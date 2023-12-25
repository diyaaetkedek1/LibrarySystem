package librarysystem3;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Diyaa Etkedek
 */
public class LibrarySystem extends javax.swing.JFrame {

    public LibrarySystem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        idStudentTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchByAnyTextField = new javax.swing.JTextField();
        searchByBookNumberRadioButton = new javax.swing.JRadioButton();
        searchByAuthorNameRadioButton = new javax.swing.JRadioButton();
        searchByBookNameRadioButton = new javax.swing.JRadioButton();
        searchByConferenceNameRadioButton = new javax.swing.JRadioButton();
        searchByConferenceNoRadioButton = new javax.swing.JRadioButton();
        searchByAuthorNameRadioButton3 = new javax.swing.JRadioButton();
        searchByAnyTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        idStudentTextField3 = new javax.swing.JTextField();
        searchByIssueNoRadioButton = new javax.swing.JRadioButton();
        searchByAuthorNameRadioButton2 = new javax.swing.JRadioButton();
        searchByAnyTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        magazineSearchButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        idStudentTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel8 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idStudentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idStudentTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("id student : ");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Search by any :");

        searchByAnyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByAnyTextFieldActionPerformed(evt);
            }
        });

        buttonGroup1.add(searchByBookNumberRadioButton);
        searchByBookNumberRadioButton.setText("Search by Book Number");
        searchByBookNumberRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByBookNumberRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(searchByAuthorNameRadioButton);
        searchByAuthorNameRadioButton.setText("Search by Author Name");
        searchByAuthorNameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByAuthorNameRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(searchByBookNameRadioButton);
        searchByBookNameRadioButton.setText("Search by Book Name");
        searchByBookNameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByBookNameRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(searchByConferenceNameRadioButton);
        searchByConferenceNameRadioButton.setText("Search by conferenceName");
        searchByConferenceNameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByConferenceNameRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(searchByConferenceNoRadioButton);
        searchByConferenceNoRadioButton.setText("Search by conferenceNo");
        searchByConferenceNoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByConferenceNoRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(searchByAuthorNameRadioButton3);
        searchByAuthorNameRadioButton3.setText("Search by Author Name");
        searchByAuthorNameRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByAuthorNameRadioButton3ActionPerformed(evt);
            }
        });

        searchByAnyTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByAnyTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Search by any :");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("id student : ");

        idStudentTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idStudentTextField3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(searchByIssueNoRadioButton);
        searchByIssueNoRadioButton.setText("Search by issueNo");
        searchByIssueNoRadioButton.setActionCommand("Search by Issue Number");
        searchByIssueNoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIssueNoRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(searchByAuthorNameRadioButton2);
        searchByAuthorNameRadioButton2.setText("Search by Author Name");
        searchByAuthorNameRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByAuthorNameRadioButton2ActionPerformed(evt);
            }
        });

        searchByAnyTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByAnyTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Search by any :");

        magazineSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        magazineSearchButton.setText("Search");
        magazineSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magazineSearchButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("id student : ");

        idStudentTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idStudentTextField2ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 0, 0));
        jLabel7.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Book");

        label1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Magazine");

        jLabel8.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Journal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchByBookNameRadioButton)
                            .addComponent(searchByBookNumberRadioButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idStudentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchByAuthorNameRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(searchByAnyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchByIssueNoRadioButton)
                    .addComponent(idStudentTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(searchByAnyTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(magazineSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchByAuthorNameRadioButton2))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchByConferenceNameRadioButton)
                    .addComponent(searchByConferenceNoRadioButton)
                    .addComponent(idStudentTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByAuthorNameRadioButton3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(searchByAnyTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jLabel8)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchByBookNameRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchByBookNumberRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchByAuthorNameRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idStudentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchByAnyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchByConferenceNameRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchByConferenceNoRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchByAuthorNameRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idStudentTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchByAnyTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchByIssueNoRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchByAuthorNameRadioButton2)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idStudentTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchByAnyTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(magazineSearchButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchByBookNameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByBookNameRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByBookNameRadioButtonActionPerformed

    private void searchByAuthorNameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAuthorNameRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByAuthorNameRadioButtonActionPerformed

    private void searchByBookNumberRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByBookNumberRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByBookNumberRadioButtonActionPerformed

    private void searchByAnyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAnyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByAnyTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Book> BookArraylist = new ArrayList<>();

        Book book = new Book("Whispers of the Ancients", new BookAuthor(1, "Miriam L. Forrest", "Lunaria", new Date(16, 10, 1976)), 831, "Fantasy", "6.3", new Date(5, 5, 2015), false);
        BookArraylist.add(book);

        book = new Book("The Last Symphony", new BookAuthor(2, "Jeremy K. Saunders", "Thundara", new Date(1, 1, 1965)), 442, "Historical Fiction", "4.8", new Date(21, 8, 2018), false);
        BookArraylist.add(book);

        book = new Book("Code of the Cosmos", new BookAuthor(3, "Fiona D. Gentry", "Serenora", new Date(5, 4, 1980)), 359, "Science Fiction", "5.2", new Date(12, 1, 2020), false);
        BookArraylist.add(book);

        book = new Book("Beneath the Willow Tree", new BookAuthor(4, "Arthur N. Bright", "Aquaterra", new Date(17, 12, 1977)), 274, "Romance", "4.4", new Date(7, 7, 2017), false);
        BookArraylist.add(book);

        book = new Book("Echoes of Eternity", new BookAuthor(5, "Clara M. Winston", "Zephyria", new Date(23, 8, 1963)), 599, "Mystery", "7.9", new Date(9, 6, 2016), false);
        BookArraylist.add(book);

        book = new Book("Sands of the Mirage", new BookAuthor(6, "Elliot J. Ramirez", "Emberland", new Date(8, 2, 1900)), 983, "Adventure", "1.8", new Date(15, 12, 2019), false);
        BookArraylist.add(book);
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        ArrayList<Student> studentArraylist = new ArrayList<>();

        Student s = new Student(1000, "Sami", "Hebron", new Date(1, 1, 2003), "Computer Since");
        studentArraylist.add(s);

        s = new Student(2000, "Osama", "Ram-Allah", new Date(5, 4, 2004), "IT");
        studentArraylist.add(s);

        s = new Student(3000, "Ibrahim", "Jenin", new Date(17, 12, 2000), "Marketing");
        studentArraylist.add(s);

        s = new Student(4000, "Lina", "Taffouh", new Date(16, 10, 2002), "Medicine");
        studentArraylist.add(s);

        s = new Student(5000, "Mohannad", "Hebron", new Date(23, 8, 2005), "Data Since");
        studentArraylist.add(s);

        s = new Student(6000, "Hasan", "Kharas", new Date(8, 2, 1999), "English");
        studentArraylist.add(s);

        Book foundBook = null;
        Student foundStudent = null;
        String studentIdString;
        int studentId = 0;

        if (searchByBookNameRadioButton.isSelected()) {
            String bookName = searchByAnyTextField.getText();
            studentIdString = idStudentTextField.getText();
            studentId = 0;
            try {
                studentId = Integer.parseInt(studentIdString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid student ID.");
                return;
            }

            foundBook = null;

            // Search for the book by name
            for (Iterator<Book> it = BookArraylist.iterator(); it.hasNext();) {
                book = it.next();
                if (book.getTitle().equalsIgnoreCase(bookName)) {
                    foundBook = book;
                    break; // Book found, no need to continue searching
                }
            }

            if (foundBook != null) {
                // Display book information
                JOptionPane.showMessageDialog(null, foundBook.getInfo());

                // Check if the book is not loaned out
                if (!foundBook.isIsLoaned()) {
                    // Search for the student by ID
                    foundStudent = null;
                    for (Iterator<Student> it = studentArraylist.iterator(); it.hasNext();) {
                        s = it.next();
                        if (s.getId() == studentId) {
                            foundStudent = s;
                            break; // Student found, no need to continue searching
                        }
                    }

                    if (foundStudent != null) {

                        JOptionPane.showMessageDialog(null, "Book '" + foundBook.getTitle() + "' is now loaned to " + foundStudent.getName() + ".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Student ID " + studentId + " not found.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "The book '" + foundBook.getTitle() + "' is already loaned out.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No book with the name '" + bookName + "' was found.");
            }

        } //------------------------------------------------------------------------------------------------------------------------------------------------------
        else if (searchByBookNumberRadioButton.isSelected()) {

            String bookNumberString = searchByAnyTextField.getText();
            int bookNumber = 0;
            try {
                bookNumber = Integer.parseInt(bookNumberString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid book number.");
                return; // Exit the method if the book number is invalid
            }

            foundBook = null;

            // Search for the book by number
            for (Book b : BookArraylist) {
                if (b.getNo() == bookNumber) {
                    foundBook = b;
                    break; // Book found, no need to continue searching
                }
            }

            if (foundBook != null) {
                // Display book information
                JOptionPane.showMessageDialog(null, foundBook.getInfo());

                // Check if the book is not loaned out
                if (!foundBook.isIsLoaned()) {
                    // Search for the student by ID
                    foundStudent = null;
                    for (Iterator<Student> it = studentArraylist.iterator(); it.hasNext();) {
                        s = it.next();
                        if (s.getId() == Integer.parseInt(idStudentTextField.getText())) {
                            foundStudent = s;
                            break; // Student found, no need to continue searching
                        }
                    }

                    if (foundStudent != null) {

                        JOptionPane.showMessageDialog(null, "Book number " + bookNumber + " is now loaned to " + foundStudent.getName() + ".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Student ID " + studentId + " not found.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "The book with number " + bookNumber + " is already loaned out.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No book with the number " + bookNumber + " was found.");
            }
        } //---------------------------------------------------------------------------------------------------------------------------------------------------
        else if (searchByAuthorNameRadioButton.isSelected()) {

            String authorName = searchByAnyTextField.getText();
            studentIdString = idStudentTextField.getText();
            studentId = 0;
            try {
                studentId = Integer.parseInt(studentIdString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid student ID.");
                return; // Exit the method if the ID is invalid
            }

            foundBook = null;

            // Search for the book by author's name
            for (Book b : BookArraylist) {
                if (b.getAuthor().getName().equalsIgnoreCase(authorName)) {
                    foundBook = b;
                    break; // Book found, no need to continue searching
                }
            }

            if (foundBook != null) {
                // Display book information
                JOptionPane.showMessageDialog(null, foundBook.getInfo());

                // Check if the book is not loaned out
                if (!foundBook.isIsLoaned()) {
                    // Search for the student by ID
                    foundStudent = null;
                    for (Iterator<Student> it = studentArraylist.iterator(); it.hasNext();) {
                        s = it.next();
                        if (s.getId() == studentId) {
                            foundStudent = s;
                            break; // Student found, no need to continue searching
                        }
                    }

                    if (foundStudent != null) {

                        JOptionPane.showMessageDialog(null, "Book by author '" + authorName + "' is now loaned to " + foundStudent.getName() + ".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Student ID " + studentId + " not found.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "The book by author '" + authorName + "' is already loaned out.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No book by author '" + authorName + "' was found.");
            }
        } ///----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        else {

            JOptionPane.showMessageDialog(null, "Select one to search");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idStudentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idStudentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idStudentTextFieldActionPerformed

    private void searchByConferenceNameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByConferenceNameRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByConferenceNameRadioButtonActionPerformed

    private void searchByConferenceNoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByConferenceNoRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByConferenceNoRadioButtonActionPerformed

    private void searchByAnyTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAnyTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByAnyTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<Journal> JournalArraylist = new ArrayList<>();

        Journal j = new Journal(" Global Tech Symposium", 100, "Innovations in AI", new BookAuthor(185, "Dr. Alex Rivera", "Celestia", new Date(16, 10, 1990)), 3, "Technology", "5.1", new Date(5, 5, 2015), false);
        JournalArraylist.add(j);

        j = new Journal("International Healthcare Conference", 200, "Breakthroughs in Genomic Medicine", new BookAuthor(274, "Prof. Lila Morris", "Technolix", new Date(1, 1, 1945)), 7, "Medicine", "4.2", new Date(21, 8, 2018), false);
        JournalArraylist.add(j);

        j = new Journal("World Renewable Energy Forum", 300, "Sustainable Energy Solutions", new BookAuthor(332, "Dr. Ethan Chong", "Historia", new Date(5, 4, 1987)), 11, "Environmental Science", " 6.3", new Date(12, 1, 2020), false);
        JournalArraylist.add(j);

        j = new Journal("Global Finance Summit", 400, "Future of Fintech", new BookAuthor(486, "Sara Jennings, MBA", "Greenhaven", new Date(17, 12, 1986)), 2, "Economics", "3.8", new Date(7, 7, 2017), false);
        JournalArraylist.add(j);

        j = new Journal("International Education Conference", 500, " New Horizons in Learning", new BookAuthor(571, "Dr. Marcus Yin", "Neuralis", new Date(23, 8, 1955)), 5, "Education", "7.0", new Date(9, 6, 2016), false);
        JournalArraylist.add(j);

        j = new Journal("World Architecture Congress", 600, "Modern Architectural Marvels", new BookAuthor(633, "Prof. Angela Duarte", "Quanta", new Date(8, 2, 1967)), 9, "Architecture", "5.5", new Date(15, 12, 2019), false);
        JournalArraylist.add(j);
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        ArrayList<Student> studentArraylist = new ArrayList<>();

        Student s = new Student(1000, "Sami", "Hebron", new Date(1, 1, 2003), "Computer Since");
        studentArraylist.add(s);

        s = new Student(2000, "Osama", "Ram-Allah", new Date(5, 4, 2004), "IT");
        studentArraylist.add(s);

        s = new Student(3000, "Ibrahim", "Jenin", new Date(17, 12, 2000), "Marketing");
        studentArraylist.add(s);

        s = new Student(4000, "Lina", "Taffouh", new Date(16, 10, 2002), "Medicine");
        studentArraylist.add(s);

        s = new Student(5000, "Mohannad", "Hebron", new Date(23, 8, 2005), "Data Since");
        studentArraylist.add(s);

        s = new Student(6000, "Hasan", "Kharas", new Date(8, 2, 1999), "English");
        studentArraylist.add(s);

        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Journal foundJournal = null;
        Student foundStudent = null;
        String studentIdString = idStudentTextField3.getText(); // Assuming this is the correct text field for the student ID
        int studentId = 0;

        if (!studentIdString.isEmpty()) {
            try {
                studentId = Integer.parseInt(studentIdString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid student ID.");
                return; // Exit the method if the ID is invalid
            }
        }

        if (searchByConferenceNameRadioButton.isSelected()) {
            String conferenceName = searchByAnyTextField3.getText(); // Assuming this is the correct text field for the search input
            // Search for the journal by conference name
            for (Iterator<Journal> it = JournalArraylist.iterator(); it.hasNext();) {
                j = it.next();
                if (j.getConferenceName().equalsIgnoreCase(conferenceName)) {
                    foundJournal = j;
                    break; // Journal found, no need to continue searching
                }
            }
            if (foundJournal != null) {
                // Display book information
                JOptionPane.showMessageDialog(null, foundJournal.getInfo());

                // Check if the book is not loaned out
                if (!foundJournal.isIsLoaned()) {
                    // Search for the student by ID
                    foundStudent = null;
                    for (Iterator<Student> it = studentArraylist.iterator(); it.hasNext();) {
                        s = it.next();
                        if (s.getId() == studentId) {
                            foundStudent = s;
                            break; // Student found, no need to continue searching
                        }
                    }

                    if (foundStudent != null) {

                        JOptionPane.showMessageDialog(null, "Journal'" + foundJournal.getConferenceName() + "' is now loaned to " + foundStudent.getName() + ".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Student ID " + studentId + " not found.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "The Journal '" + foundJournal.getConferenceName() + "' is already loaned out.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No Journal with the name '" + conferenceName + "' was found.");
            }

        } else if (searchByConferenceNoRadioButton.isSelected()) {
            String conferenceNumberString = searchByAnyTextField3.getText();
            int conferenceNumber = 0;
            try {
                conferenceNumber = Integer.parseInt(conferenceNumberString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid conference number.");
                return; // Exit the method if the conference number is invalid
            }
            // Search for the journal by conference number
            for (Iterator<Journal> it = JournalArraylist.iterator(); it.hasNext();) {
                j = it.next();
                if (j.getConferenceNo() == conferenceNumber) {
                    foundJournal = j;
                    break; // Journal found, no need to continue searching
                }
            }

            if (foundJournal != null) {
                // Display book information
                JOptionPane.showMessageDialog(null, foundJournal.getInfo());

                // Check if the book is not loaned out
                if (!foundJournal.isIsLoaned()) {
                    // Search for the student by ID
                    foundStudent = null;
                    for (Iterator<Student> it = studentArraylist.iterator(); it.hasNext();) {
                        s = it.next();
                        if (s.getId() == Integer.parseInt(idStudentTextField3.getText())) {
                            foundStudent = s;
                            break; // Student found, no need to continue searching
                        }
                    }

                    if (foundStudent != null) {

                        JOptionPane.showMessageDialog(null, "Journal number " + conferenceNumber + " is now loaned to " + foundStudent.getName() + ".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Student ID " + studentId + " not found.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "The Journal with number " + conferenceNumber + " is already loaned out.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No Journal with the number " + conferenceNumber + " was found.");
            }

        } else if (searchByAuthorNameRadioButton3.isSelected()) {
            String authorName = searchByAnyTextField3.getText();
            // Search for the journal by author's name
            for (Iterator<Journal> it = JournalArraylist.iterator(); it.hasNext();) {
                j = it.next();
                if (j.getAuthor().getName().equalsIgnoreCase(authorName)) {
                    foundJournal = j;
                    break; // Journal found, no need to continue searching
                }
            }
            if (foundJournal != null) {
                // Display book information
                JOptionPane.showMessageDialog(null, foundJournal.getInfo());

                // Check if the book is not loaned out
                if (!foundJournal.isIsLoaned()) {
                    // Search for the student by ID
                    foundStudent = null;
                    for (Iterator<Student> it = studentArraylist.iterator(); it.hasNext();) {
                        s = it.next();
                        if (s.getId() == studentId) {
                            foundStudent = s;
                            break; // Student found, no need to continue searching
                        }
                    }

                    if (foundStudent != null) {

                        JOptionPane.showMessageDialog(null, "Journal by author '" + authorName + "' is now loaned to " + foundStudent.getName() + ".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Student ID " + studentId + " not found.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "The Journal by author '" + authorName + "' is already loaned out.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No Journal by author '" + authorName + "' was found.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a search criterion.");
            return; // No search criterion selected, exit the method
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void idStudentTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idStudentTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idStudentTextField3ActionPerformed

    private void searchByIssueNoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIssueNoRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByIssueNoRadioButtonActionPerformed

    private void searchByAuthorNameRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAuthorNameRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByAuthorNameRadioButton2ActionPerformed

    private void searchByAnyTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAnyTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByAnyTextField2ActionPerformed

    private void magazineSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magazineSearchButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<Magazine> MagazineArraylist = new ArrayList<>();

        Magazine M = new Magazine(10, new Date(15, 6, 2023), "Future Tech Today", new BookAuthor(199, "Emily Carson", "New Cyberton", new Date(16, 10, 1978)), 831, "Technology", "7.1", new Date(5, 5, 2015), false);
        MagazineArraylist.add(M);

        M = new Magazine(20, new Date(22, 1, 2023), "Eco World", new BookAuthor(244, "Marcus Greenway", "Terra Verde", new Date(1, 1, 1965)), 442, "Environmental", "5.2", new Date(21, 8, 2018), false);
        MagazineArraylist.add(M);

        M = new Magazine(30, new Date(3, 8, 2022), "Culinary Arts", new BookAuthor(365, "Sofia Ramirez", "Gourmandia", new Date(5, 4, 1942)), 359, "Food & Cooking", "7.9", new Date(12, 1, 2020), false);
        MagazineArraylist.add(M);

        M = new Magazine(40, new Date(7, 7, 2020), "Ancient Mysteries Unveiled", new BookAuthor(4, " Dr. Liam Peterson", "Eldoria", new Date(17, 12, 1964)), 274, "History", "4.3", new Date(7, 7, 2017), false);
        MagazineArraylist.add(M);

        M = new Magazine(50, new Date(2, 9, 2023), "Fashion Forward", new BookAuthor(598, "Claire Dubois", "Styleton", new Date(23, 8, 1974)), 599, "Fashion", "1.5", new Date(9, 6, 2016), false);
        MagazineArraylist.add(M);

        M = new Magazine(60, new Date(5, 12, 2023), "Galactic Explorer", new BookAuthor(647, "Jackson Pearce", "Starhaven", new Date(8, 2, 1982)), 983, "Science Fiction", "6.4", new Date(15, 12, 2019), false);
        MagazineArraylist.add(M);
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        ArrayList<Student> studentArraylist = new ArrayList<>();

        Student s = new Student(1000, "Sami", "Hebron", new Date(1, 1, 2003), "Computer Since");
        studentArraylist.add(s);

        s = new Student(2000, "Osama", "Ram-Allah", new Date(5, 4, 2004), "IT");
        studentArraylist.add(s);

        s = new Student(3000, "Ibrahim", "Jenin", new Date(17, 12, 2000), "Marketing");
        studentArraylist.add(s);

        s = new Student(4000, "Lina", "Taffouh", new Date(16, 10, 2002), "Medicine");
        studentArraylist.add(s);

        s = new Student(5000, "Mohannad", "Hebron", new Date(23, 8, 2005), "Data Since");
        studentArraylist.add(s);

        s = new Student(6000, "Hasan", "Kharas", new Date(8, 2, 1999), "English");
        studentArraylist.add(s);
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Magazine foundMagazine = null;
        Student foundStudent = null;
        String studentIdString = idStudentTextField2.getText();
        int issueNo;
        int studentId = 0;

        if (!studentIdString.isEmpty()) {
            try {
                studentId = Integer.parseInt(studentIdString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid student ID.");
                return; // Exit the method if the ID is invalid
            }
        }

        String searchInput = searchByAnyTextField2.getText();

        if (searchByIssueNoRadioButton.isSelected()) {
            // Parse the issue number from search input
            issueNo = 0;
            try {
                issueNo = Integer.parseInt(searchInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid issue number.");
                return; // Exit the method if the issue number is invalid
            }

            // Search for the magazine by issue number
            for (Magazine m : MagazineArraylist) {
                if (m.getIssueNo() == issueNo) {
                    foundMagazine = m;
                    break; // Magazine found, no need to continue searching
                }
            }
        } else if (searchByAuthorNameRadioButton2.isSelected()) {
            // Search for the magazine by author's name
            for (Magazine m : MagazineArraylist) {
                if (m.getAuthor().getName().equalsIgnoreCase(searchInput)) {
                    foundMagazine = m;
                    break; // Magazine found, no need to continue searching
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a valid search criterion.");
            return; // Exit the method if no search criterion is selected
        }

        // Handle the found magazine and student logic
        if (foundMagazine != null) {
            // Display book information
            JOptionPane.showMessageDialog(null, foundMagazine.getInfo());

            // Check if the book is not loaned out
            if (!foundMagazine.isIsLoaned()) {
                // Search for the student by ID
                foundStudent = null;
                for (Iterator<Student> it = studentArraylist.iterator(); it.hasNext();) {
                    s = it.next();
                    if (s.getId() == studentId) {
                        foundStudent = s;
                        break; // Student found, no need to continue searching
                    }
                }

                if (foundStudent != null) {
                    // Implement the logic to loan the book to the student
                    // For now, just display a message
                    JOptionPane.showMessageDialog(null, "Magazine by author '" + searchByAnyTextField2.getText() + "' is now loaned to " + foundStudent.getName() + ".");
                } else {
                    JOptionPane.showMessageDialog(null, "Student ID " + searchByAnyTextField2.getText() + " not found.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "The Magazine by author '" + searchByAnyTextField2.getText() + "' is already loaned out.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Magazine by author '" + searchByAnyTextField2.getText() + "' was found.");
        }


    }//GEN-LAST:event_magazineSearchButtonActionPerformed

    private void idStudentTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idStudentTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idStudentTextField2ActionPerformed

    private void searchByAuthorNameRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAuthorNameRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByAuthorNameRadioButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarySystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField idStudentTextField;
    private javax.swing.JTextField idStudentTextField2;
    private javax.swing.JTextField idStudentTextField3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private javax.swing.JButton magazineSearchButton;
    private javax.swing.JTextField searchByAnyTextField;
    private javax.swing.JTextField searchByAnyTextField2;
    private javax.swing.JTextField searchByAnyTextField3;
    private javax.swing.JRadioButton searchByAuthorNameRadioButton;
    private javax.swing.JRadioButton searchByAuthorNameRadioButton2;
    private javax.swing.JRadioButton searchByAuthorNameRadioButton3;
    private javax.swing.JRadioButton searchByBookNameRadioButton;
    private javax.swing.JRadioButton searchByBookNumberRadioButton;
    private javax.swing.JRadioButton searchByConferenceNameRadioButton;
    private javax.swing.JRadioButton searchByConferenceNoRadioButton;
    private javax.swing.JRadioButton searchByIssueNoRadioButton;
    // End of variables declaration//GEN-END:variables
}
