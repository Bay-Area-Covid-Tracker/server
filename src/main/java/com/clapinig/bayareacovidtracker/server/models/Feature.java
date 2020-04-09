package com.clapinig.bayareacovidtracker.server.models;

/*
Report class is meant to reflect the data structure needed to display data on ReactMapGL component on the client side
Example JSON repsonse made from this model:
{
    "type": "Feature",
    "county": {
      id: 0,
      county: ...,
      state: ...,
      country: ...
      lastUpdate: ...
      confirmed: ...
      deaths: ...
    }
    "properties": {
        "id": 0,
        "point_count": 50, // represents
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
public class Feature {
  private String type;
  private County county;
  private Properties properties;
  private Point geometry;

  public Feature() {}

  public Feature(County county, Properties properties, Point geometry) {
    this.type = "Feature";
    this.county = county;
    this.properties = properties;
    this.geometry = geometry;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public County getCounty() {
    return county;
  }

  public void setCounty(County county) {
    this.county = county;
  }

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }

  public Point getGeometry() {
    return geometry;
  }

  public void setGeometry(Point geometry) {
    this.geometry = geometry;
  }
}
