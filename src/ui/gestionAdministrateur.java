
package ui;

import Base_de_données.Administration;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import vente_aux_enchères.BDD;
import vente_aux_enchères.DBConfig;
import vente_aux_enchères.ResultSetTableModel;


public class gestionAdministrateur extends javax.swing.JFrame {

    ResultSet rs;
     BDD db;
    
    public gestionAdministrateur() {
  
            db = new BDD(new DBConfig().HOST_DB, new DBConfig().USERNAME_DB, 
            new DBConfig().PASSWORD_DB, new DBConfig().IPHOST, new DBConfig().PORT);
  
        initComponents();
        table();
        emptyForm();
      
    }
    
    public void emptyForm(){
        
        this.bouton_supprimer.setEnabled(false);
        this.bouton_modifier.setEnabled(false);
    }
    
    public void fullForm(){
        
        this.bouton_supprimer.setEnabled(true);
        this.bouton_modifier.setEnabled(true);
    }
      
        
    
        public void table() {
            String a[] = {"id", "username", "password", "type"};      
            rs = db.querySelectAll("administrateur");
            table_user.setModel(new ResultSetTableModel(rs));
        }
    
        void actualiser(){
            txt_username.setText("");
            txt_password.setText("");
            com_type.setSelectedItem("Veuillez choisir");
            com_recherche.setSelectedItem("Veuillez choisir");
            emptyForm();
        }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bouton_ajouter = new javax.swing.JButton();
        bouton_modifier = new javax.swing.JButton();
        bouton_supprimer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_rechercher = new javax.swing.JTextField();
        bouton_actualiser = new javax.swing.JButton();
        txt_password = new javax.swing.JTextField();
        com_recherche = new javax.swing.JComboBox<>();
        com_type = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Espace de gestion des administrateurs");
        setPreferredSize(new java.awt.Dimension(725, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Espace de gestion des administrateurs");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 400, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/magnify.png"))); // NOI18N
        jButton1.setText("Rechercher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 390, 135, 30);

        bouton_ajouter.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        bouton_ajouter.setText("Ajouter");
        bouton_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_ajouterActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_ajouter);
        bouton_ajouter.setBounds(40, 240, 150, 40);

        bouton_modifier.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gear_16.png"))); // NOI18N
        bouton_modifier.setText("Modifier");
        bouton_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_modifierActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_modifier);
        bouton_modifier.setBounds(210, 240, 150, 40);

        bouton_supprimer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        bouton_supprimer.setText("Supprimer");
        bouton_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_supprimerActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_supprimer);
        bouton_supprimer.setBounds(380, 240, 150, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 410, 50, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Recherche par catégorie :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 340, 150, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 310, 60, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 360, 60, 30);

        txt_username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_username);
        txt_username.setBounds(150, 310, 140, 30);

        txt_rechercher.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_rechercher);
        txt_rechercher.setBounds(530, 390, 140, 30);

        bouton_actualiser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_actualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.png"))); // NOI18N
        bouton_actualiser.setText("Actualiser");
        bouton_actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_actualiserActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_actualiser);
        bouton_actualiser.setBounds(550, 240, 150, 40);

        txt_password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_password);
        txt_password.setBounds(150, 360, 140, 30);

        com_recherche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veuillez choisir", "Username", "Password", "Type" }));
        getContentPane().add(com_recherche);
        com_recherche.setBounds(530, 340, 140, 30);

        com_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veuillez choisir", "Administrateur", "Gérant" }));
        getContentPane().add(com_type);
        com_type.setBounds(150, 410, 140, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/power_off.png"))); // NOI18N
        jButton6.setText("Quitter");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(380, 490, 110, 30);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/retour1.png"))); // NOI18N
        jButton7.setText("Retour ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(220, 490, 130, 30);

        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "        Identifiant", "    Username", "Password", "         Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_user.getTableHeader().setReorderingAllowed(false);
        table_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_userMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_user);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 60, 700, 160);

        jPanel1.setBackground(new java.awt.Color(121, 121, 149));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void bouton_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_ajouterActionPerformed
       if(txt_username.getText().equals("") ||txt_password.getText().equals("") || 
               com_type.getSelectedItem().equals("Veuillez choisir")) {
           JOptionPane.showMessageDialog(this, "Un ou plusieurs champs sont vides");
       } else {
            String[] colon = {"username", "password", "type"};
            String[] inf ={txt_username.getText(), txt_password.getText(), com_type.getSelectedItem().toString()};
            System.out.println(db.queryInsert("administrateur", colon, inf));
            table();
            actualiser();
       }
    }//GEN-LAST:event_bouton_ajouterActionPerformed

    
    private void bouton_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_modifierActionPerformed
        if (txt_username.getText().equals("") || txt_password.getText().equals("")|| 
                com_type.getSelectedItem().equals("Veuillez choisir")) {
            JOptionPane.showMessageDialog(this, "Un ou plusieurs champs sont vides");
        }else{
            String[] colon = {"username", "password", "type"};
            String[] inf = {txt_username.getText(), txt_password.getText(), com_type.getSelectedItem().toString()};
            String id = String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("administrateur", colon, inf, "id='" + id + "'"));
            table();
            actualiser();
        }   
         
    }//GEN-LAST:event_bouton_modifierActionPerformed

    
    private void bouton_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_supprimerActionPerformed
    
         String id = String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),0));
        if (JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir supprimer cet utilisateur", "Attention",
         JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION ){
            db.queryDelete("administrateur", "id=" + id );
        }else{
            return;
        } table();    
    }//GEN-LAST:event_bouton_supprimerActionPerformed

    
    private void bouton_actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_actualiserActionPerformed
       actualiser();
       table();
    }//GEN-LAST:event_bouton_actualiserActionPerformed


    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String type_admin = "Administrateur";
        
        if(txt_rechercher.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez remplir le champ");
            }else {if(com_recherche.getSelectedItem().equals("Veuillez choisir")){
                JOptionPane.showMessageDialog(this, "Veuillez choisir une catégorie");
            }else if(com_recherche.getSelectedItem().equals("Username")){
              rs = db.querySelectAll("administrateur", "username LIKE '%" + txt_rechercher.getText() + "%'");
              table_user.setModel(new ResultSetTableModel(rs));
            }else if(com_recherche.getSelectedItem().equals("Password")){
              rs = db.querySelectAll("administrateur", "password LIKE '%" + txt_rechercher.getText() + "%'");
              table_user.setModel(new ResultSetTableModel(rs));
            }else if(com_recherche.getSelectedItem().equals("Type")){
              rs = db.querySelectAll("administrateur", "type LIKE '%" + txt_rechercher.getText() + "%'");
              table_user.setModel(new ResultSetTableModel(rs));
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
  

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir quitter", "Attention",
         JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION ){
            dispose();
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir retourner vers la page d'administration", "Attention",
         JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION ){
            Administration a = new Administration();
            a.setVisible(true);
            this.dispose();
        }
            
    }//GEN-LAST:event_jButton7ActionPerformed

    private void table_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_userMouseClicked
        txt_username.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 1)));
        txt_password.setText(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 2)));
        com_type.setSelectedItem(String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 3)));
        fullForm();

    }//GEN-LAST:event_table_userMouseClicked
  
  

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
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionAdministrateur().setVisible(true);
                
            }
        });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouton_actualiser;
    private javax.swing.JButton bouton_ajouter;
    private javax.swing.JButton bouton_modifier;
    private javax.swing.JButton bouton_supprimer;
    private javax.swing.JComboBox<String> com_recherche;
    private javax.swing.JComboBox<String> com_type;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_user;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_rechercher;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
