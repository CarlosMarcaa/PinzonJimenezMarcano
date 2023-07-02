/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DataManagement.CsvManager;
import DataStructures.Functions;
import DataStructures.HashTableClass;
import DataStructures.Nodo;
import static Interface.Menu.historic;
import static Interface.Menu.reservations;
import static Interface.Menu.reservationsHistory;
import static Interface.Menu.status;
import static Interface.SearchReservation.id;
import Objects.Guest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicoll Pinzon
 */
public class CheckIn extends javax.swing.JFrame {

    public static Menu menu;

    /**
     * Creates new form ChechIn
     */
    public CheckIn(Menu menu) {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id57 = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Check-In");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CI del cliente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        id57.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        id57.setForeground(new java.awt.Color(0, 0, 0));
        id57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id57ActionPerformed(evt);
            }
        });
        getContentPane().add(id57, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 270, -1));

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ok2.2.png"))); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 100, 70));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/atras2.2.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 90, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fondo4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id57ActionPerformed
    }//GEN-LAST:event_id57ActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        String id3 = id57.getText();
        try {
            
            Guest guest = reservations.searchId(reservations.getRoot(), Integer.parseInt(id3));
           
            if (guest != null) {
                LocalDate today = LocalDate.now(); //fecha de hoy
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //ejemplo de como se hace el formato de fecha

//                Verifica que la fecha de la reserva coincide con la del día de hoy 
                if (LocalDate.parse(guest.getArrival(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).equals(today)) {
                    
//                    Agrega al usuario a status
                    HashTableClass table = (HashTableClass) status;

                    boolean[] occuped = status.getOccupiedRooms();
                    int j = 1;
                    for (; j <= 300; j++) {
                        if (occuped[j] == false) {

                            if (j <= 100 && j >= 1 && "simple".equals(guest.getRoomType().toLowerCase())) {
                                guest.setRoom(j);
                                break;
                            }
                            if (j <= 224 && j >= 101 && "doble".equals(guest.getRoomType().toLowerCase())) {
                                guest.setRoom(j);
                                break;
                            }
                            if (j <= 265 && j >= 225 && "triple".equals(guest.getRoomType().toLowerCase())) {
                                guest.setRoom(j);
                                break;
                            }
                            if (j <= 300 && j >= 266 && "suite".equals(guest.getRoomType().toLowerCase())) {
                                guest.setRoom(j);
                                break;
                            }
                        }

                    }
                    if (j == 300) {
                        JOptionPane.showMessageDialog(null, "El hotel esta lleno");

                    } else {
                        Object confirm = JOptionPane.showConfirmDialog(null, "Seguro que le quieres hacer checkIn a la persona con la cedula" + "\n" + guest.getId() + "?");

                        if (confirm.equals(0)) {

                            status.put(guest, guest.getRoom());

                            reservations.delete(guest.getId(), null, reservations.getRoot());
                            menu.setVisible(true);
                            this.setVisible(false);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "La persona con esta cedula no tiene reservacion para el dia de hoy." + "\n" + today.format(dateFormat));
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con esa cedula en reservaciones.");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Pofavor ponga un dato numerico.");
        }
    }//GEN-LAST:event_okActionPerformed


    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Object confirm = JOptionPane.showConfirmDialog(null, "Seguro que no quieres seguir con el check-in?");

        if (confirm.equals(0)) {

            menu.setVisible(true);
            this.setVisible(false);

        }
    }//GEN-LAST:event_backActionPerformed

    /**
     * AAAAam args the command line arguments
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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn(menu).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField id57;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
