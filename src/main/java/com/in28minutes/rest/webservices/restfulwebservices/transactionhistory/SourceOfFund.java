package com.in28minutes.rest.webservices.restfulwebservices.transactionhistory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SourceOfFund {

    private String source;
    private HistoryAmount amount;
}
