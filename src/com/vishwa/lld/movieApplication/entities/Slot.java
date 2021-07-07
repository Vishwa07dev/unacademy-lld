package com.vishwa.lld.movieApplication.entities;

import java.util.HashMap;

public class Slot {

  private Movies movies ;
  private String startTime ;
  private String endTime;

  public Slot(Movies movies, String startTime, String endTime) {
    this.movies = movies;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public Movies getMovies() {
    return movies;
  }

  public void setMovies(Movies movies) {
    this.movies = movies;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }
}
