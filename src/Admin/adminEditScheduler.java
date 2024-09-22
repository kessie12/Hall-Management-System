package Admin;

import Login.LoginPage;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jason
 */
public class adminEditScheduler extends javax.swing.JFrame {
    private String loggedInEmail;

    /**
     * Creates new form adminEditScheduler
     */
    private String name;
    private String phoneNum;
    private String email;
    private String status;
    private String role;
    private String password;
    
    public adminEditScheduler(String name, String phoneNum, String email, String password, String status, String role) {
        initComponents();
        
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.password = password;
        this.status = status;
        this.role = role;
        
        adminClass1 Admin = new adminClass1();
        loadData();
    }
    
        public adminEditScheduler(String loggedInEmail) {
        initComponents();
        this.loggedInEmail = loggedInEmail;
        lblUsername.setText(loggedInEmail);
    }
    
    private void loadData() {
        lblName.setText(name);
        lblRole.setText(role);
        lblStatus.setText(status);
        txtContact.setText(phoneNum);
        lblEmail.setText(email);
        pwdPassword.setText(password);
        pwdConfirm.setText(password);
    }
    
    
    public adminEditScheduler() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblPageTitle = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        lblInfo1 = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        lblInfo3 = new javax.swing.JLabel();
        lblInfo4 = new javax.swing.JLabel();
        lblInfo5 = new javax.swing.JLabel();
        lblInfo6 = new javax.swing.JLabel();
        lblInfor7 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        pwdConfirm = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();
        txtContact = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 242, 253));

        lblTitle.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        lblTitle.setText("Hall Symphony Inc");

        lblUsername.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblUsername.setText("username");

        btnLogout.setBackground(new java.awt.Color(227, 242, 253));
        btnLogout.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnLogout.setText("logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblPageTitle.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblPageTitle.setText("Staff Account Update");

        btnMenu.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnMenu.setText("Back to Main Menu");
        btnMenu.setToolTipText("");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblInfo1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblInfo1.setText("Role:");

        lblInfo2.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblInfo2.setText("Name: ");

        lblInfo3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblInfo3.setText("Status:");

        lblInfo4.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblInfo4.setText("Contact:");

        lblInfo5.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblInfo5.setText("Email: ");

        lblInfo6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblInfo6.setText("Password:");

        lblInfor7.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblInfor7.setText("Confirm Password: ");

        lblRole.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblRole.setText("(auto)");

        lblName.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblName.setText("(auto)");

        lblEmail.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblEmail.setText("(auto)");

        pwdPassword.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        pwdPassword.setText("password");

        pwdConfirm.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        pwdConfirm.setText("password");

        btnUpdate.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setToolTipText("");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtContact.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        txtContact.setText("contact");
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblStatus.setText("(auto)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInfo5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInfo6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInfor7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(pwdPassword)
                            .addComponent(pwdConfirm)
                            .addComponent(txtContact)
                            .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(lblUsername)
                    .addComponent(btnLogout))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPageTitle)
                    .addComponent(btnMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo1)
                    .addComponent(lblRole))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo2)
                    .addComponent(lblName))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo3)
                    .addComponent(lblStatus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo4)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo5)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo6)
                    .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfor7)
                    .addComponent(pwdConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new adminMainPage(loggedInEmail).setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String newPhoneNum = txtContact.getText().trim();
        String newPass = new String(pwdPassword.getPassword()).trim();
        String confirmPass = new String(pwdConfirm.getPassword()).trim();
        
        // validate password and confirm password field 
        if (!newPass.equals(confirmPass)) {
            JOptionPane.showMessageDialog(null, "Password do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (newPass.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // validate phone number
        if (!newPhoneNum.matches("^\\d{3}-\\d{7}$")) {
            JOptionPane.showMessageDialog(null, "Contact number must be in the format XXX-XXXXXXX!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // check for changes
        if (newPhoneNum.isEmpty() || newPass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No changes have been made.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // call the update function
        adminClass1 Admin = new adminClass1();
        Admin.updateStaff(name, role, status, newPhoneNum, email, newPass);
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblInfo3;
    private javax.swing.JLabel lblInfo4;
    private javax.swing.JLabel lblInfo5;
    private javax.swing.JLabel lblInfo6;
    private javax.swing.JLabel lblInfor7;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField pwdConfirm;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtContact;
    // End of variables declaration//GEN-END:variables
}
