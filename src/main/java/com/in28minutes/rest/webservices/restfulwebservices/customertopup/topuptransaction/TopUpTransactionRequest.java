package com.in28minutes.rest.webservices.restfulwebservices.customertopup.topuptransaction;

import com.in28minutes.rest.webservices.restfulwebservices.customertopup.customeramount.CustomerAmount;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.customeramount.FeeAmount;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TopUpTransactionRequest {

    private String clientId;
    private String reqMsgId;
    private String customerNumber;
    private String customerName;
    private CustomerAmount amount;
    private FeeAmount feeAmount;
    private String currency;
    private Date transactionDate;
    private String partnerTrxId;
    private String sessionId;
    private int categoryId;
    private String notes;
}
