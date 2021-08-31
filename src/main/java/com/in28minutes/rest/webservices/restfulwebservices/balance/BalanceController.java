package com.in28minutes.rest.webservices.restfulwebservices.balance;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.in28minutes.rest.webservices.restfulwebservices.user.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class BalanceController {
    @Autowired
    private BalanceRepository balanceRepository;

    @CrossOrigin(origins = "https://apidevportal.bi.go.id/")
    @GetMapping("/bi/openapi/balance-inquiry2")
    public List<Balance> retrieveAllBalance() {
        return balanceRepository.findAll();
    }

    @CrossOrigin(origins = "https://apidevportal.bi.go.id/")
    @PostMapping("/bi/openapi/balance-inquiry")
    public ResponseEntity<BalanceInquiryResponse> retrieveBalance(
            @Valid @RequestBody BalanceInquiryRequest balanceInquiryRequest) {

        System.out.println(balanceInquiryRequest.getAccountNo());
        Optional<Balance> balanceOptional = balanceRepository.findById(balanceInquiryRequest.getAccountNo());
        if(!balanceOptional.isPresent()){
            throw new UserNotFoundException("accountNo-" + balanceInquiryRequest.getAccountNo());
        }
        BalanceInquiryResponse balanceInquiryResponse = new BalanceInquiryResponse();
        balanceInquiryResponse.setResponseCode("200000");
        balanceInquiryResponse.setResponseMessage("Request has been processed Sucessfully");
        balanceInquiryResponse.setAccountNo(balanceInquiryRequest.getAccountNo());
        balanceInquiryResponse.setAccountType(balanceOptional.get().getAccountType());
        balanceInquiryResponse.setClientID(balanceInquiryRequest.getClientId());
        balanceInquiryResponse.setName(balanceOptional.get().getName());
        balanceInquiryResponse.setReqMsgId(balanceInquiryRequest.getReqMsgId());
        balanceInquiryResponse.setAmount(balanceOptional.get().getAmount());
        balanceInquiryResponse.setFloatAmount(balanceOptional.get().getFloatAmount());
        balanceInquiryResponse.setHoldAmounts(balanceOptional.get().getHoldAmounts());
        balanceInquiryResponse.setAvailableBalance(balanceOptional.get().getAvailableBalance());
        balanceInquiryResponse.setLedgerBalance(balanceOptional.get().getLedgerBalance());
        balanceInquiryResponse.setCurrentMultilateralLimit(balanceOptional.get().getCurrentMultilateralLimit());
        balanceInquiryResponse.setCurrency(balanceOptional.get().getCurrency());
        balanceInquiryResponse.setRegistrationStatusCode(balanceOptional.get().getRegistrationStatusCode());
        balanceInquiryResponse.setStatus(balanceOptional.get().getStatus());
        balanceInquiryResponse.setAdditionalInfo(balanceInquiryResponse.getAdditionalInfo());

        return new ResponseEntity<>(balanceInquiryResponse, HttpStatus.OK);
    }
}