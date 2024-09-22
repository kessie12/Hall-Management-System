package Manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.invoke.MethodHandles.filterValue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author khaientiew
 */
public class managerSales extends javax.swing.JFrame {
    private String loggedInEmail;


    /**
     * Creates new form Manager_Login
     */
    public managerSales(String loggedInEmail) {
        this.loggedInEmail = loggedInEmail;
        initComponents();
        lblUsername.setText(loggedInEmail);
        Color col = new Color(224, 240, 255);
        Color buttonColor = new Color(228, 228, 228);
        Color color = new Color(242, 242, 242);
        getContentPane().setBackground(col);
        btnSales.setBackground(buttonColor);
        btnMaintenance.setBackground(buttonColor);
        btnMainMenu.setBackground(buttonColor);
        btnLogOut.setBackground(buttonColor);
        CBType.setBackground(color);
        CBSpecify.setBackground(color);
        BtnViewR.setBackground(buttonColor);
        BtnViewC.setBackground(buttonColor);
        }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lblCompanyName = new javax.swing.JLabel();
        lblSalesDashboard = new javax.swing.JLabel();
        lblFilter = new javax.swing.JLabel();
        CBType = new javax.swing.JComboBox<>();
        btnLogOut = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnMainMenu = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnMaintenance = new javax.swing.JButton();
        PanelChart = new javax.swing.JPanel();
        BtnViewR = new javax.swing.JButton();
        BtnViewC = new javax.swing.JButton();
        lblBooked = new javax.swing.JLabel();
        txtBooked = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        lblFilter1 = new javax.swing.JLabel();
        CBSpecify = new javax.swing.JComboBox<>();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCompanyName.setFont(new java.awt.Font("Bradley Hand", 0, 36)); // NOI18N
        lblCompanyName.setText("Hall Symphony Inc.");

        lblSalesDashboard.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        lblSalesDashboard.setText("Sales Dashboard");

        lblFilter.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        lblFilter.setText("Type : ");

