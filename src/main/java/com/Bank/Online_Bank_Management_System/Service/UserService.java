package com.Bank.Online_Bank_Management_System.Service;

import com.Bank.Online_Bank_Management_System.Dto.UserDto;

import java.util.List;

public interface UserService {
    public UserDto createUser(UserDto userDto);
    public UserDto updateUser(Long userId,UserDto userDto);

    public UserDto findByUser(Long userId);
    public List<UserDto> allUser();

    public void deleteUser(Long userId);

}
