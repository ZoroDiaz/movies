package com.unir.elasticmovies.model;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(indexName = "movies", createIndex = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ElasticMovie {

	@org.springframework.data.annotation.Id
	@Field(type = FieldType.Integer,name = "id")
	private int Id;

	//@MultiField(mainField = @Field(type = FieldType.Keyword,name = "title"),
		//	otherFields = {
		  //          @InnerField(suffix = "suffix1", type = FieldType.Text),
		    //        @InnerField(suffix = "suffix2", type = FieldType.Search_As_You_Type)
		      //  })
	@Field(type = FieldType.Keyword,name = "title")
	private String title;
	
	@Field(type = FieldType.Text, name = "backdrop_path")
	private String BackdropPath;

	@Field(type = FieldType.Text, name = "original_language")
	private String OriginalLanguage;

	@Field(type = FieldType.Text,name = "original_title")
	private String OriginalTitle;

	@Field(type = FieldType.Text,name = "overview")
	private String overview;

	@Field(type = FieldType.Double,name = "popularity")
	private double Popularity;

	@Field(type = FieldType.Text,name = "poster_path")
	private String PosterPath;

	@Field(type = FieldType.Text,name = "genre_ids")
	private int[] Genre_ids;
	
	@Field(type = FieldType.Text,name = "release_date")
	private String ReleaseDate;

	@Field(type = FieldType.Boolean,name = "video")
	private Boolean Video;

	@Field(type = FieldType.Double,name = "vote_average")
	private double VoteAverage;

	@Field(type = FieldType.Integer,name = "vote_count")
	private int vote_count;

	@Field(type = FieldType.Boolean,name = "adult")
	private Boolean Adult;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBackdropPath() {
		return BackdropPath;
	}

	public void setBackdropPath(String backdropPath) {
		BackdropPath = backdropPath;
	}

	public String getOriginalLanguage() {
		return OriginalLanguage;
	}

	public void setOriginalLanguage(String originalLanguage) {
		OriginalLanguage = originalLanguage;
	}

	public String getOriginalTitle() {
		return OriginalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		OriginalTitle = originalTitle;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public double getPopularity() {
		return Popularity;
	}

	public void setPopularity(double popularity) {
		Popularity = popularity;
	}

	public String getPosterPath() {
		return PosterPath;
	}

	public void setPosterPath(String posterPath) {
		PosterPath = posterPath;
	}

	public String getReleaseDate() {
		return ReleaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		ReleaseDate = releaseDate;
	}

	public Boolean getVideo() {
		return Video;
	}

	public void setVideo(Boolean video) {
		Video = video;
	}

	public double getVoteAverage() {
		return VoteAverage;
	}

	public void setVoteAverage(double voteAverage) {
		VoteAverage = voteAverage;
	}

	public int getVote_count() {
		return vote_count;
	}

	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}

	public Boolean getAdult() {
		return Adult;
	}

	public void setAdult(Boolean adult) {
		Adult = adult;
	}


	public int[] getGenre_ids() {
		return Genre_ids;
	}

	public void setGenre_ids(int[] genre_ids) {
		Genre_ids = genre_ids;
	}
	
}
