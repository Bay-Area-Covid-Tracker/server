package com.clapinig.bayareacovidtracker.server.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clapinig.bayareacovidtracker.server.services.DailyReportService;

@RestController
@RequestMapping(path="/api")
public class DailyReportController {
    @Autowired
    private DailyReportService dailyReportService;

    @GetMapping(path="/daily-reports")
    public @ResponseBody HashMap<String, Object> getAll() {
        HashMap<String, Object> res = new HashMap<>();

        try {
            res.put("success", true);
            res.put("dailyReport", dailyReportService.getDailyReport());
        } catch (Exception e) {
            res.put("success", false);
            res.put("err", e.getMessage());
        }

        return res;
    }
}
