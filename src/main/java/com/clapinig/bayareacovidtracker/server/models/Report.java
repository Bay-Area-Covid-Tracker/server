package com.clapinig.bayareacovidtracker.server.models;

/*
Report class is meant to reflect the data structure needed to display data on ReactMapGL component on the client side
Example JSON repsonse made from this model:
{
    "type": "Feature",
    "properties": {
        "id": 0,
        "county": "Example County",
        "state": "California",
        "country": "US",
        "confirmed": 50,
        "deaths": 0
    },
    "geometry": {
        "type": "Point",
        "coordinates": [
            -122.333,
            37.445
        ]
    }
}
 */
public class Report {
    private String type;
    private County properties;
    private Point geometry;

    public Report() {}

    public Report(County properties, Point geometry) {
        this.type = "Feature";
        this.properties = properties;
        this.geometry = geometry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public County getProperties() {
        return properties;
    }

    public void setProperties(County properties) {
        this.properties = properties;
    }

    public Point getGeometry() {
        return geometry;
    }

    public void setGeometry(Point geometry) {
        this.geometry = geometry;
    }
}
