package com.clapinig.bayareacovidtracker.server.controllers;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @GetMapping(path="/api")
    public @ResponseBody HashMap<String, Object> index() {
        HashMap<String, Object> res = new HashMap<>();

        res.put("name", "Bay Area Covid-19 Tracker - Backend");
        res.put("description", "Backend for Bay Area Covid-19 Tracker. Submission for www.hackquarantine.com.");

        return res;
    }
}
