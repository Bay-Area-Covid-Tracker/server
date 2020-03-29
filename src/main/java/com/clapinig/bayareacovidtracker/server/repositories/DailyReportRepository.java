package com.clapinig.bayareacovidtracker.server.repositories;

import java.util.HashMap;

public interface DailyReportRepository {
    HashMap<String, Object> getDailyReport();
}
