package sensor_client_app;

import javax.swing.SwingWorker;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

// GUI class to get user input (execution time) for the SensorClientApp
public class gui_get_input extends javax.swing.JFrame {

    // Create an instance of the main application logic class
    sensor_client_app SCA = new sensor_client_app();

    // Static variable to store time entered by the user
    static int time;

    // Constructor initializes UI and sets basic window properties
    public gui_get_input() {
        initComponents();
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    // Initializes the components and layout.
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Badge1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nextButton = new javax.swing.JButton();
        timeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        Badge = new javax.swing.JLabel();

        // Unused label
        jLabel1.setText("jLabel1");

        // Frame configuration
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(760, 450));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // Top panel with application title and close button
        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new GridBagLayout());

        // GridBag constraints for positioning
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.NONE;

        jPanel1.add(Badge1, gbc);

        // Label for closing the window
        jLabel11.setFont(new java.awt.Font("Oriya Sangam MN", 0, 24));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt); // Handle close click
            }
        });

        // Title text in header
        Badge1.setFont(new java.awt.Font("Oriya MN", 0, 30));
        Badge1.setForeground(new java.awt.Color(255, 255, 255));
        Badge1.setText("Remote Health Monitoring System");
        Badge1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Badge1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Badge1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

        // Layout for jPanel1 (top panel)
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(733, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(330, 330, 330)
                    .addComponent(Badge1)
                    .addContainerGap(103, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(Badge1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(49, 49, 49)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 170));

        // Panel where user inputs the time and proceeds
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));

        // "Next" button to proceed after entering time
        nextButton.setBackground(new java.awt.Color(1, 207, 203));
        nextButton.setFont(new java.awt.Font("Oriya MN", 0, 18));
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setFocusPainted(false);
        nextButton.setBorderPainted(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setOpaque(true);
        nextButton.setText("Next");
        nextButton.setToolTipText("");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt); // Handle button click
            }
        });

        // Text field to input execution time
        timeText.setBackground(new java.awt.Color(255, 255, 255));
        timeText.setFont(new java.awt.Font("Oriya MN", 0, 16));
        timeText.setForeground(new java.awt.Color(0, 204, 204));
        timeText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timeText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        timeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTextActionPerformed(evt); // Handle Enter key press
            }
        });

        // Icon image next to input panel
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/smartphone.png")));

        // Note about minimum time
        noteLabel.setFont(new java.awt.Font("Oriya MN", 0, 14));
        noteLabel.setForeground(new java.awt.Color(102, 102, 102));
        noteLabel.setText("* Minimum time of execution is 60 seconds");

        // Instructional label
        Badge.setFont(new java.awt.Font("Oriya MN", 0, 27));
        Badge.setForeground(new java.awt.Color(0, 204, 204));
        Badge.setText("Enter the time of execution in seconds..");
        Badge.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        // Layout for jPanel2 (main input panel)
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);

        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(noteLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap(0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Badge)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(timeText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(noteLabel))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(Badge)
                                    .addGap(1, 1, 1)))))
                    .addComponent(jLabel2)
                    .addGap(100, 100, 100))
        );

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(Badge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(0, 0, 0)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0)
                                .addComponent(Badge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(timeText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(noteLabel)
                                .addGap(50))
                            .addGap(130, 130, 130))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)))
                    .addComponent(noteLabel)
                    .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1120, 564));

        // Final frame size and position
        setSize(new java.awt.Dimension(1116, 674));
        setLocationRelativeTo(null); // Center the window
    }

    // Called when "Next" is clicked; reads time and starts background task
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {
        time = Integer.parseInt(timeText.getText());
        dispose(); // Close current window

        // Asynchronous task to run backend logic
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                SCA.setUserInput(time);
                SCA.continueAfterTimeInput(); // Start the sensor client application logic
                return null;
            }
        }.execute();
    }

    // Exits the application when the "X" label is clicked
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    // Optionally handles Enter key on time input field
    private void timeTextActionPerformed(java.awt.event.ActionEvent evt) {
        time = Integer.parseInt(timeText.getText());
    }

    // Main method to run this input interface window
    public static void main(String args[]) {
        try {
            // Apply Nimbus Look and Feel if available
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui_get_input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Launch the GUI on the Event Dispatch Thread
        java.awt.EventQueue.invokeLater(() -> {
            new gui_get_input().setVisible(true);
        });
    }

    // Variable declaration
    private javax.swing.JLabel Badge, Badge1, jLabel1, jLabel11, jLabel2, noteLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JPanel jPanel1, jPanel2;
    public javax.swing.JTextField timeText;
}