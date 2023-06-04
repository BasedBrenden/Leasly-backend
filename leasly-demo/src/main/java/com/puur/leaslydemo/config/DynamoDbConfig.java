package com.puur.leaslydemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.amazonaws.auth.*;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.*;
import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;





@Configuration
@EnableEncryptableProperties
@EnableDynamoDBRepositories(basePackages = "com.puur.leaslydemo.repositories")
public class DynamoDbConfig {

    @Value("${aws.accessKeyId}")
    private String awsAccessKey;

    @Value("${aws.secretKey}")
    private String awsSecretKey;

    @Value("${aws.dynamodb.endpoint}")
    private String awsDynamoDBEndPoint;

    @Value("${aws.region}")
    private String awsRegion;

    @Bean
    public AWSCredentials amazonAWSCredentials(){
        return new BasicAWSCredentials(awsAccessKey, awsSecretKey);
    }    public AWSCredentialsProvider amazonAWSCredentialsProvider(){
        return new AWSStaticCredentialsProvider(amazonAWSCredentials());
    }// Returns the amazonDB instance using the endpoint as well as credentials
public AmazonDynamoDB amazonDynamoDB(){
        return AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(awsDynamoDBEndPoint, awsRegion))
                .withCredentials(amazonAWSCredentialsProvider())
                .build();
    }

    @Bean
    public DynamoDBMapper mapper(){
        return new DynamoDBMapper(amazonDynamoDB());
    }
}
