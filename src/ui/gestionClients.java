/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Base_de_données.Administration;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vente_aux_enchères.BDD;
import vente_aux_enchères.DBConfig;
import vente_aux_enchères.ResultSetTableModel;


public class gestionClients extends javax.swing.JFrame {

    ResultSet rs;
    BDD db;
    

    public gestionClients() {
        
        db = new BDD(new DBConfig().HOST_DB, new DBConfig().USERNAME_DB, 
            new DBConfig().PASSWORD_DB, new DBConfig().IPHOST, new DBConfig().PORT);
        
        initComponents();
        table();
        emptyForm();
    }
    
    
         public void table() {
            String a[] = {"id_client", "nom", "prenom", "dateNaissance",  "adresse", "telephone", "mail"};      
            rs = db.querySelect(a, "client");
            table_client.setModel(new ResultSetTableModel(rs));
        }
         
     void actualiser(){
            txt_nom.setText("");
            txt_prenom.setText("");
            ((JTextField)txt_dateNaissance.getDateEditor().getUiComponent()).setText("");
            txt_email.setText("");
            txt_adresse.setText("");
            txt_telephone.setText("");
            txt_recherche.setText("");
            com_recherche.setSelectedItem("Veuillez choisir");
            emptyForm();
        }     
     
     public void emptyForm(){
        
        this.bouton_supprimer.setEnabled(false);
        this.bouton_modifier.setEnabled(false);
        txt_nom.setEnabled(false);
        txt_prenom.setEnabled(false);
        txt_dateNaissance.setEnabled(false);
        txt_adresse.setEnabled(false);
        txt_telephone.setEnabled(false);
        txt_email.setEnabled(false);
    }
    


