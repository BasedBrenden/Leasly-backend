package com.puur.leaslydemo.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
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

    @DynamoDBAttribute(attributeName = "leaserId")
    public String getLeaserId() {
        return leaserId;
    }

    @DynamoDBAttribute(attributeName = "description")
    public String getDescription() {
        return description;
    }

    @DynamoDBAttribute(attributeName = "rent")
    public int getRent() {
        return rent;
    }

    @DynamoDBAttribute(attributeName = "duration")
    public int getDuration() {
        return duration;
    }

    @DynamoDBAttribute(attributeName = "startDate")
    public String getStartDate() {
        return startDate;
    }

    @DynamoDBAttribute(attributeName = "endDate")
    public String getEndDate() {
        return endDate;
    }

    @DynamoDBAttribute(attributeName = "bedrooms")
    public int getBedrooms() {
        return bedrooms;
    }

    @DynamoDBAttribute(attributeName = "bathrooms")
    public int getBathrooms() {
        return bathrooms;
    }

    @DynamoDBAttribute(attributeName = "sqft")
    public int getSqft() {
        return sqft;
    }

    @DynamoDBAttribute(attributeName = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setLeaserId(String leaserId) {
        this.leaserId = leaserId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    

}
