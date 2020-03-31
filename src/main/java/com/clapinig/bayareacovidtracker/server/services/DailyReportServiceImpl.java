package com.clapinig.bayareacovidtracker.server.services;

import java.util.List;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clapinig.bayareacovidtracker.server.repositories.DailyReportRepository;
import com.clapinig.bayareacovidtracker.server.models.*;

@Service
public class DailyReportServiceImpl implements DailyReportService {
    @Autowired
    DailyReportRepository dailyReportRepository;

    public HashMap<String, County> getDailyReport() {
        List<DailyReport> dailyReportList = dailyReportRepository.getDailyReport();
        HashMap<String, County> dailyReports = new HashMap<>();

        for (DailyReport report : dailyReportList) {
            County county = new County(report.getFIPS(), report.getAdmin2(), report.getProvince_State(),
                    report.getCountry_Region(), report.getLast_Update(), report.getLat(), report.getLong_(),
                    report.getConfirmed(), report.getDeaths());

            dailyReports.put(county.getCounty(), county);
        }

        return dailyReports;
    }
}
