/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.travel_advisor;

import SQL.DBConnection;
import interfaces.general.Login;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import staff.*;

import java.sql.*;
import java.util.Objects;

/**
 *
 * @author Abdullah
 */
public class TravelAdvisorHub extends javax.swing.JFrame {

    /**
     * Creates new form TravelAdvisorHub
     */
    public TravelAdvisorHub() {
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

        travelAdvisorHomePanel = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        viewIndSalesButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        viewTicketsPageButton = new javax.swing.JButton();
        sellTicketPageButton = new javax.swing.JButton();
        functionPanel = new javax.swing.JPanel();
        tableName = new javax.swing.JLabel();
        showDDMenu = new javax.swing.JComboBox<>();
        refreshTableButton = new javax.swing.JButton();
        tableScrollPane = new javax.swing.JScrollPane();
        personalBlanksTable= new javax.swing.JTable();
        pageTitlePanel = new javax.swing.JPanel();
        idAndRoleLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        tableFunctionsPanel = new javax.swing.JPanel();
        voidBlankButton = new javax.swing.JButton();
        findBlankLabel = new javax.swing.JTextField();
        findBlankButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATS System | Travel Advisor | Home");
        setBackground(new java.awt.Color(54, 198, 238));
        setMinimumSize(new java.awt.Dimension(1200, 800));

        travelAdvisorHomePanel.setBackground(new java.awt.Color(255, 255, 255));
        travelAdvisorHomePanel.setMaximumSize(new java.awt.Dimension(1200, 800));
        travelAdvisorHomePanel.setMinimumSize(new java.awt.Dimension(1200, 800));

        buttonsPanel.setBackground(new java.awt.Color(49, 174, 209));
        buttonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        homeButton.setBackground(new java.awt.Color(153, 153, 255));
        homeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        homeButton.setText("Home");

        viewIndSalesButton.setBackground(new java.awt.Color(54, 198, 238));
        viewIndSalesButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewIndSalesButton.setText("View Individual Sales Report");
        viewIndSalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewIndSalesButtonActionPerformed(evt);
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
                                                .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(viewIndSalesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        functionPanel.setBackground(new java.awt.Color(49, 174, 209));
        functionPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        functionPanel.setPreferredSize(new java.awt.Dimension(829, 72));

        tableName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableName.setText("Personal Blank Stock");

        showDDMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showDDMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show", "10", "25", "50", "100" }));
        showDDMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDDMenuActionPerformed(evt);
            }
        });

        refreshTableButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        refreshTableButton.setText("Refresh");
        refreshTableButton.setAlignmentY(0.0F);
        refreshTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout functionPanelLayout = new javax.swing.GroupLayout(functionPanel);
        functionPanel.setLayout(functionPanelLayout);
        functionPanelLayout.setHorizontalGroup(
                functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(functionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(showDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(382, 382, 382)
                                .addComponent(tableName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                                .addComponent(refreshTableButton)
                                .addContainerGap())
        );
        functionPanelLayout.setVerticalGroup(
                functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(functionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(showDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tableName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(refreshTableButton))
                                .addGap(0, 5, Short.MAX_VALUE))
        );

        tableScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        personalBlanksTable.setBackground(new java.awt.Color(49, 174, 209));
        personalBlanksTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        personalBlanksTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Date", "Number", "Type", "Status"
                }
        ));
        personalBlanksTable.setColumnSelectionAllowed(true);
        personalBlanksTable.getTableHeader().setReorderingAllowed(false);
        tableScrollPane.setViewportView(personalBlanksTable);
        personalBlanksTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        DefaultTableModel model = (DefaultTableModel)personalBlanksTable.getModel();
        StaffController staffController = new StaffController();

        try{
            conn = DBConnection.getConnection();
            String query = "SELECT * FROM blank WHERE staffID = ?";
            pstm = conn.prepareStatement(query);
//            pstm.setInt(1, staffController.getAdvisor().getId());
            pstm.executeUpdate();
            while (rs.next()){
                Object[] row = new Object[4];
                row[0] = rs.getString("date");
                row[1] = rs.getString("number");
                row[2] = rs.getString("type");
                row[3] = rs.getString("status");
                model.addRow(row);
            }
        } catch (SQLException sqle){
        } finally {
            try { if (conn != null) conn.close(); } catch (Exception e) { throw new RuntimeException(e); }
            try { if (pstm != null) pstm.close(); } catch (Exception e) { throw new RuntimeException(e); }
            try { if (rs != null) rs.close(); } catch (Exception e) { throw new RuntimeException(e); }
        }

        pageTitlePanel.setBackground(new java.awt.Color(49, 174, 209));
        pageTitlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pageTitlePanel.setPreferredSize(new java.awt.Dimension(500, 83));

        idAndRoleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idAndRoleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idAndRoleLabel.setText("Staff ID | Travel Advisor");

        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome <name>");

        javax.swing.GroupLayout pageTitlePanelLayout = new javax.swing.GroupLayout(pageTitlePanel);
        pageTitlePanel.setLayout(pageTitlePanelLayout);
        pageTitlePanelLayout.setHorizontalGroup(
                pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(idAndRoleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pageTitlePanelLayout.setVerticalGroup(
                pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pageTitlePanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idAndRoleLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        infoPanel.setBackground(new java.awt.Color(204, 204, 204));
        infoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        infoLabel.setBackground(new java.awt.Color(204, 204, 204));
        infoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Select an action above, or manage your personal stock of blanks below");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
                infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        infoPanelLayout.setVerticalGroup(
                infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        logoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logoPanel.setMaximumSize(new java.awt.Dimension(104, 104));
        logoPanel.setMinimumSize(new java.awt.Dimension(104, 104));
        logoPanel.setPreferredSize(new java.awt.Dimension(104, 104));

//        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("data/smallLogo.png"))); // NOI18N
        ImageIcon logo = new ImageIcon("data/smallLogo.png");
        logoLabel.setIcon(logo);
        logoPanel.add(logoLabel);
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

        tableFunctionsPanel.setBackground(new java.awt.Color(49, 174, 209));
        tableFunctionsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableFunctionsPanel.setForeground(new java.awt.Color(255, 255, 255));

        voidBlankButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        voidBlankButton.setText("Void");
        voidBlankButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voidBlankButtonActionPerformed(evt);
            }
        });

        findBlankLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        findBlankButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        findBlankButton.setText("Find");
        findBlankButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBlankButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tableFunctionsPanelLayout = new javax.swing.GroupLayout(tableFunctionsPanel);
        tableFunctionsPanel.setLayout(tableFunctionsPanelLayout);
        tableFunctionsPanelLayout.setHorizontalGroup(
                tableFunctionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tableFunctionsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(findBlankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(findBlankButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(voidBlankButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tableFunctionsPanelLayout.setVerticalGroup(
                tableFunctionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableFunctionsPanelLayout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addGroup(tableFunctionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(voidBlankButton)
                                        .addComponent(findBlankLabel)
                                        .addComponent(findBlankButton))
                                .addContainerGap())
        );

        javax.swing.GroupLayout travelAdvisorHomePanelLayout = new javax.swing.GroupLayout(travelAdvisorHomePanel);
        travelAdvisorHomePanel.setLayout(travelAdvisorHomePanelLayout);
        travelAdvisorHomePanelLayout.setHorizontalGroup(
                travelAdvisorHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(travelAdvisorHomePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(travelAdvisorHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(travelAdvisorHomePanelLayout.createSequentialGroup()
                                                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pageTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(tableScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(functionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                                        .addComponent(infoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tableFunctionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        travelAdvisorHomePanelLayout.setVerticalGroup(
                travelAdvisorHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(travelAdvisorHomePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(travelAdvisorHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pageTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                        .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(functionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tableFunctionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(travelAdvisorHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(travelAdvisorHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void sellTicketPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellTicketPageButtonActionPerformed
        dispose();
        new TicketSales().setVisible(true);
    }//GEN-LAST:event_sellTicketPageButtonActionPerformed

    private void viewTicketsPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refundTicketButtonActionPerformed
        dispose();
        new ViewTicketsAdvisor().setVisible(true);
    }//GEN-LAST:event_refundTicketButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void viewIndSalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewIndSalesButtonActionPerformed
        dispose();
        new GenerateIndividualReport().setVisible(true);
    }//GEN-LAST:event_viewIndSalesButtonActionPerformed

    private void refreshTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)personalBlanksTable.getModel();
        StaffController staffController = new StaffController();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.getConnection();
            String query = "SELECT * FROM in2018g12.blank WHERE staffID = ?";
            pstm = conn.prepareStatement(query);
            pstm.setInt(1, staffController.getAdvisor().getId());
            rs = pstm.executeQuery();
            if (!rs.next()){
                JOptionPane.showMessageDialog(this, "Could not refresh table data. " +
                        "Try again or contact system administrator");
            } else {
                model.setRowCount(0);
                do {
                    Object[] row = new Object[4];
                    row[0] = rs.getString("date");
                    row[1] = rs.getString("number");
                    row[2] = rs.getString("type");
                    row[3] = rs.getString("status");
                    model.addRow(row);
                } while (rs.next());
            }
                //JOptionPane.showMessageDialog(this, "Could not refresh table data. Try again or contact system administrator");
        } catch (SQLException sqle) {
            if (conn != null) { try { conn.rollback(); } catch (SQLException e) { throw new RuntimeException(sqle); }}
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) { throw new RuntimeException(e); }
            try { if (pstm != null) pstm.close(); } catch (Exception e) { throw new RuntimeException(e); }
            try { if (conn != null) conn.close(); } catch (Exception e) { throw new RuntimeException(e); }
        }
    }//GEN-LAST:event_refreshTableButtonActionPerformed

    private void showDDMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDDMenuActionPerformed
        DefaultTableModel model = (DefaultTableModel) personalBlanksTable.getModel();
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

    private void findBlankButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel)personalBlanksTable.getModel();
        StaffController staffController = new StaffController();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.getConnection();
            String query = "SELECT * FROM in2018g12.blank WHERE number = ?  AND staffID = ?";
            pstm = conn.prepareStatement(query);
            pstm.setString(1, findBlankLabel.getText());
            pstm.setInt(2, staffController.getAdvisor().getId());
            rs = pstm.executeQuery();
            if (rs.next()){
                model.setRowCount(0);
                Object[] row = new Object[4];
                row[0] = rs.getString("date");
                row[1] = rs.getString("number");
                row[2] = rs.getString("type");
                row[3] = rs.getString("status");
                model.addRow(row);
            } else {
                JOptionPane.showMessageDialog(this, "Could not find requested blank. " +
                        "Review entered number or contact system administrator");
            }
        } catch (SQLException sqle) {
            if (conn != null) { try { conn.rollback(); } catch (SQLException e) { throw new RuntimeException(sqle); }}
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) { throw new RuntimeException(e); }
            try { if (pstm != null) pstm.close(); } catch (Exception e) { throw new RuntimeException(e); }
            try { if (conn != null) conn.close(); } catch (Exception e) { throw new RuntimeException(e); }
        }
    }

    private void voidBlankButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voidBlankButtonActionPerformed
        StaffController staffController = new StaffController();
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = DBConnection.getConnection();
            String query = "UPDATE blank SET status = ? WHERE staffID = ?";
            pstm = conn.prepareStatement(query);
            pstm.setString(1, "Void");
            pstm.setInt(2, staffController.getAdvisor().getId());
            int result = pstm.executeUpdate();
            if (result > 0){
                JOptionPane.showMessageDialog(this, "Selected blank has been voided. " +
                        "Review using the personal stock information table in this menu");
            } else {
                JOptionPane.showMessageDialog(this, "Could not void selected blanks. " +
                        "Review selection or contact system administrator");
            }
        } catch (SQLException sqle) {
            if (conn != null) { try { conn.rollback(); } catch (SQLException e) { throw new RuntimeException(sqle); }}
        } finally {
            try { if (conn != null) conn.close(); } catch (Exception e) { throw new RuntimeException(e); }
            try { if (pstm != null) pstm.close(); } catch (Exception e) { throw new RuntimeException(e); }
        }

    }//GEN-LAST:event_voidBlankButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TravelAdvisorHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAdvisorHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAdvisorHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAdvisorHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TravelAdvisorHub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTable personalBlanksTable;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton findBlankButton;
    private javax.swing.JTextField findBlankLabel;
    private javax.swing.JPanel functionPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel idAndRoleLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel pageTitlePanel;
    private javax.swing.JButton refreshTableButton;
    private javax.swing.JButton sellTicketPageButton;
    private javax.swing.JComboBox<String> showDDMenu;
    private javax.swing.JPanel tableFunctionsPanel;
    private javax.swing.JLabel tableName;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JPanel travelAdvisorHomePanel;
    private javax.swing.JButton viewIndSalesButton;
    private javax.swing.JButton viewTicketsPageButton;
    private javax.swing.JButton voidBlankButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration
}
