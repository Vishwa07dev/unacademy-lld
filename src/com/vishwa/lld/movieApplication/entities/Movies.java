package com.vishwa.lld.movieApplication.entities;

import java.time.LocalDateTime;


/**
 * This class represents the movie entity
 */
public class Movies {
  private long id ;
  private String name ;
  private String description;
  private double duration;
  private String releaseDate ; //"01-01-2021"
  private String cast ;
  private Language language ;

  public Movies(long id, String name, String description, double duration, String releaseDate, String cast,
      Language language) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.duration = duration;
    this.releaseDate = releaseDate;
    this.cast = cast;
    this.language = language;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getDuration() {
    return duration;
  }

  public void setDuration(double duration) {
    this.duration = duration;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getCast() {
    return cast;
  }

  public void setCast(String cast) {
    this.cast = cast;
  }

  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  @Override
  public String toString() {
    return "Movies{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + ", duration="
        + duration + ", releaseDate='" + releaseDate + '\'' + ", cast='" + cast + '\'' + ", language=" + language + '}';
  }
}
