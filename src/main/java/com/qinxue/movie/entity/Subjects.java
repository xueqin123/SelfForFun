package com.qinxue.movie.entity;

import java.util.List;

public class Subjects {

    private Rating rating;
    private List<String> genres;
    private String title;
    private List<Casts> casts;
    private int collect_count;
    private String original_title;
    private String subtype;
    private List<Directors> directors;
    private String year;
    private Images images;
    private String alt;
    private String id;

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Rating getRating() {
        return rating;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCasts(List<Casts> casts) {
        this.casts = casts;
    }

    public List<Casts> getCasts() {
        return casts;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setDirectors(List<Directors> directors) {
        this.directors = directors;
    }

    public List<Directors> getDirectors() {
        return directors;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Images getImages() {
        return images;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getAlt() {
        return alt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}