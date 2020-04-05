package com.clapinig.bayareacovidtracker.server.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.clapinig.bayareacovidtracker.server.models.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class DailyFeatureServiceTest {
    @Mock
    private DailyReportService dailyReportService = new DailyReportServiceImpl();

    // Initialize dummy report
    List<Feature> dummyFeatures = new ArrayList<>();

    @BeforeEach
    void setMockOutput() {
        // Setup dummy data for test
        County dummyCounty = new County(5555, "Alameda", "California", "US", "2020-03-28 23:05:37", 200, 4);
        Point dummyPoint = new Point(new ArrayList<Double>() {
            {
                add(-121.697);
                add(37.231);
            }
        });
        Feature dummyFeature = new Feature(dummyCounty, dummyPoint);
        dummyFeatures.add(dummyFeature);

        when(dailyReportService.getFeatures()).thenReturn(dummyFeatures);
    }

    @DisplayName("fetch daily reports with getDailyReport")
    @Test
    void testGetDailyReport() {
        assertEquals(dummyFeatures, dailyReportService.getFeatures());
    }
}
