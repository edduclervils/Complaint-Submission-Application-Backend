package com.revature.ComplaintSubmissionApplication.repository;

import com.revature.ComplaintSubmissionApplication.entity.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MeetingRepository extends JpaRepository<Meeting, Long> {

    @Query(value = "SELECT * FROM meetings WHERE time>=:beginTimeRange and time<:endTimeRange", nativeQuery = true)
    List<Meeting> findMeetingsThisDay(@Param("beginTimeRange") Long beginTimeRange, @Param("endTimeRange") Long endTimeRange);
}
