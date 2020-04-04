package com.clapinig.bayareacovidtracker.server.models;

// Purpose: Create properties needed for the "properties" property in the Report model
// Needs to reflect data structure required by ReactMapGL component on client
public class County {
    private Integer id;
    private String county;
    private String state;
    private String country;
    private String lastUpdate;
    private Integer confirmed;
    private Integer deaths;

    public County() {}

    public County(Integer id, String county, String state, String country, String lastUpdate, Integer confirmed, Integer deaths) {
        this.id = id;
        this.county = county;
        this.state = state;
        this.country = country;
        this.lastUpdate = lastUpdate;
        this.confirmed = confirmed;
        this.deaths = deaths;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }
}
