/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class reportEmp extends javax.swing.JFrame {

    /**
     * Creates new form reportEmp
     */
    login ob = new login();
    String u = ob.us;
    public reportEmp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        empname = new javax.swing.JLabel();
        empdes = new javax.swing.JLabel();
        btn1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mess = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(0, 51, 51));
        sidePanel.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_2user.png"))); // NOI18N
        sidePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 5, 130, 67));

        empname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        empname.setForeground(new java.awt.Color(255, 255, 255));
        empname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empname.setText(u);
        sidePanel.add(empname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 130, 15));

        empdes.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        empdes.setForeground(new java.awt.Color(51, 255, 255));
        empdes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empdes.setText("HRD");
        sidePanel.add(empdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 130, 15));

        btn1.setBackground(new java.awt.Color(0, 51, 102));
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard.png"))); // NOI18N
        btn1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 110, 40));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Dashboard");
        btn1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 45, 90, -1));

        sidePanel.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 70));

        btn3.setBackground(new java.awt.Color(0, 51, 102));
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        btn3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salary.png"))); // NOI18N
        btn3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 110, 40));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Salary");
        btn3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 40, -1, -1));

        sidePanel.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 70));

        btn4.setBackground(new java.awt.Color(0, 51, 102));
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        btn4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        btn4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 110, 40));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Leave");
        btn4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 40, -1, -1));

        sidePanel.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 110, 70));

        btn6.setBackground(new java.awt.Color(0, 51, 102));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("LogOut");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn6Layout = new javax.swing.GroupLayout(btn6);
        btn6.setLayout(btn6Layout);
        btn6Layout.setHorizontalGroup(
            btn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn6Layout.setVerticalGroup(
            btn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidePanel.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 515, 100, 30));

        jPanel1.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Report Employee");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Message");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        t.setBackground(new java.awt.Color(255, 255, 255));
        t.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        t.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 140, -1));

        mess.setBackground(new java.awt.Color(255, 255, 255));
        mess.setColumns(20);
        mess.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mess.setRows(5);
        jScrollPane1.setViewportView(mess);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 410, 140));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("JOB ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jButton4.setBackground(new java.awt.Color(153, 0, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Send");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_wp2590323-light-blue-background.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        // TODO add your handling code here:
        dispose();
        salary n = new salary();
        n.setVisible(true);
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        // TODO add your handling code here:
        dispose();
        employee n = new employee();
        n.setVisible(true);
    }//GEN-LAST:event_btn4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        dispose();
        login n = new login();
        n.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        String from = "phoenix.it.71@gmail.com.com";
        String jid = t.getText();
        String to=null;
        //Database searching start
        try{
            
                Connection con = connSignUp.getConnection();
                Statement stmt = (Statement) con.createStatement();
                String check = "select * from addemp";
                ResultSet point = stmt.executeQuery(check);
                
                while(point.next())
                {
                    String j = point.getString("ji");
                    
                    if(j.equals(jid))
                    {
                        to = point.getString("em");
                    }
                }
        }
        catch (SQLException ex) 
        {
           JOptionPane.showMessageDialog(null, "Error");
        }
        //Database searching start
      
        String content = mess.getText();
        
        try{
            
                Connection con = connSignUp.getConnection();
                java.sql.Statement stmt = con.createStatement();
                String query = "select * from notification";
                ResultSet rs = stmt.executeQuery(query);
                String in = "INSERT INTO `notification`(`jobID`,`noti`,`tik`) VALUES (?,?,?)";
                PreparedStatement pst;
                
                try 
                        {
                           pst = (PreparedStatement) connSignUp.getConnection().prepareStatement(in);
                           pst.setString(1,jid);
                           pst.setString(2,content);
                           pst.setBoolean(3,false);
                           pst.execute();
                        } 
                
                        catch (SQLException ex) 
                        {
                           Logger.getLogger(signUp.class.getName()).log(Level.SEVERE, null, ex);
                        }
        }
        catch (SQLException ex) 
        {
           JOptionPane.showMessageDialog(null, "Error");
        }
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        dispose();
        mainForm ob = new mainForm();
        ob.setVisible(true);
    }//GEN-LAST:event_btn1MouseClicked

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
            java.util.logging.Logger.getLogger(reportEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn3;
    private javax.swing.JPanel btn4;
    private javax.swing.JPanel btn6;
    private javax.swing.JLabel empdes;
    private javax.swing.JLabel empname;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mess;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField t;
    // End of variables declaration//GEN-END:variables
}