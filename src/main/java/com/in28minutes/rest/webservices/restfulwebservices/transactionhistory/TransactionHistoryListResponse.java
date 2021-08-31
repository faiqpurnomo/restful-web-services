package com.in28minutes.rest.webservices.restfulwebservices.transactionhistory;

import com.in28minutes.rest.webservices.restfulwebservices.balance.additionalinfo.AdditionalInfo;
import com.in28minutes.rest.webservices.restfulwebservices.balance.amount.Amount;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionHistoryListResponse {

    private String responseCode;
    private String responseMessage;
    private HistoryAmount amount;
    private String referenceId;
    private String remark;
    private String reqMsgId;
    private SourceOfFund sourceOfFund;
    private String status;
    private String transactionId;
    private String type;
    private AdditionalInfo additionalInfo;
}
