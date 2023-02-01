
package com.mycompany.airlines;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class custlogin extends javax.swing.JFrame {
   
    public custlogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordtf = new javax.swing.JPasswordField();
        usernametf = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        loginbutt = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        exitbutt = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        backbutt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Customer Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("PASSWORD");

        passwordtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtfActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        loginbutt.setBackground(new java.awt.Color(204, 0, 0));
        loginbutt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginbutt.setForeground(new java.awt.Color(255, 255, 255));
        loginbutt.setText("LOGIN");
        loginbutt.setFocusable(false);
        loginbutt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginbutt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        loginbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttActionPerformed(evt);
            }
        });
        jToolBar1.add(loginbutt);

        jToolBar2.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar2.setRollover(true);

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
        jToolBar2.add(exitbutt);

        jToolBar3.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar3.setRollover(true);

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
        jToolBar3.add(backbutt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernametf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordtf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
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

    private void exitbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttActionPerformed
    System.exit(0);    
    }//GEN-LAST:event_exitbuttActionPerformed

    private void backbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttActionPerformed
    new startpage().setVisible(true);
        this.setVisible(false);    
    }//GEN-LAST:event_backbuttActionPerformed

    private void loginbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttActionPerformed
try{
    
            String eusername = usernametf.getText();
            String epassword = passwordtf.getText();
            String gusername = "";
            String gpassword = "";
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/airlines";
            String pwd="1234";
            String user="root";
           
            Connection conn=(Connection)DriverManager.getConnection(db_url,user,pwd);
            String sql = "SELECT username,password FROM customer where username = '"+eusername+"';";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next())
            {
                gusername = rs.getString("username");
                gpassword = rs.getString("password");
            }
            if(!gusername.equals(eusername))
            {
                JOptionPane.showMessageDialog(this, "USERNAME INCORRECT"); 
            }
            else
            if(gpassword.equals(epassword) && gusername.equals(eusername))
            {
                JOptionPane.showMessageDialog(this, "LOGIN COMPLETE!"); 
                new customerstart().setVisible(true);
                this.setVisible(false);
            }
            else
            {
                 JOptionPane.showMessageDialog(this, "PASSWORD INCORRECT");
            }
            }
        catch(Exception e){
 JOptionPane.showMessageDialog(this, e.getMessage()+"  "+'\n' + " YOU HAVE AN ERROR IN CONNECTION PLEASE CORRECT IT");
               e.printStackTrace();
        }        
    }//GEN-LAST:event_loginbuttActionPerformed

    private void passwordtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtfActionPerformed
       
    }//GEN-LAST:event_passwordtfActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new custlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutt;
    private javax.swing.JButton exitbutt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton loginbutt;
    private javax.swing.JPasswordField passwordtf;
    private javax.swing.JTextField usernametf;
    // End of variables declaration//GEN-END:variables
}
