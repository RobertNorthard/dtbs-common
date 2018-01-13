
package com.robertnorthard.dtbs.server.common.exceptions;

import java.util.List;

/**
 * Invalid booking exception.
 * @author robertnorthard
 */
public class InvalidBookingException extends Exception {
        
    private List<String> errors;
        
    public InvalidBookingException(String message){
        super(message);
    }
    
    public InvalidBookingException(List<String> errors){
        super("Booking validation failed.");
        this.errors = errors;
    }
    
    public List<String> getErrors(){
        return this.errors;
    }
}
