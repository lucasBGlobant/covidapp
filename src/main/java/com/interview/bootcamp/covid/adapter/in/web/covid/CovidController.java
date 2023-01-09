package com.interview.bootcamp.covid.adapter.in.web.covid;

import com.interview.bootcamp.covid.application.port.in.CovidUseCase;
import com.interview.bootcamp.covid.domain.DailyReport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.interview.bootcamp.covid.common.utils.Constants.*;

@RestController
@RequestMapping("/covid")
@Slf4j
public class CovidController {

    @Autowired
    private CovidUseCase covidUseCase;

    @GetMapping
    public DailyReport[] getDailyReport(){

        log.info(String.format(CALLING_CLASS.concat(CALLING_METHOD),
                "CovidController", "getDailyReport()"));

        return covidUseCase.getDailyReport();

    }
}
