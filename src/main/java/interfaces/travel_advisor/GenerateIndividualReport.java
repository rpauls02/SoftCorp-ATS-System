/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.travel_advisor;

import interfaces.general.Login;

import interfaces.general.Login;

import javax.swing.*;

/**
 *
 * @author Abdullah
 */
public class GenerateIndividualReport extends javax.swing.JFrame {

    /**
     * Creates new form ViewIndSalesReportsFrame
     */
    public GenerateIndividualReport() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        functionPanel = new javax.swing.JPanel();
        reportTypeDDMenu = new javax.swing.JComboBox<>();
        refreshButton = new javax.swing.JButton();
        showDDMenu = new javax.swing.JComboBox<>();
        orderDDMenu = new javax.swing.JComboBox<>();
        buttonsPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        viewIndSalesButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        refundTicketPageButton = new javax.swing.JButton();
        sellTicketPageButton = new javax.swing.JButton();
        pageTitlePanel = new javax.swing.JPanel();
        pageTitleLabel = new javax.swing.JLabel();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATS System | Travel Advisor | View Individual Sales Report");
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        functionPanel.setBackground(new java.awt.Color(49, 174, 209));
        functionPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reportTypeDDMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportTypeDDMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Report", "Interline Sales", "Domestic Sales" }));
        reportTypeDDMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportTypeDDMenuActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        showDDMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showDDMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show", "10", "25", "50", "100" }));
        showDDMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDDMenuActionPerformed(evt);
            }
        });

        orderDDMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        orderDDMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Order", "By Number", "By Date", "By Status" }));
        orderDDMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDDMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout functionPanelLayout = new javax.swing.GroupLayout(functionPanel);
        functionPanel.setLayout(functionPanelLayout);
        functionPanelLayout.setHorizontalGroup(
            functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237)
                .addComponent(reportTypeDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton)
                .addContainerGap())
        );
        functionPanelLayout.setVerticalGroup(
            functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton)
                    .addComponent(reportTypeDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        buttonsPanel.setBackground(new java.awt.Color(49, 174, 209));
        buttonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        homeButton.setBackground(new java.awt.Color(54, 198, 238));
        homeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        viewIndSalesButton.setBackground(new java.awt.Color(153, 153, 255));
        viewIndSalesButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewIndSalesButton.setText("View Individual Sales Report");
        viewIndSalesButton.setMaximumSize(new java.awt.Dimension(72, 23));
        viewIndSalesButton.setMinimumSize(new java.awt.Dimension(72, 23));
        viewIndSalesButton.setPreferredSize(new java.awt.Dimension(72, 23));

        logoutButton.setBackground(new java.awt.Color(255, 102, 102));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        refundTicketPageButton.setBackground(new java.awt.Color(54, 198, 238));
        refundTicketPageButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        refundTicketPageButton.setText("Refund Ticket");
        refundTicketPageButton.setMaximumSize(new java.awt.Dimension(90, 26));
        refundTicketPageButton.setMinimumSize(new java.awt.Dimension(90, 26));
        refundTicketPageButton.setPreferredSize(new java.awt.Dimension(90, 26));
        refundTicketPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refundTicketPageButtonActionPerformed(evt);
            }
        });

        sellTicketPageButton.setBackground(new java.awt.Color(54, 198, 238));
        sellTicketPageButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sellTicketPageButton.setText("Sell Ticket");
        sellTicketPageButton.setMaximumSize(new java.awt.Dimension(90, 26));
        sellTicketPageButton.setMinimumSize(new java.awt.Dimension(90, 26));
        sellTicketPageButton.setPreferredSize(new java.awt.Dimension(90, 26));
        sellTicketPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellTicketPageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewIndSalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(sellTicketPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refundTicketPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewIndSalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellTicketPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refundTicketPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pageTitlePanel.setBackground(new java.awt.Color(49, 174, 209));
        pageTitlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pageTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pageTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitleLabel.setText("View Individual Sales Reports");

        javax.swing.GroupLayout pageTitlePanelLayout = new javax.swing.GroupLayout(pageTitlePanel);
        pageTitlePanel.setLayout(pageTitlePanelLayout);
        pageTitlePanelLayout.setHorizontalGroup(
            pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageTitlePanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(pageTitleLabel)
                .addGap(51, 51, 51))
        );
        pageTitlePanelLayout.setVerticalGroup(
            pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageTitlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pageTitleLabel)
                .addGap(34, 34, 34))
        );

        logoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logoPanel.setPreferredSize(new java.awt.Dimension(104, 104));

        //logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/smallLogo.png"))); // NOI18N
        ImageIcon logo = new ImageIcon("/data/smallLogo.png");
        logoLabel.setIcon(logo);
        logoPanel.add(logoLabel);
        getContentPane().add(logoPanel);

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
            .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(logoLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(logoLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        infoPanel.setBackground(new java.awt.Color(204, 204, 204));
        infoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        infoPanel.setPreferredSize(new java.awt.Dimension(394, 43));

        infoLabel.setBackground(new java.awt.Color(204, 204, 204));
        infoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Use the dropdown menu below to select the type of sales report you'd like to view");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(infoPanelLayout.createSequentialGroup()
                    .addGap(0, 317, Short.MAX_VALUE)
                    .addComponent(infoLabel)
                    .addGap(0, 317, Short.MAX_VALUE)))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(infoPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(infoLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTable1.setBackground(new java.awt.Color(49, 174, 209));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pageTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                    .addComponent(functionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pageTitlePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(functionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        dispose();
        new TravelAdvisorHub().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void refundTicketPageButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        dispose();
        new TicketRefunds().setVisible(true);
    }                                                       

    private void sellTicketPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellTicketPageButtonActionPerformed
        dispose();
        new TicketSales().setVisible(true);
    }//GEN-LAST:event_sellTicketPageButtonActionPerformed

    private void reportTypeDDMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportTypeDDMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportTypeDDMenuActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void orderDDMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDDMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderDDMenuActionPerformed

    private void showDDMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDDMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showDDMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GenerateIndividualReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateIndividualReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateIndividualReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateIndividualReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateIndividualReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel functionPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JComboBox<String> orderDDMenu;
    private javax.swing.JLabel pageTitleLabel;
    private javax.swing.JPanel pageTitlePanel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton refundTicketPageButton;
    private javax.swing.JComboBox<String> reportTypeDDMenu;
    private javax.swing.JButton sellTicketPageButton;
    private javax.swing.JComboBox<String> showDDMenu;
    private javax.swing.JButton viewIndSalesButton;
    // End of variables declaration//GEN-END:variables
}
