package com.mohamedi.cobolmigration.portfolio.service;

import com.mohamedi.cobolmigration.portfolio.dto.PortfolioStatisticsDto;

// CM-76
public interface StatisticsService {
    PortfolioStatisticsDto getPortfolioStatistics(String product, String fromDate, String toDate);
}
