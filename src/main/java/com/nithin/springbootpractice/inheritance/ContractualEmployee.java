package com.nithin.springbootpractice.inheritance;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "contractual_employees")
@Data
public class ContractualEmployee extends Employee {
    @Column(name = "contract_duration")
    private int contractDuration;

    @Column(name = "pay_per_hour")
    private double payPerHour;

    @Column(name = "is_renewable")
    private boolean isRenewable;

}
