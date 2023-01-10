package com.interview.bootcamp.covid.adapter.out.client;

import com.interview.bootcamp.covid.domain.DailyReport;
import com.interview.bootcamp.covid.domain.Status;
import com.interview.bootcamp.covid.domain.dtos.DailyReportDTO;

public interface CovidRestClient {

    DailyReport[] getDailyReport();

    Status getStatus();

}
