package com.Bank.Online_Bank_Management_System.Dto;

import com.Bank.Online_Bank_Management_System.Entity.Account;
import com.Bank.Online_Bank_Management_System.Entity.Role;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

import java.util.ArrayList;
import java.util.List;

public class UserDto {

    private String userName;

    @NotEmpty(message = "Email must be required")
    @Email(message = "Give me correct email")
    private String userEmail;
    @NotEmpty(message = "Password must be required")
    private String password;
    private String phoneNo;
    private List<Role> roles;
}
