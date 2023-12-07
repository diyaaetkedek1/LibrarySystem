/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystem3;

/**
 *
 * @author Diyaa Etkedek
 */
public class Journal extends Book {

    private String conferenceName;
    private String conferenceNo;

    // Constructors
    public Journal(String conferenceName, String conferenceNo, String title, BookAuthor author, String no, String genre, String version, Date date, boolean isLoaned) {
        super(title, author, no, genre, version, date, isLoaned);
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }

    public Journal(String conferenceName, String conferenceNo) {
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

    public String getConferenceNo() {
        return conferenceNo;
    }

    public void setConferenceNo(String conferenceNo) {
        this.conferenceNo = conferenceNo;
    }

    @Override
    public String getInfo() {
        // Return information specific to Journal, including info from the Book class
        return super.getInfo() + ", Conference Name: " + conferenceName + ", Conference No: " + conferenceNo;
    }
}
