package com.in28minutes.rest.webservices.restfulwebservices.restclient;

import com.in28minutes.rest.webservices.restfulwebservices.balance.BalanceInquiryRequest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RestClient {

    private static final String BALANCE_INQUIRY = "http://localhost:8080/bi/openapi/balance-inquiry";
    private static final String BALANCE_INQUIRY2 = "http://localhost:8080/bi/openapi/balance-inquiry2";

    static RestTemplate restTemplate = new RestTemplate();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter accountNo: ");
        String str = sc.nextLine();

        callBalanceInquiry(str);
    }

    private static void callBalanceInquiry(String accountNo) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Random rand = new Random();
        int clientIdGenerator = rand.nextInt(999999999);
        int reqMsgIdGenerator = rand.nextInt(999999999);

        BalanceInquiryRequest balanceInquiryRequest = new BalanceInquiryRequest();
        balanceInquiryRequest.setAccountNo(accountNo);
        balanceInquiryRequest.setClientId(String.valueOf(clientIdGenerator));
        balanceInquiryRequest.setReqMsgId(String.valueOf(reqMsgIdGenerator));

        //HttpEntity<String> request = new HttpEntity<String>(user.toString(), headers);
        String userAsJsonStr = restTemplate.postForObject(BALANCE_INQUIRY, balanceInquiryRequest, String.class);
        //JsonNode root = objectMapper.readTree(userAsJsonStr);

        System.out.println(userAsJsonStr);
    }

    private static void callBalanceInquiry2(){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        ResponseEntity<String> result = restTemplate.exchange(BALANCE_INQUIRY2, HttpMethod.POST, entity, String.class);
    }


}
