package com.in28minutes.rest.webservices.restfulwebservices.transactionhistory;

import com.in28minutes.rest.webservices.restfulwebservices.customertopup.topupinquiry.Customer;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.topupinquiry.TopUpInquiryRequest;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.topupinquiry.TopUpInquiryResponse;
import com.in28minutes.rest.webservices.restfulwebservices.user.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class TransactionHistoryController {

    @PostMapping("/bi/openapi/transaction-history-detail")
    public ResponseEntity<TransactionHistoryListResponse> topUpInquiry(@Valid @RequestBody TransactionHistoryListRequest
                                                                                   transactionHistoryListRequest) {
        HistoryAmount amount = new HistoryAmount();
        amount.setAmount(10000.000000000000000000);
        amount.setCurrency("IDR");
        amount.setId(1);

        SourceOfFund sourceOfFund = new SourceOfFund();
        sourceOfFund.setSource("BALANCE");
        sourceOfFund.setAmount(amount);

        TransactionHistoryListResponse transactionHistoryListResponse = new TransactionHistoryListResponse();
        transactionHistoryListResponse.setResponseCode("200000000");
        transactionHistoryListResponse.setResponseMessage("Request has been processed Successfully");
        transactionHistoryListResponse.setAmount(amount);
        transactionHistoryListResponse.setReferenceId("20200801198230912830091123");
        transactionHistoryListResponse.setRemark("Payment to Warung Ikan Bakar");
        transactionHistoryListResponse.setReqMsgId(transactionHistoryListRequest.getReqMsgId());
        transactionHistoryListResponse.setSourceOfFund(sourceOfFund);
        transactionHistoryListResponse.setStatus("SUCCESS");
        transactionHistoryListResponse.setType("PAYMENT");

        return new ResponseEntity<>(transactionHistoryListResponse, HttpStatus.OK);
    }
}
