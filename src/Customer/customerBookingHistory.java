package Customer;


import java.awt.Color;
import Login.LoginPage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author user
 */
public class customerBookingHistory extends javax.swing.JFrame {
    private String loggedInEmail;

    /**
     * Creates new form adminMainMenu
     */
    public customerBookingHistory(String loggedInEmail) {
        this.loggedInEmail = loggedInEmail;
        initComponents();
        lblUsername.setText(loggedInEmail);
        Color col = new Color(224, 240, 255); //red, green and blue values
        getContentPane().setBackground(col);

    }
     
    // helper method to check for duplicate issues
    private boolean issue(String bookingID) {
        try{
            FileReader fr = new FileReader("issue.txt");
            BufferedReader br = new BufferedReader(fr);
            String read;
            
            while((read = br.readLine()) != null) {
                String[] details = read.split(";");
                if (details.length > 1 && details[1].equals(bookingID) && details[4].equals("Open")) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading issue.txt" + e.getMessage());
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnUpcoming = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        btnMainMenu = new javax.swing.JButton();
        btnBookingHistory = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        btnUpdateProfile = new javax.swing.JButton();
        lblBookingHistory = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHistory = new javax.swing.JTable();
        btnLogOut = new javax.swing.JButton();
        btnPast = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnIssue = new javax.swing.JButton();

        jButton8.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jButton8.setText("Hall Booking");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(196, 242, 242));

        lblTitle.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblTitle.setText("Hall Symphony Inc");

        btnUpcoming.setBackground(new java.awt.Color(228, 228, 228));
        btnUpcoming.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnUpcoming.setText("Upcoming");
        btnUpcoming.setBorder(null);
        btnUpcoming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpcomingActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername.setText("username");

        panelMenu.setBackground(new java.awt.Color(228, 228, 228));
        panelMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray));

        btnMainMenu.setBackground(new java.awt.Color(228, 228, 228));
        btnMainMenu.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        btnBookingHistory.setBackground(new java.awt.Color(228, 228, 228));
        btnBookingHistory.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnBookingHistory.setText("Booking History");
        btnBookingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingHistoryActionPerformed(evt);
            }
        });

        btnBooking.setBackground(new java.awt.Color(228, 228, 228));
        btnBooking.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnBooking.setText("Hall Booking");
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });

        btnUpdateProfile.setBackground(new java.awt.Color(228, 228, 228));
        btnUpdateProfile.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnUpdateProfile.setText("Update Profile");
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBookingHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(btnMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnBookingHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        lblBookingHistory.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        lblBookingHistory.setForeground(new java.awt.Color(51, 51, 51));
        lblBookingHistory.setText("Booking History:");

        tbHistory.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        tbHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Date", "Hall ID", "Status", "Duration", "Total Payment"
            }
        ));
        jScrollPane1.setViewportView(tbHistory);

        btnLogOut.setBackground(new java.awt.Color(228, 228, 228));
        btnLogOut.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnLogOut.setText("logout");
        btnLogOut.setBorder(null);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnPast.setBackground(new java.awt.Color(228, 228, 228));
        btnPast.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnPast.setText("Past");
        btnPast.setBorder(null);
        btnPast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(228, 228, 228));
        btnCancel.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnIssue.setBackground(new java.awt.Color(228, 228, 228));
        btnIssue.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnIssue.setText("Raise Issue");
        btnIssue.setBorder(null);
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBookingHistory)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpcoming, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPast, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(704, Short.MAX_VALUE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBookingHistory)
                            .addComponent(btnUpcoming)
                            .addComponent(btnPast))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(btnCancel)
                                .addGap(27, 27, 27)
                                .addComponent(btnIssue))))
                    .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(btnLogOut)
                    .addContainerGap(382, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Customer.customerMainMenu(loggedInEmail).setVisible(true);
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnBookingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingHistoryActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Customer.customerBookingHistory(loggedInEmail).setVisible(true);
    }//GEN-LAST:event_btnBookingHistoryActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Customer.customerBooking(loggedInEmail).setVisible(true);
    }//GEN-LAST:event_btnBookingActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Customer.customerUpdateProfile(loggedInEmail).setVisible(true);
    }//GEN-LAST:event_btnUpdateProfileActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login.LoginPage().setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnUpcomingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpcomingActionPerformed
        // TODO add your handling code here:
        List<String[]> upcomingBooking = bookingClass.viewBooking(true, loggedInEmail);
        displayTable(upcomingBooking);
    }//GEN-LAST:event_btnUpcomingActionPerformed

    private void btnPastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastActionPerformed
        // TODO add your handling code here:
        List<String[]> pastBooking = bookingClass.viewBooking(false, loggedInEmail);
        displayTable(pastBooking);
    }//GEN-LAST:event_btnPastActionPerformed

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbHistory.getSelectedRow();
        if (selectedRow != -1) {
            String bookingID = (String) tbHistory.getValueAt(selectedRow, 0);
            String issueDescription = JOptionPane.showInputDialog(this, "Enter issue description: ");
            
            if (issueDescription != null && !issueDescription.isEmpty()) {
                if (issue(bookingID)) {
                    JOptionPane.showMessageDialog(this, "Issue already raised!");
                } else {
                    issueClass.raiseIssue(bookingID, issueDescription);
                    JOptionPane.showMessageDialog(this, "Issue raised sucessfully!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Description cannot be empty!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a booking to raise issue");
        }
    }//GEN-LAST:event_btnIssueActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbHistory.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select a booking to cancel");
            return;
        }
        
        String bookingID = tbHistory.getValueAt(selectedRow, 0).toString();
                
        bookingClass.cancelBooking(bookingID, loggedInEmail);
        
        List<String[]> booking = bookingClass.viewBooking(true, loggedInEmail);
        
        displayTable(booking);
        
    }//GEN-LAST:event_btnCancelActionPerformed

    
    private void displayTable(List<String[]> booking) {
        DefaultTableModel model = (DefaultTableModel) tbHistory.getModel();
        model.setRowCount(0);
        
        for (String[] Booking : booking) {
            String bookingID = Booking[0];
            String date = Booking[3];
            String hallID = Booking[2];
            String status = Booking[8];
            String duration = Booking[4] + " - " + Booking[5];
            String totalPayment = Booking[6];
            
            model.addRow(new Object[]{bookingID, date, hallID, status, duration, totalPayment});
        }
    }
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnBookingHistory;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnIssue;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnPast;
    private javax.swing.JButton btnUpcoming;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JButton jButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBookingHistory;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JTable tbHistory;
    // End of variables declaration//GEN-END:variables
}
