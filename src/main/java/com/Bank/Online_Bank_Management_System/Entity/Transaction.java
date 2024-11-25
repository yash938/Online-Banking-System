package com.Bank.Online_Bank_Management_System.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;
    private String type;
    private Double amount;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Account account;
}
