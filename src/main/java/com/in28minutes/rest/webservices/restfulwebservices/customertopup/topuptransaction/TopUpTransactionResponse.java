package com.in28minutes.rest.webservices.restfulwebservices.customertopup.topuptransaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TopUpTransactionResponse {

    private String responseCode;
    private String responseMessage;
    private String clientId;
    private String reqMsgId;
    private CustomerTransaction data;
}
