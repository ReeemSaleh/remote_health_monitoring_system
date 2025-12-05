package sensor_client_app;

public class gui_sensor_client_app extends javax.swing.JFrame {

    private final gui_get_input input_interface = new gui_get_input();

    public gui_sensor_client_app() {
        initComponents();
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    // Initializes the components and layout.
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // Bottom Panel - Sensor icons and labels
        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/thermometer.png")));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/heart-rate.png")));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/oxygen.png")));

        jLabel8.setFont(new java.awt.Font("Oriya MN", 1, 18));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Temperature");

        jLabel9.setFont(new java.awt.Font("Oriya MN", 1, 18));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Heart Rate");

        jLabel10.setFont(new java.awt.Font("Oriya MN", 1, 18));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Oxygen");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(154)
                        .addComponent(jLabel8)
                        .addGap(223)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(181)
                        .addComponent(jLabel3)
                        .addGap(259)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(203))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1120, 200));

        // Top Panel - App welcome screen and start button
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/receptionist copy.png")));

        welcomeLabel.setFont(new java.awt.Font("Oriya MN", 0, 48));
        welcomeLabel.setForeground(new java.awt.Color(0, 204, 204));
        welcomeLabel.setText("Welcome to RHMS");

        jLabel6.setFont(new java.awt.Font("Oriya MN", 0, 18));
        jLabel6.setText("We analyse health data to provide therapy suggestions");

        jLabel7.setFont(new java.awt.Font("Oriya MN", 0, 18));
        jLabel7.setText("and warn the medical staff");

        jLabel11.setFont(new java.awt.Font("Oriya Sangam MN", 0, 24));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        startButton.setBackground(new java.awt.Color(1, 207, 203));
        startButton.setFont(new java.awt.Font("Oriya MN", 0, 18));
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("Start The System");
        startButton.setFocusPainted(false);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setOpaque(true);
        startButton.addActionListener(evt -> startButtonActionPerformed(evt));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132)
                        .addComponent(welcomeLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(179))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128)
                        .addComponent(welcomeLabel)
                        .addGap(36)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(28)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(88, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 480));
        setSize(new java.awt.Dimension(1116, 674));
        setLocationRelativeTo(null);
    }

    // Close the application
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    // Handle "Start The System" button click
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {
        input_interface.setVisible(true);
        dispose();
    }

    // Main method to launch the interface
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(gui_sensor_client_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new gui_sensor_client_app().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JLabel jLabel10, jLabel11, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9;
    private javax.swing.JPanel jPanel1, jPanel3;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel welcomeLabel;
}