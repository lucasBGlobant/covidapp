package com.interview.bootcamp.covid.adapter.out.client;

import com.interview.bootcamp.covid.common.componets.RestClient;
import com.interview.bootcamp.covid.domain.DailyReport;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static com.interview.bootcamp.covid.common.utils.Constants.COVIDURL;

@RestClient
public class CovidRestClientImp implements CovidRestClient{

    private RestTemplate restTemplate = new RestTemplate();

    @Value("${daily.report.json}")
    public String sufix;

    public DailyReport[] getDailyReport(){

        return restTemplate.getForObject(COVIDURL.concat(sufix), DailyReport[].class);

    }

}
