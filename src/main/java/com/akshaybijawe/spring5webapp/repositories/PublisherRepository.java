package com.akshaybijawe.spring5webapp.repositories;

import com.akshaybijawe.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
