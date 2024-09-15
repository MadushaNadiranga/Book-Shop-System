package com.techwebdocs.citybookshop;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author NadirangaMac
 */
public class addBooks extends javax.swing.JFrame {

    /**
     * Creates new form searchPage
     */
    public addBooks() {
        initComponents();
    }




public class BookData {
    private static int lastAssignedId = 0;
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookCategory;
    private String bookYear;
    private String bookPrice;

   
    public BookData(String bookName, String bookAuthor, String bookCategory, String bookYear, String bookPrice) {
        this.bookId = ++lastAssignedId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookYear = bookYear;
        this.bookPrice = bookPrice;
    }

  
    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public String getBookYear() {
        return bookYear;
    }

    public String getBookPrice() {
        return bookPrice;
    }

  
    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            String line = bookId + ", " + bookName + ", " + bookAuthor + ", " + bookCategory + ", " + bookYear + ", " + bookPrice;
            writer.write(line + "\n");
        }
    }

        void setBookName(String text) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        void setBookAuthor(String text) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        void setBookCategory(String text) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        void setBookYear(String text) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        void setBookPrice(String text) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        String getBookId() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }



    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookPrice = new javax.swing.JLabel();
        bookName = new javax.swing.JLabel();
        bookYear = new javax.swing.JLabel();
        bookAuthor = new javax.swing.JLabel();
        bookCategory = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        yearField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        categoryField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD BOOKS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        bookPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bookPrice.setText("Price :");
        jPanel1.add(bookPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 160, 30));

        bookName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bookName.setText("Book Name :");
        jPanel1.add(bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 160, 30));

        bookYear.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bookYear.setText("Year :");
        jPanel1.add(bookYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 30));

        bookAuthor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bookAuthor.setText("Author :");
        jPanel1.add(bookAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 160, 30));

        bookCategory.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bookCategory.setText("Category :");
        jPanel1.add(bookCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 160, 30));

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 240, 30));

        nameField.setToolTipText("l");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 240, 30));

        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });
        jPanel1.add(yearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 240, 30));

        authorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorFieldActionPerformed(evt);
            }
        });
        jPanel1.add(authorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 240, 30));

        categoryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryFieldActionPerformed(evt);
            }
        });
        jPanel1.add(categoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 240, 30));

        clearButton.setBackground(new java.awt.Color(255, 204, 204));
        clearButton.setText("✖ Clear");
        clearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 70, -1));

        addButton.setBackground(new java.awt.Color(204, 204, 255));
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 110, 30));

        backButton1.setBackground(new java.awt.Color(255, 204, 204));
        backButton1.setText("⬅ Back");
        backButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        nameField.setText("");
        authorField.setText("");
        categoryField.setText("");
        yearField.setText("");
        priceField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
                                   
    String bookName = nameField.getText();
    String bookAuthor = authorField.getText();
    String bookCategory = categoryField.getText();
    String bookYear = yearField.getText();
    String bookPrice = priceField.getText();
    
    
    if (bookName.isEmpty() || bookAuthor.isEmpty() || bookCategory.isEmpty() || bookYear.isEmpty() || bookPrice.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please fill out all fields.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return; 
    }
    
    try {
        
        BookData bookData = new BookData(bookName, bookAuthor, bookCategory, bookYear, bookPrice);
        
        
        bookData.saveToFile("BookData.txt");
        
        
        javax.swing.JOptionPane.showMessageDialog(this, "Book data saved successfully.", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
      
        javax.swing.JOptionPane.showMessageDialog(this, "Error saving book data: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); 
    }


    
    }//GEN-LAST:event_addButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

    private void authorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorFieldActionPerformed

    private void categoryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryFieldActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
            manageBook1 manageBook1 = new manageBook1();
            manageBook1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(addBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField authorField;
    private javax.swing.JButton backButton1;
    private javax.swing.JLabel bookAuthor;
    private javax.swing.JLabel bookCategory;
    private javax.swing.JLabel bookName;
    private javax.swing.JLabel bookPrice;
    private javax.swing.JLabel bookYear;
    private javax.swing.JTextField categoryField;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
}
