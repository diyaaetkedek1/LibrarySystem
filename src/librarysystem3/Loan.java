/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystem3;

/**
 *
 * @author Diyaa Etkedek
 */
public class Loan {

    private Date dueDate;

    // Constructors
    public Loan(Date dueDate) {
        this.dueDate = dueDate;
    }

    // Getters and Setters
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    // Method to return a formatted string of the loan's details
    public String getinfo() {
        return "Loan Due Date: " + dueDate.toString();
    }
}
