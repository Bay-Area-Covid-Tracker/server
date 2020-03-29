package com.clapinig.bayareacovidtracker.server.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clapinig.bayareacovidtracker.server.repositories.DailyReportRepository;

@Service
public class DailyReportServiceImpl implements DailyReportService {
    @Autowired
    DailyReportRepository dailyReportRepository;

    @Override
    public HashMap<String, Object> getDailyReport() {
        return dailyReportRepository.getDailyReport();
    }
}
