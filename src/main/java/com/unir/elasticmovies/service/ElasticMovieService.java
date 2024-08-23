package com.unir.elasticmovies.service;

import java.util.List;

import com.unir.elasticmovies.model.ElasticMovie;

public interface ElasticMovieService {
	List<ElasticMovie> getSearchMovie(String title);
}
