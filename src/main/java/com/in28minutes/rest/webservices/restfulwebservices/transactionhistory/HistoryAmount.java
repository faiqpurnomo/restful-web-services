package com.in28minutes.rest.webservices.restfulwebservices.transactionhistory;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.in28minutes.rest.webservices.restfulwebservices.balance.Balance;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

//@Entity
@Getter
@Setter
public class HistoryAmount {

    //@Id
    //@JsonIgnore
    private int id;

    private double amount;
    private String currency;

    //@OneToOne(fetch= FetchType.LAZY)
    //private TransactionHistoryListResponse response;


}
