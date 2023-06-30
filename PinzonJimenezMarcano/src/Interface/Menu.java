/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DataManagement.CsvManager;
import DataStructures.ABBClass;
import DataStructures.HashTableClass;
import DataStructures.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicoll Pinzon
 */
public class Menu extends javax.swing.JFrame {
    public static CsvManager cvsManager = new CsvManager();
    
    public static boolean save = false;
    public static ABBClass historic = (ABBClass) cvsManager.ReadText("test/Booking_hotel_historic.csv");
    public static List rooms = (List) cvsManager.ReadText("test/Booking_hotel_rooms.csv");
    public static HashTableClass status = (HashTableClass) cvsManager.ReadText("test/Booking_hotel_status.csv");
    public static ABBClass reservations = (ABBClass) cvsManager.ReadText("test/Booking_hotel_reservations.csv");
    public static ABBClass reservationsHistory = (ABBClass) cvsManager.ReadText("test/Booking_hotel_reservations_1.csv");
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
         
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
        roomHistory = new javax.swing.JButton();
        checkOut = new javax.swing.JButton();
        newClient = new javax.swing.JButton();
        checkIn = new javax.swing.JButton();
        costumerRecord = new javax.swing.JButton();
        searchReservation = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        saveData = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        roomHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Historial.png"))); // NOI18N
        roomHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomHistoryActionPerformed(evt);
            }
        });
        getContentPane().add(roomHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 270, 110));

        checkOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/check-out.png"))); // NOI18N
        checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutActionPerformed(evt);
            }
        });
        getContentPane().add(checkOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 280, 110));

        newClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Agregar2.2.png"))); // NOI18N
        newClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClientActionPerformed(evt);
            }
        });
        getContentPane().add(newClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 280, 110));

        checkIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/check-in.png"))); // NOI18N
        checkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInActionPerformed(evt);
            }
        });
        getContentPane().add(checkIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 280, 110));

        costumerRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/registro.png"))); // NOI18N
        costumerRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costumerRecordActionPerformed(evt);
            }
        });
        getContentPane().add(costumerRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 110));

        searchReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Busqueda.png"))); // NOI18N
        searchReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchReservationActionPerformed(evt);
            }
        });
        getContentPane().add(searchReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 270, 120));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit2.3.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 30, 20));

        saveData.setBackground(new java.awt.Color(0, 0, 0));
        saveData.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        saveData.setForeground(new java.awt.Color(255, 255, 255));
        saveData.setText("Guardar datos");
        saveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataActionPerformed(evt);
            }
        });
        getContentPane().add(saveData, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/menu3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchReservationActionPerformed
        SearchReservation searchReservation = new SearchReservation(this);
        
    }//GEN-LAST:event_searchReservationActionPerformed

    private void newClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClientActionPerformed
        NewClient newClient = new NewClient(this);
    }//GEN-LAST:event_newClientActionPerformed

    private void costumerRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costumerRecordActionPerformed
//        CostumerRecord costumerRecord = new CostumerRecord(this);
        
    }//GEN-LAST:event_costumerRecordActionPerformed

    private void roomHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomHistoryActionPerformed
//        RoomHistory roomHistory = new RoomHistory(this);
    }//GEN-LAST:event_roomHistoryActionPerformed

    private void checkInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInActionPerformed
//        CheckIn checkIn = new CheckIn(this);
    }//GEN-LAST:event_checkInActionPerformed

    private void checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutActionPerformed
//        CheckOut checkOut = new CheckOut(this);
    }//GEN-LAST:event_checkOutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        if (true == save){
            System.exit(0);
        }else{
            Object verdad = JOptionPane.showConfirmDialog(null,"Seguro que no quieres guardar los cambios?");
        if (verdad.equals(0)){
              System.exit(0);
              
          }
        
        }
    }//GEN-LAST:event_exitActionPerformed

    private void saveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataActionPerformed
        save = true;
        cvsManager.WriteText("test/Booking_hotel_reservations.csv", reservations);
        cvsManager.WriteText("test/Booking_hotel_status.csv", status);
        cvsManager.WriteText("test/Booking_hotel_reservations_1.csv", reservationsHistory);
        cvsManager.WriteText("test/Booking_hotel_historic.csv", historic);
    }//GEN-LAST:event_saveDataActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkIn;
    private javax.swing.JButton checkOut;
    private javax.swing.JButton costumerRecord;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newClient;
    private javax.swing.JButton roomHistory;
    private javax.swing.JButton saveData;
    private javax.swing.JButton searchReservation;
    // End of variables declaration//GEN-END:variables
}
