package com.in28minutes.rest.webservices.restfulwebservices.balance;

import com.in28minutes.rest.webservices.restfulwebservices.balance.amount.Amount;
import com.in28minutes.rest.webservices.restfulwebservices.balance.amount.FloatAmount;
import com.in28minutes.rest.webservices.restfulwebservices.balance.amount.HoldAmount;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Balance {

//    private String responseCode;
//    private String responseMessage;
// add dependency Lombok (otomatis getter setter pake annotation)
    @Id
    private String accountNo;
    private String accountType;
    private String name;
    private String availableBalance;
    private String ledgerBalance;
    private String currentMultilateralLimit;
    private String currency;
    private String registrationStatusCode;
    private String status;

    @OneToOne(mappedBy="balance")
    @JsonIgnore
    private HoldAmount holdAmounts;

    @OneToOne(mappedBy="balance")
    @JsonIgnore
    private Amount amount;

    @OneToOne(mappedBy="balance")
    @JsonIgnore
    private FloatAmount floatAmount;

}