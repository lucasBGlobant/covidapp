package com.interview.bootcamp.covid.common.utils;

import com.interview.bootcamp.covid.common.componets.RestClient;
import org.springframework.web.client.RestTemplate;

@RestClient
public class RestClientTemplate extends RestTemplate {

    public RestClientTemplate(){
        super();
    }

}
