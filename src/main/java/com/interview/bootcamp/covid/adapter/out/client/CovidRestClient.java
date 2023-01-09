package com.interview.bootcamp.covid.adapter.out.client;

import com.interview.bootcamp.covid.domain.DailyReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import static com.interview.bootcamp.covid.common.utils.Constants.COVIDURL;


public class CovidRestClient {

    private RestTemplate restTemplate;

    public String sufix;

    public DailyReport getDailyReport(){
        return restTemplate.getForObject(COVIDURL.concat(sufix), DailyReport.class);
    }

}
