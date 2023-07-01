/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DataStructures.Functions;
import DataStructures.HashTableClass;
import DataStructures.Nodo;
import static Interface.Menu.historic;
import static Interface.Menu.reservations;
import static Interface.Menu.reservationsHistory;
import static Interface.Menu.status;
import Objects.Guest;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        day1 = new javax.swing.JTextField();
        month1 = new javax.swing.JTextField();
        year1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AAAA = new javax.swing.JLabel();
        id57 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de hoy:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Check-In");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CI del cliente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        day1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(day1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 70, -1));

        month1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(month1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 60, -1));

        year1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 70, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        AAAA.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        AAAA.setForeground(new java.awt.Color(255, 255, 255));
        AAAA.setText("AAAA");
        getContentPane().add(AAAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        id57.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        id57.setForeground(new java.awt.Color(255, 255, 255));
        id57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id57ActionPerformed(evt);
            }
        });
        getContentPane().add(id57, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 270, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("/");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 20, 20));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("/");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 20, 30));

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ok2.2.png"))); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 174, 100, 70));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/atras2.2.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fondo4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id57ActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        try {
            boolean dateExist = false;
            boolean findspace = true;
            boolean findSpace1 = true;
            boolean flag = false;
            boolean flag2 = true;
            Functions verifyDateExits = new Functions();
            String information1 = id57.getText() + "/" + day1.getText() + "/" + month1.getText() + "/" + year1.getText();
            String[] information2 = information1.split("/");
            for (int i = 0; i > information2.length; i++) {
                findSpace1 = space(information2[0]);
                if (findSpace1 == false) {
                    findspace = false;
                }
            }
            int idGuest = Integer.parseInt(id57.getText());
            Object guestArrival = reservations.searchIdCheck(reservations.getRoot(), idGuest);

            if (guestArrival != null) {
                String[] dateGuest = guestArrival.getArrival().split("/");

                char day6 = day1.getText().charAt(0);

                char day5 = dateGuest[0].charAt(0);
                int day3 = 0;
                int day4 = 0;

                if ((Integer.parseInt(Integer.toString(day6)) == 0) || (Integer.parseInt(Integer.toString(day5)) == 0)) {
                    if (Integer.parseInt(Integer.toString(day5)) == 0) {

                        day3 = Integer.parseInt(dateGuest[0].substring(1));
                        if (Integer.parseInt(Integer.toString(day6)) == 0) {
                            day4 = Integer.parseInt(day1.getText().substring(1));
                        } else {
                            day4 = Integer.parseInt(day1.getText());
                        }
                    } else if (Integer.parseInt(Integer.toString(day6)) == 0) {
                        day4 = Integer.parseInt(day1.getText().substring(1));
                        if (Integer.parseInt(Integer.toString(day5)) == 0) {
                            day3 = Integer.parseInt(dateGuest[0].substring(1));

                        } else {
                            day3 = Integer.parseInt(dateGuest[0]);
                        }
                    }
                } else {
                    day4 = Integer.parseInt(day1.getText());
                    day3 = Integer.parseInt(dateGuest[0]);
                }

                char month6 = month1.getText().charAt(0);

                char month5 = dateGuest[1].charAt(0);
                int month3 = 0;
                int month4 = 0;

                if ((Integer.parseInt(Integer.toString(month6)) == 0) || (Integer.parseInt(Integer.toString(month5)) == 0)) {
                    if (Integer.parseInt(Integer.toString(month5)) == 0) {

                        month3 = Integer.parseInt(dateGuest[1].substring(1));
                        if (Integer.parseInt(Integer.toString(month6)) == 0) {
                            month4 = Integer.parseInt(month1.getText().substring(1));
                        } else {
                            month4 = Integer.parseInt(month1.getText());
                        }
                    } else if (Integer.parseInt(Integer.toString(month6)) == 0) {
                        month4 = Integer.parseInt(month1.getText().substring(1));
                        if (Integer.parseInt(Integer.toString(month5)) == 0) {
                            month3 = Integer.parseInt(dateGuest[1].substring(1));

                        } else {
                            month3 = Integer.parseInt(dateGuest[1]);
                        }
                    }
                } else {
                    month4 = Integer.parseInt(month1.getText());
                    month3 = Integer.parseInt(dateGuest[1]);
                }

                int year4 = Integer.parseInt(year1.getText());
                int year3 = Integer.parseInt(dateGuest[2]);
                if ((year3 <= 9999 && year3 >= 2000) || (year4 <= 9999 && year4 >= 2000)) {
                    dateExist = verifyDateExits.equalsDate(day3, day4, month3, month4, year3, year4);
                }

                String dateArrival1 = "";
                String dateCheckout1 = "";
            }

            if (dateExist == true && findspace == true) {
                HashTableClass table = (HashTableClass) status;
                for (int i = 0; i < table.getTableSize(); i++) {
                    if (table.getTable()[i] != null) {
                        Nodo pointer = table.getTable()[i].getHead();

                        while (pointer != null) {
                            Guest guestToAppend = (Guest) pointer.getElement();
                            String[] dateGuest = guestToAppend.getArrival().split("/");

                            char day6 = day1.getText().charAt(0);

                            char day5 = dateGuest[0].charAt(0);
                            int day3 = 0;
                            int day4 = 0;

                            if ((Integer.parseInt(Integer.toString(day6)) == 0) || (Integer.parseInt(Integer.toString(day5)) == 0)) {
                                if (Integer.parseInt(Integer.toString(day5)) == 0) {

                                    day3 = Integer.parseInt(dateGuest[0].substring(1));
                                    if (Integer.parseInt(Integer.toString(day6)) == 0) {
                                        day4 = Integer.parseInt(day1.getText().substring(1));
                                    } else {
                                        day4 = Integer.parseInt(day1.getText());
                                    }
                                } else if (Integer.parseInt(Integer.toString(day6)) == 0) {
                                    day4 = Integer.parseInt(day1.getText().substring(1));
                                    if (Integer.parseInt(Integer.toString(day5)) == 0) {
                                        day3 = Integer.parseInt(dateGuest[0].substring(1));

                                    } else {
                                        day3 = Integer.parseInt(dateGuest[0]);
                                    }
                                }
                            } else {
                                day4 = Integer.parseInt(day1.getText());
                                day3 = Integer.parseInt(dateGuest[0]);
                            }

                            char month6 = month1.getText().charAt(0);

                            char month5 = dateGuest[1].charAt(0);
                            int month3 = 0;
                            int month4 = 0;

                            if ((Integer.parseInt(Integer.toString(month6)) == 0) || (Integer.parseInt(Integer.toString(month5)) == 0)) {
                                if (Integer.parseInt(Integer.toString(month5)) == 0) {

                                    month3 = Integer.parseInt(dateGuest[1].substring(1));
                                    if (Integer.parseInt(Integer.toString(month6)) == 0) {
                                        month4 = Integer.parseInt(month1.getText().substring(1));
                                    } else {
                                        month4 = Integer.parseInt(month1.getText());
                                    }
                                } else if (Integer.parseInt(Integer.toString(month6)) == 0) {
                                    month4 = Integer.parseInt(month1.getText().substring(1));
                                    if (Integer.parseInt(Integer.toString(month5)) == 0) {
                                        month3 = Integer.parseInt(dateGuest[1].substring(1));

                                    } else {
                                        month3 = Integer.parseInt(dateGuest[1]);
                                    }
                                }
                            } else {
                                month4 = Integer.parseInt(month1.getText());
                                month3 = Integer.parseInt(dateGuest[1]);
                            }

                            int year4 = Integer.parseInt(year1.getText());
                            int year3 = Integer.parseInt(dateGuest[2]);
                            if ((year3 <= 9999 && year3 >= 2000) || (year4 <= 9999 && year4 >= 2000)) {
                                flag = verifyDateExits.GoodDate(day3, day4, month3, month4, year3, year4);
                            }
                            if (flag == true) {
                                Object guestNew = reservationsHistory.searchEmailCheck(reservationsHistory.getRoot(), guestToAppend.getEmail());
                                if (guestNew != null) {
                                    String[] dateGuest1 = guestToAppend.getCheckout().split("/");

                                    day5 = dateGuest1[0].charAt(0);
                                    day3 = 0;
                                    day4 = 0;

                                    if ((Integer.parseInt(Integer.toString(day6)) == 0) || (Integer.parseInt(Integer.toString(day5)) == 0)) {
                                        if (Integer.parseInt(Integer.toString(day5)) == 0) {

                                            day3 = Integer.parseInt(dateGuest1[0].substring(1));
                                            if (Integer.parseInt(Integer.toString(day6)) == 0) {
                                                day4 = Integer.parseInt(day1.getText().substring(1));
                                            } else {
                                                day4 = Integer.parseInt(day1.getText());
                                            }
                                        } else if (Integer.parseInt(Integer.toString(day6)) == 0) {
                                            day4 = Integer.parseInt(day1.getText().substring(1));
                                            if (Integer.parseInt(Integer.toString(day5)) == 0) {
                                                day3 = Integer.parseInt(dateGuest1[0].substring(1));

                                            } else {
                                                day3 = Integer.parseInt(dateGuest1[0]);
                                            }
                                        }
                                    } else {
                                        day4 = Integer.parseInt(day1.getText());
                                        day3 = Integer.parseInt(dateGuest1[0]);
                                    }

                                    month6 = month1.getText().charAt(0);

                                    month5 = dateGuest1[1].charAt(0);
                                    month3 = 0;
                                    month4 = 0;

                                    if ((Integer.parseInt(Integer.toString(month6)) == 0) || (Integer.parseInt(Integer.toString(month5)) == 0)) {
                                        if (Integer.parseInt(Integer.toString(month5)) == 0) {

                                            month3 = Integer.parseInt(dateGuest1[1].substring(1));
                                            if (Integer.parseInt(Integer.toString(month6)) == 0) {
                                                month4 = Integer.parseInt(month1.getText().substring(1));
                                            } else {
                                                month4 = Integer.parseInt(month1.getText());
                                            }
                                        } else if (Integer.parseInt(Integer.toString(month6)) == 0) {
                                            month4 = Integer.parseInt(month1.getText().substring(1));
                                            if (Integer.parseInt(Integer.toString(month5)) == 0) {
                                                month3 = Integer.parseInt(dateGuest1[1].substring(1));

                                            } else {
                                                month3 = Integer.parseInt(dateGuest1[1]);
                                            }
                                        }
                                    } else {
                                        month4 = Integer.parseInt(month1.getText());
                                        month3 = Integer.parseInt(dateGuest1[1]);
                                    }

                                    year4 = Integer.parseInt(year1.getText());
                                    year3 = Integer.parseInt(dateGuest1[2]);
                                    flag2 = verifyDateExits.GoodDate(day3, day4, month3, month4, year3, year4);
                                    if (flag2 == false) {
                                        if (historic.searchIfisInHistoric(historic.getRoot(), guestToAppend.getId()) == false) {
                                            getHistoryTree().searchRoom(getHistoryTree().getRoot(), guestToAppend.getRoom()).getGuestHistory().insertFinal(guestToAppend);

                                            historic.insert(guestToAppend, historic.getRoot());
                                        }
                                        status.deleteGuest(guestToAppend);
                                    }

                                } else {
                                    status.deleteGuest(guestToAppend);
                                }
                            } else {
                                Object guestNew = reservationsHistory.searchEmailCheck(reservationsHistory.getRoot(), guestToAppend.getEmail());
                                if (guestNew == null) {
                                    status.deleteGuest(guestToAppend);
                                } else {
                                    if (historic.searchIfisInHistoric(historic.getRoot(), guestToAppend.getId()) == false) {
                                        getHistoryTree().searchRoom(getHistoryTree().getRoot(), guestToAppend.getRoom()).getGuestHistory().insertFinal(guestToAppend);

                                        historic.insert(guestToAppend, historic.getRoot());
                                    }
                                    status.deleteGuest(guestToAppend);
                                }
                            }

                        }
                    }
                }

                CheckIn2 checkIn2 = new CheckIn2(this);

            } else if (findspace == false) {
                JOptionPane.showMessageDialog(null, "Error, dejo un argumento sin rellenar ");
            } else if (dateExist == false) {
                JOptionPane.showMessageDialog(null, "Error, Usuario no encontrado o la fecha de hoy no es su fecha de llegada.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, coloco un dato mal");
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
    private javax.swing.JLabel AAAA;
    private javax.swing.JButton back;
    private javax.swing.JTextField day1;
    private javax.swing.JTextField id57;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField month1;
    private javax.swing.JButton ok;
    private javax.swing.JTextField year1;
    // End of variables declaration//GEN-END:variables
}
