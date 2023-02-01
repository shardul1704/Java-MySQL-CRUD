
package com.mycompany.airlines;

public class emplstart extends javax.swing.JFrame {

    
    public emplstart() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        addflightbutt = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        viewflightbutt = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        passengerlistbutt = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        editflightbutt = new javax.swing.JButton();
        jToolBar5 = new javax.swing.JToolBar();
        backbutt = new javax.swing.JButton();
        jToolBar6 = new javax.swing.JToolBar();
        exitbutt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("What would you like to do?");

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        addflightbutt.setBackground(new java.awt.Color(204, 0, 0));
        addflightbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addflightbutt.setForeground(new java.awt.Color(255, 255, 255));
        addflightbutt.setText("ADD FLIGHTS");
        addflightbutt.setFocusable(false);
        addflightbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addflightbutt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addflightbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addflightbuttActionPerformed(evt);
            }
        });
        jToolBar1.add(addflightbutt);

        jToolBar2.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar2.setRollover(true);

        viewflightbutt.setBackground(new java.awt.Color(204, 0, 0));
        viewflightbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewflightbutt.setForeground(new java.awt.Color(255, 255, 255));
        viewflightbutt.setText("VIEW FLIGHTS");
        viewflightbutt.setFocusable(false);
        viewflightbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewflightbutt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        viewflightbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewflightbuttActionPerformed(evt);
            }
        });
        jToolBar2.add(viewflightbutt);

        jToolBar3.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar3.setRollover(true);

        passengerlistbutt.setBackground(new java.awt.Color(204, 0, 0));
        passengerlistbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passengerlistbutt.setForeground(new java.awt.Color(255, 255, 255));
        passengerlistbutt.setText("VIEW PASSENGER LIST");
        passengerlistbutt.setFocusable(false);
        passengerlistbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        passengerlistbutt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        passengerlistbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengerlistbuttActionPerformed(evt);
            }
        });
        jToolBar3.add(passengerlistbutt);

        jToolBar4.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar4.setRollover(true);

        editflightbutt.setBackground(new java.awt.Color(204, 0, 0));
        editflightbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editflightbutt.setForeground(new java.awt.Color(255, 255, 255));
        editflightbutt.setText("EDIT FLIGHT DETAILS");
        editflightbutt.setFocusable(false);
        editflightbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editflightbutt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editflightbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editflightbuttActionPerformed(evt);
            }
        });
        jToolBar4.add(editflightbutt);

        jToolBar5.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar5.setRollover(true);

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
        jToolBar5.add(backbutt);

        jToolBar6.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar6.setRollover(true);

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
        jToolBar6.add(exitbutt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToolBar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addflightbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addflightbuttActionPerformed
       new addflightpage().setVisible(true);
        this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_addflightbuttActionPerformed

    private void viewflightbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewflightbuttActionPerformed
        new viewflightspage().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_viewflightbuttActionPerformed

    private void passengerlistbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengerlistbuttActionPerformed
        new passengerlist().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_passengerlistbuttActionPerformed

    private void editflightbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editflightbuttActionPerformed
        new editflightdetails().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_editflightbuttActionPerformed

    private void backbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttActionPerformed
        new startpage().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_backbuttActionPerformed

    private void exitbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitbuttActionPerformed

    
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
            java.util.logging.Logger.getLogger(emplstart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emplstart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emplstart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emplstart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emplstart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addflightbutt;
    private javax.swing.JButton backbutt;
    private javax.swing.JButton editflightbutt;
    private javax.swing.JButton exitbutt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JButton passengerlistbutt;
    private javax.swing.JButton viewflightbutt;
    // End of variables declaration//GEN-END:variables
}
