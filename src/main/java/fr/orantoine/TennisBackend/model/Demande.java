package fr.orantoine.TennisBackend.model;

import org.springframework.data.annotation.Id;

public class Demande {

    @Id
    private String id;

    private User user;

    private String date;

    private String place;

    public Demande(String id, User user, String date, String place) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.place = place;
    }

    public Demande() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Demande{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", date='" + date + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
