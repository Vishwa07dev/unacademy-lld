package com.vishwa.lld.movieApplication.entities.service;

import com.vishwa.lld.movieApplication.entities.Movies;
import com.vishwa.lld.movieApplication.entities.User;


public interface MovieService {

  /**
   * allow user to search the movie
   */
  public Movies findMovieByName(String name);
  public Movies findMovieById(String id);

  /**
   Create a movie -- only admin should be allowed
   */
  public Movies createMovie(User user);

  public Movies updateMovie(User user);
}
