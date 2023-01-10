package com.interview.bootcamp.covid.application.port.in;

import com.interview.bootcamp.covid.domain.DailyReport;
import com.interview.bootcamp.covid.domain.Status;
import com.interview.bootcamp.covid.domain.dtos.DailyReportDTO;

public interface CovidUseCase {

    DailyReport[] getDailyReport();

    Status getStatus();

    DailyReportDTO getDailyReportByDate(String date);
}
