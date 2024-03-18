package com.example.demo.controllers;

import com.example.demo.entities.Doctor;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/get")
    public String get() {
        return "it works!";
    }

    @GetMapping("/first")
    public Doctor opc() {
        return doctorService.getDoctor(1);
    }

    @GetMapping("/second")
    public String  opc2() {
        return doctorService.getDoctor(1).getName();
    }
}
