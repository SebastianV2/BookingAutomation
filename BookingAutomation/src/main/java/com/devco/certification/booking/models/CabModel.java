package com.devco.certification.booking.models;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase modelo para recibir las datos de preferencia de busqueda de taxis enviados desde el feature.
 *
 */

public class CabModel {

    private String origin;
    private String dropOff;
    private String date;
    private String pickUpHour;
    private String pickUpMin;
    private String passengers;

    public CabModel(String origin, String dropOff, String date, String pickUpHour, String pickUpMin, String passengers) {
        this.origin = origin;
        this.dropOff = dropOff;
        this.date = date;
        this.pickUpHour = pickUpHour;
        this.pickUpMin = pickUpMin;
        this.passengers = passengers;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDropOff() {
        return dropOff;
    }

    public void setDropOff(String dropOff) {
        this.dropOff = dropOff;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPickUpHour() {
        return pickUpHour;
    }

    public void setPickUpHour(String pickUpHour) {
        this.pickUpHour = pickUpHour;
    }

    public String getPickUpMin() {
        return pickUpMin;
    }

    public void setPickUpMin(String pickUpMin) {
        this.pickUpMin = pickUpMin;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }
}
