package com.revature.ComplaintSubmissionApplication.controller;

import com.revature.ComplaintSubmissionApplication.dto.LoginForm;
import com.revature.ComplaintSubmissionApplication.entity.AppUser;
import com.revature.ComplaintSubmissionApplication.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {
    @Autowired
    AppUserService appUserService;

    //TODO: This works well enough but I have no clue whether this will be right for the final implementation. Return to this once working on the frontend
    @PatchMapping()
    public ResponseEntity verifyUser(@RequestBody LoginForm loginForm){
        AppUser returnedUser = appUserService.verify(loginForm);
        if (returnedUser==null){
            return ResponseEntity.ok(HttpStatus.NOT_FOUND);
        }
        else {return ResponseEntity.ok(HttpStatus.OK);}
    }
}
