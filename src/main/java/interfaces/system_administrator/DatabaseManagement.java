/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.system_administrator;

import interfaces.general.Login;

import javax.swing.*;
import java.io.*;
import java.util.*;



/**
 *
 * @author Abdullah
 */
public class DatabaseManagement extends javax.swing.JFrame {

    /**
     * Creates new form databaseManagementFrame
     */
    public DatabaseManagement() throws IOException, InterruptedException {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() throws IOException, InterruptedException {

        buttonsPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        databaseManagementPageButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        manageStockPageButton = new javax.swing.JButton();
        pageTitlePanel = new javax.swing.JPanel();
        pageTitleLabel = new javax.swing.JLabel();
        functionPanel = new javax.swing.JPanel();
        backupDBPanel = new javax.swing.JPanel();
        panelTitle = new javax.swing.JLabel();
        backupDatabaseButton = new javax.swing.JButton();
        backupLocationLabel = new javax.swing.JLabel();
        backupInfoPanel = new javax.swing.JPanel();
        infoLabel1 = new javax.swing.JLabel();
        infoLabel2 = new javax.swing.JLabel();
        selectBackupLocationButton = new javax.swing.JButton();
        restoreDBPanel = new javax.swing.JPanel();
        sectionPanel = new javax.swing.JLabel();
        restoreDatabaseButton = new javax.swing.JButton();
        backupFileLabel = new javax.swing.JLabel();
        restoreInfoPanel = new javax.swing.JPanel();
        infoLabel1_2 = new javax.swing.JLabel();
        infoLabel1_1 = new javax.swing.JLabel();
        selectBackupFileButton = new javax.swing.JButton();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATS System | System Admin | Database Management");
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setSize(new java.awt.Dimension(1200, 800));

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

        databaseManagementPageButton.setBackground(new java.awt.Color(153, 153, 255));
        databaseManagementPageButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        databaseManagementPageButton.setText("Database Management");

        logoutButton.setBackground(new java.awt.Color(255, 102, 102));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        manageStockPageButton.setBackground(new java.awt.Color(54, 198, 238));
        manageStockPageButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        manageStockPageButton.setText("Manage Stock");
        manageStockPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStockPageButtonActionPerformed(evt);
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
                                                .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(databaseManagementPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                        .addComponent(manageStockPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
                buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(databaseManagementPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(manageStockPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pageTitlePanel.setBackground(new java.awt.Color(49, 174, 209));
        pageTitlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pageTitleLabel.setBackground(new java.awt.Color(49, 174, 209));
        pageTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pageTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitleLabel.setText("Database Management");

        javax.swing.GroupLayout pageTitlePanelLayout = new javax.swing.GroupLayout(pageTitlePanel);
        pageTitlePanel.setLayout(pageTitlePanelLayout);
        pageTitlePanelLayout.setHorizontalGroup(
                pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pageTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        pageTitlePanelLayout.setVerticalGroup(
                pageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageTitlePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pageTitleLabel)
                                .addGap(35, 35, 35))
        );

        functionPanel.setBackground(new java.awt.Color(49, 174, 209));
        functionPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        functionPanel.setMaximumSize(new java.awt.Dimension(1200, 800));
        functionPanel.setMinimumSize(new java.awt.Dimension(1200, 800));
        functionPanel.setPreferredSize(new java.awt.Dimension(1200, 800));

        backupDBPanel.setBackground(new java.awt.Color(54, 198, 238));
        backupDBPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        panelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelTitle.setText("Backup Database");
        panelTitle.setBorder(new javax.swing.border.MatteBorder(null));

        backupDatabaseButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backupDatabaseButton.setText("Backup Database");
        backupDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupDatabaseButtonActionPerformed(evt);

                // Set database credentials
                String username = "in2018g12_d";
                String password = "password";
                String databaseName = "in2018g12";
                String databaseBackupPath = "backup_path";


                try {
                    Date today = new Date(); // Get the current date
                    String fileName = databaseName + "_" + today.getTime() + ".sql"; // Generate unique file name
                    String backupFile = databaseBackupPath + "\\" + fileName; // Create backup file path
                    File file = new File(backupFile); // Create new file object
                    file.createNewFile(); // Create the backup file

                    String command = "mysqldump -u " + username + " -p" + password + " " + databaseName + " -r " + backupFile; // Create the backup command
                    Process p = Runtime.getRuntime().exec(command); // Execute backup command
                    int backupComplete = p.waitFor(); // Wait for backup to complete

                    if (backupComplete == 0) { // Check if backup was successful
                        System.out.println("Backup successfully created"); // Print success message
                    } else {
                        System.out.println("Backup failed"); // Print failure message
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                });


        backupLocationLabel.setBackground(new java.awt.Color(204, 204, 204));
        backupLocationLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        backupInfoPanel.setBackground(new java.awt.Color(54, 198, 238));

        infoLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoLabel1.setText("On clicking the \"Select File\" button, a File Explorer prompt will be shown allowing you to select where the backup will be stored.");

        infoLabel2.setBackground(new java.awt.Color(54, 198, 238));
        infoLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoLabel2.setText("The selected location will be displayed in the text box below for confirmation.");

        javax.swing.GroupLayout backupInfoPanelLayout = new javax.swing.GroupLayout(backupInfoPanel);
        backupInfoPanel.setLayout(backupInfoPanelLayout);
        backupInfoPanelLayout.setHorizontalGroup(
                backupInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backupInfoPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(backupInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(infoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(infoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(35, Short.MAX_VALUE))
        );
        backupInfoPanelLayout.setVerticalGroup(
                backupInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backupInfoPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(infoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        selectBackupLocationButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectBackupLocationButton.setText("Select Location");
        selectBackupLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBackupLocationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backupDBPanelLayout = new javax.swing.GroupLayout(backupDBPanel);
        backupDBPanel.setLayout(backupDBPanelLayout);
        backupDBPanelLayout.setHorizontalGroup(
                backupDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backupDBPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(backupLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectBackupLocationButton)
                                .addGap(18, 18, 18)
                                .addComponent(backupDatabaseButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(backupDBPanelLayout.createSequentialGroup()
                                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backupInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backupDBPanelLayout.setVerticalGroup(
                backupDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backupDBPanelLayout.createSequentialGroup()
                                .addGroup(backupDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(backupInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(backupDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(backupLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(backupDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(backupDatabaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(selectBackupLocationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        restoreDBPanel.setBackground(new java.awt.Color(54, 198, 238));
        restoreDBPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sectionPanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sectionPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sectionPanel.setText("Restore Database");
        sectionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sectionPanel.setMaximumSize(new java.awt.Dimension(149, 27));
        sectionPanel.setMinimumSize(new java.awt.Dimension(149, 27));
        sectionPanel.setPreferredSize(new java.awt.Dimension(149, 27));

        restoreDatabaseButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        restoreDatabaseButton.setText("Restore Database");
        restoreDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {restoreDatabaseButtonActionPerformed(evt);

                String username = "in2018g12_d"; // Set the database user
                String password = "password"; // Set the database password
                String databaseName = "in2018g12"; // Set the database name

                String backupFilePath = "path_to_backup_file"; // Set path to backup file

                try {
                    ProcessBuilder processBuilder = new ProcessBuilder( // Create a process builder to execute the SQL command to restore the database
                            "mysql",
                            "in2018g12_d" + username,
                            "password" + password,
                            databaseName);
                    processBuilder.redirectInput(new File(backupFilePath)); // Redirect input from the backup file
                    Process process = processBuilder.start(); // Start the process
                    int restoreComplete = process.waitFor(); // Wait for process to complete

                    if (restoreComplete == 0) { // Check if process is completed successfully
                        System.out.println("Database restored successfully"); // Print success message
                    } else {
                        System.out.println("Database restore failed"); // Print failure message
                    }

                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }

                }
        });

        backupFileLabel.setBackground(new java.awt.Color(204, 204, 204));
        backupFileLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        restoreInfoPanel.setBackground(new java.awt.Color(54, 198, 238));

        infoLabel1_2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoLabel1_2.setText("The selected location will be displayed in the text box below for confirmation.");

        infoLabel1_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoLabel1_1.setText("On clicking the \"Select File\" button, a File Explorer prompt will be shown allowing you to select the backup file you'd like to use.");

        javax.swing.GroupLayout restoreInfoPanelLayout = new javax.swing.GroupLayout(restoreInfoPanel);
        restoreInfoPanel.setLayout(restoreInfoPanelLayout);
        restoreInfoPanelLayout.setHorizontalGroup(
                restoreInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(restoreInfoPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(restoreInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(infoLabel1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(infoLabel1_2))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        restoreInfoPanelLayout.setVerticalGroup(
                restoreInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restoreInfoPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(infoLabel1_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoLabel1_2)
                                .addContainerGap())
        );

        selectBackupFileButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectBackupFileButton.setText("Select File");
        selectBackupFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBackupFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout restoreDBPanelLayout = new javax.swing.GroupLayout(restoreDBPanel);
        restoreDBPanel.setLayout(restoreDBPanelLayout);
        restoreDBPanelLayout.setHorizontalGroup(
                restoreDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(restoreDBPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(backupFileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectBackupFileButton)
                                .addGap(18, 18, 18)
                                .addComponent(restoreDatabaseButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(restoreDBPanelLayout.createSequentialGroup()
                                .addComponent(sectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(restoreInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        restoreDBPanelLayout.setVerticalGroup(
                restoreDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(restoreDBPanelLayout.createSequentialGroup()
                                .addGroup(restoreDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(restoreInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(restoreDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(restoreDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(restoreDatabaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(selectBackupFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(backupFileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout functionPanelLayout = new javax.swing.GroupLayout(functionPanel);
        functionPanel.setLayout(functionPanelLayout);
        functionPanelLayout.setHorizontalGroup(
                functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(functionPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(backupDBPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(restoreDBPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        functionPanelLayout.setVerticalGroup(
                functionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(functionPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(backupDBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(restoreDBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logoPanel.setMaximumSize(new java.awt.Dimension(104, 104));
        logoPanel.setMinimumSize(new java.awt.Dimension(104, 104));
        logoPanel.setPreferredSize(new java.awt.Dimension(104, 104));

        //logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/smallLogo.png"))); // NOI18N
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
                        .addGap(0, 102, Short.MAX_VALUE)
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
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pageTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(functionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pageTitlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(functionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new SystemAdminHub().setVisible(true);
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new Login().setVisible(true);
    }

    private void manageStockPageButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new AddStock().setVisible(true);
    }

    private void selectBackupLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            backupLocationLabel.setText(fileChooser.getSelectedFile() + "\\" + "dbbackup.sql");
        }
    }

    private void backupDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        File file = new File(backupLocationLabel.getText());

    }

    private void selectBackupFileButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            backupFileLabel.setText(String.valueOf(fileChooser.getSelectedFile()));
        }


    }

    private void restoreDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

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
            java.util.logging.Logger.getLogger(DatabaseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatabaseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatabaseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatabaseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DatabaseManagement().setVisible(true);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel backupDBPanel;
    private javax.swing.JButton backupDatabaseButton;
    private javax.swing.JLabel backupLocationLabel;
    private javax.swing.JPanel backupInfoPanel;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton databaseManagementPageButton;
    private javax.swing.JPanel functionPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel infoLabel1_1;
    private javax.swing.JLabel infoLabel1_2;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageStockPageButton;
    private javax.swing.JLabel pageTitleLabel;
    private javax.swing.JPanel pageTitlePanel;
    private javax.swing.JLabel panelTitle;
    private javax.swing.JPanel restoreDBPanel;
    private javax.swing.JButton restoreDatabaseButton;
    private javax.swing.JLabel backupFileLabel;
    private javax.swing.JPanel restoreInfoPanel;
    private javax.swing.JLabel sectionPanel;
    private javax.swing.JButton selectBackupFileButton;
    private javax.swing.JButton selectBackupLocationButton;
    // End of variables declaration
}
