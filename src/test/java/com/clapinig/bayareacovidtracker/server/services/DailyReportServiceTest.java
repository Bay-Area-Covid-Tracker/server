package com.clapinig.bayareacovidtracker.server.services;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.clapinig.bayareacovidtracker.server.repositories.DailyReportRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class DailyReportServiceTest {
    @Mock
    private DailyReportRepository dailyReportRepository;

    @InjectMocks
    private DailyReportService dailyReportService = new DailyReportServiceImpl();

    HashMap<String, Object> dummyReport = new HashMap<>();

    @BeforeEach
    void setMockOutput() {
        // Setup dummy data for test
        HashMap<String, Object> dummyCounty = new HashMap<>();

        dummyCounty.put("id", 5555);
        dummyCounty.put("county", "Alameda");
        dummyCounty.put("state", "California");
        dummyCounty.put("country", "US");
        dummyCounty.put("lastUpdate", "2020-03-28 23:05:37");
        dummyCounty.put("lat", 37.6463);
        dummyCounty.put("lon", -121.893);
        dummyCounty.put("confirmed", 200);
        dummyCounty.put("deaths", 4);
        dummyReport.put(dummyCounty.get("county").toString(), dummyCounty);

        when(dailyReportRepository.getDailyReport()).thenReturn(dummyReport);
    }

    @DisplayName("getDailyReport should fetch daily report")
    @Test
    void testGetDailyReport() {
        assertEquals(dummyReport, dailyReportService.getDailyReport());
    }
}
