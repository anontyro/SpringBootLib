package co.alexwilkinson.giflib.models;

import java.time.LocalDate;

/**
 * Created by Alex on 03/05/2017.
 */
public class Gif {
    private String name;
    private LocalDate dateUploaded;
    private String username;
    private Boolean favourite;

    public Gif(String name, LocalDate dateUploaded, String username, Boolean favourite) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favourite = favourite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }
}
