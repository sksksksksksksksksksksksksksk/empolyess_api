package com.example.employee_api.services;

import com.example.employee_api.model.empolyee_DB;
import com.example.employee_api.reposity.emplyess_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empolyee_services {
    @Autowired
    emplyess_repo emplyess_repo;
    public void inserting_value(empolyee_DB empolyeeDb) {
        emplyess_repo.save(empolyeeDb);
    }

    public List<empolyee_DB> display_empolyess(empolyee_DB empolyeeDb) {
       return emplyess_repo.findAll();
    }
}
