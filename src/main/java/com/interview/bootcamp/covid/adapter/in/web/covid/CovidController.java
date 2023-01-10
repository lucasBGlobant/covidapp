package com.interview.bootcamp.covid.adapter.in.web.covid;

import com.interview.bootcamp.covid.application.port.in.CovidUseCase;
import com.interview.bootcamp.covid.domain.DailyReport;
import com.interview.bootcamp.covid.domain.Status;
import com.interview.bootcamp.covid.domain.dtos.DailyReportDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.interview.bootcamp.covid.common.utils.Constants.*;

@RestController
@RequestMapping("/covid")
@Slf4j
@Tag(name = "Covid controller", description = "Access to covid data")
public class CovidController {

    @Autowired
    private CovidUseCase covidUseCase;

    @Operation(summary = "Get a list of daily reports", description = "Get all information about covid daily reports")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "OK."),
                    @ApiResponse(responseCode = "404", description = "Not found.", content = @Content),
                    @ApiResponse(responseCode = "500", description = "Internal error.", content = @Content
                    )
            }
    )
    @GetMapping("/daily")
    public DailyReport[] getDailyReport(){

        log.info(String.format(CALLING_CLASS.concat(CALLING_METHOD),
                "CovidController", "getDailyReport()"));

        return covidUseCase.getDailyReport();

    }

    @Operation(summary = "Get a API status", description = "Get the actual status of the API")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "OK."),
                    @ApiResponse(responseCode = "404", description = "Not found.", content = @Content),
                    @ApiResponse(responseCode = "500", description = "Internal error.", content = @Content
                    )
            }
    )
    @GetMapping("/status")
    public Status getStatus() {

        log.info(String.format(CALLING_CLASS.concat(CALLING_METHOD),
                "CovidController", "getStatusReport()"));

        return covidUseCase.getStatus();
    }

    @GetMapping("/daily/{date}")
    public DailyReportDTO getDailyReportByDate(@PathVariable String date){

        log.info(String.format(CALLING_CLASS.concat(CALLING_METHOD),
                "CovidController", "getDailyReport()"));

        return covidUseCase.getDailyReportByDate(date);

    }
}
