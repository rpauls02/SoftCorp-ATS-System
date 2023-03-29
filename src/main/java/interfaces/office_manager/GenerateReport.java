/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.office_manager;

import javax.swing.*;

/**
 *
 * @author Abdullah
 */
public class GenerateReport extends javax.swing.JFrame {

    /**
     * Creates new form generateReportFrame
     */
    public GenerateReport() {
        initComponents();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pageTitlePanel = new javax.swing.JPanel();
        pageTitleLabel = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        viewCustomerRecordsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        viewReportButton = new javax.swing.JButton();
        manageStockButton = new javax.swing.JButton();
        viewAlertsButton = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();
        infoLine1Label = new javax.swing.JLabel();
        infoLine2Label = new javax.swing.JLabel();
        infoLine3Label = new javax.swing.JLabel();
        viewFolderButtonPanel = new javax.swing.JPanel();
        viewPDFFolderButton = new javax.swing.JButton();
        functionPanel = new javax.swing.JPanel();
        reportTypesPanel = new javax.swing.JPanel();
        reportTypesLabel = new javax.swing.JLabel();
        stockTurnoverReport = new javax.swing.JButton();
        domesticSalesReportButton = new javax.swing.JButton();
        interlineSalesReportButton = new javax.swing.JButton();
        individualSalesReportButton = new javax.swing.JButton();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATS System | Office Manager | View Report");

        pageTitlePanel.setBackground(new java.awt.Color(49, 174, 209));
        pageTitlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pageTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pageTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitleLabel.setText("Generate/View Report");

        javax.swing.GroupLayout pageTitlePanelLayout = new javax.swing.GroupLayout(pageTitlePanel);
        pageTitlePanel.setLayout(pageTitlePanelLayout);
        pageTitlePanelLayout.setHorizontalGroup(
                pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pageTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        pageTitlePanelLayout.setVerticalGroup(
                pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pageTitlePanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(pageTitleLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        viewCustomerRecordsButton.setBackground(new java.awt.Color(54, 198, 238));
        viewCustomerRecordsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewCustomerRecordsButton.setText("View Customer Records");
        viewCustomerRecordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerRecordsButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 102, 102));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        viewReportButton.setBackground(new java.awt.Color(153, 153, 255));
        viewReportButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewReportButton.setText("Generate Report");
        viewReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportButtonActionPerformed(evt);
            }
        });

        manageStockButton.setBackground(new java.awt.Color(54, 198, 238));
        manageStockButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        manageStockButton.setText("Manage Stock");
        manageStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStockButtonActionPerformed(evt);
            }
        });

        viewAlertsButton.setBackground(new java.awt.Color(54, 198, 238));
        viewAlertsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewAlertsButton.setText("View Alerts");
        viewAlertsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAlertsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
                buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                                .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(viewCustomerRecordsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                                .addComponent(viewAlertsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(viewReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(manageStockButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
                buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(viewCustomerRecordsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(homeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(manageStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(viewReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(viewAlertsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        infoPanel.setBackground(new java.awt.Color(49, 174, 209));
        infoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        infoLine1Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        infoLine1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLine1Label.setText("Select report to generate. A PDF will be generated with the necessary information.");

        infoLine2Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        infoLine2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLine2Label.setText("You may also view the PDF within its folder using the \"View PDF Folder\" button on the right.");

        infoLine3Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        infoLine3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLine3Label.setText("To view Individual Sales Reports, select \"Individual Sales Reports\" and enter staff ID of user.");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
                infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(infoLine2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(infoLine3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(infoLine1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(149, 149, 149))
        );
        infoPanelLayout.setVerticalGroup(
                infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(infoPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(infoLine1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoLine2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoLine3Label)
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        viewFolderButtonPanel.setBackground(new java.awt.Color(49, 174, 209));
        viewFolderButtonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        viewPDFFolderButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewPDFFolderButton.setText("View PDF Folder");
        viewPDFFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPDFFolderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewFolderButtonPanelLayout = new javax.swing.GroupLayout(viewFolderButtonPanel);
        viewFolderButtonPanel.setLayout(viewFolderButtonPanelLayout);
        viewFolderButtonPanelLayout.setHorizontalGroup(
                viewFolderButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewFolderButtonPanelLayout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addComponent(viewPDFFolderButton)
                                .addGap(26, 26, 26))
        );
        viewFolderButtonPanelLayout.setVerticalGroup(
                viewFolderButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(viewFolderButtonPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(viewPDFFolderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        functionPanel.setBackground(new java.awt.Color(49, 174, 209));
        functionPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reportTypesPanel.setBackground(new java.awt.Color(49, 174, 209));
        reportTypesPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reportTypesLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportTypesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportTypesLabel.setText("Report Types:");

        stockTurnoverReport.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stockTurnoverReport.setText("Stock Turnover Report");
        stockTurnoverReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockTurnoverReportActionPerformed(evt);
            }
        });

        domesticSalesReportButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        domesticSalesReportButton.setText("Domestic Sales Report");
        domesticSalesReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domesticSalesReportButtonActionPerformed(evt);
            }
        });

        interlineSalesReportButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        interlineSalesReportButton.setText("Interline Sales Report");
        interlineSalesReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interlineSalesReportButtonActionPerformed(evt);
            }
        });

        individualSalesReportButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        individualSalesReportButton.setText("Individual Sales Report");
        individualSalesReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                individualSalesReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportTypesPanelLayout = new javax.swing.GroupLayout(reportTypesPanel);
        reportTypesPanel.setLayout(reportTypesPanelLayout);
        reportTypesPanelLayout.setHorizontalGroup(
                reportTypesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(reportTypesPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(reportTypesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stockTurnoverReport)
                                .addGap(18, 18, 18)
                                .addComponent(domesticSalesReportButton)
                                .addGap(18, 18, 18)
                                .addComponent(interlineSalesReportButton)
                                .addGap(18, 18, 18)
                                .addComponent(individualSalesReportButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportTypesPanelLayout.setVerticalGroup(
                reportTypesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(reportTypesPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(reportTypesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(reportTypesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(stockTurnoverReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(domesticSalesReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(interlineSalesReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(individualSalesReportButton))
                                .addContainerGap())
        );

        javax.swing.GroupLayout functionPanelLayout = new javax.swing.GroupLayout(functionPanel);
        functionPanel.setLayout(functionPanelLayout);
        functionPanelLayout.setHorizontalGroup(
                functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, functionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(reportTypesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        functionPanelLayout.setVerticalGroup(
                functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(functionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(reportTypesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(522, Short.MAX_VALUE))
        );

        logoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        //logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/smallLogo.png"))); // NOI18N
        ImageIcon logo = new ImageIcon("/data/bigLogo.png");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(functionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(viewFolderButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pageTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pageTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(viewFolderButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(functionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new OfficeManagerHub().setVisible(true);
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void viewAlertsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new ViewAlerts().setVisible(true);
    }

    private void manageStockButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new ManageStock().setVisible(true);
    }

    private void viewCustomerRecordsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new CustomerRecords().setVisible(true);
    }

    private void viewReportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void stockTurnoverReportActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void domesticSalesReportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void interlineSalesReportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void individualSalesReportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void viewPDFFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton domesticSalesReportButton;
    private javax.swing.JPanel functionPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton individualSalesReportButton;
    private javax.swing.JLabel infoLine1Label;
    private javax.swing.JLabel infoLine2Label;
    private javax.swing.JLabel infoLine3Label;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JButton interlineSalesReportButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageStockButton;
    private javax.swing.JLabel pageTitleLabel;
    private javax.swing.JPanel pageTitlePanel;
    private javax.swing.JLabel reportTypesLabel;
    private javax.swing.JPanel reportTypesPanel;
    private javax.swing.JButton stockTurnoverReport;
    private javax.swing.JButton viewAlertsButton;
    private javax.swing.JButton viewCustomerRecordsButton;
    private javax.swing.JPanel viewFolderButtonPanel;
    private javax.swing.JButton viewPDFFolderButton;
    private javax.swing.JButton viewReportButton;
    // End of variables declaration
}
