package com.clapinig.bayareacovidtracker.server.repositories;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class DailyReportRepositoryImpl implements DailyReportRepository {
    @Override
    public HashMap<String, Object> getDailyReport() {
        HashMap<String, Object> dailyReport = new HashMap<>();
        return dailyReport;
    }
}
