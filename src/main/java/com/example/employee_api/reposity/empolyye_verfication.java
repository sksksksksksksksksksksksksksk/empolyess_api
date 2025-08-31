package com.example.employee_api.reposity;

import com.example.employee_api.model.empolyes_passward_information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empolyye_verfication extends JpaRepository<empolyes_passward_information,Integer> {

}
