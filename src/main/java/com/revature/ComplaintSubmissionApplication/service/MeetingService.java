package com.revature.ComplaintSubmissionApplication.service;

import com.revature.ComplaintSubmissionApplication.entity.Meeting;

import java.util.List;

public interface MeetingService {
    Meeting insert(Meeting meeting);
    List<Meeting> getAll();
    Meeting getById(Long meetingId);
    List<Meeting> getByDate(Long beginTimeRange);
    Meeting update(Meeting meeting);
    boolean delete(Long meetingId);
}