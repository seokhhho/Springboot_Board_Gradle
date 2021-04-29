package com.ssafy.test.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ssafy.test.Customer;

public interface BoardRepository extends MongoRepository<Customer, String> {

}
