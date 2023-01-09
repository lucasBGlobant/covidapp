package com.interview.bootcamp.covid.application.port.in;

import com.interview.bootcamp.covid.common.componets.UseCase;
import com.interview.bootcamp.covid.domain.DailyReport;

@UseCase
public interface CovidUseCase {

    DailyReport[] getDailyReport();
}
