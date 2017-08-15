package pharmacysystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Sujoy
 */
public class AddItem extends javax.swing.JInternalFrame {
    Thread td = new Thread();
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public AddItem() {
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
        txt_namedrug = new javax.swing.JTextField();
        txt_batchno = new javax.swing.JTextField();
        cmb_expmonth = new javax.swing.JComboBox();
        cmb_expyear = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        txt_rate = new javax.swing.JTextField();
        txt_mrp = new javax.swing.JTextField();
        btn_saveClear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_messShow = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Add Item");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/hospitalLogo.jpg"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("New Drug Entry");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 280, 39));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Name Of Drug");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Batch No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Exp Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        txt_namedrug.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namedrug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_namedrugMouseEntered(evt);
            }
        });
        txt_namedrug.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_namedrugKeyReleased(evt);
            }
        });
        getContentPane().add(txt_namedrug, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, 30));

        txt_batchno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_batchno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 140, 30));

        cmb_expmonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_expmonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Month-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(cmb_expmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 120, 30));

        cmb_expyear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_expyear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Year-", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        getContentPane().add(cmb_expyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Add Stock Details ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("QTY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Rate");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("MRP");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        txt_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 160, 30));

        txt_rate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 150, 30));

        txt_mrp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_mrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 160, 30));

        btn_saveClear.setBackground(new java.awt.Color(0, 0, 0));
        btn_saveClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_saveClear.setForeground(new java.awt.Color(204, 204, 204));
        btn_saveClear.setText("Save And Clear");
        btn_saveClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_saveClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_saveClearMouseExited(evt);
            }
        });
        btn_saveClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveClearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_saveClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 280, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/login_bk_image.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 720, 490));
        getContentPane().add(txt_messShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 140, 30));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Save");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("EXIT");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 836, 546);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      
        btn_saveClearActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_saveClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveClearMouseEntered
        btn_saveClear.setBackground(Color.green);
    }//GEN-LAST:event_btn_saveClearMouseEntered

    private void btn_saveClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveClearActionPerformed

        try {
            String month, year, expdate;
            month = cmb_expmonth.getSelectedItem().toString(); // get data from month combo
            year = cmb_expyear.getSelectedItem().toString(); // get data from year combo
            expdate = year + "/" + month; // add 2 data from combo get item

            String sql = "insert into DrugEntry(DrugName,BatchNo,ExpDate,QTY,Rate,MRP) values (?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_namedrug.getText());
            pst.setString(2, txt_batchno.getText());
            pst.setString(3, expdate);
            pst.setString(4, txt_qty.getText());
            pst.setString(5, txt_rate.getText());
            pst.setString(6, txt_mrp.getText());

            pst.execute();
            txt_messShow.setText("Data Saved"); // show a mess
            txt_messShow.setBackground(Color.blue); // mess background color
            txt_namedrug.requestFocus(); // after saved courser gone to drug name txt box
            
            /*--------------------------------------------- */
            // Clear
            txt_batchno.setText("");
            txt_mrp.setText("");
            txt_namedrug.setText("");
            txt_qty.setText("");
            txt_rate.setText("");
            cmb_expmonth.setSelectedIndex(0);
            cmb_expyear.setSelectedIndex(0);
            
            Timer t= new Timer(5000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt_messShow.setText(null);
                }
            });
            t.setRepeats(false);
            t.start();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                pst.close();
                rs.close();
                
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btn_saveClearActionPerformed

    private void btn_saveClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveClearMouseExited
        btn_saveClear.setBackground(Color.black);
    }//GEN-LAST:event_btn_saveClearMouseExited

    private void txt_namedrugKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_namedrugKeyReleased
        //txt_namedrug.setBackground(Color.red);
    }//GEN-LAST:event_txt_namedrugKeyReleased

    private void txt_namedrugMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_namedrugMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namedrugMouseEntered

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_saveClear;
    private javax.swing.JComboBox cmb_expmonth;
    private javax.swing.JComboBox cmb_expyear;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField txt_batchno;
    private javax.swing.JLabel txt_messShow;
    private javax.swing.JTextField txt_mrp;
    private javax.swing.JTextField txt_namedrug;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_rate;
    // End of variables declaration//GEN-END:variables
}
