package com.interview.bootcamp.covid.application;

import com.interview.bootcamp.covid.adapter.out.client.CovidRestClient;
import com.interview.bootcamp.covid.application.port.in.CovidUseCase;
import com.interview.bootcamp.covid.common.utils.mappers.DailyReportMapper;
import com.interview.bootcamp.covid.domain.DailyReport;
import com.interview.bootcamp.covid.domain.Status;
import com.interview.bootcamp.covid.domain.dtos.DailyReportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

import static java.util.stream.Collectors.*;

@Service
public class CovidService implements CovidUseCase {

    @Autowired
    private CovidRestClient covidRestClient;

    @Override
    public DailyReport[] getDailyReport() {
        return covidRestClient.getDailyReport();
    }

    @Override
    public Status getStatus(){
        return covidRestClient.getStatus();
    }

    @Override
    public DailyReportDTO getDailyReportByDate(String date) {

        DailyReport[] allDailyReports = covidRestClient.getDailyReport();

        Optional<DailyReport> dailyReport = Arrays.stream(allDailyReports).filter(dr -> dr.date.equals(date)).findFirst();

        if(dailyReport.isPresent()){
            return DailyReportMapper.INSTANCE.dailyReportToDailyReportDTO(dailyReport.get());
        }

        return null;

    }
}
