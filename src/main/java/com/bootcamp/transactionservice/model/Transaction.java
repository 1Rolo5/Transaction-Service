package com.bootcamp.transactionservice.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@ToString
@Document(collection = "transaction")
public class Transaction {
    @Id
    private String transactionId;

    private Bank_Account account;

    private Personnel personnel;
    private Business  business;

    private String type;
    private double amount;
    private String account_destiny;
    private Date date ;

    public Transaction(String transactionId, String type, String account_destiny, Date date) {
        this.transactionId = transactionId;
        this.type = type;
        this.account_destiny = account_destiny;
        this.date = date;
    }

    public Transaction() {

    }

}
