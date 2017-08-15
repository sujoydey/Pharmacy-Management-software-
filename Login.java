package pharmacysystem;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sujoy
 */
public class Login extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Login() {
        initComponents();
        conn = DatabaseConnection.db_connect();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_empID = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        cmb_usertype = new javax.swing.JComboBox();
        btn_exit = new javax.swing.JLabel();
        login_click = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_displaymessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img/icon.png")));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Log In");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 113, 33));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Care Pharmacy");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Mirpur Road,Dhanmondi,Dhaka-1216");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/hospitalLogo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("Employee ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 153));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setText("User-Type");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        txt_empID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_empID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 140, 30));

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 140, 29));

        cmb_usertype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_usertype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin" }));
        getContentPane().add(cmb_usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 140, 30));

        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 153, 153));
        btn_exit.setText("           EXIT");
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(956, 19, 117, 49));

        login_click.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        login_click.setForeground(new java.awt.Color(204, 204, 255));
        login_click.setText("      Login");
        login_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_clickMouseClicked(evt);
            }
        });
        getContentPane().add(login_click, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 423, 120, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/login.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        txt_displaymessage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txt_displaymessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 240, 30));

        setSize(new java.awt.Dimension(1100, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String sql = "select * from Login where Emp_id=? and Password=?";

                pst = conn.prepareStatement(sql);

                pst.setString(1, txt_empID.getText());
                pst.setString(2, txt_password.getText());

                rs = pst.executeQuery();

                if (rs.next()) {
                    main mn = new main();
                    mn.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "ID or Password wrong");
                   // txt_displaymessage.setText("Username/Password incorrect");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    pst.close();
                    rs.close();
                } catch (Exception e) {
                }
            }

        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
       super.dispose();
    }//GEN-LAST:event_btn_exitMouseClicked

    private void login_clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_clickMouseClicked
        
        try {
            int count = 0;
            String sql = "select * from Login where Emp_id=? and Password=? and UserType =?";

            pst = conn.prepareStatement(sql);

            pst.setString(1, txt_empID.getText());
            pst.setString(2, txt_password.getText());
            pst.setString(3, cmb_usertype.getSelectedItem().toString());

            rs = pst.executeQuery();

            while (rs.next()) {
                count = count + 1;
                String username = rs.getString(1);
                emp.username = username;
                int id = rs.getInt(4);
                emp.member_id = id;

            }
            String access = (cmb_usertype.getSelectedItem().toString());

            if (access == "Admin") {
                if (count == 1) {
                    main mn= new main();
                    mn.setVisible(true);
                    this.dispose();
                }

            }else
                JOptionPane.showMessageDialog(null,"Select Admin");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (Exception e) {
            }
        }


    }//GEN-LAST:event_login_clickMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_exit;
    private javax.swing.JComboBox cmb_usertype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel login_click;
    private javax.swing.JLabel txt_displaymessage;
    private javax.swing.JTextField txt_empID;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
