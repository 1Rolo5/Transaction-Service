package com.bootcamp.transactionservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "business_account")
@Data
public class Business_Account {

    @Id
    private String idBusinessAccount;
    private Business business;
    private Bank_Account account;
}
