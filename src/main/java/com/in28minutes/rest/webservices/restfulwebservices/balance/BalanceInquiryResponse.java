package com.in28minutes.rest.webservices.restfulwebservices.balance;

import com.in28minutes.rest.webservices.restfulwebservices.balance.additionalinfo.AdditionalInfo;
import com.in28minutes.rest.webservices.restfulwebservices.balance.amount.Amount;
import com.in28minutes.rest.webservices.restfulwebservices.balance.amount.FloatAmount;
import com.in28minutes.rest.webservices.restfulwebservices.balance.amount.HoldAmount;
import lombok.*;

import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BalanceInquiryResponse {

//    private String responseCode;
//    private String responseMessage;
// add dependency Lombok (otomatis getter setter pake annotation)
    @Id
    private String accountNo;
    private String accountType;
    private String clientID;
    private String name;
    private String reqMsgId;
    private String availableBalance;
    private String ledgerBalance;
    private String currentMultilateralLimit;
    private String currency;
    private String registrationStatusCode;
    private String status;

    private String responseCode;
    private String responseMessage;

    private HoldAmount holdAmounts;

    private Amount amount;

    private FloatAmount floatAmount;

    private AdditionalInfo additionalInfo;


}