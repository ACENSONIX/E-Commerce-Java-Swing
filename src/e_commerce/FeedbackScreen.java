/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e_commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nihal gupta
 */
public class FeedbackScreen extends javax.swing.JFrame {

    String cusername = null;
    Connection con;
    PreparedStatement ps;

    /**
     * Creates new form FeedbackScreen
     */
    public FeedbackScreen() {
        super("Feedback Screen");
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
        btn_submit = new javax.swing.JButton();
        jlable1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        et_title = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        et_info = new javax.swing.JTextArea();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_submit.setBackground(new java.awt.Color(28, 109, 208));
        btn_submit.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 248, 243));
        btn_submit.setText("Submit");
        btn_submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jlable1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlable1.setForeground(new java.awt.Color(11, 44, 83));
        jlable1.setText("Feedback");
        jlable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlable1MouseClicked(evt);
            }
        });
        jPanel1.add(jlable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_feedback-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 400, -1));

        jlabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlabel2.setForeground(new java.awt.Color(11, 44, 83));
        jlabel2.setText("Title");
        jlabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        et_title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        et_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                et_titleActionPerformed(evt);
            }
        });
        jPanel1.add(et_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 340, 30));

        et_info.setColumns(20);
        et_info.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        et_info.setRows(5);
        jScrollPane1.setViewportView(et_info);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 340, 140));

        btn_back.setBackground(new java.awt.Color(73, 138, 217));
        btn_back.setForeground(new java.awt.Color(255, 248, 243));
        btn_back.setText("⬅");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void getCusernameHere(String str) {
        cusername = str;
    }
    private void jlable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlable1MouseClicked

    private void jlabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlabel2MouseClicked

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        if (!et_title.getText().isEmpty() && !et_info.getText().isEmpty()) {
            try {  //jdbc:mysql://localhost:3306/cakemarket?user=root&password=Jayshree123
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=nihal123");
                ps = con.prepareStatement("insert into feedback(fusername,finfo,ftitle) values(?,?,?)");
                ps.setString(1, cusername);
                ps.setString(2, et_info.getText());
                ps.setString(3, et_title.getText());
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(RegisterScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Submited Successfully!!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_submitActionPerformed

    private void et_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_et_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_et_titleActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        MainScreen main = new MainScreen();
        main.getCusername(cusername);
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(FeedbackScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_submit;
    private javax.swing.JTextArea et_info;
    private javax.swing.JTextField et_title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlable1;
    // End of variables declaration//GEN-END:variables
}
