package com.akshaybijawe.spring5webapp.repositories;

import com.akshaybijawe.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
