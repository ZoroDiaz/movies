package com.unir.elasticmovies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unir.elasticmovies.model.ElasticMovie;
import com.unir.elasticmovies.model.DTO.ElasticMovieDTO;
import com.unir.elasticmovies.service.ElasticMovieService;

@RestController
@RequestMapping("/movie")
public class ElasticsearchController {
	private final ElasticMovieService movieService;

	@Autowired
	public ElasticsearchController(ElasticMovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping("search")
	public ResponseEntity<ElasticMovieDTO> getSearchMovie(@RequestParam String title) {
		
		List<ElasticMovie> movies = movieService.getSearchMovie(title);
		
		if(!movies.isEmpty()) {
			ElasticMovieDTO response =  new ElasticMovieDTO();
			
			int pages = movies.size() / 20;
			
			response.setPage(1);
			response.setResults(movies);
			response.setTotal_pages(pages == 0 ? 1 : pages);
			response.setTotal_results(movies.size());
			return ResponseEntity.ok(response);
		}
			
		return ResponseEntity.notFound().build();
	}

}
