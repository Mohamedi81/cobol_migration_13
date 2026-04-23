package com.mohamedi.cobolmigration.portfolio.service.impl;

import com.mohamedi.cobolmigration.portfolio.dto.PortfolioStatisticsDto;
import com.mohamedi.cobolmigration.portfolio.service.StatisticsService;
import org.springframework.stereotype.Service;

// TODO CM-76: Implement equivalent to lgastat1.cbl
@Service
public class StatisticsServiceImpl implements StatisticsService {
    @Override
    public PortfolioStatisticsDto getPortfolioStatistics(String product, String fromDate, String toDate) {
        // stub
        return new PortfolioStatisticsDto();
    }
}
