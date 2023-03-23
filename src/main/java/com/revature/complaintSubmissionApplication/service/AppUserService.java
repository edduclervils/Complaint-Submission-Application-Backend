package com.revature.complaintSubmissionApplication.service;

import com.revature.complaintSubmissionApplication.dto.LoginForm;
import com.revature.complaintSubmissionApplication.entity.AppUser;
import com.revature.complaintSubmissionApplication.exceptions.UserNotFoundException;

import java.util.List;

public interface AppUserService {
    AppUser insert(AppUser appUser);
    AppUser getById(Long userId);
    AppUser getByUsername(String username);
    List<AppUser> getAll();
    AppUser update(AppUser appUser);
    boolean delete (Long userId);
    List<AppUser> getAll(String flag);
    AppUser verify(LoginForm loginForm) throws UserNotFoundException;

}
