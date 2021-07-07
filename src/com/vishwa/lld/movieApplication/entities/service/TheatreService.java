package com.vishwa.lld.movieApplication.entities.service;

import com.vishwa.lld.movieApplication.entities.Movies;
import com.vishwa.lld.movieApplication.entities.Theatre;
import com.vishwa.lld.movieApplication.entities.User;
import java.util.List;


public interface TheatreService {


  public List<Theatre> findTheaterByZipCode(int zipCode);

  public Theatre findTheaterByName(String name);

  public List<Movies> findMoviesInATheatre(String theaterName);

  public void addMoviesInATheater(String theatreName , long movieId , User user);

  public void removeMoviesInATheater(String theatreName , long movieId , User user);


}
