
package pharmacysystem;

import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sujoy
 */
public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        CurrentDate();
    }
    
    public  void display(){
        Bill bl= new Bill();
     display.add(bl);
     bl.show();
    }
    public void CurrentDate() {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        date.setText("Date: " + day + "/" + (month + 1) + "/" + year);

        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        time.setText("Time: " + hour + ":" + minute + ":" + second);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        btn_additem = new javax.swing.JButton();
        btn_ezpDate = new javax.swing.JButton();
        btn_viewStock = new javax.swing.JButton();
        btn_deleteItem = new javax.swing.JButton();
        btn_modifyItem = new javax.swing.JButton();
        btn_bill = new javax.swing.JButton();
        btn_refrash = new javax.swing.JButton();
        btn_salesreport = new javax.swing.JButton();
        display = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_logout = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        password1 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        date = new javax.swing.JMenu();
        time = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        loginBy = new javax.swing.JMenu();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Main Page");
        setName("Main"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1145, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/home-icon.png"))); // NOI18N
        btn_home.setText("Home");
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_homeMouseExited(evt);
            }
        });
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_additem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/add items.png"))); // NOI18N
        btn_additem.setText("Add Item");
        btn_additem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_additemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_additemMouseExited(evt);
            }
        });
        btn_additem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_additemActionPerformed(evt);
            }
        });

        btn_ezpDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/exp.png"))); // NOI18N
        btn_ezpDate.setText("View Expiry Date");
        btn_ezpDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ezpDateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ezpDateMouseExited(evt);
            }
        });
        btn_ezpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ezpDateActionPerformed(evt);
            }
        });

        btn_viewStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/stock.png"))); // NOI18N
        btn_viewStock.setText("View Stock");
        btn_viewStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_viewStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_viewStockMouseExited(evt);
            }
        });
        btn_viewStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewStockActionPerformed(evt);
            }
        });

        btn_deleteItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/delete small.png"))); // NOI18N
        btn_deleteItem.setText("Delete Item");
        btn_deleteItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_deleteItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_deleteItemMouseExited(evt);
            }
        });
        btn_deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteItemActionPerformed(evt);
            }
        });

        btn_modifyItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/modify.jpg"))); // NOI18N
        btn_modifyItem.setText("Modify Item");
        btn_modifyItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_modifyItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_modifyItemMouseExited(evt);
            }
        });
        btn_modifyItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifyItemActionPerformed(evt);
            }
        });

        btn_bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/bill.png"))); // NOI18N
        btn_bill.setText("View Bill");
        btn_bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_billMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_billMouseExited(evt);
            }
        });
        btn_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_billActionPerformed(evt);
            }
        });

        btn_refrash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacysystem/img/refresh.png"))); // NOI18N
        btn_refrash.setText("Refrash");
        btn_refrash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_refrashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_refrashMouseExited(evt);
            }
        });
        btn_refrash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrashActionPerformed(evt);
            }
        });

        btn_salesreport.setText("Sales Report");
        btn_salesreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salesreportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salesreportMouseExited(evt);
            }
        });
        btn_salesreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salesreportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_home)
                .addGap(2, 2, 2)
                .addComponent(btn_additem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_deleteItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_modifyItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_viewStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ezpDate)
                .addGap(18, 18, 18)
                .addComponent(btn_bill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btn_refrash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salesreport)
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_home)
                            .addComponent(btn_additem)
                            .addComponent(btn_modifyItem)
                            .addComponent(btn_viewStock)
                            .addComponent(btn_ezpDate)
                            .addComponent(btn_bill)
                            .addComponent(btn_refrash)
                            .addComponent(btn_deleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(btn_salesreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 70));

        display.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout displayLayout = new javax.swing.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1220, 610));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        menu_logout.setText("File");
        menu_logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menu_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_logoutActionPerformed(evt);
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Create Member");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_logout.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setText("HOME");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menu_logout.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem5.setText("ADD Item");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menu_logout.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem6.setText("Delete Item");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menu_logout.add(jMenuItem6);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem8.setText("View Stock");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menu_logout.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem9.setText("Expiry Date");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menu_logout.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem10.setText("Bill");
        menu_logout.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem11.setText("Sales Report");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menu_logout.add(jMenuItem11);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Refrash");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        menu_logout.add(jMenuItem13);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu_logout.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("EXIT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_logout.add(jMenuItem1);

        jMenuItem7.setText("Bill");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menu_logout.add(jMenuItem7);

        jMenuBar1.add(menu_logout);

        jMenu2.setText("Edit    ");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        password1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        password1.setText("Reset Password");
        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });
        jMenu2.add(password1);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem15.setText("Modify Item");
        jMenu2.add(jMenuItem15);

        jMenuBar1.add(jMenu2);

        date.setText("Date                    ");
        date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar1.add(date);

        time.setText("Time                                ");
        time.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar1.add(time);

        jMenu8.setText("Login By:");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu8);

        loginBy.setText("Nameee          ");
        loginBy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar1.add(loginBy);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1236, 746));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Login lg= new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseEntered
        btn_home.setBackground(Color.red);
    }//GEN-LAST:event_btn_homeMouseEntered

    private void btn_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseExited
        btn_home.setBackground(Color.white);
    }//GEN-LAST:event_btn_homeMouseExited

    private void btn_deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteItemActionPerformed
        DeleteItem di = new DeleteItem();
        display.add(di);
        di.show();
    }//GEN-LAST:event_btn_deleteItemActionPerformed

    private void btn_additemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_additemActionPerformed
        AddItem ad = new AddItem();

        display.add(ad);
        ad.show();
    }//GEN-LAST:event_btn_additemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        HOME hm = new HOME();
        display.add(hm);
        hm.show();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_modifyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifyItemActionPerformed
        ModifyItem mi = new ModifyItem();
        display.add(mi);
        mi.show();
    }//GEN-LAST:event_btn_modifyItemActionPerformed

    private void btn_viewStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewStockActionPerformed
        ViewStock vs = new ViewStock();
        display.add(vs);
        vs.show();

    }//GEN-LAST:event_btn_viewStockActionPerformed

    private void btn_ezpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ezpDateActionPerformed
        ViewExpDateDate vxd = new ViewExpDateDate();
        display.add(vxd);
        vxd.show();
    }//GEN-LAST:event_btn_ezpDateActionPerformed

    private void btn_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_billActionPerformed
        ViewBills vb = new ViewBills();
        display.add(vb);
        vb.show();
    }//GEN-LAST:event_btn_billActionPerformed

    private void btn_refrashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrashActionPerformed
        this.dispose();
        main mn = new main();
        mn.setVisible(true);

    }//GEN-LAST:event_btn_refrashActionPerformed

    private void btn_salesreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salesreportActionPerformed
        ViewSalesReport vsr = new ViewSalesReport();
        display.add(vsr);
        vsr.show();
    }//GEN-LAST:event_btn_salesreportActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AddUser au = new AddUser();
        display.add(au);
        au.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btn_additemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_additemMouseEntered
        btn_additem.setBackground(Color.red);
    }//GEN-LAST:event_btn_additemMouseEntered

    private void btn_additemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_additemMouseExited
        btn_additem.setBackground(Color.white);
    }//GEN-LAST:event_btn_additemMouseExited

    private void btn_deleteItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteItemMouseEntered
        btn_deleteItem.setBackground(Color.gray);
    }//GEN-LAST:event_btn_deleteItemMouseEntered

    private void btn_deleteItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteItemMouseExited
        btn_deleteItem.setBackground(Color.white);
    }//GEN-LAST:event_btn_deleteItemMouseExited

    private void btn_modifyItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modifyItemMouseEntered
        btn_modifyItem.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btn_modifyItemMouseEntered

    private void btn_modifyItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modifyItemMouseExited
        btn_modifyItem.setBackground(Color.white);
    }//GEN-LAST:event_btn_modifyItemMouseExited

    private void btn_viewStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewStockMouseEntered
        btn_viewStock.setBackground(Color.blue);
    }//GEN-LAST:event_btn_viewStockMouseEntered

    private void btn_viewStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewStockMouseExited
        btn_viewStock.setBackground(Color.white);
    }//GEN-LAST:event_btn_viewStockMouseExited

    private void btn_ezpDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ezpDateMouseEntered
        btn_ezpDate.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_btn_ezpDateMouseEntered

    private void btn_ezpDateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ezpDateMouseExited
        btn_ezpDate.setBackground(Color.white);
    }//GEN-LAST:event_btn_ezpDateMouseExited

    private void btn_billMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_billMouseEntered
        btn_bill.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_btn_billMouseEntered

    private void btn_billMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_billMouseExited
        btn_bill.setBackground(Color.white);
    }//GEN-LAST:event_btn_billMouseExited

    private void btn_refrashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refrashMouseEntered
        btn_refrash.setBackground(Color.green);
    }//GEN-LAST:event_btn_refrashMouseEntered

    private void btn_refrashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refrashMouseExited
        btn_refrash.setBackground(Color.white);
    }//GEN-LAST:event_btn_refrashMouseExited

    private void btn_salesreportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesreportMouseEntered
        btn_salesreport.setBackground(Color.red);
    }//GEN-LAST:event_btn_salesreportMouseEntered

    private void btn_salesreportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesreportMouseExited
        btn_salesreport.setBackground(Color.white);
    }//GEN-LAST:event_btn_salesreportMouseExited

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        AddItem ai= new AddItem();
        display.add(ai);
        ai.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        DeleteItem di= new DeleteItem();
        display.add(di);
        di.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void menu_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_logoutActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        ViewSalesReport v = new ViewSalesReport();
        display.add(v);
        v.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Bill bl = new Bill();
        display.add(bl);
        bl.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        HOME hm= new HOME();
        display.add(hm);
        hm.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ViewStock vs= new ViewStock();
        display.add(vs);
        vs.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ViewExpDateDate ve= new ViewExpDateDate();
        display.add(ve);
        ve.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        main m = new main();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_additem;
    private javax.swing.JButton btn_bill;
    private javax.swing.JButton btn_deleteItem;
    private javax.swing.JButton btn_ezpDate;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_modifyItem;
    private javax.swing.JButton btn_refrash;
    private javax.swing.JButton btn_salesreport;
    private javax.swing.JButton btn_viewStock;
    private javax.swing.JMenu date;
    private javax.swing.JDesktopPane display;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu loginBy;
    private javax.swing.JMenu menu_logout;
    private javax.swing.JMenuItem password1;
    private javax.swing.JMenu time;
    // End of variables declaration//GEN-END:variables
}
