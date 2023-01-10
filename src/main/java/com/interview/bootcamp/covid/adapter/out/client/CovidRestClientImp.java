package com.interview.bootcamp.covid.adapter.out.client;

import com.interview.bootcamp.covid.common.componets.RestClient;
import com.interview.bootcamp.covid.common.utils.RestClientTemplate;
import com.interview.bootcamp.covid.domain.DailyReport;
import com.interview.bootcamp.covid.domain.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import static com.interview.bootcamp.covid.common.utils.Constants.COVIDURL;

@RestClient
public class CovidRestClientImp implements CovidRestClient{

    @Autowired
    private RestClientTemplate restClientTemplate;

    @Value("${daily.report.json}")
    private String daily;

    @Value("${status.report.json}")
    private String status;

    public DailyReport[] getDailyReport(){

        return restClientTemplate.getForObject(COVIDURL.concat(daily), DailyReport[].class);

    }

    public Status getStatus(){
        return restClientTemplate.getForObject(COVIDURL.concat(status), Status.class);
    }


}
