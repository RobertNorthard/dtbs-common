package com.robertnorthard.dtbs.server.common.exceptions;

/**
 * Booking not found exception.
 * 
 * @author robertnorthard
 */
public class BookingNotFoundException extends NonexistentEntityException{

    public BookingNotFoundException() {
        super("Booking not found.");
    }
}