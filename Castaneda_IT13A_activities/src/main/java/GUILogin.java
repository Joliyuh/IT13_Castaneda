/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GUILogin extends javax.swing.JFrame {

    /**
     * Creates new form GUILogin
     */
    public GUILogin() {
        initComponents();
        setBounds(600, 300, 400, 250);
        setVisible(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelusername = new javax.swing.JLabel();
        jTextFieldusername = new javax.swing.JTextField();
        jLabelpassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonlogin = new javax.swing.JButton();
        jButtoncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 2));

        jLabelusername.setText("Username:");
        getContentPane().add(jLabelusername);
        getContentPane().add(jTextFieldusername);

        jLabelpassword.setText("Password:");
        getContentPane().add(jLabelpassword);
        getContentPane().add(jPasswordField);

        jButtonlogin.setText("LOGIN");
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlogin);

        jButtoncancel.setText("CANCEL");
        jButtoncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtoncancel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
            String username = jTextFieldusername.getText();
            String password = new String (jPasswordField.getPassword());
            
            credits (username, password);
            
            JOptionPane.showMessageDialog(this, "Account Save Successfully",  "Save",JOptionPane.INFORMATION_MESSAGE );
    }//GEN-LAST:event_jButtonloginActionPerformed

    private void credits ( String username,String password ){
        try {
        File file = new File("C:\\Users\\User\\Documents\\USER.txt");

        BufferedWriter data = new BufferedWriter( new FileWriter( file, true));
        data.write(username + ", " + password);
        data.newLine();
        data.close();

        }catch (IOException e){
               JOptionPane.showMessageDialog(this, "Error Saving Account",  "Error",JOptionPane.ERROR_MESSAGE );
        }
    }
    
    private void jButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncancelActionPerformed
       jTextFieldusername.setText("");
       jPasswordField.setText("");
    }//GEN-LAST:event_jButtoncancelActionPerformed

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
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncancel;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldusername;
    // End of variables declaration//GEN-END:variables
}
