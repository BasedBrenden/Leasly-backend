package com.puur.leaslydemo.models;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;



/**
 * Apartments
 */
@Service
@DynamoDBTable(tableName = "Apartments")
public class Apartments {

    @DynamoDBHashKey(attributeName = "default")
    private List<IndvApartment> apartments;


    public Apartments() {
    }

    @DynamoDBAttribute
    public List<IndvApartment> getApartments() {
        return apartments;
    }

    @DynamoDBAttribute
    public void setApartments(List<IndvApartment> apartments) {
        this.apartments = apartments;
    }
}
