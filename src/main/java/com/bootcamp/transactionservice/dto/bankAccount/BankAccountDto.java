package com.bootcamp.transactionservice.dto.bankAccount;

import lombok.Data;

@Data
public class BankAccountDto {


    private String bankAccountId;
    private double availableBalance;
    private String numberAccount;
    private int comission;

}
