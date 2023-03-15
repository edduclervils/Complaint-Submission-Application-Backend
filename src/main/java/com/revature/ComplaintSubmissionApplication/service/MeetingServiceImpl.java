package com.revature.ComplaintSubmissionApplication.service;

import com.revature.ComplaintSubmissionApplication.entity.Meeting;
import com.revature.ComplaintSubmissionApplication.repository.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MeetingServiceImpl implements MeetingService {
    @Autowired
    MeetingRepository meetingRepository;
    @Override
    public Meeting insert(Meeting meeting) {
        return meetingRepository.save(meeting);
    }

    @Override
    public List<Meeting> getAll() {
        return meetingRepository.findAll();
    }

    @Override
    public Meeting getById(Long meetingId) {
        return meetingRepository.findById(meetingId).get();
    }

//TODO: RETURN TO THIS FUNCTION WHEN FRONT-END IS COMPLETED. VALUE(86400) MAY CHANGE BASED ON HOW TIME IS SAVED
    @Override
    public List<Meeting> getByDate(Long beginTimeRange) {
        return meetingRepository.findMeetingsThisDay(beginTimeRange,beginTimeRange+86400);
    }

    @Override
    public Meeting update(Meeting meeting) {
        return meetingRepository.save(meeting);
    }

    @Override
    public boolean delete(Long meetingId) {
        boolean found = meetingRepository.existsById(meetingId);
        if (found) meetingRepository.deleteById(meetingId);
        return found;
    }

}
