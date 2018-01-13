package com.robertnorthard.dtbs.server.common.dto;

import java.io.Serializable;

/**
 * Booking data transfer object to reduce data coupling on methods. Martin
 * Fowler discussion on data access objects.
 * http://martinfowler.com/eaaCatalog/dataTransferObject.html
 *
 * @author robertnorthard
 */
public class BookingDto implements Serializable {

    private long id;
    private LocationDto startLocation;
    private LocationDto endLocation;
    private int numberPassengers;

    /**
     * @return the startLocation
     */
    public LocationDto getStartLocation() {
        return startLocation;
    }

    /**
     * @param startLocation the startLocation to set
     */
    public void setStartLocation(LocationDto startLocation) {
        this.startLocation = startLocation;
    }

    /**
     * @return the endLocation
     */
    public LocationDto getEndLocation() {
        return endLocation;
    }

    /**
     * @param endLocation the endLocation to set
     */
    public void setEndLocation(LocationDto endLocation) {
        this.endLocation = endLocation;
    }
    
    /**
     * @return the numberPassengers
     */
    public int getNumberPassengers() {
        return numberPassengers;
    }

    /**
     * @param numberPassengers the numberPassengers to set
     */
    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
}