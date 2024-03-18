package com.example.demo.service;

import com.example.demo.entities.Doctor;
import com.example.demo.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Doctor getDoctor(long id) {
        Doctor s = doctorRepository.getOne(id);
        return s;
    }
}
