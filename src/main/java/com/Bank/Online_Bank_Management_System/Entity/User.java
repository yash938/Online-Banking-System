package com.Bank.Online_Bank_Management_System.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(nullable = false)
    @NotEmpty(message = "Username is not empty")
    private String userName;

    @NotEmpty(message = "Email must be required")
    @Email(message = "Give me correct email")
    private String userEmail;
    @NotEmpty(message = "Password must be required")
    private String password;
    private String phoneNo;

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Account> accounts = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Role> roles = new ArrayList<>();
}
