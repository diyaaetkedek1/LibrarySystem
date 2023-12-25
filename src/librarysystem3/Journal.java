package librarysystem3;

/**
 *
 * @author Diyaa Etkedek
 */
public class Journal extends Book {

    private String conferenceName;
    private int conferenceNo;

    // Constructors
    public Journal(String conferenceName, int conferenceNo, String title, BookAuthor author, int no, String genre, String version, Date date, boolean isLoaned) {
        super(title, author, no, genre, version, date, isLoaned);
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }

    public Journal(String conferenceName, int conferenceNo) {
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }

    public Journal() {
    }

    // Getters and Setters
    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public int getConferenceNo() {
        return conferenceNo;
    }

    public void setConferenceNo(int conferenceNo) {
        this.conferenceNo = conferenceNo;
    }

    @Override
    public String getInfo() {
        // Return information specific to Journal, including info from the Book class
        return super.getInfo() + ", Conference Name: " + conferenceName + ", Conference No: " + conferenceNo;
    }
}
