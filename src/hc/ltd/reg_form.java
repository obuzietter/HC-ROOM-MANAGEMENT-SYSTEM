/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hc.ltd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author obuzietter
 */
public class reg_form extends javax.swing.JFrame {

    /**
     * Creates new form reg_form
     */
    public reg_form() {
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

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        pwdTF = new javax.swing.JPasswordField();
        cpwdTF = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fullnameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        idnoTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        residenceTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        roleCombo = new javax.swing.JComboBox<>();

        jButton3.setText("jButton3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create User Account");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 28)); // NOI18N
        jLabel2.setText("Create User Account");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel4.setText("Confirm Password");

        usernameTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        usernameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTFFocusLost(evt);
            }
        });

        pwdTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        cpwdTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("Username");

        jButton5.setText("REQADMINPASSWORD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel5.setText("Full Name");

        fullnameTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        fullnameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fullnameTFFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel6.setText("ID Number");

        idnoTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel7.setText("Residence");

        residenceTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        residenceTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                residenceTFFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel8.setText("Role");

        emailTF.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel9.setText("Email");

        saveBtn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        saveBtn.setText("ADD & NEW");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        roleCombo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ROLE", "EMPLOYEE", "ADMIN" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(residenceTF, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(idnoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(pwdTF, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(cpwdTF, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(fullnameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(emailTF, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(roleCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fullnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pwdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cpwdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(residenceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(11, 11, 11))
        );

        usernameTF.getAccessibleContext().setAccessibleName("");
        pwdTF.getAccessibleContext().setAccessibleName("");
        cpwdTF.getAccessibleContext().setAccessibleName("");
        fullnameTF.getAccessibleContext().setAccessibleName("");
        idnoTF.getAccessibleContext().setAccessibleName("");
        residenceTF.getAccessibleContext().setAccessibleName("");
        emailTF.getAccessibleContext().setAccessibleName("");
        roleCombo.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // Prompt the user for input
        String securityCode = JOptionPane.showInputDialog(this, "Enter Admin Password", "Authentication", JOptionPane.PLAIN_MESSAGE);
        if (securityCode.equals("123")) {
            JOptionPane.showMessageDialog(this, "AUTHORIZATION SUCCESS!");

        }
        while (!securityCode.equals("123")) {
            JOptionPane.showMessageDialog(this, "FAILED TO AUTHORIZE!!!");
            securityCode = JOptionPane.showInputDialog(this, "Enter Admin Password", "Authentication", JOptionPane.PLAIN_MESSAGE);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HC_LTD", "root", "");
            String sql = "INSERT INTO users (full_name, username, password, id_number, email, residence, role) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, fullnameTF.getText());
            stmt.setString(2, usernameTF.getText());
            stmt.setString(3, pwdTF.getText());
            stmt.setString(4, idnoTF.getText());
            stmt.setString(5, emailTF.getText());
            stmt.setString(6, residenceTF.getText());
            stmt.setObject(7, roleCombo.getSelectedItem());

            if (fullnameTF.getText().isEmpty() || usernameTF.getText().isEmpty() || pwdTF.getText().isEmpty() || idnoTF.getText().isEmpty() || residenceTF.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Check for empty fields!");

            } else if (!pwdTF.getText().equals(cpwdTF.getText())) {

                JOptionPane.showMessageDialog(this, "Passwords do not match!");

            } else if (!(roleCombo.getSelectedItem().equals("ADMIN") || roleCombo.getSelectedItem().equals("EMPLOYEE"))) {

                JOptionPane.showMessageDialog(this, "No Role Selected!");

            } else {
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "USER ACCOUNT CREATED SUCCCESSFULLY!");
                

            }

        } catch (Exception e) {
            System.out.print(e);
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void fullnameTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameTFFocusLost
        fullnameTF.setText(fullnameTF.getText().toUpperCase());
    }//GEN-LAST:event_fullnameTFFocusLost

    private void usernameTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTFFocusLost
        usernameTF.setText(usernameTF.getText().toUpperCase());
    }//GEN-LAST:event_usernameTFFocusLost

    private void residenceTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_residenceTFFocusLost
        residenceTF.setText(residenceTF.getText().toUpperCase());
    }//GEN-LAST:event_residenceTFFocusLost

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
            java.util.logging.Logger.getLogger(reg_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reg_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reg_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reg_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reg_form().setVisible(true);
                
                
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cpwdTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JTextField fullnameTF;
    private javax.swing.JTextField idnoTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pwdTF;
    private javax.swing.JTextField residenceTF;
    private javax.swing.JComboBox<String> roleCombo;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
