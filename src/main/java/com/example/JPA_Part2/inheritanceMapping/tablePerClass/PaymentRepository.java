package com.example.JPA_Part2.inheritanceMapping.tablePerClass;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment,Long> {

}
