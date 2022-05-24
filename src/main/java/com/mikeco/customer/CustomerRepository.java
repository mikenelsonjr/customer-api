package com.mikeco.customer;

import org.springframework.data.repository.Repository;

interface CustomerRepository extends Repository<Customer, Long> {
    
}
