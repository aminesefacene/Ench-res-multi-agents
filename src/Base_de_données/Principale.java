
package Base_de_données;



import Client.InterfaceAgent;
import Client.ProposerOffre;
import jade.gui.GuiEvent;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import vente_aux_enchères.BDD;
import vente_aux_enchères.DBConfig;
import vente_aux_enchères.ResultSetTableModel;
 
public class Principale extends javax.swing.JFrame {

        ResultSet rs;
        BDD db;
        String id_voiture_selectionne;
        InterfaceAgent interfaceAgent;
        
    public Principale() {
        
        db = new BDD(new DBConfig().HOST_DB, new DBConfig().USERNAME_DB, 
            new DBConfig().PASSWORD_DB, new DBConfig().IPHOST, new DBConfig().PORT);
        
        initComponents();
        table();
        emptyForm();
        
      }
    
    public Principale(String nom){
        
        db = new BDD(new DBConfig().HOST_DB, new DBConfig().USERNAME_DB, 
            new DBConfig().PASSWORD_DB, new DBConfig().IPHOST, new DBConfig().PORT);
        
        
        initComponents();
        txt_ClientName.setText(nom);
        table();
        emptyForm();
        area_message.setEditable(false);
    }
    
    
    public void emptyForm(){
        
        this.bouton_négocier.setEnabled(false);
        
    }
    
    public void fullForm(){
        
        this.bouton_négocier.setEnabled(true);
    }

