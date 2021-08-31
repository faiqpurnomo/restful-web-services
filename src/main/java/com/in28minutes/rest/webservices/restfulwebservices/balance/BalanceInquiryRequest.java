package com.in28minutes.rest.webservices.restfulwebservices.balance;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.in28minutes.rest.webservices.restfulwebservices.balance.additionalinfo.AdditionalInfo;
import lombok.*;

//@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonDeserialize
public class BalanceInquiryRequest {

    private String accountNo;
    private String clientId;
    private String reqMsgId;
    private AdditionalInfo additionalInfo;

    public BalanceInquiryRequest(String balanceInquiryRequest) throws JsonProcessingException {
        this.accountNo = accountNo;
        this.clientId = clientId;
        this.reqMsgId = reqMsgId;
        this.additionalInfo = additionalInfo;
    }

}
