package com.example.employee_api.reposity;

import com.example.employee_api.model.empolyee_DB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface emplyess_repo extends JpaRepository<empolyee_DB,Integer> {

}
