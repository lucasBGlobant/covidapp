package com.interview.bootcamp.covid.application.service;

import com.interview.bootcamp.covid.adapter.out.client.CovidAdapter;
import com.interview.bootcamp.covid.application.port.in.CovidUseCase;
import com.interview.bootcamp.covid.common.componets.UseCase;
import com.interview.bootcamp.covid.domain.DailyReport;
import org.springframework.beans.factory.annotation.Autowired;

@UseCase
public class CovidService implements CovidUseCase {

    @Autowired
    private CovidAdapter covidAdapter;
    @Override
    public DailyReport[] getDailyReport() {
        return covidAdapter.getDailyReport();
    }
}
