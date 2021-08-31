package com.in28minutes.rest.webservices.restfulwebservices.customertopup.topupinquiry;

import com.in28minutes.rest.webservices.restfulwebservices.customertopup.customeramount.CustomerAmount;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.customeramount.FeeAmount;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.customeramount.MaxAmount;
import com.in28minutes.rest.webservices.restfulwebservices.customertopup.customeramount.MinAmount;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private String sessionId;
    private String partnerTxId;

    @Id
    private String customerNumber;

    private String customerName;
    private int customerMonthlyLimit;

    @OneToOne(mappedBy="customer")
    @JsonIgnore
    private MinAmount minAmount;

    @OneToOne(mappedBy="customer")
    @JsonIgnore
    private MaxAmount maxAmount;

    @OneToOne(mappedBy="customer")
    @JsonIgnore
    private CustomerAmount amount;

    @OneToOne(mappedBy="customer")
    @JsonIgnore
    private FeeAmount feeAmount;
    private String feeType;
}
