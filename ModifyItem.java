package pharmacysystem;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sujoy
 */
public class ModifyItem extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public ModifyItem() {
        initComponents();
        conn = DatabaseConnection.db_connect();
        Fillcombo();
    }

    private void Fillcombo() {
        try {
            String sql = "select * from DrugEntry";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String drugname = rs.getString("DrugName");
                cmb_drugname.addItem(drugname);
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
        cmb_drugname = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_drugname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_batchNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_rate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_mrp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_modify = new javax.swing.JButton();
        txt_exp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Modify Data");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modify Item/Stock");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 11, 250, 36));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Drug Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 65, -1, -1));

        cmb_drugname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_drugnameKeyPressed(evt);
            }
        });
        getContentPane().add(cmb_drugname, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 101, 159, 33));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("New Drug Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 152, -1, -1));
        getContentPane().add(txt_drugname, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 180, 159, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Batch No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 152, -1, -1));
        getContentPane().add(txt_batchNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 180, 132, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Current Stock");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 228, 130, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("QTY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 271, -1, -1));
        getContentPane().add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 264, 118, 28));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("EXP Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 272, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Rate");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 330, -1, -1));
        getContentPane().add(txt_rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 323, 118, 28));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("MRP");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 330, -1, -1));
        getContentPane().add(txt_mrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 317, 174, 35));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 98, 93, 33));

        btn_modify.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_modify.setText("Modify");
        btn_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 381, 105, 41));
        getContentPane().add(txt_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 271, 174, 31));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/modify page.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 430));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Qut");
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
        String tmp = (String) cmb_drugname.getSelectedItem();
        String sql = "select * from DrugEntry where DrugName=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = pst.executeQuery();

            if (rs.next()) {
                String addd1 = rs.getString("DrugName");
                txt_drugname.setText(addd1);
                String addd2 = rs.getString("BatchNo");
                txt_batchNo.setText(addd2);
                String addd3 = rs.getString("QTY");
                txt_qty.setText(addd3);
                String addd4 = rs.getString("ExpDate");
                txt_exp.setText(addd4);
                String add5 = rs.getString("Rate");
                txt_rate.setText(add5);
                String add6 = rs.getString("MRP");
                txt_mrp.setText(add6);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifyActionPerformed
        try {
            String val1 = txt_drugname.getText();
            String val2 = txt_batchNo.getText();
            String val3 = txt_exp.getText();
            String val4 = txt_qty.getText();
            String val5 = txt_rate.getText();
            String val6 = txt_mrp.getText();

            String sql = "update DrugEntry set DrugName='" + val1 + "',BatchNo='" + val2 + "',ExpDate='" + val3 + "',QTY='" + val4 + "',Rate='" + val5 + "',MRP='" + val6 + "',";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pst.close();
                rs.close();

            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btn_modifyActionPerformed

    private void cmb_drugnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_drugnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String tmp = (String) cmb_drugname.getSelectedItem();
            String sql = "select * from DrugEntry where DrugName=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, tmp);
                rs = pst.executeQuery();

                if (rs.next()) {
                    String addd1 = rs.getString("DrugName");
                    txt_drugname.setText(addd1);
                    String addd2 = rs.getString("BatchNo");
                    txt_batchNo.setText(addd2);
                    String addd3 = rs.getString("QTY");
                    txt_qty.setText(addd3);
                    String addd4 = rs.getString("ExpDate");
                    txt_exp.setText(addd4);
                    String add5 = rs.getString("Rate");
                    txt_rate.setText(add5);
                    String add6 = rs.getString("MRP");
                    txt_mrp.setText(add6);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    rs.close();
                    pst.close();
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_cmb_drugnameKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_modify;
    private javax.swing.JComboBox cmb_drugname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField txt_batchNo;
    private javax.swing.JTextField txt_drugname;
    private javax.swing.JTextField txt_exp;
    private javax.swing.JTextField txt_mrp;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_rate;
    // End of variables declaration//GEN-END:variables
}