 public void fullForm(){
        
        this.bouton_supprimer.setEnabled(true);
        this.bouton_modifier.setEnabled(true);
        txt_nom.setEnabled(true);
        txt_prenom.setEnabled(true);
        txt_dateNaissance.setEnabled(true);
        txt_adresse.setEnabled(true);
        txt_telephone.setEnabled(true);
        txt_email.setEnabled(true);
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_client = new javax.swing.JTable();
        txt_adresse = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        com_recherche = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        txt_recherche = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bouton_modifier = new javax.swing.JButton();
        bouton_supprimer = new javax.swing.JButton();
        bouton_actualiser = new javax.swing.JButton();
        txt_telephone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_dateNaissance = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Espace de gestion des clients\n");
        setPreferredSize(new java.awt.Dimension(1050, 660));
        setResizable(false);
        getContentPane().setLayout(null);

        table_client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Identifiant", "Nom", "Prenom", "Date de naissance", "Adresse", "Téléphone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_clientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_client);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 1020, 150);

        txt_adresse.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_adresse);
        txt_adresse.setBounds(720, 400, 240, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setText("Mot clé");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(570, 90, 80, 22);

        com_recherche.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        com_recherche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veuillez choisir", "Identifiant", "Nom", "Prenom", "Date de naissance", "Adresse", "Téléphone", "Email" }));
        getContentPane().add(com_recherche);
        com_recherche.setBounds(350, 90, 129, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton6.setText("Rechercher");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(830, 90, 160, 30);

        txt_recherche.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_recherche);
        txt_recherche.setBounds(660, 90, 142, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setText("Recherche par catégorie");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(130, 90, 182, 22);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Espace de gestion des clients");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 20, 431, 42);

        bouton_modifier.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_modifier.setIcon(new javax.swing.ImageIcon("C:\\Netbeans\\Vente_aux_enchères\\src\\Icons\\gear_16.png")); // NOI18N
        bouton_modifier.setText("Modifier");
        bouton_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_modifierActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_modifier);
        bouton_modifier.setBounds(330, 330, 130, 40);

        bouton_supprimer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_supprimer.setIcon(new javax.swing.ImageIcon("C:\\Netbeans\\Vente_aux_enchères\\src\\Icons\\delete.png")); // NOI18N
        bouton_supprimer.setText("Supprimer");
        bouton_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_supprimerActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_supprimer);
        bouton_supprimer.setBounds(490, 330, 130, 40);

        bouton_actualiser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_actualiser.setIcon(new javax.swing.ImageIcon("C:\\Netbeans\\Vente_aux_enchères\\src\\Icons\\refresh.png")); // NOI18N
        bouton_actualiser.setText("Actualiser");
        bouton_actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_actualiserActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_actualiser);
        bouton_actualiser.setBounds(650, 330, 130, 40);

        txt_telephone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_telephone);
        txt_telephone.setBounds(720, 450, 240, 30);

        txt_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_email);
        txt_email.setBounds(720, 500, 240, 30);

        txt_prenom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_prenom);
        txt_prenom.setBounds(200, 450, 240, 30);

        txt_nom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_nom);
        txt_nom.setBounds(200, 400, 240, 30);

        txt_dateNaissance.setDateFormatString("yyyy-MM-d");
        txt_dateNaissance.setPreferredSize(new java.awt.Dimension(87, 20));
        getContentPane().add(txt_dateNaissance);
        txt_dateNaissance.setBounds(200, 500, 280, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setText("Nom");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 410, 26, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel5.setText("Date de naissance");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 510, 102, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel6.setText("Prénom");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 460, 44, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel7.setText("Adresse (*)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(560, 410, 64, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel8.setText("Téléphone (*)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(560, 460, 79, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel9.setText("Email (*)");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(560, 510, 55, 17);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon("D:\\Etude\\Informatique\\Master2\\SOUTENANCE\\images\\icons-circular\\circular icons\\power_off.png")); // NOI18N
        jButton7.setText("Quitter");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(570, 580, 110, 35);

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon("D:\\Etude\\Informatique\\Master2\\SOUTENANCE\\images\\retour1.png")); // NOI18N
        jButton8.setText("Retour");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(430, 580, 110, 35);

        jPanel1.setBackground(new java.awt.Color(121, 121, 149));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1050, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_clientMouseClicked
        fullForm();
        txt_nom.setText(String.valueOf(table_client.getValueAt(table_client.getSelectedRow(), 1)));
        txt_prenom.setText(String.valueOf(table_client.getValueAt(table_client.getSelectedRow(), 2)));
        ((JTextField)txt_dateNaissance.getDateEditor().getUiComponent()).setText(String.valueOf(table_client.getValueAt(table_client.getSelectedRow(), 3)));
        txt_adresse.setText(String.valueOf(table_client.getValueAt(table_client.getSelectedRow(), 4)));
        txt_telephone.setText(String.valueOf(table_client.getValueAt(table_client.getSelectedRow(), 5)));
        txt_email.setText(String.valueOf(table_client.getValueAt(table_client.getSelectedRow(), 6)));

    }//GEN-LAST:event_table_clientMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(txt_recherche.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez remplir le champ");
        }else {if(com_recherche.getSelectedItem().equals("Veuillez choisir")){
            JOptionPane.showMessageDialog(this, "Veuillez choisir une catégorie");
        }if(com_recherche.getSelectedItem().equals("Identifiant")){
            rs = db.querySelectAll("client", "id_client LIKE '%" + txt_recherche.getText() + "%'");
            table_client.setModel(new ResultSetTableModel(rs));
        }else if(com_recherche.getSelectedItem().equals("Nom")){
            rs = db.querySelectAll("client", "nom LIKE '%" + txt_recherche.getText() + "%'");
            table_client.setModel(new ResultSetTableModel(rs));
        }else if(com_recherche.getSelectedItem().equals("Prenom")){
            rs = db.querySelectAll("client", "prenom LIKE '%" + txt_recherche.getText() + "%'");
            table_client.setModel(new ResultSetTableModel(rs));
        }else if(com_recherche.getSelectedItem().equals("Date de naissance")){
            rs = db.querySelectAll("client", "dateNaissance LIKE '%" + txt_recherche.getText() + "%'");
            table_client.setModel(new ResultSetTableModel(rs));
        }else if(com_recherche.getSelectedItem().equals("Adresse")){
            rs = db.querySelectAll("client", "adresse LIKE '%" + txt_recherche.getText() + "%'");
            table_client.setModel(new ResultSetTableModel(rs));
        }else if(com_recherche.getSelectedItem().equals("Téléphone")){
            rs = db.querySelectAll("client", "telephone LIKE '%" + txt_recherche.getText() + "%'");
            table_client.setModel(new ResultSetTableModel(rs));
        }else if(com_recherche.getSelectedItem().equals("Email")){
            rs = db.querySelectAll("client", "mail LIKE '%" + txt_recherche.getText() + "%'");
            table_client.setModel(new ResultSetTableModel(rs));
        }
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void bouton_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_modifierActionPerformed
        if (txt_nom.getText().equals("") || txt_prenom.getText().equals("") || ((JTextField)txt_dateNaissance.getDateEditor().getUiComponent()).getText().equals("") ||
            txt_adresse.getText().equals("") || txt_telephone.equals("") || txt_email.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Un ou plusieurs champs sont vides");
        }else{
            String[] colon = {"nom", "prenom", "dateNaissance", "adresse", "telephone", "mail"};
            String[] inf = {txt_nom.getText(), txt_prenom.getText(), ((JTextField)txt_dateNaissance.getDateEditor().getUiComponent()).getText(),
                txt_adresse.getText(),txt_telephone.getText(), txt_email.getText()};
            String id = String.valueOf(table_client.getValueAt(table_client.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("client", colon, inf, "id_client='" + id + "'"));
            table();
            actualiser();
            emptyForm();
        }
    }//GEN-LAST:event_bouton_modifierActionPerformed

    private void bouton_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_supprimerActionPerformed

        String id = String.valueOf(table_client.getValueAt(table_client.getSelectedRow(),0));
        if (JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir supprimer cet utilisateur", "Attention",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION ){
        System.out.println(db.queryDelete("client", "id_client=" + id ));
        }else{
            return;
        }
        table();
        actualiser();
        emptyForm();
    }//GEN-LAST:event_bouton_supprimerActionPerformed

    private void bouton_actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_actualiserActionPerformed
        actualiser();
        table();

    }//GEN-LAST:event_bouton_actualiserActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir quitter", "Attention",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION ){
        this.dispose();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir retourner vers la page d'administration", "Attention",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION ){
        Administration a = new Administration();
        a.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(gestionClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouton_actualiser;
    private javax.swing.JButton bouton_modifier;
    private javax.swing.JButton bouton_supprimer;
    private javax.swing.JComboBox<String> com_recherche;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_client;
    private javax.swing.JTextField txt_adresse;
    private com.toedter.calendar.JDateChooser txt_dateNaissance;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_recherche;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration//GEN-END:variables
}
