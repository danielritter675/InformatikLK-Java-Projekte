/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package daniel.noel.informatiklk;

/**
 *
 * @author danie
 */
public class AB06_SechsAusNeunundvierzig extends javax.swing.JFrame {

    /**
     * Creates new form AB06_SechsAusNeunvierzig
     */
    public AB06_SechsAusNeunundvierzig() {
        initComponents();
        this.setLocationRelativeTo(null);  //Fenster in der Mitte des Bildschirms öffnen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        generateButton = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setBackground(new java.awt.Color(0, 255, 0));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Lottozahlen-Generator");

        infoLabel.setText("Die generierten Zahlen lauten:");

        outputLabel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        outputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outputLabel.setText("...");

        generateButton.setText("Zahlen generieren");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel.setForeground(new java.awt.Color(150, 150, 150));
        jLabel.setText("AB06_Reihungen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(infoLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 137, Short.MAX_VALUE)
                .addComponent(generateButton)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(infoLabel)
                .addGap(18, 18, 18)
                .addComponent(outputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Meine Variablen
    
    int[] lottoNumbers = new int[6];
    
    boolean numberInArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return true;
            }
        }
        return false;
    }
    
    
    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
        int randomNumber = (int) (Math.random() * 49 + 1);
        
        for (int i = 0; i < this.lottoNumbers.length; i++) {
            randomNumber = (int) (Math.random()* 49 + 1);
            while (numberInArray(randomNumber, lottoNumbers)) {
                randomNumber = (int) (Math.random() * 49 + 1);
            }
            this.lottoNumbers[i] = randomNumber;
        }
        
        for (int i = 1; i < lottoNumbers.length; i++) {
        int key = lottoNumbers[i];
        int j = i - 1;

        // Verschieben der Elemente von lottoNumbers[0..i-1], die größer als key sind, um eine Position nach rechts
        while (j >= 0 && lottoNumbers[j] > key) {
            lottoNumbers[j + 1] = lottoNumbers[j];
            j = j - 1;
        }
        lottoNumbers[j + 1] = key;
    }
        
        String resultText = "";
        for (int i = 0; i < this.lottoNumbers.length; i++) {
            resultText = resultText + this.lottoNumbers[i] + "  ";
        }
        
        this.outputLabel.setText(resultText);
        
    }//GEN-LAST:event_generateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AB06_SechsAusNeunundvierzig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AB06_SechsAusNeunundvierzig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AB06_SechsAusNeunundvierzig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AB06_SechsAusNeunundvierzig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AB06_SechsAusNeunundvierzig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