    void actualiser(){
            
            txt_recherche.setText("");
            com_recherche.setSelectedItem("Identifiant");
            emptyForm();
    }
    public void table() {
            String a[] = {"id_produit", "type_produit", "prix_depart", "description"};      
            rs = db.querySelect(a, "produit");
            table_produit.setModel(new ResultSetTableModel(rs));
            
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        com_recherche = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        txt_recherche = new javax.swing.JTextField();
        bouton_négocier = new javax.swing.JButton();
        bouton_actualiser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_produit = new javax.swing.JTable();
        bouton_actualiser1 = new javax.swing.JButton();
        label_prix_proposer = new javax.swing.JLabel();
        txt_prix_depart_proposé = new javax.swing.JTextField();
        label_prix_max_proposer = new javax.swing.JLabel();
        txt_prix_max_proposé = new javax.swing.JTextField();
        label_pourcentageAugmentation = new javax.swing.JLabel();
        txt_pourcentageAugmentation = new javax.swing.JTextField();
        txt_ClientName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area_message = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fenêtre principale");
        setPreferredSize(new java.awt.Dimension(700, 570));
        setResizable(false);
        getContentPane().setLayout(null);

        com_recherche.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        com_recherche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identifiant", "Type de produit", "Prix de départ", "Description" }));
        getContentPane().add(com_recherche);
        com_recherche.setBounds(30, 60, 130, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/magnify.png"))); // NOI18N
        jButton6.setText("Rechercher");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(360, 60, 140, 30);

        txt_recherche.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_recherche);
        txt_recherche.setBounds(200, 60, 142, 31);

        bouton_négocier.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_négocier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/yes.png"))); // NOI18N
        bouton_négocier.setText("Négocier");
        bouton_négocier.setSelected(true);
        bouton_négocier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_négocierActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_négocier);
        bouton_négocier.setBounds(120, 280, 120, 40);

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
        bouton_actualiser.setBounds(290, 280, 130, 40);

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
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        table_produit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_produitMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_produit);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 630, 100);

        bouton_actualiser1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bouton_actualiser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/power_off.png"))); // NOI18N
        bouton_actualiser1.setText("Quitter");
        bouton_actualiser1.setSelected(true);
        bouton_actualiser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_actualiser1ActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_actualiser1);
        bouton_actualiser1.setBounds(470, 280, 130, 40);

        label_prix_proposer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_prix_proposer.setText("Prix de départ");
        getContentPane().add(label_prix_proposer);
        label_prix_proposer.setBounds(20, 240, 100, 17);

        txt_prix_depart_proposé.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_prix_depart_proposé);
        txt_prix_depart_proposé.setBounds(110, 240, 100, 23);

        label_prix_max_proposer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_prix_max_proposer.setText("Prix maximum");
        getContentPane().add(label_prix_max_proposer);
        label_prix_max_proposer.setBounds(220, 240, 90, 17);

        txt_prix_max_proposé.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_prix_max_proposé);
        txt_prix_max_proposé.setBounds(310, 240, 100, 23);

        label_pourcentageAugmentation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_pourcentageAugmentation.setText("Pourcentage d'augmentation");
        getContentPane().add(label_pourcentageAugmentation);
        label_pourcentageAugmentation.setBounds(420, 240, 170, 17);

        txt_pourcentageAugmentation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_pourcentageAugmentation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pourcentageAugmentationActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pourcentageAugmentation);
        txt_pourcentageAugmentation.setBounds(590, 240, 90, 23);

        txt_ClientName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_ClientName);
        txt_ClientName.setBounds(610, 50, 110, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Client :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 60, 60, 20);

        area_message.setColumns(20);
        area_message.setRows(5);
        jScrollPane2.setViewportView(area_message);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 370, 630, 130);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Le processus d'enchère sera affiché ci-dessous");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 340, 360, 22);

        jPanel3.setBackground(new java.awt.Color(121, 121, 149));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fenêtre principale");
        jPanel3.add(jLabel1);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 830, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(txt_recherche.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez remplir le champ");
        }else {if(com_recherche.getSelectedItem().equals("Identifiant")){
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

    private void table_produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_produitMouseClicked
            
            fullForm(); 
               
    }//GEN-LAST:event_table_produitMouseClicked

    private void bouton_négocierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_négocierActionPerformed
            if(txt_prix_depart_proposé.getText().equals("") || 
                txt_prix_max_proposé.getText().equals("") || txt_pourcentageAugmentation.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Un ou plusieurs champs sont vides");
        }else{        
            String Identifiant_produit_enchère=(String.valueOf(table_produit.getValueAt(table_produit.getSelectedRow(), 0)));    
            String prix_système=(String.valueOf(table_produit.getValueAt(table_produit.getSelectedRow(), 2)));;
            String prix_depart_client = txt_prix_depart_proposé.getText();
            String prix_max_client = txt_prix_max_proposé.getText();
            String pourcentage_augmentation_client = txt_pourcentageAugmentation.getText();
            int Prix_depart=Integer.parseInt(prix_système);
            int Prix_donnee=Integer.parseInt(prix_depart_client);
            int Prix_max=Integer.parseInt(prix_max_client);
                if(Prix_donnee < Prix_depart) {
                     JOptionPane.showMessageDialog(this, "Le prix que vous avez proposé est inférieur au prix de départ");
                }else{if(Prix_max < Prix_donnee) {
                     JOptionPane.showMessageDialog(this, "Le prix maximum que vous avez proposé est inférieur au prix de départ");
                     }else{ 
                           txt_pourcentageAugmentation.setEnabled(false);
                           txt_prix_depart_proposé.setEnabled(false);
                           txt_prix_max_proposé.setEnabled(false);
                           GuiEvent gev=new GuiEvent(this, 1);
                           Map<String, Object> params=new HashMap<>();
                           params.put("Prix proposé", prix_depart_client);
                           params.put("Prix maximum à proposer", prix_max_client);
                           params.put("Pourcentage d'augmentation", pourcentage_augmentation_client);
                           gev.addParameter(params);
                           interfaceAgent.onGuiEvent(gev);
                           
                           
                     } 
               }               
            }
                    
    }//GEN-LAST:event_bouton_négocierActionPerformed

    private void bouton_actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_actualiserActionPerformed
            actualiser();
            table();
    }//GEN-LAST:event_bouton_actualiserActionPerformed

    private void bouton_actualiser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_actualiser1ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir quitter", "Attention",
             JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION ){
             this.dispose();
        }     
    }//GEN-LAST:event_bouton_actualiser1ActionPerformed

    private void txt_pourcentageAugmentationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pourcentageAugmentationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pourcentageAugmentationActionPerformed

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
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principale().setVisible(true);
            }
        });
    }
    
    
        public InterfaceAgent getInterfaceAgent() {
		return interfaceAgent;
	}

        public void setInterfaceAgent(InterfaceAgent interfaceAgent) {
                this.interfaceAgent = interfaceAgent;
        }

                public void showMessage(String msg, boolean apprend){
               if(apprend == true){
                    area_message.append(msg+"\n");
               }else{
                    area_message.setText(msg);
               } 
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_message;
    private javax.swing.JButton bouton_actualiser;
    private javax.swing.JButton bouton_actualiser1;
    private javax.swing.JButton bouton_négocier;
    private javax.swing.JComboBox<String> com_recherche;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_pourcentageAugmentation;
    private javax.swing.JLabel label_prix_max_proposer;
    private javax.swing.JLabel label_prix_proposer;
    public javax.swing.JTable table_produit;
    private javax.swing.JLabel txt_ClientName;
    public javax.swing.JTextField txt_pourcentageAugmentation;
    public javax.swing.JTextField txt_prix_depart_proposé;
    public javax.swing.JTextField txt_prix_max_proposé;
    private javax.swing.JTextField txt_recherche;
    // End of variables declaration//GEN-END:variables
}
