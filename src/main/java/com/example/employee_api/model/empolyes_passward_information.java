package com.example.employee_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class empolyes_passward_information {
    @Id
    private int pasward;
    private String user_name;
}
