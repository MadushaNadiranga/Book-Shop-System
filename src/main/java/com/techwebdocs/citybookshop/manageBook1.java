/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.techwebdocs.citybookshop;

import javax.swing.JOptionPane;

/**
 *
 * @author NadirangaMac
 */
public class manageBook1 extends javax.swing.JFrame {

    /**
     * Creates new form manageBook
     */
    public manageBook1() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        addButton1 = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE BOOKS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        exitButton.setBackground(new java.awt.Color(204, 255, 255));
        exitButton.setText("❌ Exit");
        exitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 70, 30));

        backButton.setBackground(new java.awt.Color(204, 255, 255));
        backButton.setText("⬅ Back");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 383, 70, 30));

        searchButton.setBackground(new java.awt.Color(255, 204, 204));
        searchButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchButton.setText("🔍 SEARCH BOOKS");
        searchButton.setBorder(null);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 140, 60));

        addButton1.setBackground(new java.awt.Color(255, 204, 204));
        addButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addButton1.setText("➕ ADD BOOKS");
        addButton1.setBorder(null);
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(addButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 140, 60));

        editButton.setBackground(new java.awt.Color(255, 204, 204));
        editButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        editButton.setText("✎ EDIT BOOKS");
        editButton.setBorder(null);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 140, 60));

        deleteButton.setBackground(new java.awt.Color(255, 204, 204));
        deleteButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteButton.setText("✖ DELETE BOOKS");
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 140, 60));

        viewButton.setBackground(new java.awt.Color(255, 204, 204));
        viewButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        viewButton.setText("🗨 VIEW BOOKS");
        viewButton.setBorder(null);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        jPanel1.add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 140, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/NadirangaMac/Desktop/City Bookshop/8.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        JOptionPane.showMessageDialog(null, "User Exited successfully.", "Exit", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
            managerPage managerPage = new managerPage();
            managerPage.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
            addBooks addBooks = new addBooks();
            addBooks.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_addButton1ActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
            editBook editBook = new editBook();
            editBook.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
            deletePage deletePage = new deletePage();
            deletePage.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
            viewBook viewBook = new viewBook();
            viewBook.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_viewButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
            searchPage searchPage = new searchPage();
            searchPage.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(manageBook1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageBook1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageBook1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageBook1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageBook1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton1;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
