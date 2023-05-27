package com.puur.leaslydemo.models;

public class Sublease {
    private String leaserId;
    private String description;
    private int rent;
    private int duration;
    private String startDate;
    private String endDate;
    private int bedrooms;
    private int bathrooms;
    private int sqft;
    private String photo;

    public Sublease() {

    }

    public Sublease(String leaserId, String description, int rent, int duration, String startDate, String endDate, int bedrooms, int bathrooms, int sqft, String photo) {
        this.leaserId = leaserId;
        this.description = description;
        this.rent = rent;
        this.duration = duration;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.sqft = sqft;
        this.photo = photo;
    }

    public String getLeaserId() {
        return leaserId;
    }

    public String getDescription() {
        return description;
    }

    public int getRent() {
        return rent;
    }

    public int getDuration() {
        return duration;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getSqft() {
        return sqft;
    }

    public String getPhoto() {
        return photo;
    }
}
