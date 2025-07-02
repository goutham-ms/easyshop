package com.easyshop.easy_shop.service.user;

import com.easyshop.easy_shop.dto.UserDto;
import com.easyshop.easy_shop.model.User;
import com.easyshop.easy_shop.request.CreateUserRequest;
import com.easyshop.easy_shop.request.UpdateUserRequest;

public interface UserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UpdateUserRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertToDto(User user);
}
