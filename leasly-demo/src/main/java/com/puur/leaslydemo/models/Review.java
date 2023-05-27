package com.puur.leaslydemo.models;


public class Review {
    private String userId;
    private String description;
    private int rating;

    public Review() {

    }

    public Review(String userId, String description, int rating) {
        this.userId = userId;
        this.description = description;
        this.rating = rating;
    }

    public String getUserId() {
        return userId;
    }

    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }
}
