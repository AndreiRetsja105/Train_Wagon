/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trainswagon;

import javax.swing.JOptionPane;

/**
 *
 * @author arets
 */
public class GUI extends javax.swing.JFrame {
    private MyStack<String> trainStack;
    
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
          // Total Wagons Label
        trainStack = new MyStack<>();
        
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
        firstWagonBTN = new javax.swing.JButton();
        removeWagonBTN = new javax.swing.JButton();
        numberOFWagonBTN = new javax.swing.JButton();
        removeAllWagonBTN = new javax.swing.JButton();
        addWagonBTN = new javax.swing.JButton();
        listProductsBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        wagonProductTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstWagonBTN.setText("First Wagon");
        firstWagonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstWagonBTNActionPerformed(evt);
            }
        });

        removeWagonBTN.setText("Remove Wagon");
        removeWagonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeWagonBTNActionPerformed(evt);
            }
        });

        numberOFWagonBTN.setText("Number of Wagon");
        numberOFWagonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOFWagonBTNActionPerformed(evt);
            }
        });

        removeAllWagonBTN.setText("Remove ALL Wagon");
        removeAllWagonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllWagonBTNActionPerformed(evt);
            }
        });

        addWagonBTN.setText("ADD Wagon");
        addWagonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWagonBTNActionPerformed(evt);
            }
        });

        listProductsBTN.setText("List Products");
        listProductsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProductsBTNActionPerformed(evt);
            }
        });

        exitBTN.setText("EXIT");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Wagon Product");

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Train Products");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exitBTN)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addWagonBTN)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(removeWagonBTN)
                                .addGap(68, 68, 68)
                                .addComponent(numberOFWagonBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(wagonProductTF, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(listProductsBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(firstWagonBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68)
                        .addComponent(removeAllWagonBTN)))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wagonProductTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addWagonBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOFWagonBTN)
                    .addComponent(removeWagonBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeAllWagonBTN)
                    .addComponent(firstWagonBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listProductsBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBTN)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addWagonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWagonBTNActionPerformed
        // TODO add your handling code here:
       // Add Wagon Button Action
        String productType = wagonProductTF.getText();
        trainStack.push(productType);
        updateTotalWagonsLabel();
         displayWagons();
    }//GEN-LAST:event_addWagonBTNActionPerformed

    private void firstWagonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstWagonBTNActionPerformed
        // TODO add your handling code here:
         // First Wagon Button Action
        if (!trainStack.isEmpty()) {
            String firstWagon = trainStack.pop();
            displayWagons();
        } else {
            // Display an error message or handle appropriately
        }
    
    }//GEN-LAST:event_firstWagonBTNActionPerformed

    private void removeWagonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeWagonBTNActionPerformed
        // TODO add your handling code here:
      // Remove Wagon Button Action
        if (!trainStack.isEmpty()) {
            trainStack.pop();
            updateTotalWagonsLabel();
            displayWagons();
        } else {
            // Display an error message or handle appropriately
        }

    }//GEN-LAST:event_removeWagonBTNActionPerformed

    private void listProductsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listProductsBTNActionPerformed
        // TODO add your handling code here:
         // List Products Button Action
    String productInfo = trainStack.displayStack();
    displayTA.setText(productInfo);

    }//GEN-LAST:event_listProductsBTNActionPerformed

    private void removeAllWagonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllWagonBTNActionPerformed
        // TODO add your handling code here:
        // Remove All Wagons Button Action
      trainStack.emptyStack();
      updateTotalWagonsLabel();
      displayWagons();
    }//GEN-LAST:event_removeAllWagonBTNActionPerformed

    private void numberOFWagonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOFWagonBTNActionPerformed
        // TODO add your handling code here:
         // Display total number of wagons button action
    int totalWagons = trainStack.size();
    JOptionPane.showMessageDialog(this, "Total Wagons: " + totalWagons);
    }//GEN-LAST:event_numberOFWagonBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
  
    System.exit(0);

    }//GEN-LAST:event_exitBTNActionPerformed

    
    private void updateTotalWagonsLabel() {
        int totalWagons = trainStack.size();
        displayTA.append("Total Wagons: " + totalWagons + "\n");
    }
    
    private void displayWagons() {
    String wagonInfo = trainStack.displayStack();
    displayTA.setText(wagonInfo);
    }
     
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addWagonBTN;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton firstWagonBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listProductsBTN;
    private javax.swing.JButton numberOFWagonBTN;
    private javax.swing.JButton removeAllWagonBTN;
    private javax.swing.JButton removeWagonBTN;
    private javax.swing.JTextField wagonProductTF;
    // End of variables declaration//GEN-END:variables
}
