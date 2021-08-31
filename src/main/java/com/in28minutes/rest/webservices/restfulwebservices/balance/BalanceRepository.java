package com.in28minutes.rest.webservices.restfulwebservices.balance;

import com.in28minutes.rest.webservices.restfulwebservices.balance.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository extends JpaRepository<Balance, String> {

}
