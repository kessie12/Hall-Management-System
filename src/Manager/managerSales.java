package Manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import static java.lang.invoke.MethodHandles.filterValue;
import java.util.List;
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
    private managerSalesClass manager = new managerSalesClass(); // Instance of your main class


    /**
     * Creates new form Manager_Login
     */
    public managerSales() {
        initComponents();
        Color col = new Color(224, 240, 255);
        Color buttonColor = new Color(228, 228, 228);
        Color color = new Color(242, 242, 242);
        getContentPane().setBackground(col);
        btnSales.setBackground(buttonColor);
        btnMaintenance.setBackground(buttonColor);
        btnMainMenu.setBackground(buttonColor);
        btnLogOut.setBackground(buttonColor);
        CBFilter.setBackground(color);
        
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
        CBFilter = new javax.swing.JComboBox<>();
        btnLogOut = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnMainMenu = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnMaintenance = new javax.swing.JButton();
        PanelChart = new javax.swing.JPanel();
        BtnView = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCompanyName.setFont(new java.awt.Font("Bradley Hand", 0, 36)); // NOI18N
        lblCompanyName.setText("Hall Symphony Inc.");

        lblSalesDashboard.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        lblSalesDashboard.setText("Sales Dashboard");

        lblFilter.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        lblFilter.setText("Filter: ");

        CBFilter.setFont(new java.awt.Font("Gill Sans", 0, 18)); // NOI18N
        CBFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "year", "month", "date" }));
        CBFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBFilterActionPerformed(evt);
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
                .addContainerGap(35, Short.MAX_VALUE)
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
            .addGap(0, 466, Short.MAX_VALUE)
        );
        PanelChartLayout.setVerticalGroup(
            PanelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BtnView.setText("View");
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCompanyName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                        .addComponent(lblUsername)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogOut))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFilter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnView))
                            .addComponent(PanelChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(lblSalesDashboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblSalesDashboard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFilter)
                            .addComponent(CBFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnView))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        this.dispose();
        new managerMainMenu().setVisible(true);
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        this.dispose();
        new managerSales().setVisible(true);
    }//GEN-LAST:event_btnSalesActionPerformed

    private void btnMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintenanceActionPerformed
        this.dispose();
        new managerMaintenance().setVisible(true);
    }//GEN-LAST:event_btnMaintenanceActionPerformed

    private void CBFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBFilterActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login.LoginPage().setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        // Get the selected filter type from the combo box
        String filterType = CBFilter.getSelectedItem().toString().toLowerCase(); // year, month, day
        String filterValue = null;

        // Call the processSalesData method in managerSalesClass to get filtered data
        List<String[]> filteredData = manager.processSalesData(filterValue, filterType);
        
        if(filteredData.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No data found for the selected filter.", "No Data", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Create a dataset for the chart
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (String[] sale : filteredData) {
                String hallID = sale[0];
                String price = sale[2]; 
                dataset.addValue(Double.parseDouble(price), "Sales", hallID);
            }

            // Create a bar chart
            JFreeChart barChart = ChartFactory.createBarChart(
                "Sales Data", 
                "Hall ID", 
                "Sales", 
                dataset, 
                PlotOrientation.VERTICAL, 
                true, true, false);

            CategoryPlot plot = barChart.getCategoryPlot();
            plot.setRangeGridlinePaint(Color.BLACK);
            BarRenderer renderer = (BarRenderer) plot.getRenderer();
            renderer.setSeriesPaint(0, Color.BLUE);

            // Create a ChartPanel and add it to your JPanel (which is in your GUI)
            ChartPanel chartPanel = new ChartPanel(barChart);
            chartPanel.setPreferredSize(new Dimension(400, 300));

            // Assuming you have a JPanel named chartPanelContainer to show the chart
            PanelChart.removeAll(); // Clear any previous chart
            PanelChart.setLayout(new BorderLayout());
            PanelChart.add(chartPanel, BorderLayout.CENTER);
            PanelChart.validate(); // Revalidate the panel to refresh
        }
    
    }//GEN-LAST:event_BtnViewActionPerformed

    

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnView;
    private javax.swing.JComboBox<String> CBFilter;
    private javax.swing.JPanel PanelChart;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnMaintenance;
    private javax.swing.JButton btnSales;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblFilter;
    private javax.swing.JLabel lblSalesDashboard;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
