package com.rkg.netflixdgs.dsgdemo.domain;

public class Review {
    private int starRating;
    private int reviewCount;
    private String lastReviewDate;

    public Review(int starRating, int reviewCount, String lastReviewDate) {
        this.starRating = starRating;
        this.reviewCount = reviewCount;
        this.lastReviewDate = lastReviewDate;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public int getStarRating() {
        return starRating;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getLastReviewDate() {
        return lastReviewDate;
    }

    public void setLastReviewDate(String lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }
}
