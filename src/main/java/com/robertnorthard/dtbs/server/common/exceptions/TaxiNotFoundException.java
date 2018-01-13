package com.robertnorthard.dtbs.server.common.exceptions;

/**
 * Taxi not found exception.
 * 
 * @author robertnorthard
 */
public class TaxiNotFoundException extends NonexistentEntityException{

    public TaxiNotFoundException() {
        super("Taxi not found.");
    }
}