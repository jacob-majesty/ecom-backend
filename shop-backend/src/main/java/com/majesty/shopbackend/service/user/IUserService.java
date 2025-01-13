package com.majesty.shopbackend.service.user;

import com.majesty.shopbackend.dto.UserDto;
import com.majesty.shopbackend.model.User;
import com.majesty.shopbackend.request.CreateUserRequest;
import com.majesty.shopbackend.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);

    User createUser(CreateUserRequest request);

    User updateUser(UserUpdateRequest request, Long userId);

    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}