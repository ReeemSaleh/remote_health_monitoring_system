package medical_server;

// GUI class for alerting medical staff (e.g., nurses) 
public class gui_medical_server extends javax.swing.JFrame {

    // Constructor initializes UI and sets basic window properties
    public gui_medical_server() {
        initComponents();
        setTitle("Medical Server"); // Set the window title
        setResizable(false); // Disable window resizing
    }

    // Initializes the components and layout.
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(); // Header panel
        jLabel11 = new javax.swing.JLabel(); // Empty placeholder
        Badge = new javax.swing.JLabel(); // Title label
        jPanel2 = new javax.swing.JPanel(); // Main panel
        attentionLabel = new javax.swing.JLabel(); // Alert title
        jTextField1 = new javax.swing.JTextField(); // Message box

        // Set frame behavior on close and layout manager
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // Header panel configuration (turquoise background)
        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        // Large title in header
        Badge.setFont(new java.awt.Font("Oriya MN", 0, 30)); // Font styling
        Badge.setForeground(new java.awt.Color(255, 255, 255)); // White text
        Badge.setText("Nurse Actions Alert"); // Header text
        Badge.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); // Default cursor

        // Layout for jPanel1 (header)
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11) // Empty label for spacing
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Badge) // Title centered
                        .addGap(250, 250, 250))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Badge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 140));

        // Main body panel setup (white background)
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));

        // Attention label for alerts
        attentionLabel.setFont(new java.awt.Font("Oriya MN", 0, 24));
        attentionLabel.setForeground(new java.awt.Color(0, 204, 204));
        attentionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attentionLabel.setText("Attention!!");

        // Text field to display alert message (non-editable)
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Oriya MN", 1, 18));
        jTextField1.setEditable(false);
        jTextField1.setCaretColor(jTextField1.getBackground()); // Caret invisible
        jTextField1.setForeground(new java.awt.Color(0, 153, 153));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true)); // Red border

        // Layout for main panel
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(attentionLabel)) // Centered title
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))) // Full-width message
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(attentionLabel)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 760, 320));

        // Auto-size frame to fit components
        pack();
    }

    // Method to display a string in the alert text field
    public void toString(String str){
        jTextField1.setText(" "); // Clear existing text (though not strictly necessary)
        jTextField1.setText(str); // Set new alert message
    }

    // Main method to launch the GUI application
    public static void main(String args[]) {

        // Try to set "Nimbus" look and feel for better UI styling
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui_medical_server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Launch the GUI on the Event Dispatch Thread
        java.awt.EventQueue.invokeLater(() -> {
            new gui_medical_server().setVisible(true);
        });
    }

    // Variable declaration
    private javax.swing.JLabel Badge, attentionLabel, jLabel11;
    private javax.swing.JPanel jPanel1, jPanel2;
    private javax.swing.JTextField jTextField1;
}