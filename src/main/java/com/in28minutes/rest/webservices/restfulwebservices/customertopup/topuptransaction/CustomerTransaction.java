package com.in28minutes.rest.webservices.restfulwebservices.customertopup.topuptransaction;

import com.in28minutes.rest.webservices.restfulwebservices.customertopup.customeramount.CustomerAmount;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerTransaction {

    private String sessionId;
    private String partnerTrxId;

    @Id
    private String customerNumber;
    private String referenceNumber;

    @OneToOne(mappedBy="customer")
    @JsonIgnore
    private CustomerAmount amount;
}