        CBType.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        CBType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "Month", "Day" }));
        CBType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTypeActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        btnLogOut.setText("LogOut");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        lblUsername.setText("jLabel4");

        btnMainMenu.setBackground(new java.awt.Color(222, 225, 232));
        btnMainMenu.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        btnMainMenu.setText("Main Menu");
        btnMainMenu.setPreferredSize(new java.awt.Dimension(80, 23));
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        btnSales.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        btnSales.setText("Sales Dashboard");
        btnSales.setPreferredSize(new java.awt.Dimension(80, 23));
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });

        btnMaintenance.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        btnMaintenance.setText("Maintenance Operations");
        btnMaintenance.setPreferredSize(new java.awt.Dimension(80, 23));
        btnMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintenanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        PanelChart.setMaximumSize(new java.awt.Dimension(700, 400));

        javax.swing.GroupLayout PanelChartLayout = new javax.swing.GroupLayout(PanelChart);
        PanelChart.setLayout(PanelChartLayout);
        PanelChartLayout.setHorizontalGroup(
            PanelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        PanelChartLayout.setVerticalGroup(
            PanelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        BtnViewR.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        BtnViewR.setText("View Report");
        BtnViewR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewRActionPerformed(evt);
            }
        });

        BtnViewC.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        BtnViewC.setText("View Chart");
        BtnViewC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewCActionPerformed(evt);
            }
        });

        lblBooked.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        lblBooked.setText("Total Hall Booked: ");

        txtBooked.setText("jTextField1");

        lblAmount.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        lblAmount.setText("Total Amount:");

        txtAmount.setText("jTextField1");

        lblFilter1.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        lblFilter1.setText("Specify : ");

        CBSpecify.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        CBSpecify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSpecifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblCompanyName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogOut))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PanelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSalesDashboard)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFilter)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CBType, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFilter1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBSpecify, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnViewR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnViewC, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBooked)
                                    .addComponent(lblAmount))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBooked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLogOut)
                        .addComponent(lblUsername))
                    .addComponent(lblCompanyName))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblSalesDashboard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFilter)
                            .addComponent(CBType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFilter1)
                            .addComponent(CBSpecify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(BtnViewR))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBooked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblBooked)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnViewC)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAmount)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        this.dispose();
        new managerMainMenu(loggedInEmail).setVisible(true);
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        this.dispose();
        new managerSales(loggedInEmail).setVisible(true);
    }//GEN-LAST:event_btnSalesActionPerformed

    private void btnMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintenanceActionPerformed
        this.dispose();
        new managerMaintenance(loggedInEmail).setVisible(true);
    }//GEN-LAST:event_btnMaintenanceActionPerformed

    private void CBTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTypeActionPerformed
        // TODO add your handling code here:
        String selectedType = CBType.getSelectedItem().toString(); 
        CBSpecify.removeAllItems(); 

        File file = new File("booking.txt"); 
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            List<String> dateParts = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
            String[] bookingDetails = line.split(";"); 
            String paymentStatus = bookingDetails[8];  
            String date = bookingDetails[3];  

            if (paymentStatus.equalsIgnoreCase("Paid")) {
                System.out.println("Print" + date);
                String[] dateSplit = date.split("-");  // Split date into year, month, day

                switch (selectedType) {
                    case "Year":
                        CBSpecify.addItem(dateSplit[0]);  // Add year
                        break;
                    case "Month":
                        CBSpecify.addItem(dateSplit[1]);  // Add month
                        break;
                    case "Day":
                        CBSpecify.addItem(dateSplit[2]);  // Add day
                        break;
                }
            }
        
        }

            // Remove duplicates
            Set<String> uniqueParts = new HashSet<>(dateParts);

            // Add the unique date parts to the CBSpecify combo box
            for (String part : uniqueParts) {
                CBSpecify.addItem(part);
            }
    }   catch (IOException ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_CBTypeActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login.LoginPage().setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void BtnViewRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewRActionPerformed
        String selectedDatePart = CBSpecify.getSelectedItem().toString();  
        String selectedType = CBType.getSelectedItem().toString();  
    
        int bookingCount = 0;  
        double totalAmount = 0.0;  
    
        File file = new File("booking.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookingDetails = line.split(";"); 
                String paymentStatus = bookingDetails[8];  
                String date = bookingDetails[3];    

                if (paymentStatus.equalsIgnoreCase("Paid")) {
                    String[] dateParts = date.split("-");  
                
                    // Check if the selected type and date part match the current row
                    boolean match = false;
                    switch (selectedType) {
                    case "Year":
                        match = dateParts[0].equals(selectedDatePart);
                        break;
                    case "Month":
                        match = dateParts[1].equals(selectedDatePart);
                        break;
                    case "Day":
                        match = dateParts[2].equals(selectedDatePart);
                        break;
                }
                    
                    // If the date part matches, count the booking and add the amount
                if (match) {
                    bookingCount++;  // Increment booking count
                    totalAmount += Double.parseDouble(bookingDetails[6]);  // Add the booking price to total
                }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display the report
        txtBooked.setText(Integer.toString(bookingCount));
        txtAmount.setText(Double.toString(totalAmount));
    
    }//GEN-LAST:event_BtnViewRActionPerformed

    private void BtnViewCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewCActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnViewCActionPerformed

    private void CBSpecifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSpecifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBSpecifyActionPerformed

    

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnViewC;
    private javax.swing.JButton BtnViewR;
    private javax.swing.JComboBox<String> CBSpecify;
    private javax.swing.JComboBox<String> CBType;
    private javax.swing.JPanel PanelChart;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnMaintenance;
    private javax.swing.JButton btnSales;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBooked;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblFilter;
    private javax.swing.JLabel lblFilter1;
    private javax.swing.JLabel lblSalesDashboard;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBooked;
    // End of variables declaration//GEN-END:variables
}
