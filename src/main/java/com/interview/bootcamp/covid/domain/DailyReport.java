package com.interview.bootcamp.covid.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DailyReport {
    public String date;
    public String states;
    public String positive;
    public String negative;
    public String pending;
    public String hospitalizedCurrently;
    public String hospitalizedCumulative;
    public String inIcuCurrently;
    public String inIcuCumulative;
    public String onVentilatorCurrently;
    public String onVentilatorCumulative;
    public String dateChecked;
    public String death;
    public String hospitalized;
    public String totalTestResults;
    public String lastModified;
    public String recovered;
    public String total;
    public String posNeg;
    public String deathIncrease;
    public String hospitalizedIncrease;
    public String negativeIncrease;
    public String positiveIncrease;
    public String totalTestResultsIncrease;
    public String hash;

}
