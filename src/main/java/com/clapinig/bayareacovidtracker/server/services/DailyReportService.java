package com.clapinig.bayareacovidtracker.server.services;

import java.util.List;

import com.clapinig.bayareacovidtracker.server.models.Report;

public interface DailyReportService {
    List<Report> getDailyReport();
}