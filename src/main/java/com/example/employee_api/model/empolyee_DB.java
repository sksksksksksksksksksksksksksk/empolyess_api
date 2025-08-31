package com.example.employee_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class empolyee_DB{
    @Id
    private int id;
    private String name;
    private String pos;
}
