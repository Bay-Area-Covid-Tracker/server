package com.clapinig.bayareacovidtracker.server.models;

import java.util.List;
import java.util.ArrayList;

// Purpose: Create properties needed for the "geometry" property in the Report model
// Needs to reflect data structure required by ReactMapGL component on client
/*
Example JSON response
{
  ...
  "geometry": {
    type: "Point",
    coordinates: [ ... ]
  }
}
*/
public class Point {
  private String type;
  private List<Double> coordinates;

  public Point() {}

  public Point(Double lon, Double lat) {
    this.type = "Point";
    this.coordinates = new ArrayList<Double>() {
      {
        add(lon);
        add(lat);
      }
    };
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
