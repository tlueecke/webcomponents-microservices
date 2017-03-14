package com.capgemini.summit2017.wcms.bookservice.jpa;

import org.springframework.data.repository.CrudRepository;

public interface JpaBookRepository extends CrudRepository<Book, Integer> {


}
