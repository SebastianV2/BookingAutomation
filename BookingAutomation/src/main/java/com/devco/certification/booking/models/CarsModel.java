package com.devco.certification.booking.models;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase modelo para recibir las datos de preferencia de busqueda de carros enviados desde el feature.
 *
 */

public class CarsModel {

    private String loc;

    public CarsModel(String loc) {
        this.loc = loc;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
