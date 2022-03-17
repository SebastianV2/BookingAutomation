package com.devco.certification.booking.models;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase modelo para recibir las datos de preferencia de atracciones enviados desde el feature.
 *
 */

public class AttractionsModel {

    private String place;
    private String category;

    public AttractionsModel(String place, String category) {
        this.place = place;
        this.category = category;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
