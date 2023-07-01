/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Interface.Menu.reservations;
import static Interface.SearchReservation.id;
import Objects.Guest;
import javax.swing.JOptionPane;


/**
 *
 * @author Nicoll Pinzon
 */
public class SearchReservation2 extends javax.swing.JFrame {
    public static SearchReservation reservation2;
    /**
     * Creates new form SearchReservation2
     */
    public SearchReservation2(SearchReservation reservation2) {
        initComponents();
       
        
        this.reservation2 = reservation2;
        reservation2.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        
        
        
        
    }
    
    public void information(int id1){
        Guest guest_find1 = reservations.searchId(reservations.getRoot(), id1);
        
       
        
        name.setText(guest_find1.getFirstName());
        lastName.setText(guest_find1.getLastName());
       CI.setText(Integer.toString(guest_find1.getId()));
       email.setText(guest_find1.getEmail());
       cellphone.setText(guest_find1.getPhone());
        gender.setText(guest_find1.getGender());
        roomType.setText(guest_find1.getRoomType());
        dateArrival.setText(guest_find1.getArrival());
        dateExit.setText(guest_find1.getCheckout());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        CI = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        roomType = new javax.swing.JLabel();
        dateArrival = new javax.swing.JLabel();
        dateExit = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CI:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Celular:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Genero:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de habitacion:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha de llegada:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        lastName.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lastName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 110, 30));

        CI.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        CI.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CI, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 140, 30));

        name.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 110, 30));

        cellphone.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        cellphone.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 190, 30));

        email.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 270, 30));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha de salida:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        gender.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 180, 20));

        roomType.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        roomType.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(roomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 200, 30));

        dateArrival.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        dateArrival.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dateArrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 180, 30));

        dateExit.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        dateExit.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dateExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 190, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/astronauta.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ok2.2.png"))); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 100, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fondo2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        Menu menu = new Menu(this);
    }//GEN-LAST:event_okActionPerformed

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
            java.util.logging.Logger.getLogger(SearchReservation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchReservation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchReservation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchReservation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchReservation2(reservation2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CI;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel dateArrival;
    private javax.swing.JLabel dateExit;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel name;
    private javax.swing.JButton ok;
    private javax.swing.JLabel roomType;
    // End of variables declaration//GEN-END:variables
}
