
package Client;

import Client.InterfaceAgent;
import jade.gui.GuiEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;



public final class ProposerOffre extends  javax.swing.JFrame {
 
       private InterfaceAgent interfaceAgent;
       
    public ProposerOffre() {
        
        initComponents();
        emptyform();
        text_identifiant.setEditable(false);
        text_prixdedépart.setEditable(false);
        text_typedeproduit.setEditable(false);
    }

    
    public void emptyform(){
        lbl_prix_offert.setVisible(false);
        lbl_prix_max.setVisible(false);
        lbl_pourcentageAugmentation.setVisible(false);
        lbl_stratégie.setVisible(false);
        label_ecris_propose.setVisible(false);
        label_ecris_maximum.setVisible(false);
        label_ecris_stratégie.setVisible(false);
        label_pourcentageAugmentationFerme.setVisible(false);
        //area_message.setVisible(false);
    }
    
    public void fullForm(){
        lbl_prix_offert.setVisible(true);
        lbl_pourcentageAugmentation.setVisible(true);
        lbl_prix_max.setVisible(true);
        lbl_stratégie.setVisible(true);
        label_ecris_propose.setVisible(true);
        label_ecris_maximum.setVisible(true);
        label_ecris_stratégie.setVisible(true);
        label_pourcentageAugmentationFerme.setVisible(true);
//        area_message.setVisible(true);
//        area_message.setEditable(false);
        txt_prix_depart_proposé.setVisible(false);
        txt_prix_max_proposé.setVisible(false);
        txt_pourcentageAugmentation.setVisible(false);
        txt_nomAgent.setVisible(false);
        com_stratégie.setVisible(false);
        label_nomAgent.setVisible(false);
        label_prix_proposer.setVisible(false);
        label_prix_max_proposer.setVisible(false);
        label_Stragétie_proposer.setVisible(false);
        label_pourcentageAugmentation.setVisible(false);
        button_lancer_negociation.setVisible(false);
        button_annuler.setVisible(false);
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_prix_proposer = new javax.swing.JLabel();
        label_Stragétie_proposer = new javax.swing.JLabel();
        com_stratégie = new javax.swing.JComboBox<>();
        button_annuler = new javax.swing.JButton();
        button_lancer_negociation = new javax.swing.JButton();
        txt_prix_depart_proposé = new javax.swing.JTextField();
        label_prix_max_proposer = new javax.swing.JLabel();
        txt_prix_max_proposé = new javax.swing.JTextField();
        label_ecris_stratégie = new javax.swing.JLabel();
        label_ecris_propose = new javax.swing.JLabel();
        label_ecris_maximum = new javax.swing.JLabel();
        lbl_pourcentageAugmentation = new javax.swing.JLabel();
        lbl_prix_max = new javax.swing.JLabel();
        lbl_stratégie = new javax.swing.JLabel();
        label_pourcentageAugmentation = new javax.swing.JLabel();
        txt_pourcentageAugmentation = new javax.swing.JTextField();
        label_pourcentageAugmentationFerme = new javax.swing.JLabel();
        lbl_prix_offert = new javax.swing.JLabel();
        label_nomAgent = new javax.swing.JLabel();
        txt_nomAgent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        label_typedeproduit = new javax.swing.JLabel();
        label_prixdedépart = new javax.swing.JLabel();
        label_identifiant = new javax.swing.JLabel();
        text_identifiant = new javax.swing.JTextField();
        text_typedeproduit = new javax.swing.JTextField();
        text_prixdedépart = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proposer vôtre offre\n\n");
        setResizable(false);
        getContentPane().setLayout(null);

        label_prix_proposer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_prix_proposer.setText("Prix de départ à proposer");
        getContentPane().add(label_prix_proposer);
        label_prix_proposer.setBounds(430, 230, 160, 17);

        label_Stragétie_proposer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_Stragétie_proposer.setText("Stratégie");
        getContentPane().add(label_Stragétie_proposer);
        label_Stragétie_proposer.setBounds(30, 310, 70, 17);

        com_stratégie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        com_stratégie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veuillez choisir", "Enchère périodique" }));
        getContentPane().add(com_stratégie);
        com_stratégie.setBounds(240, 310, 160, 23);

        button_annuler.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        button_annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/no.png"))); // NOI18N
        button_annuler.setText("Annuler");
        button_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_annulerActionPerformed(evt);
            }
        });
        getContentPane().add(button_annuler);
        button_annuler.setBounds(460, 360, 110, 30);

        button_lancer_negociation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        button_lancer_negociation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/yes.png"))); // NOI18N
        button_lancer_negociation.setText("Lancer négocitation");
        button_lancer_negociation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_lancer_negociationActionPerformed(evt);
            }
        });
        getContentPane().add(button_lancer_negociation);
        button_lancer_negociation.setBounds(250, 360, 180, 30);

        txt_prix_depart_proposé.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_prix_depart_proposé);
        txt_prix_depart_proposé.setBounds(640, 230, 160, 23);

        label_prix_max_proposer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_prix_max_proposer.setText("Prix maximum à proposer");
        getContentPane().add(label_prix_max_proposer);
        label_prix_max_proposer.setBounds(30, 270, 160, 17);

        txt_prix_max_proposé.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_prix_max_proposé);
        txt_prix_max_proposé.setBounds(240, 270, 160, 23);

        label_ecris_stratégie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_ecris_stratégie.setText("Stratégie :");
        getContentPane().add(label_ecris_stratégie);
        label_ecris_stratégie.setBounds(430, 190, 70, 20);

        label_ecris_propose.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_ecris_propose.setText("Prix proposé : ");
        getContentPane().add(label_ecris_propose);
        label_ecris_propose.setBounds(30, 150, 90, 17);

        label_ecris_maximum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_ecris_maximum.setText("Prix maximum :");
        getContentPane().add(label_ecris_maximum);
        label_ecris_maximum.setBounds(430, 150, 100, 20);

        lbl_pourcentageAugmentation.setBackground(new java.awt.Color(0, 0, 0));
        lbl_pourcentageAugmentation.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbl_pourcentageAugmentation.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbl_pourcentageAugmentation);
        lbl_pourcentageAugmentation.setBounds(240, 180, 130, 20);

        lbl_prix_max.setBackground(new java.awt.Color(0, 0, 0));
        lbl_prix_max.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbl_prix_max.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbl_prix_max);
        lbl_prix_max.setBounds(530, 150, 130, 20);

        lbl_stratégie.setBackground(new java.awt.Color(0, 0, 0));
        lbl_stratégie.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbl_stratégie.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbl_stratégie);
        lbl_stratégie.setBounds(530, 190, 140, 20);

        label_pourcentageAugmentation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_pourcentageAugmentation.setText("Pourcentage d'augmentation");
        getContentPane().add(label_pourcentageAugmentation);
        label_pourcentageAugmentation.setBounds(430, 270, 160, 17);

        txt_pourcentageAugmentation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_pourcentageAugmentation);
        txt_pourcentageAugmentation.setBounds(640, 270, 160, 23);

        label_pourcentageAugmentationFerme.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_pourcentageAugmentationFerme.setText("Pourcentage d'augmentation (%) :");
        getContentPane().add(label_pourcentageAugmentationFerme);
        label_pourcentageAugmentationFerme.setBounds(30, 180, 200, 17);

        lbl_prix_offert.setBackground(new java.awt.Color(0, 0, 0));
        lbl_prix_offert.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbl_prix_offert.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbl_prix_offert);
        lbl_prix_offert.setBounds(240, 150, 130, 20);

        label_nomAgent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_nomAgent.setText("Nom de l'agent");
        getContentPane().add(label_nomAgent);
        label_nomAgent.setBounds(30, 230, 160, 17);

        txt_nomAgent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_nomAgent);
        txt_nomAgent.setBounds(240, 230, 160, 23);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proposez votre prix");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 10, 320, 42);

        label_typedeproduit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_typedeproduit.setText("Type de produit");
        getContentPane().add(label_typedeproduit);
        label_typedeproduit.setBounds(290, 80, 90, 30);

        label_prixdedépart.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_prixdedépart.setText("Prix de départ");
        getContentPane().add(label_prixdedépart);
        label_prixdedépart.setBounds(570, 77, 80, 30);

        label_identifiant.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_identifiant.setText("Identifiant");
        getContentPane().add(label_identifiant);
        label_identifiant.setBounds(40, 77, 60, 30);

        text_identifiant.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(text_identifiant);
        text_identifiant.setBounds(130, 80, 120, 30);

        text_typedeproduit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(text_typedeproduit);
        text_typedeproduit.setBounds(410, 80, 120, 30);

        text_prixdedépart.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(text_prixdedépart);
        text_prixdedépart.setBounds(670, 80, 120, 30);

        jPanel1.setBackground(new java.awt.Color(105, 124, 240));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 840, 70);

        jPanel2.setBackground(new java.awt.Color(121, 121, 149));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 820, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_annulerActionPerformed
         this.dispose();
    }//GEN-LAST:event_button_annulerActionPerformed

    private void button_lancer_negociationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_lancer_negociationActionPerformed
        
        if(txt_nomAgent.getText().equals("") || txt_prix_depart_proposé.getText().equals("") || com_stratégie.getSelectedItem().equals("Veuillez choisir") || 
                txt_prix_max_proposé.getText().equals("") || txt_pourcentageAugmentation.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Un ou plusieurs champs sont vides");
        }else{        
            String prix_système=text_prixdedépart.getText();
            String nomAgent = txt_nomAgent.getText();
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
            /*             lbl_prix_offert.setText(prix_depart_client);
                           lbl_prix_max.setText(prix_max_client);
                           lbl_stratégie.setText((String) com_stratégie.getSelectedItem());
                           lbl_pourcentageAugmentation.setText(pourcentage_augmentation_client+" %");
                           fullForm(); 
                           ClientContainer cl=new ClientContainer();
                           GuiEvent gev=new GuiEvent(this, 1);
                           Map<String, Object> params=new HashMap<>();
                           params.put("Le nom de l'agent", nomAgent);
                           params.put("Prix proposé", prix_depart_client);
                           params.put("Prix maximum à proposer", prix_max_client);
                           params.put("Pourcentage d'augmentation", pourcentage_augmentation_client);
                           gev.addParameter(params);
                           interfaceAgent.onGuiEvent(gev);
            */               
                           
                     } 
               }               
            }
     
    }//GEN-LAST:event_button_lancer_negociationActionPerformed
 /*
        public InterfaceAgent getInterfaceAgent() {
		return interfaceAgent;
	}

        public void setInterfaceAgent(InterfaceAgent interfaceAgent) {
                this.interfaceAgent = interfaceAgent;
        }
 */       
        public void showMessage(String msg, boolean apprend){
               if(apprend == true){
//                    area_message.append(msg+"\n");
               }else{
//                    area_message.setText(msg);
               } 
        }
    
    
    
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
            java.util.logging.Logger.getLogger(ProposerOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProposerOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProposerOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProposerOffre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProposerOffre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_annuler;
    private javax.swing.JButton button_lancer_negociation;
    public javax.swing.JComboBox<String> com_stratégie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_Stragétie_proposer;
    private javax.swing.JLabel label_ecris_maximum;
    private javax.swing.JLabel label_ecris_propose;
    private javax.swing.JLabel label_ecris_stratégie;
    private javax.swing.JLabel label_identifiant;
    private javax.swing.JLabel label_nomAgent;
    private javax.swing.JLabel label_pourcentageAugmentation;
    private javax.swing.JLabel label_pourcentageAugmentationFerme;
    private javax.swing.JLabel label_prix_max_proposer;
    private javax.swing.JLabel label_prix_proposer;
    private javax.swing.JLabel label_prixdedépart;
    private javax.swing.JLabel label_typedeproduit;
    private javax.swing.JLabel lbl_pourcentageAugmentation;
    private javax.swing.JLabel lbl_prix_max;
    private javax.swing.JLabel lbl_prix_offert;
    private javax.swing.JLabel lbl_stratégie;
    public javax.swing.JTextField text_identifiant;
    public javax.swing.JTextField text_prixdedépart;
    public javax.swing.JTextField text_typedeproduit;
    public javax.swing.JTextField txt_nomAgent;
    public javax.swing.JTextField txt_pourcentageAugmentation;
    public javax.swing.JTextField txt_prix_depart_proposé;
    public javax.swing.JTextField txt_prix_max_proposé;
    // End of variables declaration//GEN-END:variables

    
}
