/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haven_login;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author QCU
 */
public class HAVEN_LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form HAVEN_LOGIN
     */
    public HAVEN_LOGIN() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Check = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1380, 776));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 70, -1, -1));

        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        jPanel1.add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 95, 369, 35));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 146, -1, -1));
        jPanel1.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 171, 369, 35));

        login.setBackground(new java.awt.Color(251, 151, 36));
        login.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOG IN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 253, 369, 31));

        jButton2.setBackground(new java.awt.Color(251, 151, 36));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 302, 94, -1));

        Check.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        Check.setForeground(new java.awt.Color(255, 255, 255));
        Check.setText("Show password?");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });
        jPanel1.add(Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 213, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 450, 380));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/haven_login/images/logo1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 100, 100));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BREW HAVEN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/haven_login/images/bg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1380, 776));
        jLabel1.setMinimumSize(new java.awt.Dimension(1380, 776));
        jLabel1.setPreferredSize(new java.awt.Dimension(1380, 776));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 776));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if (jname.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out the Username");
        }
        
        else if (jpassword.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Please fill out the Password");
        }
        
        else if (jname.getText().contains("admin123")&& jpassword.getText().contains("admin123")){
               JOptionPane.showMessageDialog(null, "Login Successful");
        }
        
        else{
           JOptionPane.showMessageDialog(null, "Wrong Username or Password","Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
         if(Check.isSelected())
        {
        jpassword.setEchoChar((char)0);
        }
        else
        {
         jpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(HAVEN_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HAVEN_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HAVEN_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HAVEN_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HAVEN_LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Check;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jname;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
