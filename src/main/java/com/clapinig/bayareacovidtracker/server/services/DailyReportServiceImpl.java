package com.clapinig.bayareacovidtracker.server.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clapinig.bayareacovidtracker.server.repositories.DailyReportRepository;
import com.clapinig.bayareacovidtracker.server.models.*;

@Service
public class DailyReportServiceImpl implements DailyReportService {
  @Autowired
  DailyReportRepository dailyReportRepository;

  // Return features required for Mapbox map
  public List<Feature> getFeatures() {
    List<DailyReport> dailyReportList = dailyReportRepository.getDailyReport();
    List<Feature> features = new ArrayList<>();

    for (DailyReport dr : dailyReportList) {
      County county = new County(dr.getFIPS(), dr.getAdmin2(), dr.getProvince_State(),
              dr.getCountry_Region(), dr.getLast_Update(), dr.getConfirmed(), dr.getDeaths());

      // properties and point represent the data needed to render clusters in Mapbox on client
      Properties properties = new Properties(county.getId(), county.getConfirmed());
      Point point = new Point(dr.getLong_(), dr.getLat());
      Feature feature = new Feature(county, properties, point);

      features.add(feature);
    }

    return features;
  }
}
