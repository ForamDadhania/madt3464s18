
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pramukhcomputer
 */
public class AdminPage extends javax.swing.JFrame {
 Connection conn= null;
    ResultSet rs = null;
    Statement pst= null;
    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
         conn=mySqlConnection.connectDb();
            setSize(700,500);
              setLocation(100,50);
      
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        admintxt = new javax.swing.JTextField();
        adloginBtn = new javax.swing.JButton();
        adminpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Admin Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 190, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("AdminId");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 108, 28));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, 111, 26));
        getContentPane().add(admintxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 68, 127, 28));

        adloginBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        adloginBtn.setText("Login");
        adloginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adloginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(adloginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 241, 97, 32));
        getContentPane().add(adminpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 171, 127, 26));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pramukhcomputer\\Downloads\\download.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adloginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adloginBtnActionPerformed
        try
        {
 
         Statement stmn=conn.createStatement();
          ResultSet rs2 = stmn.executeQuery("select* from admin where username='"+admintxt.getText()+"' and password='"+adminpass.getText()+"'");
      

       if(rs2.next())
           
       {
           JOptionPane.showMessageDialog(null,"Logging Successful");
       }
        
        else
            {
                JOptionPane.showMessageDialog(null,"Login Unuccessful");
//            String s1=rs.getString("option");
//            if(option.equalsIgnoreCase("Admin")&&s1.equalsIgnoreCase("admin"));
//            {
//                AdminPage ad=new AdminPage();
//                ad.setVisible(true);
//            
//            }
            }}
        catch(Exception e)
                {
                JOptionPane.showMessageDialog(null,e);
               
                }
        
    }//GEN-LAST:event_adloginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adloginBtn;
    private javax.swing.JPasswordField adminpass;
    private javax.swing.JTextField admintxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}