package com.revature.ComplaintSubmissionApplication.controller;

import com.revature.ComplaintSubmissionApplication.dto.MeetingContent;
import com.revature.ComplaintSubmissionApplication.entity.Meeting;
import com.revature.ComplaintSubmissionApplication.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meetings")
@CrossOrigin
public class MeetingController {
    @Autowired
    MeetingService meetingService;

    @PostMapping()
    public Meeting insert(@RequestBody Meeting meeting){
        return meetingService.insert(meeting);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Meeting> getAll(){
        return meetingService.getAll();
    }

    @GetMapping("/{meetingId}")
    public Meeting getById(@PathVariable("meetingId") Long meetingId){
        return meetingService.getById(meetingId);
    }

    @GetMapping("/on/{date}")
    public List<Meeting> getByDate(@PathVariable("date") Long date){
        return meetingService.getByDate(date);
    }

    @PutMapping("/{meetingId}")
    public Meeting update(@PathVariable("meetingId") Long meetingId, @RequestBody MeetingContent meetingContent){
        Meeting updatedMeeting = new Meeting(meetingId,meetingContent);
        return meetingService.update(updatedMeeting);
    }

    @DeleteMapping("/{meetingId}")
    public boolean delete(@PathVariable("meetingId") Long meetingId){
        return meetingService.delete(meetingId);
    }

}
