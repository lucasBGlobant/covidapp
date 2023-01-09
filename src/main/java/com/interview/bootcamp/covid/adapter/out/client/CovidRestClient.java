package com.interview.bootcamp.covid.adapter.out.client;

import com.interview.bootcamp.covid.domain.DailyReport;

public interface CovidRestClient {

    DailyReport[] getDailyReport();
}
