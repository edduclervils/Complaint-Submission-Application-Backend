package com.revature.complaintSubmissionApplication.repository;

import com.revature.complaintSubmissionApplication.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {

    List<Complaint> findByStatus(String status);
    List<Complaint> findByPriority(String priority);
    List<Complaint> findByStatusAndPriority(String status, String priority);

    List<Complaint> findByMeetingId(Long meetingId);
}
