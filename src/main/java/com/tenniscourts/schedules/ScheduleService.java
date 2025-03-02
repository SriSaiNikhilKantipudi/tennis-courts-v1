package com.tenniscourts.schedules;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
//@AllArgsConstructor
public class ScheduleService {

    private  ScheduleRepository scheduleRepository;

    private  ScheduleMapper scheduleMapper;

    public ScheduleDTO addSchedule(Long tennisCourtId, CreateScheduleRequestDTO createScheduleRequestDTO) {
        //TODO: implement addSchedule
        return null;
    }

    public List<ScheduleDTO> findSchedulesByDates(LocalDateTime startDate, LocalDateTime endDate) {
        //TODO: implement
        return null;
    }

    public ScheduleDTO findSchedule(Long scheduleId) {
        //TODO: implement
        return null;
    }

    public List<ScheduleDTO> findSchedulesByTennisCourtId(Long tennisCourtId) {
        return scheduleMapper.map(scheduleRepository.findByTennisCourt_IdOrderByStartDateTime(tennisCourtId));
    }

	public ScheduleRepository getScheduleRepository() {
		return scheduleRepository;
	}

	public void setScheduleRepository(ScheduleRepository scheduleRepository) {
		this.scheduleRepository = scheduleRepository;
	}

	public ScheduleMapper getScheduleMapper() {
		return scheduleMapper;
	}

	public void setScheduleMapper(ScheduleMapper scheduleMapper) {
		this.scheduleMapper = scheduleMapper;
	}
    
    
}
