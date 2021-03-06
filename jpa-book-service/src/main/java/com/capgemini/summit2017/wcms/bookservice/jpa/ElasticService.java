package com.capgemini.summit2017.wcms.bookservice.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ElasticService {

    @Autowired
    private RestTemplate restTemplate;

    @Async
    public void publishBook(Book book) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Book> entity = new HttpEntity<>(book, headers);
        restTemplate.postForLocation("http://book-service-elastic/books", entity);
    }

	public void removeBook(Book book) {
		restTemplate.delete("http://book-service-elastic/books/" + book.getId());
	}

}