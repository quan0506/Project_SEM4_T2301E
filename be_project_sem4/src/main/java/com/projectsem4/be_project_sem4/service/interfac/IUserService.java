package com.projectsem4.be_project_sem4.service.interfac;

import com.projectsem4.be_project_sem4.dto.LoginRequest;
import com.projectsem4.be_project_sem4.dto.Response;
import com.projectsem4.be_project_sem4.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
