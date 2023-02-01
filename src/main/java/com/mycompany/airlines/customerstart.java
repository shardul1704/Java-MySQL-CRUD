/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.airlines;

/**
 *
 * @author Shardul
 */
public class customerstart extends javax.swing.JFrame {

    /**
     * Creates new form customerstart
     */
    public customerstart() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        bookbutt = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        cancelbutt = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        currentbutt = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        backbutt = new javax.swing.JButton();
        jToolBar5 = new javax.swing.JToolBar();
        exitbutt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("What would you like to do?");

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        bookbutt.setBackground(new java.awt.Color(204, 0, 51));
        bookbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookbutt.setForeground(new java.awt.Color(255, 255, 255));
        bookbutt.setText("BOOK FLIGHT TICKETS");
        bookbutt.setFocusable(false);
        bookbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bookbutt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bookbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbuttActionPerformed(evt);
            }
        });
        jToolBar1.add(bookbutt);

        jToolBar2.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar2.setRollover(true);

        cancelbutt.setBackground(new java.awt.Color(204, 0, 51));
        cancelbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelbutt.setForeground(new java.awt.Color(255, 255, 255));
        cancelbutt.setText("CANCEL TICKETS");
        cancelbutt.setFocusable(false);
        cancelbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelbutt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttActionPerformed(evt);
            }
        });
        jToolBar2.add(cancelbutt);

        jToolBar3.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar3.setRollover(true);

        currentbutt.setBackground(new java.awt.Color(204, 0, 51));
        currentbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        currentbutt.setForeground(new java.awt.Color(255, 255, 255));
        currentbutt.setText("VIEW CURRENT TICKETS");
        currentbutt.setFocusable(false);
        currentbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        currentbutt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        currentbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentbuttActionPerformed(evt);
            }
        });
        jToolBar3.add(currentbutt);

        jToolBar4.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar4.setRollover(true);

        backbutt.setBackground(new java.awt.Color(204, 0, 0));
        backbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbutt.setForeground(new java.awt.Color(255, 255, 255));
        backbutt.setText("BACK");
        backbutt.setFocusable(false);
        backbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backbutt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        backbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttActionPerformed(evt);
            }
        });
        jToolBar4.add(backbutt);

        jToolBar5.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar5.setRollover(true);

        exitbutt.setBackground(new java.awt.Color(204, 0, 0));
        exitbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbutt.setForeground(new java.awt.Color(255, 255, 255));
        exitbutt.setText("EXIT");
        exitbutt.setFocusable(false);
        exitbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitbutt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exitbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttActionPerformed(evt);
            }
        });
        jToolBar5.add(exitbutt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jToolBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbuttActionPerformed
    new bookingpage().setVisible(true);
        this.setVisible(false);    // TODO add your handling code here:
    }//GEN-LAST:event_bookbuttActionPerformed

    private void cancelbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttActionPerformed
    new cancelpage().setVisible(true);
        this.setVisible(false);    // TODO add your handling code here:
    }//GEN-LAST:event_cancelbuttActionPerformed

    private void currentbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentbuttActionPerformed
    new currenttickspage().setVisible(true);
        this.setVisible(false);    // TODO add your handling code here:
    }//GEN-LAST:event_currentbuttActionPerformed

    private void backbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttActionPerformed
    new custlogin().setVisible(true);
        this.setVisible(false);    // TODO add your handling code here:
    }//GEN-LAST:event_backbuttActionPerformed

    private void exitbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttActionPerformed
    System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_exitbuttActionPerformed

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
            java.util.logging.Logger.getLogger(customerstart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerstart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerstart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerstart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerstart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutt;
    private javax.swing.JButton bookbutt;
    private javax.swing.JButton cancelbutt;
    private javax.swing.JButton currentbutt;
    private javax.swing.JButton exitbutt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    // End of variables declaration//GEN-END:variables
}
