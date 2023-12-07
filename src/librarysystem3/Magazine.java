/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystem3;

/**
 *
 * @author Diyaa Etkedek
 */
public class Magazine extends Book {

    private String issueNo;
    private Date releaseDate;

    // Constructors
    public Magazine(String issueNo, Date releaseDate, String title, BookAuthor author, String no, String genre, String version, Date date, boolean isLoaned) {
        super(title, author, no, genre, version, date, isLoaned);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    public Magazine(String issueNo, Date releaseDate) {
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    // Getters and Setters
    public String getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String getInfo() {
        // Return information specific to Magazine, including info from the Book class
        return super.getInfo() + ", Issue No: " + issueNo + ", Release Date: " + releaseDate;
    }
}
