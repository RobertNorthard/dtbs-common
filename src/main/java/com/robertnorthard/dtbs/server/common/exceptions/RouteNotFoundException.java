package com.robertnorthard.dtbs.server.common.exceptions;

/**
 * Route not found exception.
 * @author robertnorthard
 */
public class RouteNotFoundException extends Exception {
     public RouteNotFoundException(){
        super("Route not found");
    }
}
