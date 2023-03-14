package com.revature.ComplaintSubmissionApplication.dto;

import com.revature.ComplaintSubmissionApplication.entity.AppUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data@NoArgsConstructor@AllArgsConstructor
public class AppUserReturnInfo {
    private Long userId;
    private String username;
    private String role;


    public AppUserReturnInfo(AppUser appUser) {
        this.username = appUser.getUsername();
        this.userId = appUser.getUserId();
        this.role = appUser.getRole();
    }

}
