package com.example.demo.controller;

import com.example.demo.dto.EmployeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/list")
    public EmployeDTO getList() {
        EmployeDTO employeDTO = new EmployeDTO();
        employeDTO.setId(1);
        employeDTO.setName("test");
        return employeDTO;
    }
}
