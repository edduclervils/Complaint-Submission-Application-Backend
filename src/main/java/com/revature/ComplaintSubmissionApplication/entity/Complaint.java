package com.revature.ComplaintSubmissionApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data@NoArgsConstructor@AllArgsConstructor@Entity@Table(name = "complaints")
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long complaintId;
    private  String description;
    private String status;
    private Long meetingId;

    public Complaint(String description, String status, Long meetingId ){
        this.description = description;
        this.status = status;
        this.meetingId = meetingId;
    }
}
