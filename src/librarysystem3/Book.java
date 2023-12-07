/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystem3;

/**
 *
 * @author Diyaa Etkedek
 */
public class Book implements Display {

    private String title;
    private BookAuthor author;
    private String no;
    private String genre;
    private String version;
    private Date date;
    private boolean isLoaned;

    // Constructors
    public Book(String title, BookAuthor author, String no, String genre, String version, Date date, boolean isLoaned) {
        this.title = title;
        this.author = author;
        this.no = no;
        this.genre = genre;
        this.version = version;
        this.date = date;
        this.isLoaned = isLoaned;
    }

    public Book() {
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookAuthor getAuthor() {
        return author;
    }

    public void setAuthor(BookAuthor author) {
        this.author = author;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIsLoaned() {
        return isLoaned;
    }

    public void setIsLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }

    // Implement Display Interface
    @Override
    public String getInfo() {
        return "Title: " + title + ", Author: " + author.getName() + ", Number: " + no
                + ", Genre: " + genre + ", Version: " + version + ", Date: " + date.toString();
    }

    // Additional Method
    @Override
    public boolean inLoan() {
        return isLoaned;
    }
}

