package com.example.employee_api.controal;

import com.example.employee_api.model.empolyee_DB;
import com.example.employee_api.services.empolyee_services;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class empolyee_controal {
    @Autowired
    empolyee_services empolyee_services;
    @GetMapping("/about")
    public List<empolyee_DB> get_value(empolyee_DB empolyee_DB)
    {
        return empolyee_services.display_empolyess(empolyee_DB);

    }
    @PostMapping("/about")
    public String DATA_BASEINSERTING(@RequestBody empolyee_DB empolyee_DB )
    {
        empolyee_services.inserting_value(empolyee_DB);
        return "successfully inserting..";

    }
}
