package com.in28minutes.rest.webservices.restfulwebservices.transactionhistory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionHistoryListRequest {

    private String reqMsgId;
    private Date fromDateTime;
    private Date toDateTime;
    private int pageSize;
    private int pageNumber;
}
