package com.interview.bootcamp.covid.domain;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Status {

    private Date buildTime;

    private Boolean production;

    private String runNumber;
}
