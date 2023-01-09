package com.interview.bootcamp.covid.application.service;

import com.interview.bootcamp.covid.adapter.out.client.CovidRestClient;
import com.interview.bootcamp.covid.application.port.in.CovidUseCase;
import com.interview.bootcamp.covid.domain.DailyReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CovidService implements CovidUseCase {

    @Autowired
    private CovidRestClient covidRestClient;

    @Override
    public DailyReport[] getDailyReport() {
        return covidRestClient.getDailyReport();
    }
}
