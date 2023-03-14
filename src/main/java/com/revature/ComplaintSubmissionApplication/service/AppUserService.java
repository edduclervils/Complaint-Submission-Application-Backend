package com.revature.ComplaintSubmissionApplication.service;

import com.revature.ComplaintSubmissionApplication.dto.LoginForm;
import com.revature.ComplaintSubmissionApplication.entity.AppUser;

import java.util.List;

public interface AppUserService {
    AppUser insert(AppUser appUser);
    AppUser getById(Long userId);
    AppUser getByUsername(String username);
    List<AppUser> getAll();
    AppUser update(AppUser appUser);
    boolean delete (Long userId);
    List<AppUser> getAll(String flag);
    AppUser verify(LoginForm loginForm);
}
