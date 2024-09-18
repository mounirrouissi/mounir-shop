package com.mounir.dreamshops.service.user;

import com.mounir.dreamshops.dto.UserDto;
import com.mounir.dreamshops.model.User;
import com.mounir.dreamshops.request.CreateUserRequest;
import com.mounir.dreamshops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
