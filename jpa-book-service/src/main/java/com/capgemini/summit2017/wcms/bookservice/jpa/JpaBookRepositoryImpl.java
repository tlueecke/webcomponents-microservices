package com.capgemini.summit2017.wcms.bookservice.jpa;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JpaBookRepositoryImpl extends SimpleJpaRepository<Book, Integer> implements JpaBookRepository {

    @Autowired
    private ElasticService elasticService;

    public JpaBookRepositoryImpl(EntityManager em) {
        super(Book.class, em);
    }

    @Override
    public <S extends Book> S save(S book) {
        elasticService.publishBook(book);
        return super.save(book);
    }

    @Override
    public void delete(Book book) {
        elasticService.removeBook(book);
    	super.delete(book);
    }

}
