package com.example.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entities.Shops;

public interface ShopsRepository extends MongoRepository<Shops, String> {

}
