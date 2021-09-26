package com.rkg.netflixdgs.dsgdemo.domain;

public class Show {

    private String title;
    private int releaseYear;
    private Review[] reviews;

    public Show(String title, int releaseYear, Review[] reviews) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
