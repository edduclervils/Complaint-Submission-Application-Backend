package com.revature.ComplaintSubmissionApplication.entity;

import com.revature.ComplaintSubmissionApplication.dto.AppUserReturnInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "app_user")
public class AppUser extends AppUserReturnInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    private String role;


    public AppUser(String username, String password, String role){
        this.username = username;
        this.password = password;
        this.role = role;

    }


}


