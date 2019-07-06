/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement;

import LibraryManagement.DBConnection;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emran
 */
public class ReturnBook extends javax.swing.JFrame {

    DefaultTableModel model;

    /**
     * Creates new form cout
     */
    public ReturnBook() {
        initComponents();
        loadCombo();
        showTime();
        getContentPane().setBackground(Color.BLACK);

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        jdate.setText(sdf.format(d));

        model = new DefaultTableModel();
        jTable.setModel(model);
        model.addColumn("Id");
        model.addColumn("Book No");
        model.addColumn("Book Name");
        model.addColumn("Student Id");
        model.addColumn("Student Name");
        model.addColumn("Student Contact");
        model.addColumn("Return Date");

    }
   
    public void loadCombo() {

        Connection con = null;
        Statement stm = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "123");
            stm = con.createStatement();

            List blist = new ArrayList();
            ResultSet rs = stm.executeQuery("select bookno from issuebooks ");
            while (rs.next()) {
                blist.add(rs.getString("bookno"));
                
            }
            cbmItem.setModel(new javax.swing.DefaultComboBoxModel(blist.toArray()));
            cbmItem.insertItemAt("Select One", 0);
            cbmItem.setSelectedIndex(0);

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    void showTime() {

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                jTime.setText(sdf.format(d));
            }
        }).start();

    }
    //==============================================================================

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTime = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        cbmItem = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnreturn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 4));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Issued book return");

        jdate.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jdate.setForeground(new java.awt.Color(255, 255, 255));
        jdate.setText("                            ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Time :");

        jTime.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jTime.setForeground(new java.awt.Color(255, 255, 255));
        jTime.setText("                    ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Book No :");

        jButton3.setBackground(new java.awt.Color(205, 205, 240));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jButton3.setForeground(new java.awt.Color(205, 0, 240));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1)
                        .addContainerGap(324, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cbmItem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(jdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(44, 44, 44)
                        .addComponent(jTime)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 116, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jdate)
                    .addComponent(jLabel5)
                    .addComponent(jTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbmItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel2.setForeground(new java.awt.Color(0, 0, 204));

        jTable.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(102, 0, 102));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Book No", "Book Name", "Student Id", "Student Name", "Student Cotact", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Display");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnreturn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnreturn.setText("Return");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnreturn)
                .addGap(79, 79, 79)
                .addComponent(jButton2)
                .addGap(69, 69, 69)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnreturn)
                    .addComponent(jButton4))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    public void findInTable() {
        String bookno = cbmItem.getSelectedItem().toString();
        if (jTable.getRowCount() > 0) {
            for (int i = jTable.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "123");
            //Create the Statement object
            stmt = con.createStatement();

            //Execute the query
            // rs = stmt.executeQuery("select * from hotelm where c_o_d='"+jCheckOut.getDate().toString()+"'");
            rs = stmt.executeQuery("select * from issuebooks where bookno='" + bookno + "'");
            int count = 0;
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("id"), rs.getString("bookno"), rs.getString("bookname"), rs.getString("studentid"), rs.getString("studentname"), rs.getString("studentcontact"), rs.getString("returndate")});

                count++;
            }
            if (count == 0) {
                JOptionPane.showMessageDialog(rootPane, "There is no such record");
            }

        } catch (Exception e) {
            // e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "There is no such record");
        } finally {
            try {
                //Close the connection and statement object
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(rootPane, "There is no such record");
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        displayInTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        String bookno;
        bookno = cbmItem.getSelectedItem().toString();

        Connection con = null;
        Statement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "123");
            //Create the Statement object
            stmt = con.createStatement();
            int count = 0;
            count = stmt.executeUpdate("delete from issuebooks where bookno='" + bookno + "' ");
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Return successfully");

            } else {
                JOptionPane.showMessageDialog(this, "Return failed", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnreturnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        findInTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       LibrarianSuccess ls = new LibrarianSuccess();
       ls.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void displayInTable() {
        if (jTable.getRowCount() > 0) {
            for (int i = jTable.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "123");
            //Create the Statement object
            stmt = con.createStatement();

            //Execute the query
            rs = stmt.executeQuery("select * from issuebooks ");

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("id"), rs.getString("bookno"), rs.getString("bookname"), rs.getString("studentid"), rs.getString("studentname"), rs.getString("studentcontact"), rs.getString("returndate")});

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //Close the connection and statement object
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
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

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreturn;
    private javax.swing.JComboBox<String> cbmItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel jTime;
    private javax.swing.JLabel jdate;
    // End of variables declaration//GEN-END:variables
}
