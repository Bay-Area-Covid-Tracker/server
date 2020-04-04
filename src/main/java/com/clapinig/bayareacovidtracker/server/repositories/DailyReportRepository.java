package com.clapinig.bayareacovidtracker.server.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clapinig.bayareacovidtracker.server.models.DailyReport;

@Repository
public interface DailyReportRepository extends CrudRepository<DailyReport, Integer> {
    @Query(value = "select * from daily_reports " +
            "where Province_State=\"California\"" +
            " AND Admin2=\"Alameda\"" +
            " OR Admin2=\"Contra Costa\" OR Admin2=\"San Mateo\" OR Admin2=\"Santa Clara\"" +
            " OR Admin2=\"San Francisco\" OR Admin2=\"Marin\" OR Admin2=\"Solano\" OR Admin2=\"Napa\"" +
            " OR Admin2=\"Sonoma\"",
            nativeQuery = true
    )
    List<DailyReport> getDailyReport();
}
