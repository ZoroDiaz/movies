package com.unir.elasticmovies.model.DTO;

import java.util.List;

import com.unir.elasticmovies.model.ElasticMovie;


public class ElasticMovieDTO {
	
	private int page;
	private List<ElasticMovie> results;
	private int total_pages;
	private int total_results;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public List<ElasticMovie> getResults() {
		return results;
	}
	
	public void setResults(List<ElasticMovie> results) {
		this.results = results;
	}
	
	public int getTotal_pages() {
		return total_pages;
	}
	
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	
	public int getTotal_results() {
		return total_results;
	}
	
	public void setTotal_results(int total_results) {
		this.total_results = total_results;
	}
}
