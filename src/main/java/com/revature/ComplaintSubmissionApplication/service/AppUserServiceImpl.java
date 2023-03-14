package com.revature.ComplaintSubmissionApplication.service;


import com.revature.ComplaintSubmissionApplication.dto.LoginForm;
import com.revature.ComplaintSubmissionApplication.entity.AppUser;
import com.revature.ComplaintSubmissionApplication.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class AppUserServiceImpl implements AppUserService{

    @Autowired
    AppUserRepository appUserRepository;

    @Override
    public AppUser insert(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public AppUser getById(Long userId) {
        return appUserRepository.findById(userId).get();
    }

    @Override
    public AppUser getByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }

    @Override
    public List<AppUser> getAll() {
        return appUserRepository.findAll();
    }

    @Override
    public AppUser update(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public boolean delete(Long userId) {
        boolean found = appUserRepository.existsById(userId);
        if (found) appUserRepository.deleteById(userId);
        return found;
    }

    @Override
    public List<AppUser> getAll(String flag) {
        if (flag == null){
            return appUserRepository.findAll();
        }
        else{
            return appUserRepository.findByRole(flag);
        }
    }

    @Override
    public AppUser verify(LoginForm loginForm) {
        return appUserRepository.verifyLogin(loginForm.getUsername(), loginForm.getPassword());
    }
}
