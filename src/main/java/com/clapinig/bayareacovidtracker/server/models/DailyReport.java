package com.clapinig.bayareacovidtracker.server.models;

import javax.persistence.Entity;
import javax.persistence.Id;

// Strucutre the data returned by the MySQL query
@Entity
public class DailyReport {
    @Id
    private Integer FIPS;
    private String Admin2;
    private String Province_State;
    private String Country_Region;
    private String Last_Update;
    private Double Lat;
    private Double Long_;
    private Integer Confirmed;
    private Integer Deaths;
    private Integer Recovered;
    private Integer Active;
    private String Combined_Key;

    public DailyReport () {}

    public Integer getFIPS() {
        return FIPS;
    }

    public void setFIPS(Integer FIPS) {
        this.FIPS = FIPS;
    }

    public String getAdmin2() {
        return Admin2;
    }

    public void setAdmin2(String admin2) {
        Admin2 = admin2;
    }

    public String getProvince_State() {
        return Province_State;
    }

    public void setProvince_State(String province_State) {
        Province_State = province_State;
    }

    public String getCountry_Region() {
        return Country_Region;
    }

    public void setCountry_Region(String country_Region) {
        Country_Region = country_Region;
    }

    public String getLast_Update() {
        return Last_Update;
    }

    public void setLast_Update(String last_Update) {
        Last_Update = last_Update;
    }

    public Double getLat() {
        return Lat;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public Double getLong_() {
        return Long_;
    }

    public void setLong_(Double long_) {
        Long_ = long_;
    }

    public Integer getConfirmed() {
        return Confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        Confirmed = confirmed;
    }

    public Integer getDeaths() {
        return Deaths;
    }

    public void setDeaths(Integer deaths) {
        Deaths = deaths;
    }

    public Integer getRecovered() {
        return Recovered;
    }

    public void setRecovered(Integer recovered) {
        Recovered = recovered;
    }

    public Integer getActive() {
        return Active;
    }

    public void setActive(Integer active) {
        Active = active;
    }

    public String getCombined_Key() {
        return Combined_Key;
    }

    public void setCombined_Key(String combined_Key) {
        Combined_Key = combined_Key;
    }
}
