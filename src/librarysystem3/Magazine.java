package librarysystem3;

/**
 *
 * @author Diyaa Etkedek
 */
public class Magazine extends Book {

    private int issueNo;
    private Date releaseDate;

    // Constructors
    public Magazine(int issueNo, Date releaseDate, String title, BookAuthor author, int no, String genre, String version, Date date, boolean isLoaned) {
        super(title, author, no, genre, version, date, isLoaned);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    public Magazine(int issueNo, Date releaseDate) {
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    // Getters and Setters
    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
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
