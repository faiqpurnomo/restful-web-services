package com.in28minutes.rest.webservices.restfulwebservices.customertopup;

import com.in28minutes.rest.webservices.restfulwebservices.customertopup.topupinquiry.Customer;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.topupinquiry.TopUpInquiryRepository;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.topupinquiry.TopUpInquiryRequest;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.topupinquiry.TopUpInquiryResponse;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.topuptransaction.CustomerTransaction;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.topuptransaction.TopUpTransactionRepository;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.topuptransaction.TopUpTransactionRequest;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.topuptransaction.TopUpTransactionResponse;
import com.in28minutes.rest.webservices.restfulwebservices.user.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class TopUpController {
    
    @Autowired
    private TopUpInquiryRepository topUpInquiryRepository;

    @Autowired
    private TopUpTransactionRepository topUpTransactionRepository;

    @PostMapping("/bi/openapi/topup-account/inquiry")
    public ResponseEntity<TopUpInquiryResponse> topUpInquiry(@Valid @RequestBody TopUpInquiryRequest topUpInquiryRequest) {

        Optional<Customer> customerOptional = topUpInquiryRepository.findById(topUpInquiryRequest.getCustomerNumber());
        if(!customerOptional.isPresent()){
            throw new UserNotFoundException("customerNo-" + topUpInquiryRequest.getCustomerNumber());
        }

        TopUpInquiryResponse topUpInquiryResponse = new TopUpInquiryResponse();
        topUpInquiryResponse.setResponseCode("200000000");
        topUpInquiryResponse.setResponseMessage("Request has been processed Successfully");
        topUpInquiryResponse.setClientId(topUpInquiryRequest.getClientId());
        topUpInquiryRequest.setReqMsgId(topUpInquiryRequest.getReqMsgId());
        topUpInquiryResponse.setData(customerOptional.get());

        return new ResponseEntity<>(topUpInquiryResponse, HttpStatus.OK);
    }

    @PostMapping("/bi/openapi/topup-account/transaction")
    public ResponseEntity<TopUpTransactionResponse> topUpTransaction(@Valid @RequestBody TopUpTransactionRequest topUpTransactionRequest) {

        Optional<CustomerTransaction> customerTransactionOptional =
                topUpTransactionRepository.findById(topUpTransactionRequest.getCustomerNumber());
        if(!customerTransactionOptional.isPresent()){
            throw new UserNotFoundException("customerNo-" + topUpTransactionRequest.getCustomerNumber());
        }
        CustomerTransaction data = customerTransactionOptional.get();
        data.setPartnerTrxId(topUpTransactionRequest.getPartnerTrxId());
        data.setSessionId(topUpTransactionRequest.getSessionId());
        data.setAmount(topUpTransactionRequest.getAmount());

        TopUpTransactionResponse topUpTransactionResponse = new TopUpTransactionResponse();
        topUpTransactionResponse.setResponseCode("200000000");
        topUpTransactionResponse.setResponseMessage("Request has been processed Successfully");
        topUpTransactionResponse.setClientId(topUpTransactionRequest.getClientId());
        topUpTransactionResponse.setReqMsgId(topUpTransactionRequest.getReqMsgId());
        topUpTransactionResponse.setData(customerTransactionOptional.get());

        return new ResponseEntity<>(topUpTransactionResponse, HttpStatus.OK);
    }
}
