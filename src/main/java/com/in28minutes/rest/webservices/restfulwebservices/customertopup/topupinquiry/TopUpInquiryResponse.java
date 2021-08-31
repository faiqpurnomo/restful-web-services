package com.in28minutes.rest.webservices.restfulwebservices.customertopup.topupinquiry;

import com.in28minutes.rest.webservices.restfulwebservices.balance.additionalinfo.AdditionalInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TopUpInquiryResponse {
    private String responseCode;
    private String responseMessage;
    private String clientId;
    private String reqMsgId;
    private Customer data;
    private AdditionalInfo additionalInfo;
}
