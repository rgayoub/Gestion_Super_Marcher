
package applicationgestionsupermarche;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MaForme extends javax.swing.JFrame {
    ArrayList<Produit> Produits ;
    DefaultTableModel modelProduit;
    DefaultTableModel modelAchat;
    
    public MaForme() {
        initComponents();
        Produits =new ArrayList<>();
        modelProduit =(DefaultTableModel)tabProduit.getModel();
        modelAchat =(DefaultTableModel) tabAchat.getModel();
        remplirTabProduit();
                
    }
        private void remplirTabProduit() {
            try {
                File fichier = new File("fichier.txt");
                Scanner scan = new Scanner(fichier);
                boolean tabProduit = true;
                String nom ="",prix="";
                while(scan.hasNext()){
                    if(tabProduit){
                        nom=scan.next();
                        tabProduit=false;
                    }else{
                        prix = scan.next();
                        tabProduit=true;
                        Produit p = new Produit(nom, prix);
                        Produits.add(p);
                    }
                }
                for(Produit p :Produits){
                    modelProduit.addRow(new String[]{p.getNom(),p.getPrix()});
                }
                
            } catch (Exception e) {
            }
    
    
    
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabProduit = new javax.swing.JTable();
        txtRecherche = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAcheter = new javax.swing.JButton();
        btnEnlever = new javax.swing.JButton();
        btnEffcer = new javax.swing.JButton();
        btnpayer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabAchat = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMontantTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAjouter = new javax.swing.JButton();
        btnModifer = new javax.swing.JButton();
        btnChercher = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnEnregister = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Super Marhcé");

        tabProduit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produit", "Prix"
            }
        ));
        jScrollPane1.setViewportView(tabProduit);

        txtRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRechercheActionPerformed(evt);
            }
        });
        txtRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRechercheKeyReleased(evt);
            }
        });

        jLabel3.setText("Chercher Produit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtRecherche)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAcheter.setText("Acheter");
        btnAcheter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcheterActionPerformed(evt);
            }
        });

        btnEnlever.setText("Enlever");
        btnEnlever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnleverActionPerformed(evt);
            }
        });

        btnEffcer.setText("Effacer");
        btnEffcer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffcerActionPerformed(evt);
            }
        });

        btnpayer.setText("Payer");
        btnpayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAcheter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnlever, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEffcer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAcheter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnlever)
                .addGap(18, 18, 18)
                .addComponent(btnEffcer)
                .addGap(18, 18, 18)
                .addComponent(btnpayer)
                .addGap(19, 19, 19))
        );

        tabAchat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produit", "Prix"
            }
        ));
        jScrollPane2.setViewportView(tabAchat);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Montant total :");

        txtMontantTotal.setBackground(new java.awt.Color(255, 255, 0));
        txtMontantTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMontantTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMontantTotal.setText("0");
        txtMontantTotal.setToolTipText("");
        txtMontantTotal.setName("txtMontantTotal"); // NOI18N
        txtMontantTotal.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtMontantTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMontantTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnModifer.setText("Modifier");
        btnModifer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiferActionPerformed(evt);
            }
        });

        btnChercher.setText("Chercher");
        btnChercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChercherActionPerformed(evt);
            }
        });

        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnEnregister.setText("Enregister");
        btnEnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAjouter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModifer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChercher)
                .addGap(18, 18, 18)
                .addComponent(btnSupprimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnregister)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter)
                    .addComponent(btnModifer)
                    .addComponent(btnChercher)
                    .addComponent(btnSupprimer)
                    .addComponent(btnEnregister))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        String nom,prix;
       nom = JOptionPane.showInputDialog(this,"Entrer le nom de produit","Ajout de produit",JOptionPane.INFORMATION_MESSAGE);
       prix = JOptionPane.showInputDialog(this,"Entrer le prix","Ajout de prix",JOptionPane.INFORMATION_MESSAGE);
      if(!(nom==null || nom.equals("")||prix.equals(""))){
           Produit produit = new Produit(nom,prix);
       Produits.add(produit);
       modelProduit.addRow(new String[]{nom,prix});
      }
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
      int indice = tabProduit.getSelectedRow();
      if(indice!=-1){
          Produits.remove(indice);
          modelProduit.removeRow(indice);
      }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnModiferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiferActionPerformed
                     int indice = tabProduit.getSelectedRow();
      if(indice!=-1){
         String nom,prix;
       nom = JOptionPane.showInputDialog(this, "Entrer le nom du produit à modifier", modelProduit.getValueAt(indice,0));
       prix = JOptionPane.showInputDialog(this, "Entrer le prix du produit à modifier", modelProduit.getValueAt(indice,1));
       Produits.get(indice).setNom(nom);
        Produits.get(indice).setNom(prix);
        modelProduit.setValueAt(nom, indice, 0);
         modelProduit.setValueAt(prix, indice, 1);
        
    }      
    }//GEN-LAST:event_btnModiferActionPerformed

    private void btnEnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregisterActionPerformed
        File fichier = new File("fichier.txt"); 
        FileWriter fw=null;
        try {
            fw = new FileWriter(fichier);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
          PrintWriter pw =new PrintWriter(fw);
              for(Produit p :Produits){
                  pw.println(p);
           
        }
        pw.close();
  
      
        
    }//GEN-LAST:event_btnEnregisterActionPerformed

    private void txtRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRechercheActionPerformed
    
    }//GEN-LAST:event_txtRechercheActionPerformed

    private void btnChercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChercherActionPerformed
       
        String nom =JOptionPane.showInputDialog(this,"Entrer le nom du produit à rehercher",JOptionPane.INFORMATION_MESSAGE);
            for(int i=0;i<Produits.size();i++){
                if(nom.equalsIgnoreCase(Produits.get(i).getNom()))
                        {
                         tabProduit.setRowSelectionInterval(i, i);
                         break;
                        }
            }
    }//GEN-LAST:event_btnChercherActionPerformed

    private void btnAcheterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcheterActionPerformed
        float somme = Float.parseFloat(txtMontantTotal.getText());
        int indice = tabProduit.getSelectedRow();
        if(indice != -1){
            int nombre = Integer.valueOf(JOptionPane.showInputDialog(this, "Entrer la quantité du produit", "1"));
            float prixTotal = nombre * Float.valueOf(Produits.get(indice).getPrix());
            modelAchat.addRow(new String[]{Produits.get(indice).getNom(),String.valueOf(prixTotal)});
            somme+=prixTotal;
            txtMontantTotal.setText(String.valueOf(somme));
        }
        
    }//GEN-LAST:event_btnAcheterActionPerformed

    private void btnEnleverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnleverActionPerformed
     int indice = tabAchat.getSelectedRow();
     if(indice != -1){
         float prix = Float.valueOf(modelAchat.getValueAt(indice, 1).toString());
         float PT = Float.valueOf(txtMontantTotal.getText()) - prix;
         txtMontantTotal.setText(String.valueOf(PT));
         modelAchat.removeRow(indice);
     }
    }//GEN-LAST:event_btnEnleverActionPerformed

    private void btnEffcerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffcerActionPerformed
       txtMontantTotal.setText("0");
       modelAchat.setRowCount(0);
    }//GEN-LAST:event_btnEffcerActionPerformed

    private void btnpayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpayerActionPerformed
      
    }//GEN-LAST:event_btnpayerActionPerformed

    private void txtRechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRechercheKeyReleased
         String nom = txtRecherche.getText();
        for (int i=0;i<Produits.size();i++){
            if(nom.equalsIgnoreCase(Produits.get(i).getNom())){
                tabProduit.setRowSelectionInterval(i, i);
                break;
            }
        }
    }//GEN-LAST:event_txtRechercheKeyReleased

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
            java.util.logging.Logger.getLogger(MaForme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaForme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaForme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaForme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaForme().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcheter;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnChercher;
    private javax.swing.JButton btnEffcer;
    private javax.swing.JButton btnEnlever;
    private javax.swing.JButton btnEnregister;
    private javax.swing.JButton btnModifer;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnpayer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tabAchat;
    private javax.swing.JTable tabProduit;
    private javax.swing.JLabel txtMontantTotal;
    private javax.swing.JTextField txtRecherche;
    // End of variables declaration//GEN-END:variables

}
