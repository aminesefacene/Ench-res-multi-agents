/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_données;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vente_aux_enchères.BDD;
import vente_aux_enchères.DBConfig;
import vente_aux_enchères.ResultSetTableModel;

/**
 *
 * @author acer
 */
public class AjoutClient extends javax.swing.JFrame {

    ResultSet rs;
     BDD db;
     
    public AjoutClient() {
            db = new BDD(new DBConfig().HOST_DB, new DBConfig().USERNAME_DB, 
            new DBConfig().PASSWORD_DB, new DBConfig().IPHOST, new DBConfig().PORT);
  
        initComponents();
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_telephone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_pseudo = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_adresse = new javax.swing.JTextField();
        txt_dateNaissance = new com.toedter.calendar.JDateChooser();
        txt_password = new javax.swing.JPasswordField();
        txt_password1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Créer un nouveau compte\n");
        setPreferredSize(new java.awt.Dimension(540, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setText("Pseudonyme ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 74, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setText("Confirmation du mot de passe ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 210, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setText("Nom ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 210, 60, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel5.setText("Date de naissance ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 290, 150, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel6.setText("Prénom ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 250, 80, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel7.setText("Adresse");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 330, 80, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel8.setText("Téléphone ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 370, 62, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel9.setText("Email ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 410, 38, 17);

        txt_telephone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_telephone.setPreferredSize(new java.awt.Dimension(6, 27));
        getContentPane().add(txt_telephone);
        txt_telephone.setBounds(260, 360, 200, 27);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/no.png"))); // NOI18N
        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 460, 120, 31);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/yes.png"))); // NOI18N
        jButton2.setText("Envoyer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(213, 460, 120, 31);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel10.setText("Mot de passe");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 130, 74, 17);

        txt_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_email.setPreferredSize(new java.awt.Dimension(6, 27));
        getContentPane().add(txt_email);
        txt_email.setBounds(260, 400, 200, 27);

        txt_pseudo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_pseudo.setPreferredSize(new java.awt.Dimension(6, 27));
        getContentPane().add(txt_pseudo);
        txt_pseudo.setBounds(260, 80, 200, 27);

        txt_nom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_nom.setPreferredSize(new java.awt.Dimension(6, 27));
        getContentPane().add(txt_nom);
        txt_nom.setBounds(260, 200, 200, 27);

        txt_prenom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_prenom.setPreferredSize(new java.awt.Dimension(6, 27));
        getContentPane().add(txt_prenom);
        txt_prenom.setBounds(260, 240, 200, 27);

        txt_adresse.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_adresse.setPreferredSize(new java.awt.Dimension(6, 27));
        getContentPane().add(txt_adresse);
        txt_adresse.setBounds(260, 320, 200, 27);

        txt_dateNaissance.setBackground(new java.awt.Color(121, 121, 149));
        txt_dateNaissance.setDateFormatString("yyyy-MM-d");
        txt_dateNaissance.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_dateNaissance);
        txt_dateNaissance.setBounds(260, 280, 244, 30);

        txt_password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_password);
        txt_password.setBounds(260, 120, 200, 30);

        txt_password1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_password1);
        txt_password1.setBounds(260, 160, 200, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulaire de création d'un compte client");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 434, 28);

        jPanel1.setBackground(new java.awt.Color(121, 121, 149));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            if(txt_pseudo.getText().equals("") || txt_password.getText().equals("") || 
               txt_password1.getText().equals("") || txt_nom.getText().equals("") || txt_prenom.getText().equals("") ||
               ((JTextField)txt_dateNaissance.getDateEditor().getUiComponent()).getText().equals("") || 
               txt_telephone.getText().equals("") || txt_adresse.getText().equals("") || txt_email.getText().equals("")) {
           JOptionPane.showMessageDialog(this, "Un ou plusieurs champs sont vides");
            } else { if(!(txt_password.getText().equals(txt_password1.getText()))){
                JOptionPane.showMessageDialog(this, "Les deux mots de passes ne sont pas identiques");
                   }else {
                
                         
                         System.out.println(db.getMD5(txt_password.getText()));
                         String password = db.getMD5(txt_password.getText());
                         String[] colon = {"login","password","nom", "prenom", "dateNaissance", "adresse", "telephone", "mail"};
                         String[] inf ={txt_pseudo.getText(), password, txt_nom.getText(), txt_prenom.getText(), 
                         ((JTextField)txt_dateNaissance.getDateEditor().getUiComponent()).getText(), txt_adresse.getText(), txt_telephone.getText(), txt_email.getText() };
                         System.out.println(db.queryInsert("client", colon, inf));
                         JOptionPane.showMessageDialog(this, " Incription réussi" );
                         this.dispose();
                         Login l = new Login();
                         l.setVisible(true);
                         }
                   
               }
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
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_adresse;
    private com.toedter.calendar.JDateChooser txt_dateNaissance;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_password1;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_pseudo;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration//GEN-END:variables
}
