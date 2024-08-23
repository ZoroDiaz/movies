package com.unir.elasticmovies.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.unir.elasticmovies.model.ElasticMovie;

@Repository
public interface ElasticMovieRepository extends ElasticsearchRepository<ElasticMovie, String> {
	List<ElasticMovie> findByTitleContaining(String title);
}
