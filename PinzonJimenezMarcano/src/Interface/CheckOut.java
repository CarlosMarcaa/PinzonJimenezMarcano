/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DataStructures.Functions;
import DataStructures.HashTableClass;
import DataStructures.Nodo;
import static Interface.CheckIn.menu;
import static Interface.Menu.historic;
import static Interface.Menu.roomH;
import static Interface.Menu.reservations;
import static Interface.Menu.reservationsHistory;
import static Interface.Menu.status;
import Objects.Guest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicoll Pinzon
 */
public class CheckOut extends javax.swing.JFrame {
    public static Menu menu;
    /**
     * Creates new form CheckOut
     */
    public CheckOut(Menu menu) {
        initComponents();
        this.menu = menu;
        menu.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
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
        jLabel10 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id57 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Check Out");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/atras2.2.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 90, 50));

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ok2.2.png"))); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 100, 70));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CI:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 40, 40));

        id57.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        id57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id57ActionPerformed(evt);
            }
        });
        getContentPane().add(id57, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 230, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Object confirm = JOptionPane.showConfirmDialog(null, "Seguro que no quieres seguir con el check-out?");

        if (confirm.equals(0)) {

            menu.setVisible(true);
            this.setVisible(false);

        }
        
        
    }//GEN-LAST:event_backActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        
        String id3 = id57.getText();
        try {
           String room ="";
          
            Guest guest = reservationsHistory.searchId(reservationsHistory.getRoot(), Integer.parseInt(id3));
            
           if (guest!=null){
            room = status.getGuestRoom(guest.getFirstName(), guest.getLastName());}
          
            if ((guest != null) && (!room.equals(""))) {
                LocalDate today = LocalDate.now(); //fecha de hoy
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //ejemplo de como se hace el formato de fecha

//                Verifica que la fecha de la reserva coincide con la del día de hoy 
                if (LocalDate.parse(guest.getCheckout(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).equals(today)) {
                   

                        Object confirm2 = JOptionPane.showConfirmDialog(null, "Seguro que le quieres hacer check-out a la persona con la cedula" + "\n" + guest.getId() + "?");

                        if (confirm2.equals(0)) {
                            Guest guestToEliminate = status.getGuest(guest.getFirstName(), guest.getLastName());
                            historic.insert(guestToEliminate, historic.getRoot());
                            status.deleteGuest(guestToEliminate);
                            roomH.searchRoom(roomH.getRoot(), guestToEliminate.getRoom()).guestHistory.insertFinal(guestToEliminate);

                            
                            menu.setVisible(true);
                            this.setVisible(false);
                        }
                    

                } else {
                    JOptionPane.showMessageDialog(null, "La persona con esta cedula no tiene su dia de check-out para el dia de hoy." + "\n" + today.format(dateFormat));
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con esa cedula el hotel");
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Pofavor ponga un dato numerico.");
        }
    }//GEN-LAST:event_okActionPerformed

    private void id57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id57ActionPerformed

    public boolean space(String information2) {
        boolean flag = true;
        if (information2 == "") {
            flag = false;
        }
        return flag;
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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut(menu).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField id57;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
