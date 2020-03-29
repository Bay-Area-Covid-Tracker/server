package com.clapinig.bayareacovidtracker.server.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clapinig.bayareacovidtracker.server.models.DailyReport;
import com.clapinig.bayareacovidtracker.server.repositories.DailyReportRepository;

@RestController
@RequestMapping(path="/api/daily-reports")
public class DailyReportController {
    //@Autowired
    //private DailyReportRepository dailyReportRepository;

    @GetMapping(path="/all")
    public @ResponseBody HashMap<String, Object> getAll() {
        HashMap<String, Object> res = new HashMap<>();
        return res;
    }
}
