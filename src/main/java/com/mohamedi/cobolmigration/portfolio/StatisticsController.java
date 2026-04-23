package com.mohamedi.cobolmigration.portfolio;

import com.mohamedi.cobolmigration.portfolio.dto.PortfolioStatisticsDto;
import com.mohamedi.cobolmigration.portfolio.service.StatisticsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// CM-76
@RestController
@RequestMapping("/api/statistics")
public class StatisticsController {

    private final StatisticsService statisticsService;

    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping("/portfolio")
    public ResponseEntity<PortfolioStatisticsDto> getPortfolioStatistics(
            @RequestParam(required = false) String product,
            @RequestParam(required = false) String fromDate,
            @RequestParam(required = false) String toDate) {
        // TODO CM-76: call service and return data
        return ResponseEntity.ok(new PortfolioStatisticsDto());
    }
}
