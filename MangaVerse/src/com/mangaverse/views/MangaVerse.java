/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// Package declaration for the MangaVerse views
package com.mangaverse.views;

// Import statements for necessary classes and utilities
import com.mangaverse.StringUtil;
import com.mangaverse.controllers.BinarySearchManga;
import com.mangaverse.controllers.MergeSortManga;
import com.mangaverse.models.MangaModel;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 * The MangaVerse class represents the main JFrame of the MangaVerse application.
 * @author: Shailshree 
 */
public class MangaVerse extends javax.swing.JFrame {

    // Variable to store the index of the selected row in the table
    int selectedRow;

    // ArrayList to store instances of MangaModel representing manga data
    ArrayList<MangaModel> mangaList = new ArrayList();

    // Arrays to store individual attributes of manga data for use in JTable
    private int[] serialNumber;
    private String[] title;
    private int[] totalChapter;
    private String[] status;
    private int[] rating;
    private String[] publisher;
    private String[] genre;
    private String[] author;
    private String[] releaseDate;

    StringUtil stringUtil = new StringUtil();
    // Constructor for the MangaVerse class
    MangaVerse() {
        // Initialize the components of the JFrame
        initComponents();
        // Set the location of the JFrame to the center of the screen
        setLocationRelativeTo(null);
        // Retrieve manga data and populate the JTable
        getTableData();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManga = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        searchComboBox = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        sortComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tfSerialNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTotalChapter = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfGenre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfStatus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfPublisher = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfAuthor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfReleaseDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnClear = new javax.swing.JButton();
        btnSort1 = new javax.swing.JButton();
        tfRating = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 0, 0)));

        tblManga.setBackground(new java.awt.Color(153, 153, 153));
        tblManga.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 51, 102)));
        tblManga.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        tblManga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "One piece", "1101", "ongoing", "4", "VIz Media", "Action", "Eiichiro Oda", "July 22, 1997"},
                {"2", "Dragon Ball", "115", "completed", "3", "Shueisha's", "Adventure", "Akira Toriyama", "November 20, 1984"},
                {"3", "Attack on Titan", "196", "completed", "4", "Bessatsu", "Action", "Hajime Isayama", "September 9, 2009"},
                {"4", "Vagabond", "79", "ongoing", "4", "Viz Media", "Comendy", "Takehiko Inoue", "April 21, 2015"},
                {"5", "Tokyo Ghoul", "110", "completed", "3", "Crunchyroll", "Shounen", "Sui Ishida", "September 8, 2011"},
                {"6", "Jujutsu Kaisen", "22", "ongoing", "5", "Yen Press", "Romance", "Gege Akutami", "October 2023"},
                {"7", "Shaman King", "312", "ongoing", "5", "Aniplex", "Shouen", "Hiroyuki Takei", "August 2004"},
                {"8", "Berserk", "364", "completed", "4", "Jet Comics", "Action", "Kentaro Miura", "November 26, 1990"},
                {"9", "Akira", "120", "completed", "3", "Kodansha Comics", "Drama", "Katsuhiro Otomo", "December 20, 1982"},
                {"10", "Death Note", "108", "completed", "5", "Viz Media", "Thriller", "Tsugumi Ohba", "December 1, 2003"},
                {"11", "Naruto", "700", "completed", "4", "Viz Media", "Action", "Masashi Kishi", "September 21, 1999"},
                {"12", "Haikyu", "402", "completed", "4", "Shueisha", "Comedy", "Haruichi ", "February 20, 2012"},
                {"13", "Bleach", "698", "completed", "3", "Shueisha", "Adventure", "Tite Kubo ", "August 7, 2001 "},
                {"14", "Fruit Basket", "136", "completed", "5", "Hakusensha", "RomCom", "Natsuki Takaya  ", "July 1998 "},
                {"15", "Paradise Kiss", "48", "completed", "4", "Shodensha ", "Romance", "Ai Yazawa ", "May 21, 2002 "}
            },
            new String [] {
                "S.N", "Title", "Total chapter", "Status", "Rating (5)", "Publisher", "Genre", "Author", "Release Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManga.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblManga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblManga.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        tblManga.setMinimumSize(new java.awt.Dimension(710, 200));
        tblManga.setName(""); // NOI18N
        tblManga.setSelectionForeground(new java.awt.Color(255, 51, 0));
        tblManga.getTableHeader().setResizingAllowed(false);
        tblManga.getTableHeader().setReorderingAllowed(false);
        tblManga.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tblMangaMouseDragged(evt);
            }
        });
        tblManga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMangaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManga);
        if (tblManga.getColumnModel().getColumnCount() > 0) {
            tblManga.getColumnModel().getColumn(0).setMinWidth(10);
            tblManga.getColumnModel().getColumn(0).setMaxWidth(40);
            tblManga.getColumnModel().getColumn(1).setMinWidth(140);
            tblManga.getColumnModel().getColumn(2).setMinWidth(85);
            tblManga.getColumnModel().getColumn(5).setMinWidth(150);
            tblManga.getColumnModel().getColumn(5).setMaxWidth(150);
            tblManga.getColumnModel().getColumn(7).setMinWidth(130);
            tblManga.getColumnModel().getColumn(8).setMinWidth(150);
            tblManga.getColumnModel().getColumn(8).setMaxWidth(170);
        }

        jLabel1.setFont(new java.awt.Font("Monospaced", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("   MANGA VERSE");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 0)));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S.N", "Title", "TotalChapter", "Author" }));

        btnAdd.setBackground(new java.awt.Color(255, 102, 102));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mangaverse/views/logoManga.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(35, 35));
        jLabel2.setMinimumSize(new java.awt.Dimension(35, 35));
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));

        btnUpdate.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSort.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSort.setText("↑");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S.N", "Title", "Total_Chapter", "Status", "Rating", "Publisher", "Genre", "Author", "Release_Date" }));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("  S.N");

        tfSerialNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSerialNumberKeyPressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Title");

        tfTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfTitleKeyPressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Total Chapter");

        tfTotalChapter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfTotalChapterKeyPressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Genre");

        tfGenre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfGenreKeyPressed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Status");

        tfStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfStatusKeyPressed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Publisher");

        tfPublisher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPublisherKeyPressed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Author");

        tfAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAuthorKeyPressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Rating");

        tfReleaseDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfReleaseDateKeyPressed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("Release Date");

        jSeparator1.setForeground(new java.awt.Color(255, 51, 51));

        btnClear.setBackground(new java.awt.Color(255, 102, 102));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSort1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSort1.setText("↓");
        btnSort1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSort1ActionPerformed(evt);
            }
        });

        tfRating.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfRatingKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnSearch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSort1))
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)))
                        .addGap(21, 21, 21)
                        .addComponent(tfTotalChapter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfRating, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(tfReleaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSort1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRating, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotalChapter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfReleaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * This method returns the JTable associated with manga data.
    * @return The JTable containing manga data.
    */
    public JTable getTblManga() {
        return tblManga;
    }
    
    /**
    * Checks if a given serial number (SN) is a duplicate in the current JTable.
    * @param key The serial number to check for duplication.
    * @return true if the serial number is a duplicate, false otherwise.
    */
    private boolean isDuplicateSN(int key){
    // Get the number of rows in the JTable
    selectedRow = tblManga.getRowCount();

    // Iterate through each row in the JTable
    for (int i = 0; i < selectedRow; i++) {
        // Extract the serial number from the current row
        int tableSN = Integer.parseInt(tblManga.getValueAt(i, NORMAL).toString());
        
        // Check if the given serial number matches any in the JTable
        if (key == tableSN) {
            return true; // Duplicate found
        }
    }
    return false; // No duplicate found
   }
    
    /**
    * Event handler for the delete button.
    * Prompts the user for confirmation before deleting the selected row from the JTable.
    * Displays appropriate messages based on the outcome of the deletion operation.
    * @param evt The ActionEvent associated with the button click.
    */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      
        // Prompt the user for confirmation before deleting the row
        int choice = JOptionPane.showConfirmDialog(null, stringUtil.CONFIRM_MESSAGE, "Confirmation", JOptionPane.YES_NO_OPTION);

        // Check the user's choice
        if (choice == JOptionPane.YES_OPTION) {
            // Get the index of the selected row
            selectedRow = tblManga.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel)tblManga.getModel();

            // Check the number of selected rows
            if (tblManga.getSelectedRowCount() == 1) {
                // Remove the selected row from the JTable
                tableModel.removeRow(selectedRow);
                // Display a success message
                JOptionPane.showMessageDialog(this, stringUtil.DELETED, "Deleted", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Display appropriate messages for different scenarios
                if (tblManga.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, stringUtil.EMPTY_TABLE);
                } else if (tblManga.getSelectedRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, stringUtil.SELECT_ROW);
               
                }
            }
        } else {
            // Display a message indicating that no rows were deleted
            JOptionPane.showMessageDialog(this, stringUtil.NOT_DELETED, "No deletion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
    * Event handler for the update button. Updates the selected row in the JTable with the values
    * provided in the text fields after performing validation checks.
    * @param evt The ActionEvent associated with the button click.
    */
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // Get the index of the selected row
        selectedRow = tblManga.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) tblManga.getModel();

        // Check if any of the required text fields are empty
        if (tfSerialNumber.getText().isEmpty() || tfTitle.getText().isEmpty() || tfTotalChapter.getText().isEmpty() ||
            tfStatus.getText().isEmpty() || tfRating.getText().isEmpty() || tfPublisher.getText().isEmpty() ||
            tfGenre.getText().isEmpty() || tfAuthor.getText().isEmpty() || tfReleaseDate.getText().isEmpty()) {

            // Display a warning message if any field is empty
            JOptionPane.showMessageDialog(this, stringUtil.EMPTY_FIELDS, "Please Fill up", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                // Parse values from text fields
                int serialNumber = Integer.parseInt(tfSerialNumber.getText());
                String title = tfTitle.getText();
                int totalChapter = Integer.parseInt(tfTotalChapter.getText());
                String genre = tfGenre.getText();
                String status = tfStatus.getText();
                String publisher = tfPublisher.getText();
                String author = tfAuthor.getText();
                int rating = Integer.parseInt(tfRating.getText());
                String releaseDate = tfReleaseDate.getText();

                // Validate the rating
                if (rating > 5) {
                    // Display a warning message for an invalid rating
                    JOptionPane.showMessageDialog(this, stringUtil.RATING_MORE, "Invalid Rating", JOptionPane.WARNING_MESSAGE);
                } else if (rating <= 0) {
                    // Display a warning message for an invalid rating
                    JOptionPane.showMessageDialog(this, stringUtil.RATING_ZERO, "Invalid Rating", JOptionPane.WARNING_MESSAGE);
                } else {
                    // Update the values in the selected row of the JTable
                    tableModel.setValueAt(serialNumber, selectedRow, 0);
                    tableModel.setValueAt(title, selectedRow, 1);
                    tableModel.setValueAt(totalChapter, selectedRow, 2);
                    tableModel.setValueAt(status, selectedRow, 3);
                    tableModel.setValueAt(rating, selectedRow, 4);
                    tableModel.setValueAt(publisher, selectedRow, 5);
                    tableModel.setValueAt(genre, selectedRow, 6);
                    tableModel.setValueAt(author, selectedRow, 7);
                    tableModel.setValueAt(releaseDate, selectedRow, 8);

                    // Clear the text fields and display a success message
                    tfSerialNumber.setText("");
                    tfTitle.setText("");
                    tfTotalChapter.setText("");
                    tfGenre.setText("");
                    tfStatus.setText("");
                    tfPublisher.setText("");
                    tfAuthor.setText("");
                    tfRating.setText("");
                    tfReleaseDate.setText("");

                    JOptionPane.showMessageDialog(this, stringUtil.UPDATE_MESSAGE, "UPDATED", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                // Display an error message if the user enters invalid syntax
                JOptionPane.showMessageDialog(this, stringUtil.INVALID_SYNTAX, "Invalid Syntax", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    /**
    * Event handler for the add button.
    * Validates user input, adds a new row of manga data to the JTable, and updates the internal mangaList.
    * Displays appropriate messages for success or validation errors.
    * @param evt The ActionEvent associated with the button click.
    */
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        // Check if any of the required text fields is empty
       if (tfSerialNumber.getText().isEmpty() || tfTitle.getText().isEmpty() || tfTotalChapter.getText().isEmpty()
               || tfStatus.getText().isEmpty() || tfRating.getText().isEmpty() || tfPublisher.getText().isEmpty()
               || tfGenre.getText().isEmpty() || tfAuthor.getText().isEmpty() || tfReleaseDate.getText().isEmpty()) {

           // Display a warning message if any required field is empty
           JOptionPane.showMessageDialog(this, stringUtil.EMPTY_FIELDS, "Incomplete Form", JOptionPane.WARNING_MESSAGE);
       } else {
           // Parse input values from text fields
           int newSerialNumber = Integer.parseInt(tfSerialNumber.getText());
           String newTitle = tfTitle.getText();
           int newTotalChapter = Integer.parseInt(tfTotalChapter.getText());
           String newStatus = tfStatus.getText();
           int newRating = Integer.parseInt(tfRating.getText());
           String newPublisher = tfPublisher.getText();
           String newGenre = tfGenre.getText();
           String newAuthor = tfAuthor.getText();
           String newReleaseDate = tfReleaseDate.getText();

           // Validate the rating input
           if (newRating > 5) {
               // Display a warning message for invalid rating
               JOptionPane.showMessageDialog(this, stringUtil.RATING_MORE, "Invalid Rating", JOptionPane.WARNING_MESSAGE);
           } else if (newRating <= 0) {
               // Display a warning message for invalid rating
               JOptionPane.showMessageDialog(this, stringUtil.RATING_ZERO, "Invalid Rating", JOptionPane.WARNING_MESSAGE);
           } else {
               // Check for duplicate serial number
               if (!isDuplicateSN(newSerialNumber)) {
                   // Add new row to the JTable
                   DefaultTableModel model = (DefaultTableModel) tblManga.getModel();
                   model.addRow(new Object[]{newSerialNumber, newTitle, newTotalChapter, newStatus, newRating, newPublisher, newGenre, newAuthor, newReleaseDate});

                   // Create a new MangaModel instance and update its attributes
                   MangaModel manga = new MangaModel(newSerialNumber, newTitle, newTotalChapter, newStatus, newRating, newPublisher, newGenre, newAuthor, newReleaseDate);
                   mangaList.add(manga);

                   // Clear the text fields
                   tfSerialNumber.setText("");
                   tfTitle.setText("");
                   tfTotalChapter.setText("");
                   tfGenre.setText("");
                   tfStatus.setText("");
                   tfPublisher.setText("");
                   tfAuthor.setText("");
                   tfRating.setText("");
                   tfReleaseDate.setText("");

                   // Display a success message
                   JOptionPane.showMessageDialog(this, stringUtil.ADD_TABLE, "Updated", JOptionPane.INFORMATION_MESSAGE);
               } else {
                   // Display a warning message for duplicate serial number
                   JOptionPane.showMessageDialog(this, stringUtil.INVALID_SYNTAX, "Invalid Serial Number", JOptionPane.WARNING_MESSAGE);
               }
           }
       }
    }//GEN-LAST:event_btnAddActionPerformed

    /**
    * Event handler for the search button. Performs search based on the selected criteria
    * (Serial Number, Title, Total Chapter, Author) and displays the corresponding manga details.
    * Validates user input and handles exceptions appropriately.
    * @param evt The ActionEvent associated with the button click.
    */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    
        // Get the selected search criteria and the search value from the UI components
        String searchItem = searchComboBox.getSelectedItem().toString().toUpperCase();
        String searchValue = tfSearch.getText();

        // Validate and retrieve manga data
        getTableValue();

        // Variable to store the search result index
        int result;

        try {
            // Retrieve manga data and initialize the BinarySearchManga object
            getTableValue();
            BinarySearchManga searchManga = new BinarySearchManga();

            // Perform search based on the selected criteria
            switch(searchItem) {
                case "S.N" -> {
                    // Search by Serial Number
                    result = searchManga.searchByID(serialNumber, 0, serialNumber.length, Integer.parseInt(searchValue));
                    // Display manga details if found, otherwise show a message
                    JOptionPane.showMessageDialog(rootPane, "Serial Number: " + searchValue + "\nTitle: " + title[result] + "\nTotal Chapter: " + totalChapter[result] + "\nStatus: " + status[result] + "\nRating: " +
                            rating[result] + "\nPublisher: " + publisher[result] + "\nGenre: " + genre[result] + "\nAuthor: " + author[result] + "\nRelease Date: " + releaseDate[result]);
                }

                case "TITLE" -> {
                    // Search by Title
                    result = searchManga.searchValue(title, 0, title.length, searchValue);
                    // Display manga details if found, otherwise show a message
                    if (result != -1) {
                        JOptionPane.showMessageDialog(this, "Serial Number: " + serialNumber[result] + "\nTitle: " + searchValue + "\nTotal Chapter: " + totalChapter[result] + "\nStatus: " + status[result]
                                + "\nRating: " + rating[result] + "\nPublisher: " + publisher[result] + "\nGenre: " + genre[result] + "\nAuthor: " + author[result] + "\nRelease Date: " + releaseDate[result]);
                    } else {
                        System.out.println("Manga not found.");
                    }
                }

                case "TOTALCHAPTER" -> {
                    // Search by Total Chapter
                    result = searchManga.searchByID(totalChapter, 0, totalChapter.length, Integer.parseInt(searchValue));
                    // Display manga details if found, otherwise show a message
                    if (result != -1) {
                        JOptionPane.showMessageDialog(rootPane, "Serial Number: " + serialNumber[result] + "\nTitle: " + title[result] + "\nTotal Chapter: " + searchValue + "\nStatus: " + status[result] + "\nRating: " +
                                rating[result] + "\nPublisher: " + publisher[result] + "\nGenre: " + genre[result] + "\nAuthor: " + author[result] + "\nRelease Date: " + releaseDate[result]);
                    } else {
                        System.out.println("Manga not found.");
                    }
                }

                case "AUTHOR" -> {
                    // Search by Author
                    result = searchManga.searchValue(author, 0, author.length, searchValue);
                    // Display manga details if found, otherwise show a message
                    if (result != -1) {
                        JOptionPane.showMessageDialog(rootPane, "Serial Number: " + serialNumber[result] + "\nTitle: " + title[result] + "\nTotal Chapter: " + totalChapter[result] + "\nStatus: " + status[result] + "\nRating: " +
                                rating[result] + "\nPublisher: " + publisher[result] + "\nGenre: " + genre[result] + "\nAuthor: " + searchValue + "\nRelease Date: " + releaseDate[result]);
                    } else {
                        System.out.println("Manga not found.");
                    }
                }
            }
        
        } catch (Exception ex) {
            // Handle other exceptions and display an appropriate error message
            JOptionPane.showMessageDialog(this, stringUtil.ERROR + ex.getMessage());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
    * Event handler for mouse click on the JTable row. 
    * Populates text fields with data from the selected row for editing.
    * @param evt The MouseEvent associated with the mouse click.
    */
    private void tblMangaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMangaMouseClicked
        
        // Get the index of the selected row in the JTable
        selectedRow = tblManga.getSelectedRow();

        // Ensure a valid row is selected
        if (selectedRow >= 0) {
            // Populate text fields with data from the selected row
            tfSerialNumber.setText(tblManga.getValueAt(selectedRow, 0).toString());
            tfTitle.setText(tblManga.getValueAt(selectedRow, 1).toString());
            tfTotalChapter.setText(tblManga.getValueAt(selectedRow, 2).toString());
            tfStatus.setText(tblManga.getValueAt(selectedRow, 3).toString());
            tfRating.setText(tblManga.getValueAt(selectedRow, 4).toString());
            tfPublisher.setText(tblManga.getValueAt(selectedRow, 5).toString());
            tfGenre.setText(tblManga.getValueAt(selectedRow, 6).toString());
            tfAuthor.setText(tblManga.getValueAt(selectedRow, 7).toString());
            tfReleaseDate.setText(tblManga.getValueAt(selectedRow, 8).toString());
        } else {
            // Display a message if no row is selected
            JOptionPane.showMessageDialog(this, stringUtil.VALID_ROW, "Selection Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_tblMangaMouseClicked

    /**
    * Event handler for the clear button. Clears the content of text fields and displays a message.
    * @param evt The ActionEvent associated with the button click.
    */
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        // Clear the content of each text field
        tfSerialNumber.setText("");
        tfTitle.setText("");
        tfTotalChapter.setText("");
        tfGenre.setText("");
        tfStatus.setText("");
        tfRating.setText("");
        tfPublisher.setText("");
        tfAuthor.setText("");
        tfReleaseDate.setText("");

             // Display a message indicating that text fields have been cleared
        JOptionPane.showMessageDialog(this, stringUtil.CLEARED, "Cleared", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnClearActionPerformed

    /**
    * Event handler for the sort button. Performs sorting of manga data based on the selected criteria.
    * @param evt The ActionEvent associated with the button click.
    */
    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
       
        // Create an instance of MergeSortManga for sorting manga data
        MergeSortManga mangaSorter = new MergeSortManga();

        // Get the DefaultTableModel associated with the JTable
        DefaultTableModel model = (DefaultTableModel) tblManga.getModel();

        // Get the selected sorting criteria from the combo box
        String sortingCriteria = (sortComboBox.getSelectedItem()).toString();

        // Check if the mangaList is not empty before proceeding with sorting
        if (!mangaList.isEmpty()) {
            // Convert ArrayList to MangaModel array
            MangaModel[] mangaArray = mangaList.toArray(new MangaModel[0]);

            // Sort the mangaArray using MergeSort based on the selected criteria
            mangaSorter.sort(mangaArray, sortingCriteria);

            // Clear the table before populating it with sorted data
            model.setRowCount(0);

            // Populate the table with sorted manga data
            for (MangaModel manga : mangaArray) {
                Object[] rowData = {
                    manga.getSerialNumber(),
                    manga.getTitle(),
                    manga.getTotalChapter(),
                    manga.getStatus(),
                    manga.getRating(),
                    manga.getPublisher(),
                    manga.getGenre(),
                    manga.getAuthor(),
                    manga.getReleaseDate()
                };
                // Add the sorted row data to the table model
                model.addRow(rowData);
            }
        } else {
            // Display a message indicating that there is no data to sort
            JOptionPane.showMessageDialog(this, stringUtil.EMPTY_DATA, "Empty Data", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSortActionPerformed

    /**
    * Event handler for key press in the "Title" text field.
    * Validates the input to ensure only alphabetic characters are allowed.
    * Displays a warning message and clears the text field if a numeric character is entered.
    * @param evt The KeyEvent associated with the key press.
    */
    private void tfTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTitleKeyPressed
       // Get the pressed key character
       char key = evt.getKeyChar();

       // Check if the key is a digit (numeric character)
       if (Character.isDigit(key)) {
           // Consume the key press, preventing the digit from being entered
           evt.consume();

           // Display a warning message to the user
           JOptionPane.showMessageDialog(this, stringUtil.LETTER_ONLY, "Invalid syntax", JOptionPane.WARNING_MESSAGE); 

           // Clear the text field to maintain consistency
           tfTitle.setText("");
       }
       // If the key is an alphabetic character, it is allowed without any action
    }//GEN-LAST:event_tfTitleKeyPressed

    /**
    * Event handler for key press events in the tfTotalChapter JTextField.
    * Ensures that only numeric input is accepted and displays a warning message if a non-numeric key is pressed.
    * @param evt The KeyEvent associated with the key press.
    */
    private void tfTotalChapterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTotalChapterKeyPressed
        // Get the pressed key character
        char key = evt.getKeyChar();

        // Check if the pressed key is a letter
        if (Character.isLetter(key)) {
            // Consume the event, preventing the letter from being entered
            evt.consume();

            // Display a warning message to the user
            JOptionPane.showMessageDialog(this, stringUtil.NUMBER_ONLY, "Invalid Input", JOptionPane.WARNING_MESSAGE);

            // Clear the content of tfTotalChapter
            tfTotalChapter.setText("");
        }   
    }//GEN-LAST:event_tfTotalChapterKeyPressed

    /**
    * Event handler for key press events in the tfGenre (Genre text field).
    * Validates and restricts the input to alphabets only, consuming the key event if a digit is entered.
    * Displays a warning message and clears the text field in case of invalid input.
    * @param evt The KeyEvent associated with the key press event.
    */
    private void tfGenreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGenreKeyPressed
        // Get the pressed key
        char key = evt.getKeyChar();

        // Check if the key is a digit
        if (Character.isDigit(key)) {
            // Consume the key event to prevent the digit from being entered
            evt.consume();

            // Display a warning message for invalid syntax
            JOptionPane.showMessageDialog(this, stringUtil.LETTER_ONLY, "Invalid syntax", JOptionPane.WARNING_MESSAGE);

            // Clear the text field
            tfGenre.setText("");
        }
    }//GEN-LAST:event_tfGenreKeyPressed
    
    /**
    * This method is an event handler for the key press event in a text field.
    * It ensures that only alphabets are allowed and displays a warning message if a digit is entered.
    * @param evt The KeyEvent generated by the key press event.
    */
    private void tfStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfStatusKeyPressed
        // Get the character pressed
        char key = evt.getKeyChar();

        // Check if the pressed key is a digit
        if(Character.isDigit(key)){
            // If it's a digit, consume the event to prevent the digit from being entered
            evt.consume();

            // Show a warning message to the user
            JOptionPane.showMessageDialog(this, stringUtil.LETTER_ONLY, "Invalid syntax", JOptionPane.WARNING_MESSAGE);

            // Clear the text field to ensure only alphabets are allowed
            tfStatus.setText("");
        }
    }//GEN-LAST:event_tfStatusKeyPressed

    /**
    * This method is invoked when a key is pressed in the tfAuthor (text field for author) component.
    * It ensures that only alphabetic characters are allowed and displays a warning message if a digit is entered.
    * @param evt The KeyEvent generated when a key is pressed.
    */
    private void tfAuthorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAuthorKeyPressed
        // Get the pressed key character
        char key = evt.getKeyChar();

        // Check if the pressed key is a digit
        if(Character.isDigit(key)){
            // If a digit is entered, consume the event to prevent the digit from being displayed
            evt.consume();

            // Display a warning message to the user
            JOptionPane.showMessageDialog(this, stringUtil.LETTER_ONLY, "Invalid syntax", JOptionPane.WARNING_MESSAGE); 

            // Clear the text field
            tfAuthor.setText("");
        }
        // If the key is an alphabet, it is allowed without any action
    }//GEN-LAST:event_tfAuthorKeyPressed

    /**
    * This method is triggered when a key is pressed in the tfReleaseDate JTextField.
    * It validates the entered key and ensures only numeric values are allowed.
    * If a non-numeric key is pressed, it consumes the event, displays a warning message,
    * and clears the text field.
    * 
    * @param evt The KeyEvent triggered when a key is pressed.
    */
    private void tfReleaseDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfReleaseDateKeyPressed
        // Get the pressed key
        char key = evt.getKeyChar();

        // Check if the key is a letter
        if(Character.isLetter(key)){
            // Consume the event to prevent the letter from being entered
            evt.consume();

            // Display a warning message
            JOptionPane.showMessageDialog(this, stringUtil.NUMBER_ONLY, "Invalid Input", JOptionPane.WARNING_MESSAGE); 

            // Clear the text field
            tfReleaseDate.setText("");
        } 
    }//GEN-LAST:event_tfReleaseDateKeyPressed

    private void tblMangaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMangaMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMangaMouseDragged

    private void btnSort1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSort1ActionPerformed
        // Create a MergeSortManga instance for sorting
        MergeSortManga mangaSorter = new MergeSortManga();

        // Get the DefaultTableModel from the table component
        DefaultTableModel model = (DefaultTableModel) tblManga.getModel();

        // Get the selected sorting criteria from the combo box
        String sortingCriteria = (sortComboBox.getSelectedItem()).toString();

        // Ensure mangaList is not null before attempting to sort
        if (mangaList != null) {
            // Convert ArrayList to MangaModel array
            MangaModel[] mangaArray = mangaList.toArray(new MangaModel[0]);

            // Sort the mangaArray using MergeSort algorithm based on the selected criteria
            mangaSorter.sort(mangaArray, sortingCriteria);

            // Reverse the order of mangaList to match the sorted order
            Collections.reverse(mangaList);

            // Clear the table before populating with sorted data
            model.setRowCount(0);

            // Populate the table with sorted manga data
            for (MangaModel manga : mangaArray) {
                // Create an array of rowData for each manga
                Object[] rowData = {
                    manga.getSerialNumber(),
                    manga.getTitle(),
                    manga.getTotalChapter(),
                    manga.getStatus(),
                    manga.getRating(),
                    manga.getPublisher(),
                    manga.getGenre(),
                    manga.getAuthor(),
                    manga.getReleaseDate()
                };

                // Add the rowData to the table model
                model.addRow(rowData);
            }
        } else {
            // Handle the case when mangaList is null
            System.out.println("Error: mangaList is null. Unable to perform sorting.");
            // You may want to display a message to the user or log the error.
        }
    }//GEN-LAST:event_btnSort1ActionPerformed

    private void tfRatingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRatingKeyPressed
        char key = evt.getKeyChar();

        // Check if the pressed key is a letter
        if(Character.isLetter(key)){
            // Consume the key event to prevent the letter from being entered
            evt.consume();

            // Show a warning message to the user
            JOptionPane.showMessageDialog(this, stringUtil.NUMBER_ONLY, "Invalid Input", JOptionPane.WARNING_MESSAGE);

            // Clear the text field to ensure only valid input is displayed
            tfReleaseDate.setText("");
        }
    }//GEN-LAST:event_tfRatingKeyPressed

    private void tfPublisherKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPublisherKeyPressed
        // Get the pressed key from the KeyEvent
        char key = evt.getKeyChar();

        // Check if the pressed key is a digit
        if (Character.isDigit(key)) {
            // Consume the event to prevent the digit from being entered
            evt.consume();

            // Display a warning message to the user
            JOptionPane.showMessageDialog(this, stringUtil.LETTER_ONLY, "Invalid syntax", JOptionPane.WARNING_MESSAGE);

            // Clear the text field to ensure only alphabets are present
            tfGenre.setText("");
        }

    }//GEN-LAST:event_tfPublisherKeyPressed

    private void tfSerialNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSerialNumberKeyPressed
        // This code is triggered when a key is pressed in an event (e.g., in a text field)
        char key = evt.getKeyChar();

        // Check if the pressed key is a letter
        if (Character.isLetter(key)) {
            // Consume the event to prevent the letter from being entered
            evt.consume();

            // Display a warning message to the user
            JOptionPane.showMessageDialog(this, stringUtil.NUMBER_ONLY, "Invalid Input", JOptionPane.WARNING_MESSAGE); 

            // Clear the text field where the invalid input was attempted
            tfReleaseDate.setText("");
        }

    }//GEN-LAST:event_tfSerialNumberKeyPressed
    
    /**
    * Retrieves data from the table and populates the mangaList with MangaModel objects.
    * Assumes that the table structure matches the expected format.
    */
    public void getTableData(){
        // Get the number of rows in the table
        int rowCount = tblManga.getRowCount();

        // Ensure there is at least one row in the table before attempting to retrieve data
        if (rowCount > 0) {
            // Loop through each row in the table
            for (int i = 0; i < rowCount; i++) {
                try {
                    // Create a MangaModel object using data from the table cells
                    MangaModel model = new MangaModel(
                            Integer.parseInt(tblManga.getValueAt(i, 0).toString()),
                            tblManga.getValueAt(i, 1).toString(),
                            Integer.parseInt(tblManga.getValueAt(i, 2).toString()),
                            tblManga.getValueAt(i, 3).toString(),
                            Integer.parseInt(tblManga.getValueAt(i, 4).toString()),
                            tblManga.getValueAt(i, 5).toString(),
                            tblManga.getValueAt(i, 6).toString(),
                            tblManga.getValueAt(i, 7).toString(),
                            tblManga.getValueAt(i, 8).toString()
                    );

                    // Add the MangaModel object to the mangaList
                    mangaList.add(model);
                } catch (NumberFormatException | NullPointerException e) {
                    // Handle potential exceptions when parsing or accessing data
                    System.err.println("Error processing row " + i + ": " + e.getMessage());
                    // You may want to log the error or display a user-friendly message.
                }
            }
        } else {
            // Handle the case when the table is empty
            System.out.println("Warning: The table is empty. No data to retrieve.");
            // You may want to display a message to the user or log the warning.
        }
    }    
    
    public void getTableValue() {
        // Get the number of rows in the table
        int tableSize = tblManga.getRowCount();

        // Initialize arrays to store table values
        serialNumber = new int[tableSize];
        title = new String[tableSize];
        totalChapter = new int[tableSize];
        status = new String[tableSize];
        rating = new int[tableSize];
        publisher = new String[tableSize];
        genre = new String[tableSize];
        author = new String[tableSize];
        releaseDate = new String[tableSize];

        // Loop through each row in the table
        for (int i = 0; i < tableSize; i++) {
            try {
                // Retrieve values from the table and validate them
                serialNumber[i] = getIntValue(tblManga.getValueAt(i, 0));
                title[i] = getStringValue(tblManga.getValueAt(i, 1));
                totalChapter[i] = getIntValue(tblManga.getValueAt(i, 2));
                status[i] = getStringValue(tblManga.getValueAt(i, 3));
                rating[i] = getIntValue(tblManga.getValueAt(i, 4));
                publisher[i] = getStringValue(tblManga.getValueAt(i, 5));
                genre[i] = getStringValue(tblManga.getValueAt(i, 6));
                author[i] = getStringValue(tblManga.getValueAt(i, 7));
                releaseDate[i] = getStringValue(tblManga.getValueAt(i, 8));

                // Create a MangaModel instance with the retrieved values
                MangaModel manga = new MangaModel(serialNumber[i], title[i], totalChapter[i], status[i],
                        rating[i], publisher[i], genre[i], author[i], releaseDate[i]);

                // Add the manga to the list
                mangaList.add(manga);
            } catch (Exception e) {
                // Handle any exceptions during data retrieval or validation
                System.out.println("Error at index " + i + ": " + e.getMessage());
            }
        }
    }

    // Helper method to convert Object to int with validation
    private int getIntValue(Object value) {
        if (value instanceof Integer) {
            return (int) value;
        } else if (value instanceof String && !((String) value).isEmpty()) {
            try {
                return Integer.parseInt((String) value);
            } catch (NumberFormatException e) {
                // Handle the case when the value cannot be parsed as an integer
                System.out.println("Error parsing integer: " + e.getMessage());
                return 0; // Default value, change it based on your needs
            }
        } else {
            // Handle unexpected value types
            System.out.println("Unexpected value type: " + value.getClass().getName());
            return 0; // Default value for non-integer or empty values
        }
    }

    // Helper method to convert Object to String
    private String getStringValue(Object value) {
        return (value instanceof String) ? (String) value : "";
    }


            
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
            java.util.logging.Logger.getLogger(MangaVerse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MangaVerse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MangaVerse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MangaVerse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MangaVerse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnSort1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JComboBox<String> sortComboBox;
    private javax.swing.JTable tblManga;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfGenre;
    private javax.swing.JTextField tfPublisher;
    private javax.swing.JTextField tfRating;
    private javax.swing.JTextField tfReleaseDate;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfSerialNumber;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfTitle;
    private javax.swing.JTextField tfTotalChapter;
    // End of variables declaration//GEN-END:variables
}
