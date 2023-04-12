/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.office_manager;

import SQL.DBConnection;
import interfaces.general.Login;

import javax.swing.*;
import java.sql.*;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Abdullah
 */
public class AddCustomer extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomer
     */
    public AddCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //<editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        addCustomerPanel = new javax.swing.JPanel();
        customerDetailsPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        forenameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        forenameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        addCustomerButton = new javax.swing.JButton();
        surnameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        postcodeLabel = new javax.swing.JLabel();
        postcodeField = new javax.swing.JTextField();
        custStatusLabel = new javax.swing.JLabel();
        custStatusDDMenu = new javax.swing.JComboBox<>();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        viewCustomerRecordsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        viewAlertsButton = new javax.swing.JButton();
        manageStockButton = new javax.swing.JButton();
        viewReportButton = new javax.swing.JButton();
        manageCommissionsButton = new javax.swing.JButton();
        pageTitlePanel = new javax.swing.JPanel();
        pageTitleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATS System | Office Manager | View Customer Records | Add Customer");
        setFocusable(false);

        customerDetailsPanel.setBackground(new java.awt.Color(49, 174, 209));
        customerDetailsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        forenameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        forenameLabel.setText("Forename:");

        surnameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        surnameLabel.setText("Surname:");

        addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressLabel.setText("Address:");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabel.setText("Email:");

        phoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneLabel.setText("Phone:");

        forenameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        emailField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        phoneField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addCustomerButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addCustomerButton.setText("Submit");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        surnameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addressField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        postcodeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        postcodeLabel.setText("Postcode:");

        postcodeField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        custStatusLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custStatusLabel.setText("Status:");
        custStatusLabel.setPreferredSize(new java.awt.Dimension(53, 30));

        custStatusDDMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        custStatusDDMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "Regular", "Valued" }));

        javax.swing.GroupLayout customerDetailsPanelLayout = new javax.swing.GroupLayout(customerDetailsPanel);
        customerDetailsPanel.setLayout(customerDetailsPanelLayout);
        customerDetailsPanelLayout.setHorizontalGroup(
                customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerDetailsPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addCustomerButton)
                                .addGap(24, 24, 24))
                        .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customerDetailsPanelLayout.createSequentialGroup()
                                                                .addComponent(phoneLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(phoneField))
                                                        .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                                                                .addComponent(emailLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(emailField))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customerDetailsPanelLayout.createSequentialGroup()
                                                                .addComponent(forenameLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(forenameField))
                                                        .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                                                                .addComponent(surnameLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(61, 61, 61)
                                                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                                                                .addComponent(addressLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                                                                .addComponent(postcodeLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(postcodeField))
                                                        .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                                                                .addComponent(custStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(custStatusDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(backButton)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        customerDetailsPanelLayout.setVerticalGroup(
                customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(backButton)
                                .addGap(96, 96, 96)
                                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                                                .addGap(126, 126, 126)
                                                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(custStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(custStatusDDMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(emailLabel)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(phoneLabel)))
                                        .addGroup(customerDetailsPanelLayout.createSequentialGroup()
                                                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(forenameLabel)
                                                        .addComponent(forenameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addressLabel)
                                                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(surnameLabel)
                                                                .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(postcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(postcodeLabel)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                                .addComponent(addCustomerButton)
                                .addGap(20, 20, 20))
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(logoPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(logoLabel)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        logoPanelLayout.setVerticalGroup(
                logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(logoPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(logoLabel)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        viewCustomerRecordsButton.setBackground(new java.awt.Color(153, 153, 255));
        viewCustomerRecordsButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewCustomerRecordsButton.setText("View Customer Records");

        logoutButton.setBackground(new java.awt.Color(255, 102, 102));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
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

        manageStockButton.setBackground(new java.awt.Color(54, 198, 238));
        manageStockButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        manageStockButton.setText("Manage Stock");
        manageStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStockButtonActionPerformed(evt);
            }
        });

        viewReportButton.setBackground(new java.awt.Color(54, 198, 238));
        viewReportButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewReportButton.setText("Generate/View Report");
        viewReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportButtonActionPerformed(evt);
            }
        });

        manageCommissionsButton.setBackground(new java.awt.Color(54, 198, 238));
        manageCommissionsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        manageCommissionsButton.setText("Manage Commissions");
        manageCommissionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCommissionsButtonActionPerformed(evt);
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
                                                .addComponent(homeButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(viewCustomerRecordsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(manageCommissionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(logoutButton))
                                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                                .addComponent(viewAlertsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(viewReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(manageStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
                buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(viewCustomerRecordsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                        .addComponent(homeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                        .addComponent(manageCommissionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(manageStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewAlertsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pageTitlePanel.setBackground(new java.awt.Color(49, 174, 209));
        pageTitlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pageTitleLabel.setBackground(new java.awt.Color(49, 174, 209));
        pageTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pageTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitleLabel.setText("Add Customer");

        javax.swing.GroupLayout pageTitlePanelLayout = new javax.swing.GroupLayout(pageTitlePanel);
        pageTitlePanel.setLayout(pageTitlePanelLayout);
        pageTitlePanelLayout.setHorizontalGroup(
                pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pageTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pageTitlePanelLayout.setVerticalGroup(
                pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageTitlePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pageTitleLabel)
                                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout addCustomerPanelLayout = new javax.swing.GroupLayout(addCustomerPanel);
        addCustomerPanel.setLayout(addCustomerPanelLayout);
        addCustomerPanelLayout.setHorizontalGroup(
                addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCustomerPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(customerDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pageTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        addCustomerPanelLayout.setVerticalGroup(
                addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addCustomerPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(addCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(pageTitlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customerDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1200, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(addCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 800, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(addCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new OfficeManagerHub().setVisible(true);
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new Login().setVisible(true);
    }

    private void viewAlertsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new ViewAlerts().setVisible(true);
    }

    private void viewReportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new GenerateReport().setVisible(true);
    }

    private void manageStockButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new ManageStock().setVisible(true);
    }

    private void manageCommissionsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new ManageCommissions().setVisible(true);
    }


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String[] usernames = {forenameField.getText(), forenameField.getText() + surnameField.getText().charAt(0)};
        Random random = new Random();
        int index = random.nextInt(usernames.length);
        String username = usernames[index];

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.getConnection();
            String checkCustomerQuery = "SELECT COUNT(*) AS count FROM in2018g12.customer WHERE username=?";
            pstm = conn.prepareStatement(checkCustomerQuery);
            pstm.setString(1, username);
            rs = pstm.executeQuery();
            if (rs.next()){
                int count = rs.getInt("count");
                if (count > 0){
                    JOptionPane.showMessageDialog(this, "Customer already exists in system. " +
                            "Review using 'View Customer Records' menu or contact system administrator");
                } else {
                    String query = "INSERT INTO in2018g12.customer VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                    pstm = conn.prepareStatement(query);
                    pstm.setString(1, username);
                    pstm.setString(2, forenameField.getText());
                    pstm.setString(3, surnameField.getText());
                    pstm.setString(4, addressField.getText());
                    pstm.setString(5, postcodeField.getText());
                    pstm.setString(6, phoneField.getText());
                    pstm.setString(7, emailField.getText());
                    pstm.setString(8, Objects.requireNonNull(custStatusDDMenu.getSelectedItem()).toString());
                    int result = pstm.executeUpdate();
                    if (result > 0) {
                        JOptionPane.showMessageDialog(this, "Customer added to system. " +
                                "Review using 'View Customer Records' menu");
                    } else {
                        JOptionPane.showMessageDialog(this, "Could not add customer to system. " +
                                "Review details entered or contact system administrator");
                    }
                }
            }
        } catch (SQLException sqle) {
            if (conn != null) { try { conn.rollback(); } catch (SQLException e) { throw new RuntimeException(sqle); }}
        } finally {
            try { if (conn != null) conn.close(); } catch (Exception e) { throw new RuntimeException(e); }
            try { if (pstm != null) pstm.close(); } catch (Exception e) { throw new RuntimeException(e); }
            try { if (rs != null) rs.close(); } catch (Exception e) { throw new RuntimeException(e); }
        }
    }

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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JPanel addCustomerPanel;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JComboBox<String> custStatusDDMenu;
    private javax.swing.JLabel custStatusLabel;
    private javax.swing.JPanel customerDetailsPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField forenameField;
    private javax.swing.JLabel forenameLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageCommissionsButton;
    private javax.swing.JButton manageStockButton;
    private javax.swing.JLabel pageTitleLabel;
    private javax.swing.JPanel pageTitlePanel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField postcodeField;
    private javax.swing.JLabel postcodeLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JButton viewAlertsButton;
    private javax.swing.JButton viewCustomerRecordsButton;
    private javax.swing.JButton viewReportButton;
    // End of variables declaration
}
