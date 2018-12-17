 
package Base_de_données;



import java.sql.ResultSet;
import java.sql.SQLException;
import vente_aux_enchères.BDD;





import javax.swing.JOptionPane;
import vente_aux_enchères.DBConfig;
public class Login extends javax.swing.JFrame {

    ResultSet rs;
    BDD db;
    String username1, password1, hak, username2, password2; 

    public Login() {
        
    db = new BDD(new DBConfig().HOST_DB, new DBConfig().USERNAME_DB, 
            new DBConfig().PASSWORD_DB, new DBConfig().IPHOST, new DBConfig().PORT);
   
    initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username4 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        text_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_fermer = new javax.swing.JButton();
        txt_login = new javax.swing.JButton();
        txt_enregistrer = new javax.swing.JButton();
        authentification = new javax.swing.JLabel();
        username5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        username4.setFont(new java.awt.Font("Bradley Hand ITC", 2, 18)); // NOI18N
        username4.setText("Username ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Authentification\n");
        setBackground(new java.awt.Color(102, 20, 248));
        setForeground(new java.awt.Color(204, 51, 255));
        setPreferredSize(new java.awt.Dimension(650, 320));
        setResizable(false);
        getContentPane().setLayout(null);

        username.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        username.setText("Username ");
        getContentPane().add(username);
        username.setBounds(200, 100, 100, 30);

        password.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        password.setText("Password ");
        getContentPane().add(password);
        password.setBounds(200, 170, 100, 23);

        text_username.setBackground(new java.awt.Color(0, 0, 0));
        text_username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        text_username.setForeground(new java.awt.Color(255, 255, 255));
        text_username.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        text_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(text_username);
        text_username.setBounds(350, 100, 170, 32);

        txt_password.setBackground(new java.awt.Color(0, 0, 0));
        txt_password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password);
        txt_password.setBounds(350, 160, 170, 32);

        txt_fermer.setBackground(new java.awt.Color(255, 255, 255));
        txt_fermer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_fermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/power_off.png"))); // NOI18N
        txt_fermer.setText("Fermer");
        txt_fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fermerActionPerformed(evt);
            }
        });
        getContentPane().add(txt_fermer);
        txt_fermer.setBounds(480, 240, 110, 31);

        txt_login.setBackground(new java.awt.Color(255, 255, 255));
        txt_login.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/padlock_closed.png"))); // NOI18N
        txt_login.setText("Connexion");
        txt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loginActionPerformed(evt);
            }
        });
        getContentPane().add(txt_login);
        txt_login.setBounds(310, 240, 140, 30);

        txt_enregistrer.setBackground(new java.awt.Color(255, 255, 255));
        txt_enregistrer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_enregistrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enregistrer.jpg"))); // NOI18N
        txt_enregistrer.setText("S'enregistrer");
        txt_enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_enregistrerActionPerformed(evt);
            }
        });
        getContentPane().add(txt_enregistrer);
        txt_enregistrer.setBounds(120, 240, 160, 31);

        authentification.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        authentification.setForeground(java.awt.Color.white);
        authentification.setText("Authentification");
        getContentPane().add(authentification);
        authentification.setBounds(160, 30, 250, 42);

        username5.setFont(new java.awt.Font("Bradley Hand ITC", 2, 18)); // NOI18N
        username5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login.jpg"))); // NOI18N
        username5.setText("Username ");
        getContentPane().add(username5);
        username5.setBounds(20, 100, 130, 100);

        jPanel1.setBackground(new java.awt.Color(121, 121, 149));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fermerActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir quitter", "Attention",
         JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION ){
            dispose();
        }
    }//GEN-LAST:event_txt_fermerActionPerformed

    private void txt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loginActionPerformed
      rs = db.querySelectAll("administrateur", "username='" + text_username.getText()
            + "' and password='" + txt_password.getText() + "'");
        try {
            while (rs.next()) {
                username1 = rs.getString("username");
                password1 = rs.getString("password");
                hak = rs.getString("type");
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        
        if(username1 == null && password1 == null){
            
            rs = db.querySelectAll("client", "login='" + text_username.getText()
            + "' and password='" + db.getMD5(txt_password.getText()) + "'");
        try {
            while (rs.next()) {
                username2 = rs.getString("login");
                password2 = rs.getString("password");
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            if(username2 == null && password2 == null){
                JOptionPane.showMessageDialog(this, "Le nom d'utilisateur ou le mot de passe est incorrect");
            }else {
                Principale p = new Principale();
                String login=text_username.getText();
                new Principale(login).setVisible(true);
            }
            
        } else {
            if(hak.equals("Administrateur")) {
                Administration ad = new Administration();
                ad.setVisible(true);
               // this.dispose();
            }else {
                Gerant g = new Gerant();
                g.setVisible(true);
                // this.dispose();
            }
            }
        
    }//GEN-LAST:event_txt_loginActionPerformed

    private void txt_enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_enregistrerActionPerformed
        AjoutClient c = new AjoutClient();
        c.setVisible(true);
       
    }//GEN-LAST:event_txt_enregistrerActionPerformed

    private void text_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_usernameActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

 
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authentification;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password;
    private javax.swing.JTextField text_username;
    private javax.swing.JButton txt_enregistrer;
    private javax.swing.JButton txt_fermer;
    private javax.swing.JButton txt_login;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username4;
    private javax.swing.JLabel username5;
    // End of variables declaration//GEN-END:variables
}
