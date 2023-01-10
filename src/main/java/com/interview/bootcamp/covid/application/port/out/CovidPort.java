package com.interview.bootcamp.covid.application.port.out;

import com.interview.bootcamp.covid.domain.DailyReport;
import com.interview.bootcamp.covid.domain.Status;

public interface CovidPort {

    DailyReport[] getDailyReport();

    Status getStatus();

}
