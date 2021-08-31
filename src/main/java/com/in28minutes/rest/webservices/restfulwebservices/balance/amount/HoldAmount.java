package com.in28minutes.rest.webservices.restfulwebservices.balance.amount;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.in28minutes.rest.webservices.restfulwebservices.balance.Balance;
import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class HoldAmount {

    @Id
    @JsonIgnore
    private int id;

    private BigDecimal floatAmount;
    private String currency;

    @OneToOne(fetch= FetchType.LAZY)

    private Balance balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getFloatAmount() {
        return floatAmount;
    }

    public void setFloatAmount(BigDecimal floatAmount) {
        this.floatAmount = floatAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @Override
    public String toString() {
        return "HoldAmount{" +
                "id=" + id +
                ", floatAmount=" + floatAmount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
