package com.robertnorthard.dtbs.server.common.exceptions;

/**
 * Thrown when illegal booking state.
 * 
 * @author robertnorthard
 */
public class IllegalBookingStateException extends Exception{
    public IllegalBookingStateException(String message){
        super(message);
    }
}
