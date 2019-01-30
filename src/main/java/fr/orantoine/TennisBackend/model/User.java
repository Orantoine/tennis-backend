package fr.orantoine.TennisBackend.model;


import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private int year;

    private String level;

    private String pseudo;

    private String password;

    private String[] contact;

    private boolean admin;


    public User(String id, String firstName, String lastName, int year, String pseudo, String password,String[] contact, boolean admin, String level) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.pseudo = pseudo;
        this.password = password;
        this.admin = admin;
        this.level = level;
        this.contact = contact;
    }


    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String[] getContact() {
        return contact;
    }

    public void setContact(String[] contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", level=" + level +
                ", pseudo='" + pseudo + '\'' +
                ", password='" + password + '\'' +
                ", contact='" + contact + '\'' +
                ", admin=" + admin +
                '}';
    }
}
