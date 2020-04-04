package com.clapinig.bayareacovidtracker.server.models;

import java.util.List;

// Purpose: Create properties needed for the "geometry" property in the Report model
// Needs to reflect data structure required by ReactMapGL component on client
public class Point {
    private String type;
    private List<Double> coordinates;

    public Point() {}

    public Point(List<Double> coordinates) {
        this.type = "Point";
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }
}
