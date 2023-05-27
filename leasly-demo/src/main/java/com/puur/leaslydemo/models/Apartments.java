package com.puur.leaslydemo.models;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;



/**
 * Apartments
 */

@DynamoDBTable(tableName = "Apartments")
public class Apartments {

    @DynamoDBHashKey(attributeName = "default")
    private List<IndvApartment> apartments;


    public Apartments() {
    }


    public List<IndvApartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<IndvApartment> apartments) {
        this.apartments = apartments;
    }
}