package com.vishwa.lld.movieApplication.entities.service;

import com.vishwa.lld.movieApplication.entities.User;


public interface BookingService {
  public long createBooking(long userId , long movieId , long theatreId , long slotId);
}
