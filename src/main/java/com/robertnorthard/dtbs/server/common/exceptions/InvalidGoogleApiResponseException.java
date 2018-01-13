package com.robertnorthard.dtbs.server.common.exceptions;

/**
 * Invalid location exception.
 * @author robertnorthard
 */
public class InvalidGoogleApiResponseException extends Exception {
    public InvalidGoogleApiResponseException(){
        super("Invalid Google API response. The API may have changed.");
    }
}
