/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hc.ltd;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author obuzietter
 */
public class create_room extends javax.swing.JFrame {

    /**
     * Creates new form create_room
     */
    public create_room() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roomNoTF = new javax.swing.JTextField();
        roomTypeCombo = new javax.swing.JComboBox<>();
        roomPriceTF = new javax.swing.JTextField();
        createRoomBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rooms_display = new javax.swing.JTable();
        showBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD NEW ROOM");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("ROOM NO");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("ROOM TYPE");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setText("ROOM PRICE");

        roomNoTF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        roomNoTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                roomNoTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                roomNoTFFocusLost(evt);
            }
        });
        roomNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNoTFActionPerformed(evt);
            }
        });

        roomTypeCombo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        roomTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ROOM TYPE", "STANDARD", "DELUXE" }));
        roomTypeCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomTypeComboItemStateChanged(evt);
            }
        });

        roomPriceTF.setEditable(false);
        roomPriceTF.setBackground(new java.awt.Color(204, 204, 204));
        roomPriceTF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        createRoomBtn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        createRoomBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-in.png"))); // NOI18N
        createRoomBtn.setText("SAVE & NEW");
        createRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRoomBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        rooms_display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ROOM NO", "ROOM TYPE", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rooms_display.setRowHeight(35);
        jScrollPane1.setViewportView(rooms_display);

        showBtn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        showBtn.setText("SHOW ROOMS");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createRoomBtn)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBtn))
                            .addComponent(roomTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showBtn)
                        .addGap(247, 247, 247))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(roomNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(roomTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(roomPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(showBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomNoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomNoTFActionPerformed

    private void roomNoTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roomNoTFFocusLost

    }//GEN-LAST:event_roomNoTFFocusLost

    private void roomTypeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomTypeComboItemStateChanged
        String room_state = roomTypeCombo.getSelectedItem().toString();

        if (room_state.equals("DELUXE")) {

            roomPriceTF.setText("2000");

        } else if (room_state.equals("STANDARD")) {
            roomPriceTF.setText("1500");
        } else {
            JOptionPane.showMessageDialog(this, "SELECT ROOM TYPE");
        }

    }//GEN-LAST:event_roomTypeComboItemStateChanged

    private void createRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRoomBtnActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HC_LTD", "root", "");
            String sql = "INSERT INTO rooms (room_no, room_type, room_price) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, roomNoTF.getText());
            stmt.setObject(2, roomTypeCombo.getSelectedItem());
            stmt.setString(3, roomPriceTF.getText());

            String roomcheck = "SELECT * FROM rooms where room_no=?";
            PreparedStatement roomcheckstmt = conn.prepareStatement(roomcheck);
            roomcheckstmt.setString(1, roomNoTF.getText());
            ResultSet result = roomcheckstmt.executeQuery();

            if (roomNoTF.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "ROOM NUMBER IS EMPTY!");

            } else if (result.next()) {

                JOptionPane.showMessageDialog(this, "ROOM ALREADY EXISTS IN DATABASE");

            } else if (!(roomTypeCombo.getSelectedItem().equals("DELUXE") || roomTypeCombo.getSelectedItem().equals("STANDARD"))) {

                JOptionPane.showMessageDialog(this, "SELECT ROOM TYPE");

            } else {

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "ROOM CREATED SUCCCESSFULLY!");
                reset();

            }

        } catch (Exception e) {
            System.out.print(e);
        }

    }//GEN-LAST:event_createRoomBtnActionPerformed

    private void roomNoTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roomNoTFFocusGained
        roomNoTF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
    }//GEN-LAST:event_roomNoTFFocusGained

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HC_LTD", "root", "");
            String sql = "SELECT * FROM rooms";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                String roomNo = result.getString("room_no");
                String roomType = result.getString("room_type");
                String roomPrice = result.getString("room_price");

                String roomData[] = {"R" + roomNo, roomType, roomPrice};
                DefaultTableModel table = (DefaultTableModel) rooms_display.getModel();
                table.addRow(roomData);
                
            }

        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_showBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HC_LTD", "root", "");
            String sql = "DELETE FROM rooms WHERE room_no = ";
            PreparedStatement stmt = conn.prepareStatement(sql);
        }catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void reset() {
        roomNoTF.setText(null);
        roomPriceTF.setText(null);
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
            java.util.logging.Logger.getLogger(create_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(create_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(create_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(create_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new create_room().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createRoomBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField roomNoTF;
    private javax.swing.JTextField roomPriceTF;
    private javax.swing.JComboBox<String> roomTypeCombo;
    private javax.swing.JTable rooms_display;
    private javax.swing.JButton showBtn;
    // End of variables declaration//GEN-END:variables

}
