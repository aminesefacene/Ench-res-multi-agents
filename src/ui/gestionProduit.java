/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Base_de_données.Administration;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import vente_aux_enchères.BDD;
import vente_aux_enchères.DBConfig;
import vente_aux_enchères.ResultSetTableModel;



public class gestionProduit extends javax.swing.JFrame {

        ResultSet rs;
        BDD db;
        
    
    public gestionProduit() {
        
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
            String a[] = {"id_produit", "type_produit", "prix_depart", "description"};      
            rs = db.querySelect(a, "produit");
            table_produit.setModel(new ResultSetTableModel(rs));
    }
    void actualiser(){
            txt_TypeProduit.setText("");
            txt_prixdepart.setText("");
            txt_description.setText("");
            txt_recherche.setText("");
            com_recherche.setSelectedItem("Identifiant");
            emptyForm();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_produit = new javax.swing.JTable();
        bouton_modifier = new javax.swing.JButton();
        bouton_supprimer = new javax.swing.JButton();
        bouton_ajouter = new javax.swing.JButton();
        bouton_actualiser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_TypeProduit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_description = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        com_recherche = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        txt_recherche = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_prixdepart = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Espace de gestion des clients\n");
        setPreferredSize(new java.awt.Dimension(880, 680));
        setResizable(false);
        getContentPane().setLayout(null);

        table_produit.setModel(new javax.swing.table.DefaultTableModel(
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
                "        Identifiant", "         Type de produit", "      Prix de départ", "         Description"
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
        table_produit.getTableHeader().setReorderingAllowed(false);
        table_produit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_produitMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_produit);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 860, 160);

        bouton_modifier.setBackground(new java.awt.Color(255, 255, 255));
        bouton_modifier.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gear_16.png"))); // NOI18N
        bouton_modifier.setText("Modifier");
        bouton_modifier.setSelected(true);
        bouton_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_modifierActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_modifier);
        bouton_modifier.setBounds(300, 250, 120, 40);

