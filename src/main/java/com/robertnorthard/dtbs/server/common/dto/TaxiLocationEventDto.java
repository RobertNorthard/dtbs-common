package com.robertnorthard.dtbs.server.common.dto;

import java.util.Objects;

/**
 * Taxi Location Event data transfer object.
 * 
 * @author robertnorthard
 */
public class TaxiLocationEventDto {
    private long taxiId;
    private String state;
    private long timestamp;
    private LocationDto location;

    public TaxiLocationEventDto(){
        // Needed by Jackason JSON ORM.
    }
    
    public TaxiLocationEventDto(long taxiId, String state, LocationDto location, long timestamp) {
        this.taxiId = taxiId;
        this.state = state;
        this.timestamp = timestamp;
        this.location = location;
    }
 
    /**
     * @return the taxiId
     */
    public long getTaxiId() {
        return taxiId;
    }

    /**
     * @param taxiId the taxiId to set
     */
    public void setTaxiId(long taxiId) {
        this.taxiId = taxiId;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the currentLocation
     */
    public LocationDto getLocation() {
        return location;
    }

    /**
     * @param currentLocation the currentLocation to set
     */
    public void setLocation(LocationDto currentLocation) {
        this.location = currentLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (this.taxiId ^ (this.taxiId >>> 32));
        hash = 41 * hash + Objects.hashCode(this.state);
        hash = 41 * hash + (int) (this.timestamp ^ (this.timestamp >>> 32));
        hash = 41 * hash + Objects.hashCode(this.location);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TaxiLocationEventDto other = (TaxiLocationEventDto) obj;
        if (this.taxiId != other.taxiId) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (this.timestamp != other.timestamp) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }
}
