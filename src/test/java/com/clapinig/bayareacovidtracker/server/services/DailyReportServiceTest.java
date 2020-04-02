package com.clapinig.bayareacovidtracker.server.services;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.clapinig.bayareacovidtracker.server.repositories.DailyReportRepository;
import com.clapinig.bayareacovidtracker.server.models.County;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class DailyReportServiceTest {
    @Mock
    private DailyReportService dailyReportService = new DailyReportServiceImpl();

    HashMap<String, County> dummyReport = new HashMap<>();

    @BeforeEach
    void setMockOutput() {
        // Setup dummy data for test
        County dummyCounty = new County(5555, "Alameda", "California", "US", "2020-03-28 23:05:37", 37.6463, -121.893, 200, 4);
        dummyReport.put(dummyCounty.getCounty(), dummyCounty);

        when(dailyReportService.getDailyReport()).thenReturn(dummyReport);
    }

    @DisplayName("fetch daily reports")
    @Test
    void testGetDailyReport() {
        assertEquals(dummyReport, dailyReportService.getDailyReport());
    }
}
