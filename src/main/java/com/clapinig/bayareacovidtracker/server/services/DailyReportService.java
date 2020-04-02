package com.clapinig.bayareacovidtracker.server.services;

import java.util.HashMap;

import com.clapinig.bayareacovidtracker.server.models.County;

public interface DailyReportService {
    HashMap<String, County> getDailyReport();
}