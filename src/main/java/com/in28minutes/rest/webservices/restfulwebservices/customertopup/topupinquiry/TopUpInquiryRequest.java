package com.in28minutes.rest.webservices.restfulwebservices.customertopup.topupinquiry;


import com.in28minutes.rest.webservices.restfulwebservices.balance.additionalinfo.AdditionalInfo;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.customeramount.CustomerAmount;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TopUpInquiryRequest {
    private String clientId;
    private String reqMsgId;
    private String customerNumber;
    private CustomerAmount amount;
    private Date transactionDate;
    private String partnerTrxId;
    private String currency;
    private AdditionalInfo additionalInfo;
}