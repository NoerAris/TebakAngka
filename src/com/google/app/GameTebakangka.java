
package com.google.app;
//Import untuk log4j
import org.apache.log4j.Logger;
import id.co.indocyber.game.GuessNumber;
import java.util.Scanner;
//Import untuk logging Logger
//import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class GameTebakangka extends javax.swing.JFrame {
    GuessNumber guess=new GuessNumber();
    private String derajat="";
    Logger log=Logger.getLogger("com.google.app.GameTebakangka");
    /**
     * Creates new form GameTebakangka
     */
    private GuessNumber guessGame;
    public GameTebakangka() {
        initComponents();
        log.info("Game dimulai");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bMulai = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lInput = new javax.swing.JTextField();
        lHasil = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bCek = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game tebak Angka");

        bMulai.setText("Start Game");
        bMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMulaiActionPerformed(evt);
            }
        });

        jLabel1.setText("Input Nilai");

        lInput.setEnabled(false);
        lInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lInputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lInputKeyReleased(evt);
            }
        });

        jLabel2.setText("Keterangan");

        jLabel3.setText("Masukkan angka antara 1-100");

        bCek.setText("Cek");
        bCek.setEnabled(false);
        bCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCekActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/google/picture/images.png"))); // NOI18N

        jLabel5.setText("Created by Aris ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lHasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lInput, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addComponent(bCek, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(63, 63, 63)))
                .addComponent(bMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCek)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMulaiActionPerformed
        // TODO add your handling code here:
       GuessNumber guess=new GuessNumber();
       lInput.setEnabled(true);
       lInput.requestFocus();
       bCek.setEnabled(true);
        
        
    }//GEN-LAST:event_bMulaiActionPerformed

    private void lInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lInputKeyPressed
        // TODO add your handling code here:   
    }//GEN-LAST:event_lInputKeyPressed

    private void lInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lInputKeyReleased
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_lInputKeyReleased

    private void bCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCekActionPerformed
        // TODO add your handling code here:
       try{
        int angka=Integer.parseInt(lInput.getText());
        boolean correct=guess.isGuessTrue(angka);

        if(correct){
            lHasil.setText("Tebakan anda benar, setelah "+guess.getJumlahTebakan()+" kali");
            
        }
        if(angka>100){
            //Penggunaan Logger menggunanakan log.warning
            //log.warning("Anda memasukan angka lebih dari batas maksimal");
            //Penggunaan log4j menggunakan log.warn, hanya beda istilah
            log.warn("Anda memasukan angka lebih dari batas maksimal");
        }
        else{
            if(guess.isLebihBesar())
            lHasil.setText("Tebakan anda salah, coba angka lebih kecil");
            else
            lHasil.setText("Tebakan anda salah, coba angka lebih besar");
        }
       }catch(NumberFormatException nfe){
           JOptionPane.showMessageDialog(null,"Sistem Error, masukan angka, bukan huruf ...!!!");
             //Penggunaan Logger menggunanakan log.severe
            //log.severe("Sistem Error, masukan angka, bukan huruf ...!!!");
            //Penggunaan log4j menggunakan log.fatal, hanya beda istilah
             //log.severe("Sistem Error, masukan angka, bukan huruf ...!!!");
            log.fatal("Sistem Error, masukan angka, bukan huruf ...!!!");
       }catch (Exception e){
           JOptionPane.showMessageDialog(rootPane,"Anda belum klik tombol mulai ...!!!");
       }
    }//GEN-LAST:event_bCekActionPerformed

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
            java.util.logging.Logger.getLogger(GameTebakangka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameTebakangka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameTebakangka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameTebakangka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameTebakangka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCek;
    private javax.swing.JButton bMulai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lHasil;
    private javax.swing.JTextField lInput;
    // End of variables declaration//GEN-END:variables
}
