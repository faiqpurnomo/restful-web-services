package com.in28minutes.rest.webservices.restfulwebservices.restclient;



public class UserAccount {

    private String accountNo;
    private String clientId;
    private String reqMsgId;

    public UserAccount(String accountNo, String clientId, String reqMsgId) {
        this.accountNo = accountNo;
        this.clientId = clientId;
        this.reqMsgId = reqMsgId;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "accountNo='" + accountNo + '\'' +
                ", clientId='" + clientId + '\'' +
                ", reqMsgId='" + reqMsgId + '\'' +
                '}';
    }
}
