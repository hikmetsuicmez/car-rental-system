package com.hikmetsuicmez.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "credit_card")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cardNumber;
    private Integer month;
    private Integer year;
    private Integer cvv;
    private Long accountBalance;
}