        bouton_supprimer.setBackground(new java.awt.Color(255, 255, 255));
        bouton_supprimer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        bouton_supprimer.setText("Supprimer");
        bouton_supprimer.setSelected(true);
        bouton_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_supprimerActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_supprimer);
        bouton_supprimer.setBounds(440, 250, 127, 40);

        bouton_ajouter.setBackground(new java.awt.Color(255, 255, 255));
        bouton_ajouter.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        bouton_ajouter.setText("Ajouter");
        bouton_ajouter.setSelected(true);
        bouton_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_ajouterActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_ajouter);
        bouton_ajouter.setBounds(160, 250, 120, 40);

        bouton_actualiser.setBackground(new java.awt.Color(255, 255, 255));
        bouton_actualiser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_actualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.png"))); // NOI18N
        bouton_actualiser.setText("Actualiser");
        bouton_actualiser.setSelected(true);
        bouton_actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_actualiserActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_actualiser);
        bouton_actualiser.setBounds(590, 250, 140, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Type de produit");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 340, 100, 17);

        txt_TypeProduit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_TypeProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TypeProduitActionPerformed(evt);
            }
        });
        getContentPane().add(txt_TypeProduit);
        txt_TypeProduit.setBounds(200, 330, 230, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Description");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 460, 65, 17);

        txt_description.setColumns(20);
        txt_description.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_description.setRows(5);
        jScrollPane2.setViewportView(txt_description);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(200, 440, 230, 110);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setText("Recherche par catégorie");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(470, 340, 182, 22);

        com_recherche.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        com_recherche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veuillez choisir", "Identifiant", "Type de produit", "Prix de départ", "Description" }));
        getContentPane().add(com_recherche);
        com_recherche.setBounds(700, 340, 140, 23);

        jButton6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/magnify.png"))); // NOI18N
        jButton6.setText("Rechercher");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(490, 400, 150, 31);

        txt_recherche.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_recherche);
        txt_recherche.setBounds(700, 400, 142, 31);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/power_off.png"))); // NOI18N
        jButton7.setText("Quitter");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(450, 570, 110, 35);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/retour1.png"))); // NOI18N
        jButton8.setText("Retour");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(310, 570, 110, 35);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Prix de départ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 390, 79, 17);

        txt_prixdepart.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_prixdepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prixdepartActionPerformed(evt);
            }
        });
        getContentPane().add(txt_prixdepart);
        txt_prixdepart.setBounds(200, 380, 230, 30);

        jPanel1.setBackground(new java.awt.Color(121, 121, 149));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Espace de gestion des produits");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouton_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_modifierActionPerformed
        if (txt_TypeProduit.getText().equals("") || txt_prixdepart.getText().equals("") ||   
                txt_description.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Un ou plusieurs champs sont vides");
        }else{
            String[] colon = {"type_produit","prix_depart","description"};
            String[] inf = {txt_TypeProduit.getText(),txt_prixdepart.getText(),txt_description.getText()};
            String id = String.valueOf(table_produit.getValueAt(table_produit.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("produit", colon, inf, "id_produit='" + id + "'"));
            }
        table();
        actualiser();
        
    }//GEN-LAST:event_bouton_modifierActionPerformed

    private void bouton_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_supprimerActionPerformed
        String id = String.valueOf(table_produit.getValueAt(table_produit.getSelectedRow(),0));
        if (JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir supprimer ce produit", "Attention",
         JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION ){
            db.queryDelete("produit", "id_produit=" + id );
        }else{
            return;
        } 
        table();
        actualiser();
    }//GEN-LAST:event_bouton_supprimerActionPerformed

    private void bouton_actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_actualiserActionPerformed
        actualiser();
        table();
    }//GEN-LAST:event_bouton_actualiserActionPerformed

    private void bouton_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_ajouterActionPerformed
        if(txt_TypeProduit.getText().equals("") || txt_prixdepart.getText().equals("") || txt_description.getText().equals("")) {
           JOptionPane.showMessageDialog(this, "Un ou plusieurs champs sont vides");
       } else {
           String[] colon = {"type_produit", "prix_depart", "description"};
           String[] inf ={txt_TypeProduit.getText(),txt_prixdepart.getText(),txt_description.getText()};
           System.out.println(db.queryInsert("produit", colon, inf));
           table();
           actualiser();
       }
    }//GEN-LAST:event_bouton_ajouterActionPerformed

    
    private void txt_TypeProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TypeProduitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TypeProduitActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(txt_recherche.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez remplir le champ");
        }else {if(com_recherche.getSelectedItem().equals("Veuillez choisir")){
                JOptionPane.showMessageDialog(this, "Veuillez choisir une catégorie");
            }if(com_recherche.getSelectedItem().equals("Identifiant")){
              rs = db.querySelectAll("produit", "id_produit LIKE '%" + txt_recherche.getText() + "%'");
              table_produit.setModel(new ResultSetTableModel(rs));
            }else if(com_recherche.getSelectedItem().equals("Type de produit")){
              rs = db.querySelectAll("produit", "type_produit LIKE '%" + txt_recherche.getText() + "%'");
              table_produit.setModel(new ResultSetTableModel(rs));
            }else if(com_recherche.getSelectedItem().equals("Prix de départ")){
              rs = db.querySelectAll("produit", "prix_depart LIKE '%" + txt_recherche.getText() + "%'");
              table_produit.setModel(new ResultSetTableModel(rs));
            }else if(com_recherche.getSelectedItem().equals("Description")){
              rs = db.querySelectAll("produit", "description LIKE '%" + txt_recherche.getText() + "%'");
              table_produit.setModel(new ResultSetTableModel(rs));  
           }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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

    private void table_produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_produitMouseClicked
            txt_TypeProduit.setText(String.valueOf(table_produit.getValueAt(table_produit.getSelectedRow(), 1)));
            txt_prixdepart.setText(String.valueOf(table_produit.getValueAt(table_produit.getSelectedRow(), 2)));
            txt_description.setText(String.valueOf(table_produit.getValueAt(table_produit.getSelectedRow(), 3)));
            fullForm();
            
            
            
    }//GEN-LAST:event_table_produitMouseClicked

    private void txt_prixdepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prixdepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prixdepartActionPerformed

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
            java.util.logging.Logger.getLogger(gestionProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouton_actualiser;
    private javax.swing.JButton bouton_ajouter;
    private javax.swing.JButton bouton_modifier;
    private javax.swing.JButton bouton_supprimer;
    private javax.swing.JComboBox<String> com_recherche;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_produit;
    private javax.swing.JTextField txt_TypeProduit;
    private javax.swing.JTextArea txt_description;
    private javax.swing.JTextField txt_prixdepart;
    private javax.swing.JTextField txt_recherche;
    // End of variables declaration//GEN-END:variables
}
