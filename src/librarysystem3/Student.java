package librarysystem3;

import java.util.ArrayList;

/**
 *
 * @author Diyaa Etkedek
 */
public class Student {

    private int id;
    private String name;
    private String address;
    private Date birthDate;
    private String major;

    // Constructor
    public Student(int id, String name, String address, Date birthDate, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;

    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getinfo() {
        return "Student ID: " + id + ", Name: " + name + ", Address: " + address
                + ", Birth Date: " + birthDate + ", Major: " + major;
    }
}
