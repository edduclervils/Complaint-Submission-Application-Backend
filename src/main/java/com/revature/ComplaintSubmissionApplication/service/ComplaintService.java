package com.revature.ComplaintSubmissionApplication.service;

import com.revature.ComplaintSubmissionApplication.entity.Complaint;

import java.util.List;

public interface ComplaintService {
    Complaint insert(Complaint complaint);
    List<Complaint> getAll();
    List<Complaint> getAll(String status);
    Complaint getById(Long complaintId);
    List<Complaint> getByStatus(String status);
    List<Complaint> getByPriority(String priority);
    List<Complaint> getByStatusAndPriority(String status, String priority);
    List<Complaint> getByMeetingId(Long meetingId);
    Complaint update(Complaint complaint);
    boolean delete(Long complaintId);
}
