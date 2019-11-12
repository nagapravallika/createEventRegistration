package com.df.organiser.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.df.organiser.model.Management;

public interface ManagementRepository extends MongoRepository<Management, String>{

	Management findByeventTitle(String eventTitle);

}
