package com.interview.bootcamp.covid.common.utils.mappers;

import com.interview.bootcamp.covid.domain.DailyReport;
import com.interview.bootcamp.covid.domain.dtos.DailyReportDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DailyReportMapper {

    DailyReportMapper INSTANCE = Mappers.getMapper( DailyReportMapper.class );

    DailyReportDTO dailyReportToDailyReportDTO(DailyReport dailyReport);

    DailyReport dailyReportDTOtoDailyReport(DailyReportDTO dailyReportDTO);

}
