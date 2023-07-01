/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DataStructures.Functions;
import static Interface.Menu.reservations;
import static Interface.Menu.reservationsHistory;
import Objects.Guest;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/**
 *
 * @author Nicoll Pinzon
 */
public class NewClient extends javax.swing.JFrame {

    /**
     * Creates new form NewClient
     */
    public static Menu menu;

    public NewClient(Menu menu) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        lastName2 = new javax.swing.JTextField();
        id2 = new javax.swing.JTextField();
        gender2 = new javax.swing.JTextField();
        email2 = new javax.swing.JTextField();
        cell = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        month1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        day2 = new javax.swing.JTextField();
        month2 = new javax.swing.JTextField();
        day1 = new javax.swing.JTextField();
        year1 = new javax.swing.JTextField();
        year2 = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        back = new javax.swing.JButton();
        typeRoom2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genero:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CI:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Celular:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de habitacion:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha de llegada:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha de salida:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        name.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 160, -1));

        lastName2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(lastName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 160, -1));

        id2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        id2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id2ActionPerformed(evt);
            }
        });
        getContentPane().add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 160, -1));

        gender2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(gender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 160, -1));

        email2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 330, -1));

        cell.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(cell, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 50, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(")");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 10, -1));

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("(");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 20, -1));

        phone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 140, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("# # #");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("# # # # # # #");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/astronauta.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cohete.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, -1, -1));

        jLabel19.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("\\");
            getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 20, 20));

            jLabel21.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
            jLabel21.setForeground(new java.awt.Color(255, 255, 255));
            jLabel21.setText("\\");
                getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 20, 20));

                month1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                getContentPane().add(month1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 40, -1));

                jLabel23.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                jLabel23.setForeground(new java.awt.Color(255, 255, 255));
                jLabel23.setText("DD");
                getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

                jLabel24.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                jLabel24.setForeground(new java.awt.Color(255, 255, 255));
                jLabel24.setText("MM");
                getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

                jLabel20.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
                jLabel20.setForeground(new java.awt.Color(255, 255, 255));
                jLabel20.setText("\\");
                    getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 20, 20));

                    jLabel25.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
                    jLabel25.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel25.setText("\\");
                        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 20, 20));

                        jLabel26.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
                        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel26.setText("AAAA");
                        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

                        day2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                        getContentPane().add(day2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 40, -1));

                        month2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                        getContentPane().add(month2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 40, -1));

                        day1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                        getContentPane().add(day1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 40, -1));

                        year1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                        getContentPane().add(year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 60, -1));

                        year2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                        getContentPane().add(year2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 60, -1));

                        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ok2.2.png"))); // NOI18N
                        ok.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                okActionPerformed(evt);
                            }
                        });
                        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 100, 70));

                        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/atras2.2.png"))); // NOI18N
                        back.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backActionPerformed(evt);
                            }
                        });
                        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 90, 50));

                        typeRoom2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
                        typeRoom2.setForeground(new java.awt.Color(255, 255, 255));
                        typeRoom2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Doble", "Triple", "Suite" }));
                        getContentPane().add(typeRoom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fondo.png"))); // NOI18N
                        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

                        pack();
                    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        try {
            boolean dateExist = false;
            boolean findspace = true;
            boolean findSpace1 = true;
            boolean emailGood = false;
            boolean typeRoomExist = false;
            boolean cellphone = false;
            
            Functions verifyDateExits = new Functions();
            
            String information1 = name.getText() + "/" + lastName2.getText() + "/" + id2.getText() + "/" + gender2.getText() + "/" + email2.getText() + "/" + cell.getText() + "/" + phone.getText() + "/" + typeRoom2.getText() + "/" + day1.getText() + "/" + month1.getText() + "/" + year1.getText() + "/" + day2.getText() + "/" + month2.getText() + "/" + year2.getText();
            String[] information2 = information1.split("/");
            for (int i = 0; i > information2.length; i++) {
                findSpace1 = space(information2[0]);
                if (findSpace1 == false) {
                    findspace = false;
                }
            }

            int id3 = Integer.parseInt(id2.getText());
            int phone1 = Integer.parseInt(phone.getText());
            int cell1 = Integer.parseInt(cell.getText());

            if ((email2.getText().contains("@")) && (email2.getText().contains(".com"))) {
                emailGood = true;
            }

            char day5 = day1.getText().charAt(0);

            char day6 = day2.getText().charAt(0);
            int day3 = 0;
            int day4 = 0;

            if ((Integer.parseInt(Integer.toString(day6)) == 0) || (Integer.parseInt(Integer.toString(day5)) == 0)) {
                if (Integer.parseInt(Integer.toString(day6)) == 0) {

                    day4 = Integer.parseInt(day2.getText().substring(1));
                    if (Integer.parseInt(Integer.toString(day5)) == 0) {
                        day3 = Integer.parseInt(day1.getText().substring(1));
                    } else {
                        day3 = Integer.parseInt(day1.getText());
                    }
                } else if (Integer.parseInt(Integer.toString(day5)) == 0) {
                    day3 = Integer.parseInt(day1.getText().substring(1));
                    if (Integer.parseInt(Integer.toString(day6)) == 0) {
                        day4 = Integer.parseInt(day2.getText().substring(1));

                    } else {
                        day4 = Integer.parseInt(day2.getText());
                    }
                }
            } else {
                day3 = Integer.parseInt(day1.getText());
                day4 = Integer.parseInt(day2.getText());
            }

            char month5 = month1.getText().charAt(0);

            char month6 = month2.getText().charAt(0);
            int month3 = 0;
            int month4 = 0;

            if ((Integer.parseInt(Integer.toString(month6)) == 0) || (Integer.parseInt(Integer.toString(month5)) == 0)) {
                if (Integer.parseInt(Integer.toString(month6)) == 0) {

                    month4 = Integer.parseInt(month2.getText().substring(1));
                    if (Integer.parseInt(Integer.toString(month5)) == 0) {
                        month3 = Integer.parseInt(month1.getText().substring(1));
                    } else {
                        month3 = Integer.parseInt(month1.getText());
                    }
                } else if (Integer.parseInt(Integer.toString(month5)) == 0) {
                    month3 = Integer.parseInt(month1.getText().substring(1));
                    if (Integer.parseInt(Integer.toString(month6)) == 0) {
                        month4 = Integer.parseInt(month2.getText().substring(1));

                    } else {
                        month4 = Integer.parseInt(month2.getText());
                    }
                }
            } else {
                month3 = Integer.parseInt(month1.getText());
                month4 = Integer.parseInt(month2.getText());
            }

            int year3 = Integer.parseInt(year1.getText());
            int year4 = Integer.parseInt(year2.getText());
            System.out.println(day3 +"\n" + day4+"\n" +month3+"\n" + month4+"\n" + year3+"\n" + year4);
            System.out.println("PRueba");
            
            if ((year3 <= 9999 && year3 >= 2000) && (year4 <= 9999 && year4 >= 2000)){
            dateExist = verifyDateExits.GoodDate(day3, day4, month3, month4, year3,year4);}
            
            String dateArrival1 = "";
            String dateCheckout1 ="";
            if (dateExist==true){
                dateArrival1 = day1.getText()+"/"+month1.getText()+"/"+year1.getText();
                dateCheckout1 = day2.getText()+"/"+month2.getText()+"/"+year2.getText();
            }
            System.out.println("HOLAAAAAAA");
            System.out.println(dateArrival1);
            System.out.println(dateCheckout1);

            if (cell1 >= 100 && cell1 <= 999) {
                if (phone1 >= 1000000 && phone1 <= 9999999) {
                    cellphone = true;
                }
            }

            String cellphone4 = "";
            
            if (cellphone==true){
                cellphone4 = "("+cell.getText()+")"+phone.getText();
            }
            
            if (typeRoom2.getSelectedItem().toString().toUpperCase().equals("SIMPLE")){
                typeRoomExist = true;
            }else if(typeRoom2.getSelectedItem().toString().toUpperCase().equals("DOBLE")){
                typeRoomExist = true;
            }else if(typeRoom2.getSelectedItem().toString().toUpperCase().equals("SUITE")){
                typeRoomExist = true;
            }else if(typeRoom2.getSelectedItem().toString().toUpperCase().equals("TRIPLE")){
                typeRoomExist = true;
            }
            
            System.out.println(findspace);
            System.out.println("HHHHHH");
            System.out.println(dateExist);
            System.out.println("NNNNNNN");
            System.out.println(emailGood);
            System.out.println("PPPPPP");
            System.out.println(typeRoomExist);
            System.out.println("BBBBB ");
            System.out.println(cellphone);
            
            if ((findspace == true) && (dateExist == true) && (emailGood == true) && (typeRoomExist == true) && (cellphone == true)) {

                Object confirm = JOptionPane.showConfirmDialog(null, "Seguro que pusiste todos los datos bien?");

                Guest guest = new Guest(name.getText(), lastName2.getText());
                guest.setId(id3);
                guest.setEmail(email2.getText());
                guest.setArrival(dateArrival1);
                guest.setCheckout(dateCheckout1);
                guest.setGender(gender2.getText());
                guest.setPhone(cellphone4);
                guest.setRoomType(typeRoom2.getSelectedItem().toString().toLowerCase());
                reservations.insert(guest, reservations.getRoot());
                reservationsHistory.insert(guest, reservationsHistory.getRoot());
                
        if (confirm.equals(0)) {
            menu.setVisible(true);
            this.setVisible(false);
        }
            } else {
                JOptionPane.showMessageDialog(null, "Error, revise que puso todos los datos correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, revise que puso todos los datos correctamente");
            System.out.println("ERRROOOOORRR");
            System.out.println(e);
        }
    }//GEN-LAST:event_okActionPerformed

    public boolean space(String information2) {
        boolean flag = true;
        if (information2 == "") {
            flag = false;
        }
        return flag;
    }


    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Object confirm = JOptionPane.showConfirmDialog(null, "Seguro que no quieres continuar con la reserva?");

        if (confirm.equals(0)) {
            menu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_backActionPerformed

    private void id2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewClient(menu).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField cell;
    private javax.swing.JTextField day1;
    private javax.swing.JTextField day2;
    private javax.swing.JTextField email2;
    private javax.swing.JTextField gender2;
    private javax.swing.JTextField id2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName2;
    private javax.swing.JTextField month1;
    private javax.swing.JTextField month2;
    private javax.swing.JTextField name;
    private javax.swing.JButton ok;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> typeRoom2;
    private javax.swing.JTextField year1;
    private javax.swing.JTextField year2;
    // End of variables declaration//GEN-END:variables
}
