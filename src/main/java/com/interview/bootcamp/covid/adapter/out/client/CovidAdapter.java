package com.interview.bootcamp.covid.adapter.out.client;

import com.interview.bootcamp.covid.application.port.out.CovidPort;
import com.interview.bootcamp.covid.common.componets.Adapter;
import com.interview.bootcamp.covid.domain.DailyReport;
import com.interview.bootcamp.covid.domain.Status;
import com.interview.bootcamp.covid.domain.dtos.DailyReportDTO;
import org.springframework.beans.factory.annotation.Autowired;

@Adapter
public class CovidAdapter implements CovidPort {

    @Autowired
    private CovidRestClient covidRestClient;

    public DailyReport[] getDailyReport() {
        return covidRestClient.getDailyReport();
    }

    public Status getStatus() { return covidRestClient.getStatus(); }

}
