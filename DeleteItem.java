package pharmacysystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sujoy
 */
public class DeleteItem extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public DeleteItem() {
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
                cmb_drugName.addItem(drugname);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally
        {
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
        btn_delete1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_delete4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_delete3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn_delete2 = new javax.swing.JButton();
        cmb_drugName = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Delete Item");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Delete Item");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 290, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Drug Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 99, -1));

        btn_delete1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_delete1.setText("Delete");
        btn_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 122, 162, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("Delete All Item Which have Zero(0) QTY avaiable");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 203, -1, 30));

        btn_delete4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_delete4.setText("Delete");
        btn_delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete4, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 308, 162, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setText("Delete All Item");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 252, 210, 30));

        btn_delete3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_delete3.setText("Delete");
        btn_delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete3, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 251, 162, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setText("Delete Bills");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 314, 160, 20));

        btn_delete2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_delete2.setText("Delete");
        btn_delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 202, 162, -1));

        cmb_drugName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_drugNamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(cmb_drugName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 127, 337, 37));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/delete.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 460));

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

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete4ActionPerformed
        JOptionPane.showConfirmDialog(null, "Do You Really Delete all Bill data", "Deleted", JOptionPane.YES_NO_OPTION);
        {
            try {
                String sql = "delete * from RetailSales";
                pst = conn.prepareStatement(sql);
                pst.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }finally{
            try {
                pst.close();
                rs.close();
                
            } catch (Exception e) {
            }
        }
        }
    }//GEN-LAST:event_btn_delete4ActionPerformed

    private void btn_delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete3ActionPerformed
       int p= JOptionPane.showConfirmDialog(null, "Do You Really Delete all Drug data", "Deleted", JOptionPane.YES_NO_OPTION);
       if(p==0) {
            try {
                String sql = "delete * from DrugEntry";
                pst = conn.prepareStatement(sql);
                pst.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }finally{
            try {
                pst.close();
                rs.close();
                
            } catch (Exception e) {
            }
        }
        }
    }//GEN-LAST:event_btn_delete3ActionPerformed

    private void btn_delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete2ActionPerformed
        int p= JOptionPane.showConfirmDialog(null, "Do You Really Delete QTY<0 Drug data", "Deleted", JOptionPane.YES_NO_OPTION);
       if(p==0) {
       
        try {
            String sql= "delete  from DrugEntry where QTY<=0";
            pst=conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Deleted which QTY  0");
        } catch (Exception e) {
        }}
    }//GEN-LAST:event_btn_delete2ActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
     int p= JOptionPane.showConfirmDialog(null, "Do You Really Delete this Drug data", "Deleted", JOptionPane.YES_NO_OPTION);
       if(p==0) {
       
        String name= cmb_drugName.getSelectedItem().toString();
        try {
            String sql= "delete * from DrugEntry where name='"+name+"'";
            pst= conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Deleted");
        } catch (Exception e) {
        }finally{
            try {
                pst.close();
                rs.close();
                
            } catch (Exception e) {
            }
        }}
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void cmb_drugNamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_drugNamePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_drugNamePopupMenuWillBecomeInvisible

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete1;
    private javax.swing.JButton btn_delete2;
    private javax.swing.JButton btn_delete3;
    private javax.swing.JButton btn_delete4;
    private javax.swing.JComboBox cmb_drugName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
