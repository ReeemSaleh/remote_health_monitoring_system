package sensor_client_app;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class sensor_client_app {
    
    private int userInput;

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }
    
    public int getUserInput() {
        return this.userInput;
    }

    public void continueAfterTimeInput() {

        try{
            
            // Server configuration for local testing (i.e., client and server on the same machine).
            // Comment out the following two lines if running the client and server on different machines:
            int serverPort = 600;
            String serverName = "localhost";


            // Server configuration for remote execution (i.e., client and server on different machines):
            // Replace "IP Address here.." with the actual IP address of the server.
            // Make sure the firewall allows incoming connections on the specified port (600).
            /*
            int serverPort = 600;
            InetAddress address = InetAddress.getByName("IP Address here..");
            String serverName = address.getHostName();
            */


            // Create socket, to connect to the Personal Server
            Socket clientSocket = new Socket(serverName , serverPort);

            // Create an output stream to send objects to the server
            ObjectOutputStream obgToServer = new ObjectOutputStream(clientSocket.getOutputStream());
            
            // Create a random variable to generate the sensors data randomly
            Random randNo = new Random();
            
            // Creat an object from the showData_interface to be able to send the data to that GUI
            gui_patient_health_info show=new gui_patient_health_info();

            // The minimum time of execution is 60 seconds
            if (userInput < 60) {
                userInput = 60;
            }

            System.out.println("The Sensor Client server will send the data every 5 seconds to the Personal Server application");

            // Create array of {date, time, Temperature, HeartRate, OxygenLevel} 
            String date = java.time.LocalDate.now().toString();
            String time;
            double Temperature = 0;
            double HeartRate = 0;
            double OxygenLevel = 0;
            String[] sensorsData;
            
            // Loop for a persistent connection over a period of time
            LocalTime currentTime = java.time.LocalTime.now();
            LocalTime endTime = currentTime.plusSeconds(userInput);
            
            while (currentTime.isBefore(endTime)) {

                // Save current time
                time = java.time.LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

                // Generate and save data
                Temperature = (int) ((36 + (41.1 - 36) * randNo.nextDouble()) * 10) / 10.0;
                HeartRate = (int) ((50 + (120.1 - 50) * randNo.nextDouble()) * 10) / 10.0;
                OxygenLevel = (int) ((60 + (100.1 - 60) * randNo.nextDouble()) * 10) / 10.0;

                // Save the data in the array
                sensorsData = new String[]{date , time , String.valueOf(Temperature) , String.valueOf(HeartRate) , String.valueOf(OxygenLevel)};

                // Store the sensed data in a vriable, print it on the console, and send it to the showData_interface to appear on the GUI
                String msgT= "At date: " + date + ", time: " + time + ", sensed temperature is " + Temperature;
                System.out.println(msgT);
                show.tempToString(msgT);
                show.setVisible(true);
                
                
                String msgH="At date: " + date + ", time: " + time + ", sensed heart rate is " + HeartRate;
                System.out.println(msgH);
                show.heartToString(msgH);
                show.setVisible(true);
                
                String msgO="At date: " + date + ", time: " + time + ", sensed oxygen saturation is " + OxygenLevel;
                System.out.println(msgO);
                show.oxToString(msgO);
                show.setVisible(true);
                
                System.out.println();

                // Send the array to the Personal Server
                obgToServer.writeObject(sensorsData);

                // Wait for 5 seconds to generate next data
                Thread.sleep(5000);

                currentTime = java.time.LocalTime.now();
            }

            // Send a null object to the Personal server to end the connection
            obgToServer.writeObject(null);
            
            // Close objects
            obgToServer.close();
            clientSocket.close();

        } catch(IOException e){
            e.printStackTrace();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException , InterruptedException {
        // Create an object from the main GUI and make it visible
        gui_sensor_client_app ms = new gui_sensor_client_app();
        ms.setVisible(true);
    }
}