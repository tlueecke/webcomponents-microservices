package com.capgemini.summit2017.wcms.bookservice.elastic;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticBookRepository extends ElasticsearchRepository<Book, Long> {

}
