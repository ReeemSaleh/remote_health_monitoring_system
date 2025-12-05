package personal_server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class personal_server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Port number
        int serverPort = 600;

        gui_personal_server show= new gui_personal_server();
        
        // Variables
        ServerSocket serverSocket = new ServerSocket(serverPort);
        String date;
        String time;
        double temperature;
        double heartRate;
        double oxygenLevel;

        while (true) {

            // Waiting for incoming connection request
            System.out.println("Waiting for client on port number " + serverPort + "...");
            Socket socket = serverSocket.accept();

            // Create an input stream to recieve objects from the client
            ObjectInputStream objFromClient = new ObjectInputStream(socket.getInputStream());

            String[] sensorsData;

            System.out.println("Connected...");

            // While loop to send and receive data and messages
            while (true) {

                // Variable to indicate whether an object has been sent or not
                int sendAlert = 0;

                // Message to sent to the server
                String msg = "";
                String displayMsg = "";

                // Get object from Sensorclient
                sensorsData = (String[]) objFromClient.readObject();

                // If Sensorclient sent a null object then end the connection
                if (sensorsData == null) {
                    break;
                }

                // Fill the variables with the values coming from the object
                date = sensorsData[0];
                time = sensorsData[1];
                temperature = Double.parseDouble(sensorsData[2]);
                heartRate = Double.parseDouble(sensorsData[3]);
                oxygenLevel = Double.parseDouble(sensorsData[4]);

                // If temperature is higher than the normal rate, send data to the medical server
                if (temperature > 38) {
                    String firstPart = String.format("At date: %s, time: %s, temperature is high %.1f", date, time, temperature);
                    int alertStartColumn = 90; // column where alert should begin
                    int padding = Math.max(1, alertStartColumn - firstPart.length());
                    String line = firstPart + " ".repeat(padding) + "(An alert message is sent to the Medical Server)";
                    System.out.println(line);
                    displayMsg = "At date: " + date + ", time: " + time + ", temperature is high " + temperature + "\n";
                    msg += displayMsg;
                    show.tempToString(displayMsg);
                    show.setVisible(true);
                    sendAlert = 1;
                } else {
                    System.out.println("At date: " + date + ", time: " + time + ", temperature is normal");
                    displayMsg = "At date: " + date + ", time: " + time + ", temperature is normal\n";
                    msg += displayMsg;
                    show.tempToString(displayMsg);
                    show.setVisible(true);
                }

                // If heart rate is greater than the normal rate, send data to the medical server
                if (heartRate > 100) {
                    String firstPart = String.format("At date: %s, time: %s, heart rate is above normal %.1f", date, time, heartRate);
                    int alertStartColumn = 90; // column where alert should begin
                    int padding = Math.max(1, alertStartColumn - firstPart.length());
                    String line = firstPart + " ".repeat(padding) + "(An alert message is sent to the Medical Server)";
                    System.out.println(line);
                    displayMsg = "At date: " + date + ", time: " + time + ", heart rate is above normal  " + heartRate + "\n";
                    msg += displayMsg;
                    show.heartToString(displayMsg);
                    show.setVisible(true);
                    sendAlert = 1;
                    
                // If heart rate is lower than the normal rate, send data to the medical server
                } else if (heartRate < 60) {
                    String firstPart = String.format("At date: %s, time: %s, heart rate is below normal %.1f", date, time, heartRate);
                    int alertStartColumn = 90; // column where alert should begin
                    int padding = Math.max(1, alertStartColumn - firstPart.length());
                    String line = firstPart + " ".repeat(padding) + "(An alert message is sent to the Medical Server)";
                    System.out.println(line);
                    displayMsg = "At date: " + date + ", time: " + time + ", heart rate is below normal  " + heartRate + "\n";
                    msg += displayMsg;
                    show.heartToString(displayMsg);
                    show.setVisible(true);
                    sendAlert = 1;
                    
                } else {
                    System.out.println("At date: " + date + ", time: " + time + ", heart rate is normal");
                    displayMsg = "At date: " + date + ", time: " + time + ", heart rate is normal\n";
                    msg += displayMsg;
                    show.heartToString(displayMsg);
                    show.setVisible(true);

                }

                // If oxygen level is low, send data to the medical server
                // Note : if the object(information like date,time,Oxygenlevel,...) never send to medical  ==>sendAlert=0 then send object send to medical srver sendAlert change to 1
                if (oxygenLevel < 95) {
                    String firstPart = String.format("At date: %s, time: %s, oxygen saturation is low %.1f", date, time, oxygenLevel);
                    int alertStartColumn = 90; // column where alert should begin
                    int padding = Math.max(1, alertStartColumn - firstPart.length());
                    String line = firstPart + " ".repeat(padding) + "(An alert message is sent to the Medical Server)";
                    System.out.println(line);
                    displayMsg = "At date: " + date + ", time: " + time + ", oxygen saturation is low " + oxygenLevel + "\n";
                    msg += displayMsg;
                    show.oxToString(displayMsg);
                    show.setVisible(true);
                    sendAlert = 1;
                    
                } else {
                    System.out.println("At date: " + date + ", time: " + time + ", oxygen is normal");
                    displayMsg = "At date: " + date + ", time: " + time + ", oxygen is normal\n";
                    msg += displayMsg;
                    show.heartToString(displayMsg);
                    show.setVisible(true);
                }

                System.out.println("");

                if (sendAlert == 1) {
                    
                    // Server configuration for local testing (i.e., client and server on the same machine).
                    // Comment out the following two lines if running the client and server on different machines:
                    int medicalServerPort = 800;
                    String medicalServerName = "localhost";

                    // Server configuration for remote execution (i.e., client and server on different machines):
                    // Replace "IP Address here.." with the actual IP address of the server.
                    // Make sure the firewall allows incoming connections on the specified port (800).
                    /*
                    int medicalServerPort = 800;
                    InetAddress address = InetAddress.getByName("IP Address here..");
                    String medicalServerName = address.getHostName();
                    */

                    try{
                        // Create socket, to connet to the Medical Server
                        Socket medicalSocket = new Socket(medicalServerName, medicalServerPort);

                        // Create an output stream to send objects to the Mediaclserver
                        ObjectOutputStream obgToSend = new ObjectOutputStream(medicalSocket.getOutputStream());

                        // Create a buffered writer to send messages to the Mediaclserver
                        BufferedWriter msgToSend = new BufferedWriter(new OutputStreamWriter(medicalSocket.getOutputStream()));

                        obgToSend.writeObject(sensorsData);
                        msgToSend.write(msg);
                        msgToSend.flush();
                        medicalSocket.close();
                    } catch (IOException e){
                        System.err.println("Connection failed to " + medicalServerName + ":" + medicalServerPort);
                        e.printStackTrace();
                    }
                }
            }
            
            System.out.println("Connection ends...\n\n");
            socket.close();
            serverSocket.close();
        }
    }
}