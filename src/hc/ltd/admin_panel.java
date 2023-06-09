package hc.ltd;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author obuzietter
 */
public class admin_panel extends javax.swing.JFrame {

    /**
     * Creates new form admin_panel
     */
    public admin_panel() {
        initComponents();

        loadUsersTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        unameTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        passTF = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        cpassTF = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        roleCombo = new javax.swing.JComboBox<>();
        saveBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        allUsersTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        saveChanges = new javax.swing.JButton();
        emailTF2 = new javax.swing.JTextField();
        idnoTF2 = new javax.swing.JTextField();
        usernameTF2 = new javax.swing.JTextField();
        fullnameTF2 = new javax.swing.JTextField();
        roleTF = new javax.swing.JTextField();
        voidUser = new javax.swing.JButton();
        searchTF = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchResultTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        roomsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        roomTypeCombo = new javax.swing.JComboBox<>();
        roomNoTF = new javax.swing.JTextField();
        roomPriceTF = new javax.swing.JTextField();
        createRoomBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        roomStateTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADMIN PANEL");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTabbedPane2.setToolTipText("");
        jTabbedPane2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel12.setText("Full Name");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("Username");

        nameTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        unameTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel15.setText("Password");

        passTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel16.setText("Confirm Password");

        cpassTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel13.setText("ID Number");

        idTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel18.setText("Email");

        emailTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel17.setText("Role");

        roleCombo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ROLE", "ADMIN", "MANAGER", "USER" }));

        saveBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create.png"))); // NOI18N
        saveBtn.setText("CREATE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        allUsersTable.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        allUsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FULL NAME", "USERNAME", "ID NUMBER", "EMAIL", "ROLE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allUsersTable.setRowHeight(35);
        allUsersTable.setSelectionBackground(java.awt.Color.green);
        allUsersTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(allUsersTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTF)
                            .addComponent(idTF)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpassTF)
                            .addComponent(roleCombo, 0, 364, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("CREATE USER", jPanel1);

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel20.setText("Username");

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel21.setText("Full Name");

        jLabel23.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel23.setText("ID Number");

        jLabel24.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel24.setText("Email");

        jLabel25.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel25.setText("Role");

        saveChanges.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        saveChanges.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-file.png"))); // NOI18N
        saveChanges.setText("SAVE");
        saveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesActionPerformed(evt);
            }
        });

        emailTF2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        idnoTF2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        usernameTF2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        fullnameTF2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        roleTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        voidUser.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        voidUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/void.png"))); // NOI18N
        voidUser.setText("DELETE");
        voidUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voidUserActionPerformed(evt);
            }
        });

        searchTF.setFont(new java.awt.Font("Lato Semibold", 0, 16)); // NOI18N
        searchTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTFKeyReleased(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        searchResultTable.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        searchResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FULL NAME", "USERNAME", "ID NO", "EMAIL", "ROLE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchResultTable.setRowHeight(35);
        searchResultTable.setSelectionBackground(java.awt.Color.green);
        searchResultTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        searchResultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchResultTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchResultTable);
        if (searchResultTable.getColumnModel().getColumnCount() > 0) {
            searchResultTable.getColumnModel().getColumn(0).setMinWidth(30);
            searchResultTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            searchResultTable.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(68, 68, 68)
                        .addComponent(usernameTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel25)
                        .addGap(147, 147, 147)
                        .addComponent(saveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(voidUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fullnameTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel24)))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idnoTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fullnameTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel20))
                            .addComponent(usernameTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel23))
                            .addComponent(idnoTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(emailTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel25))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(roleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(saveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(voidUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("MODIFY", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane2.addTab("USERS", jPanel4);

        roomsTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roomsTable.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        roomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ROOM NO", "ROOM TYPE", "PRICE", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomsTable.setRowHeight(35);
        roomsTable.setSelectionBackground(java.awt.Color.green);
        roomsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(roomsTable);
        if (roomsTable.getColumnModel().getColumnCount() > 0) {
            roomsTable.getColumnModel().getColumn(0).setMinWidth(0);
            roomsTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("ROOM NO");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel6.setText("ROOM TYPE");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setText("ROOM PRICE");

        roomTypeCombo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        roomTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ROOM TYPE", "STANDARD", "DELUXE" }));

        roomNoTF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        roomNoTF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        roomPriceTF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        roomPriceTF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        createRoomBtn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        createRoomBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-file.png"))); // NOI18N
        createRoomBtn.setText("CREATE");
        createRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRoomBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/void.png"))); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        showBtn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        showBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        showBtn.setText("SHOW ROOMS");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        roomStateTF.setEditable(false);
        roomStateTF.setBackground(new java.awt.Color(204, 204, 204));
        roomStateTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        roomStateTF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("ROOM STATUS");

        jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/broom.png"))); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3)
                .addGap(6, 6, 6))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(roomNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(roomTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomPriceTF, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(136, 136, 136)))
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(roomStateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(12, 12, 12)
                            .addComponent(roomNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(12, 12, 12)
                            .addComponent(roomStateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(12, 12, 12)
                            .addComponent(roomPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(roomTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ROOMS", jPanel5);

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fetch.png"))); // NOI18N
        jButton1.setText("FETCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "PHONE", "ID NO", "ROOM NO", "ROOM TYPE", "DAYS", "AMOUNT", "PAYMENT", "CHECK IN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1712, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane3.addTab("RESERVATIONS", jPanel8);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane2.addTab("REPORTS", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        createUser();
        //loadUsersTable();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        searchUser();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchResultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchResultTableMouseClicked
        loadToForm();
    }//GEN-LAST:event_searchResultTableMouseClicked

    private void voidUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voidUserActionPerformed
        deleteUser();
    }//GEN-LAST:event_voidUserActionPerformed

    private void saveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesActionPerformed
        updateUserDetails();
    }//GEN-LAST:event_saveChangesActionPerformed

    private void createRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRoomBtnActionPerformed
        createRoom();

    }//GEN-LAST:event_createRoomBtnActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        fetchRooms();
    }//GEN-LAST:event_showBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        deleteRoom();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void roomsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsTableMouseClicked
        loadRoomsToForm();
        if (roomStateTF.getText().equals("BOOKED")) {
            roomStateTF.setForeground(Color.red);
        } else if (roomStateTF.getText().equals("OPEN")) {
            roomStateTF.setForeground(Color.green);
        }
    }//GEN-LAST:event_roomsTableMouseClicked

    private void searchTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTFKeyReleased
        searchUser();
    }//GEN-LAST:event_searchTFKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable() {
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                pf.setOrientation(PageFormat.PORTRAIT);
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.24, 0.24);

                jPanel3.paint(g2);
                //

                return Printable.PAGE_EXISTS;

            }
        });

        boolean ok = job.printDialog();
        if (ok) {
            try {

                job.print();
            } catch (PrinterException ex) {
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat date = new SimpleDateFormat("dd");
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        String formattedDate = date.format(jDateChooser1.getDate());
        String formattedMonth = month.format(jDateChooser1.getDate());
        String formattedYear = year.format(jDateChooser1.getDate());
        System.out.println(jDateChooser1.getDate());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HC_LTD", "root", "");
            String sql = "SELECT * FROM bookings "
                    + "WHERE date_format(check_in_date, '%d') = ? "
                    + "AND date_format(check_in_date, '%m') = ? "
                    + "AND date_format(check_in_date, '%Y') = ?";
            PreparedStatement dateFilter = conn.prepareStatement(sql);
            dateFilter.setString(1, formattedDate);
            dateFilter.setString(2, formattedMonth);
            dateFilter.setString(3, formattedYear);

            ResultSet rs = dateFilter.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            int due = 0;
            while (rs.next()) {
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String id_no = rs.getString("id_no");
                String room_no = rs.getString("room_no");
                String room_type = rs.getString("room_type");
                String no_of_days = rs.getString("no_of_days");
                int amount = rs.getInt("amount");
                String payment_method = rs.getString("payment_method");
                String check_in_date = rs.getString("check_in_date");

                Object getData[] = {
                    name,
                    phone,
                    id_no,
                    room_no,
                    room_type,
                    no_of_days,
                    amount,
                    payment_method,
                    check_in_date
                };
                model.addRow(getData);
                due += amount;
            }

            Object[] totalRow = {"TOTAL", "", "", "", "", "", due, "", ""};
            model.addRow(totalRow);

        } catch (HeadlessException | ClassNotFoundException
                | NumberFormatException | SQLException e) {

            System.out.println(e);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearRoomsFields();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adjustRooms();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        login_form login = new login_form();
        login.setVisible(true);
    }//GEN-LAST:event_formWindowClosed
    //PROBLEM SOLVED BUT WITHOUT CHECK FOR EMAILS
    private void createUser() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HC_LTD", "root", "");

            String sqlUsernameCheck = "SELECT * FROM users where username = ?";
            PreparedStatement check = conn.prepareStatement(sqlUsernameCheck);
            check.setString(1, unameTF.getText());

            ResultSet result = check.executeQuery();

            if (result.next()) {
                JOptionPane.showMessageDialog(this,
                        "USERNAME ALREADY EXISTS IN DATABASE!");
            } else {
                String sql = "INSERT INTO users (full_name, username, "
                        + "password, id_number, email, role) "
                        + "VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, nameTF.getText());
                stmt.setString(2, unameTF.getText());
                stmt.setString(3, passTF.getText());
                stmt.setString(4, idTF.getText());
                stmt.setString(5, emailTF.getText());
                stmt.setObject(6, roleCombo.getSelectedItem());

                if (nameTF.getText().isEmpty() || unameTF.getText().isEmpty()
                        || passTF.getText().isEmpty()
                        || idTF.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(this,
                            "CHECK FOR EMPTY FIELDS!");

                } else if (!(passTF.getText().equals(cpassTF.getText()))) {

                    JOptionPane.showMessageDialog(this,
                            "PASSWORDS DO NOT MATCH!");

                } else if (!(roleCombo.getSelectedItem().equals("ADMIN")
                        || roleCombo.getSelectedItem().equals("MANAGER")
                        || roleCombo.getSelectedItem().equals("USER"))) {

                    JOptionPane.showMessageDialog(this, "NO ROLE SELECTED!");

                } else {
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,
                            "USER CREATED SUCCCESSFULLY!");
                    resetFields();
                    loadUsersTable();
                }

            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.print(e);
        }
    }

    private void resetFields() {
        nameTF.setText("");
        unameTF.setText("");
        passTF.setText("");
        cpassTF.setText("");
        idTF.setText("");
        emailTF.setText("");
        roleCombo.setSelectedIndex(0);
    }

    private void searchUser() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HC_LTD", "root", "");
            String sql = "SELECT * FROM users where username like ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + searchTF.getText() + "%");
            ResultSet result = stmt.executeQuery();

            if (searchTF.getText().isEmpty()) {
                //JOptionPane.showMessageDialog(this, "Enter Username to search!");
            } else if (result.next()) {
                //JOptionPane.showMessageDialog(this, "Search for " + searchTF.getText() + " found");
                DefaultTableModel table;
                table = (DefaultTableModel) searchResultTable.getModel();
                table.setRowCount(0);
                do {
                    // Retrieve data from the current row using getter methods
                    int id = result.getInt("id");
                    String name = result.getString("full_name");
                    String username = result.getString("username");
                    String idno = result.getString("id_number");
                    String email = result.getString("email");
                    String role = result.getString("role");
                    // Create an array of search results
                    Object searchResults[] = {
                        id,
                        name,
                        username,
                        idno,
                        email,
                        role
                    };
//                    System.out.println(Arrays.toString(searchResults));
                    // Add the search results to the table
                    //refresh();
                    table.addRow(searchResults);
                } while (result.next());
            } else {
                JOptionPane.showMessageDialog(this,
                        "Search for '" + searchTF.getText() + "' not found!");
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    private void loadToForm() {
        int row = searchResultTable.getSelectedRow();
        fullnameTF2.setText(searchResultTable.getValueAt(row, 1).toString());
        usernameTF2.setText(searchResultTable.getValueAt(row, 2).toString());
        idnoTF2.setText(searchResultTable.getValueAt(row, 3).toString());
        emailTF2.setText(searchResultTable.getValueAt(row, 4).toString());
        roleTF.setText(searchResultTable.getValueAt(row, 5).toString());
    }

    private void deleteUser() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HC_LTD", "root", "");

            int row = searchResultTable.getSelectedRow();
            int userID = Integer.parseInt(String.valueOf(searchResultTable.getValueAt(row, 0)));

            String sql = "DELETE FROM users WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, userID);
            int deletedUser = stmt.executeUpdate();

            if (deletedUser > 0) {
                JOptionPane.showMessageDialog(this,
                        "USER DELETED SUCCESSFULLY!");
                refresh();
            } else {
                JOptionPane.showMessageDialog(this,
                        "NO RECORDS FOUND!");
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    private void updateUserDetails() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HC_LTD", "root", "");

            int row = searchResultTable.getSelectedRow();
            int userID = Integer.parseInt(String.valueOf(searchResultTable.getValueAt(row, 0)));

            String sql = "UPDATE users SET full_name = ?, username = ?, "
                    + "id_number = ?, email = ?, role = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, fullnameTF2.getText());
            stmt.setString(2, usernameTF2.getText());
            stmt.setString(3, idnoTF2.getText());
            stmt.setString(4, emailTF2.getText());
            stmt.setString(5, roleTF.getText());
            stmt.setInt(6, userID);
            int updatedUser = stmt.executeUpdate();
            if (updatedUser > 0) {
                JOptionPane.showMessageDialog(this,
                        "1 RECORD UPDATED SUCCESSFULLY!");
                refresh();
            } else {
                JOptionPane.showMessageDialog(this,
                        "UPDATE FAILED. CHECK PARAMETERS!");
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    private void refresh() {
        fullnameTF2.setText("");
        usernameTF2.setText("");
        idnoTF2.setText("");
        emailTF2.setText("");
        roleTF.setText("");
        searchTF.setText("");
        
        DefaultTableModel table;
        table = (DefaultTableModel) searchResultTable.getModel();
        table.setRowCount(0);

    }

    private void createRoom() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HC_LTD", "root", "");
            String sql = "INSERT INTO rooms (room_no, room_type, room_price) "
                    + "VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, roomNoTF.getText());
            stmt.setObject(2, roomTypeCombo.getSelectedItem());
            stmt.setString(3, roomPriceTF.getText());

            String roomcheck = "SELECT * FROM rooms where room_no=?";
            PreparedStatement roomcheckstmt = conn.prepareStatement(roomcheck);
            roomcheckstmt.setString(1, roomNoTF.getText());
            ResultSet result = roomcheckstmt.executeQuery();

            if (roomNoTF.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this,
                        "ROOM NUMBER IS EMPTY!");

            } else if (result.next()) {

                JOptionPane.showMessageDialog(this,
                        "ROOM ALREADY EXISTS IN DATABASE");

            } else if (!(roomTypeCombo.getSelectedItem().equals("DELUXE")
                    || roomTypeCombo.getSelectedItem().equals("STANDARD"))) {

                JOptionPane.showMessageDialog(this,
                        "SELECT ROOM TYPE");

            } else {

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this,
                        "ROOM CREATED SUCCCESSFULLY!");

                fetchRooms();

            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.print(e);
        }
    }

    private void fetchRooms() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HC_LTD", "root", "");
            String sql = "SELECT * FROM rooms";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();

            DefaultTableModel table;
            table = (DefaultTableModel) roomsTable.getModel();
            table.setRowCount(0);

            while (result.next()) {

                int id = result.getInt("id");
                int roomNo = result.getInt("room_no");
                String roomType = result.getString("room_type");
                int price = result.getInt("room_price");
                String status = result.getString("room_state");

                // Create an array of search results
                Object rooms[] = {
                    id,
                    roomNo,
                    roomType,
                    price,
                    status
                };

                // Add the search results to the table
                table.addRow(rooms);
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }

    private void clearRoomsFields() {
        roomNoTF.setText("");
        roomTypeCombo.setSelectedIndex(0);
        roomPriceTF.setText("");
        roomStateTF.setText("");
    }

    private void loadRoomsToForm() {
        int row = roomsTable.getSelectedRow();
        roomNoTF.setText(roomsTable.getValueAt(row, 1).toString());
        roomTypeCombo.setSelectedItem(roomsTable.getValueAt(row, 2).toString());
        roomPriceTF.setText(roomsTable.getValueAt(row, 3).toString());
        roomStateTF.setText(roomsTable.getValueAt(row, 4).toString());

    }

    private void deleteRoom() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HC_LTD", "root", "");

            int row = roomsTable.getSelectedRow();
            int roomID = Integer.parseInt(String.valueOf(roomsTable.getValueAt(row, 0)));

            String sql = "DELETE FROM rooms WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, roomID);

            int confirm = JOptionPane.showConfirmDialog(this,
                    "ARE YOU SURE YOU WANT TO DELETE ROOM?",
                    "DELETE ROOM", JOptionPane.YES_NO_OPTION);
            if (confirm == 0) {
                int deletedRoom = stmt.executeUpdate();

                if (deletedRoom > 0) {
                    JOptionPane.showMessageDialog(this,
                            "ROOM DELETED SUCCESSFULLY!");
                    clearRoomsFields();
                    fetchRooms();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "NO RECORDS FOUND!");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }

    private void loadUsersTable() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HC_LTD", "root", "");
            String sql = "SELECT * FROM users";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet result = stmt.executeQuery();
            DefaultTableModel table;
            table = (DefaultTableModel) allUsersTable.getModel();
            table.setRowCount(0);

            while (result.next()) {
                String fullName = result.getString("full_name").toUpperCase();
                String userName = result.getString("username").toUpperCase();
                String idNo = result.getString("id_number");
                String email = result.getString("email").toLowerCase();
                String role = result.getString("role");

                // Create an array of search results
                Object rooms[] = {
                    fullName,
                    userName,
                    idNo,
                    email,
                    role
                };

                // Add the search results to the table
                table.addRow(rooms);

            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }

    private void adjustRooms() {
        int roomNo = Integer.parseInt(roomNoTF.getText());
        int price = Integer.parseInt(roomPriceTF.getText());
        int row = roomsTable.getSelectedRow();
        int roomId = (int) roomsTable.getValueAt(row, 0);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HC_LTD", "root", "");
            String sql = "UPDATE rooms "
                    + "SET room_no = ?, room_type = ?, room_price = ? "
                    + "WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, roomNo);
            stmt.setObject(2, roomTypeCombo.getSelectedItem());
            stmt.setInt(3, price);
            stmt.setInt(4, roomId);

            int confirm = JOptionPane.showConfirmDialog(this, "MAKE CHANGES TO ROOM?", "EDIT ROOM?", JOptionPane.YES_NO_OPTION);
            if (confirm == 0) {
                stmt.executeUpdate();
                fetchRooms();
                clearRoomsFields();
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);

        }
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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }

                UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_panel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_panel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_panel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_panel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new admin_panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allUsersTable;
    private javax.swing.JPasswordField cpassTF;
    private javax.swing.JButton createRoomBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTF;
    private javax.swing.JTextField emailTF2;
    private javax.swing.JTextField fullnameTF2;
    private javax.swing.JTextField idTF;
    private javax.swing.JTextField idnoTF2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JComboBox<String> roleCombo;
    private javax.swing.JTextField roleTF;
    private javax.swing.JTextField roomNoTF;
    private javax.swing.JTextField roomPriceTF;
    private javax.swing.JTextField roomStateTF;
    private javax.swing.JComboBox<String> roomTypeCombo;
    private javax.swing.JTable roomsTable;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton saveChanges;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable searchResultTable;
    private javax.swing.JTextField searchTF;
    private javax.swing.JButton showBtn;
    private javax.swing.JTextField unameTF;
    private javax.swing.JTextField usernameTF2;
    private javax.swing.JButton voidUser;
    // End of variables declaration//GEN-END:variables
}
