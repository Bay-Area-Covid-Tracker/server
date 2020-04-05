package com.clapinig.bayareacovidtracker.server.services;

import java.util.List;

import com.clapinig.bayareacovidtracker.server.models.Feature;

public interface DailyReportService {
    List<Feature> getFeatures();
}