package com.in28minutes.rest.webservices.restfulwebservices.customertopup.topuptransaction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopUpTransactionRepository extends JpaRepository<CustomerTransaction, String> {
}
