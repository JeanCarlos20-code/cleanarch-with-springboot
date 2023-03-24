package com.arantes.cleanarch.dataprovider.repository;

import com.arantes.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
