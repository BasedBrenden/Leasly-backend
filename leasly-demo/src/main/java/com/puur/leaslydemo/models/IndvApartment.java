package com.puur.leaslydemo.models;

import java.util.List;

public class IndvApartment {
    private String name;
    private String address;
    private String phoneString;
    private String photo;
    private int rating;
    private List<Review> reviews;
    private List<Sublease> subleases;
    private Amenities amenities;

    public IndvApartment() {

    }

    public IndvApartment(String name, String address, String phoneString, String photo, int rating, List<Review> reviews, List<Sublease> subleases, Amenities amenities) {
        this.name = name;
        this.address = address;
        this.phoneString = phoneString;
        this.photo = photo;
        this.rating = rating;
        this.reviews = reviews;
        this.subleases = subleases;
        this.amenities = amenities;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneString() {
        return phoneString;
    }

    public String getPhoto() {
        return photo;
    }

    public int getRating() {
        return rating;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public List<Sublease> getSubleases() {
        return subleases;
    }

    public Amenities getAmenities() {
        return amenities;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     * sets the rating of the apartment based on the average of all the reviews
     */
    public void setRating() {
        this.rating = reviews.size() == 0 ? 0 : reviews.stream().mapToInt(Review::getRating).sum() / reviews.size();
    }

    /*
     * adds a review to the apartment reviews list
     */
    public void addReview(Review newReview) {
        this.reviews.add(newReview);
    }

    /*
     * adds a sublease posting to the apartment subleases list
     */
    public void addSublease(Sublease newSublease) {
        this.subleases.add(newSublease);
    }


}
