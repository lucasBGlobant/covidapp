package com.interview.bootcamp.covid.application.port.out;

import com.interview.bootcamp.covid.domain.DailyReport;

public interface CovidPort {

    public DailyReport[] getDailyReport();

}
