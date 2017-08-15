package pharmacysystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sujoy
 */
public class ViewSalesReport extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String date1, date2;

    public ViewSalesReport() {
        initComponents();
        conn = DatabaseConnection.db_connect();
        //amount();
        //sumAmount();
    }

    public void sumAmount() {
        amount();
        try {
            String sql1 = "select sum(Amount) from RetailSales where Date >='" + date1 + "' and Date <='" + date2 + "' ";
            pst = conn.prepareStatement(sql1);

            rs = pst.executeQuery();
            if (rs.next()) {
                String add = rs.getString("SUM(Amount)");
                txt_amount.setText(add);
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

    public void amount() {

        String a, b, c, d, e, f;
        a = (String) cmb_day1.getSelectedItem();
        b = (String) cmb_month1.getSelectedItem();
        c = (String) cmb_year1.getSelectedItem();
        date1 = a + "/" + b + "/" + c;
        d = (String) cmb_day2.getSelectedItem();
        e = (String) cmb_month2.getSelectedItem();
        f = (String) cmb_year2.getSelectedItem();
        date2 = d + "/" + e + "/" + f;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_day1 = new javax.swing.JComboBox();
        cmb_year1 = new javax.swing.JComboBox();
        cmb_month1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmb_day2 = new javax.swing.JComboBox();
        cmb_month2 = new javax.swing.JComboBox();
        cmb_year2 = new javax.swing.JComboBox();
        btn_ok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_amount = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(255, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("                                                                                                    View Sales Report");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("View Sales Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Total Sales From");

        cmb_day1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_day1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Day-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmb_year1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_year1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Year-", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        cmb_month1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_month1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Month-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Till");

        cmb_day2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_day2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Day-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmb_month2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_month2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Month-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cmb_year2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_year2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Year-", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        btn_ok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Total Sales Amount :");

        txt_amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_amount.setText("Amount");

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txt_amount)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cmb_day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmb_month1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmb_year1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmb_day2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmb_month2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmb_year2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_month2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_year2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cmb_day2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_month1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_year1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cmb_day1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed

        String a, b, c, d, e, f;
        a = (String) cmb_day1.getSelectedItem();
        b = (String) cmb_month1.getSelectedItem();
        c = (String) cmb_year1.getSelectedItem();
        date1 = a + "/" + b + "/" + c;
        d = (String) cmb_day2.getSelectedItem();
        e = (String) cmb_month2.getSelectedItem();
        f = (String) cmb_year2.getSelectedItem();
        date2 = d + "/" + e + "/" + f;

        try {
            //String sq="select * from RetailSales where Date >='"+date1+"' and Date<= "+date2;
            String sql = "select * from RetailSales where Date >='" + date1 + "' and Date <='" + date2 + "'";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
                table.setModel(DbUtils.resultSetToTableModel(rs));
            sumAmount();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception ep) {
            }
        }
    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        cmb_day1.setSelectedIndex(0);
        cmb_day2.setSelectedIndex(0);
        cmb_month2.setSelectedIndex(0);
        cmb_month1.setSelectedIndex(0);
        cmb_year2.setSelectedIndex(0);
        cmb_year1.setSelectedIndex(0);
        txt_amount.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 super.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_ok;
    private javax.swing.JComboBox cmb_day1;
    private javax.swing.JComboBox cmb_day2;
    private javax.swing.JComboBox cmb_month1;
    private javax.swing.JComboBox cmb_month2;
    private javax.swing.JComboBox cmb_year1;
    private javax.swing.JComboBox cmb_year2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JLabel txt_amount;
    // End of variables declaration//GEN-END:variables
}
