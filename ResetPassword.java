package pharmacysystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Sujoy
 */
public class ResetPassword extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public ResetPassword() {
        initComponents();
        conn = DatabaseConnection.db_connect();
        Fillcombo();
    }

    private void Fillcombo() {
        try {
            String sql = "select * from Login";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String drugname = rs.getString("Email");
                cmb_email.addItem(drugname);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cmb_email = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Reset Password");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Reset User Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Select Email Address");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Reset Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        getContentPane().add(cmb_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 274, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/password.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Quit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // make a random password
        Random rand = new Random();
        int n = ((rand.nextInt(9999) + 1) * 12) / 2;
        String pass = String.valueOf(n); // convert int to string

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465"); // ssl port free
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465"); // api ssl port 

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("sujoydey217@gmail.com", "stsujoy9290A"); // sender address and password
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("sujoydey217@gmail.com")); // mail sender
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(cmb_email.getSelectedItem().toString())); //  recipient address
            message.setSubject("Password Recovery"); // message title

            message.setText("This is your Password :" + pass); // // message body
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Password Send on your Email\n" + cmb_email.getSelectedItem().toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                pst.close();
                rs.close();
                
            } catch (Exception e) {
            }
        }

        try {

            String sql = "update Login set Password='" + pass + "'";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try {
                pst.close();
                rs.close();
                
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 super.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmb_email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
