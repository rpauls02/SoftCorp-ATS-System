/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.travel_advisor;

import SQL.DBConnection;
import interfaces.general.Login;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        individualSalesReportPanel = new javax.swing.JPanel();
        pageTitlePanel = new javax.swing.JPanel();
        pageTitleLabel = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        viewIndSalesButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        viewTicketsPageButton = new javax.swing.JButton();
        sellTicketPageButton = new javax.swing.JButton();
        reportTableSP = new javax.swing.JScrollPane();
        reportContentsTable = new javax.swing.JTable();
        infoPanel = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        functionPanel = new javax.swing.JPanel();
        reportTypeDDMenu = new javax.swing.JComboBox<>();
        refreshTableButton = new javax.swing.JButton();
        showDDMenu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATS System | Travel Advisor | View Individual Sales Report");
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        pageTitlePanel.setBackground(new java.awt.Color(49, 174, 209));
        pageTitlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pageTitlePanel.setPreferredSize(new java.awt.Dimension(500, 83));

        pageTitleLabel.setBackground(new java.awt.Color(153, 204, 255));
        pageTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pageTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitleLabel.setText("View Individual Sales");

        javax.swing.GroupLayout pageTitlePanelLayout = new javax.swing.GroupLayout(pageTitlePanel);
        pageTitlePanel.setLayout(pageTitlePanelLayout);
        pageTitlePanelLayout.setHorizontalGroup(
                pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pageTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        pageTitlePanelLayout.setVerticalGroup(
                pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageTitlePanelLayout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addComponent(pageTitleLabel)
                                .addGap(35, 35, 35))
        );

        buttonsPanel.setBackground(new java.awt.Color(49, 174, 209));
        buttonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonsPanel.setMaximumSize(new java.awt.Dimension(572, 104));
        buttonsPanel.setMinimumSize(new java.awt.Dimension(572, 104));

        homeButton.setBackground(new java.awt.Color(54, 198, 238));
        homeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homeButton.setText("Home");

        viewIndSalesButton.setBackground(new java.awt.Color(153, 153, 255));
        viewIndSalesButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewIndSalesButton.setText("View Individual Sales Report");

        logoutButton.setBackground(new java.awt.Color(255, 102, 102));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        viewTicketsPageButton.setBackground(new java.awt.Color(54, 198, 238));
        viewTicketsPageButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewTicketsPageButton.setText("View Customer Tickets");
        viewTicketsPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTicketsPageButtonActionPerformed(evt);
            }
        });

        sellTicketPageButton.setBackground(new java.awt.Color(54, 198, 238));
        sellTicketPageButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sellTicketPageButton.setText("Sell Ticket");
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
                                .addGap(6, 6, 6)
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                                .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(viewIndSalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                                .addComponent(sellTicketPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(viewTicketsPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
                buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(viewIndSalesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(homeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sellTicketPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewTicketsPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        reportContentsTable.setBackground(new java.awt.Color(49, 174, 209));
        reportContentsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "Date", "Issued Blank", "USD Amount", "Converted Amount", "Tax", "Tax - Other", "Total Payable", "Card Number", "Total Paid", "Commissions Used"
                }
        ));
        reportContentsTable.setColumnSelectionAllowed(true);
        reportContentsTable.getTableHeader().setReorderingAllowed(false);
        reportTableSP.setViewportView(reportContentsTable);
        reportContentsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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

        logoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logoPanel.setPreferredSize(new java.awt.Dimension(104, 104));

        //logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/smallLogo.png"))); // NOI18N
        ImageIcon logo = new ImageIcon("data/smallLogo.png");
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
                        .addGap(0, 102, Short.MAX_VALUE)
                        .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(logoPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(logoLabel)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        functionPanel.setBackground(new java.awt.Color(49, 174, 209));
        functionPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reportTypeDDMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportTypeDDMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Report", "Interline Sales", "Domestic Sales" }));
        reportTypeDDMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportTypeDDMenuActionPerformed(evt);
            }
        });

        refreshTableButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        refreshTableButton.setText("Refresh");
        refreshTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTableButtonActionPerformed(evt);
            }
        });

        showDDMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showDDMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show", "10", "25", "50", "100" }));
        showDDMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDDMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout functionPanelLayout = new javax.swing.GroupLayout(functionPanel);
        functionPanel.setLayout(functionPanelLayout);
        functionPanelLayout.setHorizontalGroup(
                functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(functionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(showDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(409, 409, 409)
                                .addComponent(reportTypeDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 424, Short.MAX_VALUE)
                                .addComponent(refreshTableButton)
                                .addContainerGap())
        );
        functionPanelLayout.setVerticalGroup(
                functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, functionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(reportTypeDDMenu)
                                        .addComponent(showDDMenu, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(refreshTableButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout individualSalesReportPanelLayout = new javax.swing.GroupLayout(individualSalesReportPanel);
        individualSalesReportPanel.setLayout(individualSalesReportPanelLayout);
        individualSalesReportPanelLayout.setHorizontalGroup(
                individualSalesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(individualSalesReportPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(individualSalesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(individualSalesReportPanelLayout.createSequentialGroup()
                                                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pageTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                                        .addComponent(functionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(reportTableSP))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        individualSalesReportPanelLayout.setVerticalGroup(
                individualSalesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(individualSalesReportPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(individualSalesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(individualSalesReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(pageTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(functionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reportTableSP, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1200, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(individualSalesReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 800, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(individualSalesReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        dispose();
        new TravelAdvisorHub().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void viewTicketsPageButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new ViewTicketsAdvisor().setVisible(true);
    }                                                       

    private void sellTicketPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellTicketPageButtonActionPerformed
        dispose();
        new TicketSales().setVisible(true);
    }//GEN-LAST:event_sellTicketPageButtonActionPerformed

    private void showDDMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDDMenuActionPerformed
        DefaultTableModel model = (DefaultTableModel) reportContentsTable.getModel();
        int rowCount = model.getRowCount();
        int maxRows;
        switch ((String) Objects.requireNonNull(showDDMenu.getSelectedItem())) {
            case "10" -> {
                maxRows = 10;
                if (rowCount > maxRows) {
                    model.setRowCount(maxRows);
                }
            }
            case "25" -> {
                maxRows = 25;
                if (rowCount > maxRows) {
                    model.setRowCount(maxRows);
                }
            }
            case "50" -> {
                maxRows = 50;
                if (rowCount > maxRows) {
                    model.setRowCount(maxRows);
                }
            }
            case "100" -> {
                maxRows = 100;
                if (rowCount > maxRows) {
                    model.setRowCount(maxRows);
                }
            }
        }
    }//GEN-LAST:event_showDDMenuActionPerformed

    private void refreshTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)reportContentsTable.getModel();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();
            String query = "SELECT s.sellDate, t.blankNumber, s.originalFare, s.exchangeRate, s.convertedFare, s.tax, s.taxOther, s.total, s.payLater, ca.number, s.totalPaid, co.rate " +
                    "FROM sale s " +
                    "INNER JOIN staff st ON st.id = s.staffID " +
                    "INNER JOIN ticket t ON t.saleID = s.id " +
                    "INNER JOIN card ca ON ca.customerUsername = t.customerUsername " +
                    "INNER JOIN commission co ON co.blankNumber = t.blankNumber";
            pstm = conn.prepareStatement(query);
            rs = pstm.executeQuery();
            if (!rs.next()){
                JOptionPane.showMessageDialog(this, "Could not refresh table data. " +
                        "Try again or contact system administrator");
            } else {
                model.setRowCount(0);
                if(Objects.equals(reportTypeDDMenu.getSelectedItem().toString(), "Interline Sales")) {
                    do {
                        Object[] row = new Object[12];
                        row[0] = rs.getString("date");
                        row[1] = rs.getString("blankNumber");
                        row[2] = rs.getString("originalFare");
                        row[3] = rs.getString("exchangeRate");
                        row[4] = rs.getString("convertedFare");
                        row[5] = rs.getString("tax");
                        row[6] = rs.getString("taxOther");
                        row[7] = rs.getString("total");
                        row[8] = rs.getString("number");
                        row[9] = rs.getString("totalPaid");
                        row[10] = rs.getString("payLater");
                        row[11] = rs.getString("rate");
                        model.addRow(row);
                    } while (rs.next());
                } else if (Objects.equals(reportTypeDDMenu.getSelectedItem().toString(), "Domestic Sales")){
                    do {
                        //"Date", "Issued Blank", "Amount", "Tax", "Tax - Other", "Total Payable", "Pay Later?", "Card Number", "Total Paid", "Commission Rate Used"
                        Object[] row = new Object[9];
                        row[0] = rs.getString("date");
                        row[1] = rs.getString("blankNumber");
                        row[2] = rs.getString("originalFare");
                        row[3] = rs.getString("tax");
                        row[4] = rs.getString("taxOther");
                        row[5] = rs.getString("total");
                        row[6] = rs.getString("number");
                        row[7] = rs.getString("totalPaid");
                        row[8] = rs.getString("rate");
                        model.addRow(row);
                    } while (rs.next());
                }
            }
        } catch (SQLException sqle) {
            if (conn != null) { try { conn.rollback(); } catch (SQLException e) { throw new RuntimeException(sqle); }}
        } finally {
            try { if (conn != null) conn.close(); } catch (Exception e) { throw new RuntimeException(e); }
            try { if (pstm != null) pstm.close(); } catch (Exception e) { throw new RuntimeException(e); }
            try { if (rs != null) rs.close(); } catch (Exception e) { throw new RuntimeException(e); }
        }
    }//GEN-LAST:event_refreshTableButtonActionPerformed

    private void reportTypeDDMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportTypeDDMenuActionPerformed

        // report table for content code
//    DefaultTableModel model = (DefaultTableModel)reportContentsTable.getModel();
//    Connection conn = null;
//    PreparedStatement pstm = null;
//    ResultSet rs = null;
//    String query = null;
//
//        try {
//                conn = DBConnection.getConnection();
//                if (Objects.equals(Objects.requireNonNull(reportTypeDDMenu.getSelectedItem()).toString(), "Interline Sales")){
//                query = "SELECT s.sellDate, t.blankNumber, s.originalFare, s.exchangeRate, s.convertedFare, s.tax, s.taxOther, s.total, s.payLater, ca.number, s.totalPaid, co.rate " +
//                "FROM sale s " +
//                "INNER JOIN staff st ON st.id = s.staffID " +
//                "INNER JOIN ticket t ON t.saleID = s.id " +
//                "INNER JOIN card ca ON ca.customerUsername = t.customerUsername " +
//                "INNER JOIN commission co ON co.blankNumber = t.blankNumber";
//
//                } else if (Objects.equals(reportTypeDDMenu.getSelectedItem().toString(), "Domestic Sales")){
//                query = "SELECT s.sellDate, t.blankNumber, s.originalFare, s.exchangeRate, s.convertedFare, s.tax, s.taxOther, s.total, s.payLater, ca.number, s.totalPaid, co.rate " +
//                "FROM sale s " +
//                "INNER JOIN staff st ON st.id = s.staffID " +
//                "INNER JOIN ticket t ON t.saleID = s.id " +
//                "INNER JOIN card ca ON ca.customerUsername = t.customerUsername " +
//                "INNER JOIN commission co ON co.blankNumber = t.blankNumber";
//                }
//                pstm = conn.prepareStatement(query);
//                rs = pstm.executeQuery();
//                if (!rs.next()) {
//                JOptionPane.showMessageDialog(this, "Could not retrieve sales data. " +
//                "Try again or contact system administrator");
//                } else {
//                model.setRowCount(0);
//                if (Objects.equals(reportTypeDDMenu.getSelectedItem().toString(), "Interline Sales")) {
//                do {
//                Object[] row = new Object[12];
//                row[0] = rs.getString("date");
//                row[1] = rs.getString("blankNumber");
//                row[2] = rs.getString("originalFare");
//                row[3] = rs.getString("exchangeRate");
//                row[4] = rs.getString("convertedFare");
//                row[5] = rs.getString("tax");
//                row[6] = rs.getString("taxOther");
//                row[7] = rs.getString("total");
//                row[8] = rs.getString("number");
//                row[9] = rs.getString("totalPaid");
//                row[10] = rs.getString("payLater");
//                row[11] = rs.getString("rate");
//                model.addRow(row);
//                } while (rs.next());
//                } else {
//                reportContentsTable.setModel(new javax.swing.table.DefaultTableModel(
//                new Object [][] {
//                {null, null, null, null, null, null, null, null, null, null},
//                {null, null, null, null, null, null, null, null, null, null},
//                {null, null, null, null, null, null, null, null, null, null},
//                },
//                new String [] {
//                "Date", "Issued Blank", "Local(USD) Amount", "Tax", "Tax - Other", "Total Payable", "Pay Later?", "Card Number", "Total Paid", " Commission Rate Used"
//                }
//                ));
//                do {
//                Object[] row = new Object[9];
//                row[0] = rs.getString("date");
//                row[1] = rs.getString("blankNumber");
//                row[2] = rs.getString("originalFare");
//                row[3] = rs.getString("tax");
//                row[4] = rs.getString("taxOther");
//                row[5] = rs.getString("total");
//                row[6] = rs.getString("number");
//                row[7] = rs.getString("totalPaid");
//                row[8] = rs.getString("rate");
//                model.addRow(row);
//                } while (rs.next());
//                }
//                }
//                } catch (SQLException sqle) {
//                if (conn != null) { try { conn.rollback(); } catch (SQLException e) { throw new RuntimeException(sqle); }}
//                } finally {
//                try { if (rs != null) rs.close(); } catch (Exception e) { throw new RuntimeException(e); }
//                try { if (pstm != null) pstm.close(); } catch (Exception e) { throw new RuntimeException(e); }
//                try { if (conn != null) conn.close(); } catch (Exception e) { throw new RuntimeException(e); }
//                }




    }//GEN-LAST:event_reportTypeDDMenuActionPerformed

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

    // Variables declaration - do not modify
    // Variables declaration - do not modify
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel functionPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel individualSalesReportPanel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel pageTitleLabel;
    private javax.swing.JPanel pageTitlePanel;
    private javax.swing.JButton refreshTableButton;
    private javax.swing.JTable reportContentsTable;
    private javax.swing.JScrollPane reportTableSP;
    private javax.swing.JComboBox<String> reportTypeDDMenu;
    private javax.swing.JButton sellTicketPageButton;
    private javax.swing.JComboBox<String> showDDMenu;
    private javax.swing.JButton viewIndSalesButton;
    private javax.swing.JButton viewTicketsPageButton;
    // End of variables declaration
}

