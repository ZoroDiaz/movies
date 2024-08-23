package com.unir.elasticmovies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unir.elasticmovies.model.ElasticMovie;
import com.unir.elasticmovies.repository.ElasticMovieRepository;

@Service
public class ElasticMovieServiceImpl implements ElasticMovieService {

	private final ElasticMovieRepository repository;

	@Autowired
	public ElasticMovieServiceImpl(ElasticMovieRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<ElasticMovie> getSearchMovie(String title) {
		return repository.findByTitleContaining(title);
	}
	
}
