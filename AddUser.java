package pharmacysystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Sujoy
 */
public class AddUser extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int add1;

    public AddUser() {
        initComponents();
        conn = DatabaseConnection.db_connect();
        getIDNo();
    }

    public void getIDNo(){
        String sql="select max(Emp_id)as Emp_id from Login";
        try {
            
        pst=conn.prepareStatement(sql);
        //pst.setString(1,InvoiceNo);
        rs=pst.executeQuery();
            if (rs.next()) {
                int add=rs.getInt("Emp_id");
                add1 = add+1; // invoice no increase 
                txt_id.setText(""+add1);
                
            }
            
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e);
        }finally{
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        cmb_usertype = new javax.swing.JComboBox();
        txt_email = new javax.swing.JTextField();
        btn_create = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Add User");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("Create A New User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 153));
        jLabel2.setText("Email Address");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 153));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 153));
        jLabel4.setText("User Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 153));
        jLabel5.setText("Employee ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_id.setText("ID Show");
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 130, 24));

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 237, 31));

        cmb_usertype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_usertype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Staff" }));
        getContentPane().add(cmb_usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 237, 33));

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 239, 35));

        btn_create.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_create.setText("Create");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 128, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/adduserBKpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 560));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Quit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Create");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        Random rand = new Random();
        int n = ((rand.nextInt(9999) + 1) * 12) / 2;
        String pass = String.valueOf(n);
        try {
            String sql = "insert into Login(Emp_id,UserName,Password,UserType,Email) values(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, txt_id.getText());
            pst.setString(2, txt_username.getText());
            pst.setString(3, pass);
            pst.setString(4, cmb_usertype.getSelectedItem().toString());
            pst.setString(5, txt_email.getText());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"User Create Successfully\n"+"Your Employee ID Is:"+txt_id.getText()+"\nYour Password Is: "+pass);
            
            txt_email.setText("");
            txt_username.setText("");
            cmb_usertype.setSelectedIndex(0);
            txt_id.setText(String.valueOf(add1));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                pst.close();
                rs.close();
                
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btn_createActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create;
    private javax.swing.JComboBox cmb_usertype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField txt_email;
    private javax.swing.JLabel txt_id;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
