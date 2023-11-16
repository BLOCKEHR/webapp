package com.inventor.app.service;

import java.util.List;
import java.util.Optional;

import com.inventor.app.model.Doctor;

public interface DoctorService {
    
    Doctor saveDoctor(Doctor pd);

    List<Doctor> getAllDoctors();
    List<Doctor> buscarPorEspecialidad(String name);
    Optional<Doctor> getDoctorById(Long id);


    Doctor updateDoctor(Doctor pd,Long id);
    
    void deleteDetail(Long id);

    Doctor buscarPacienteByUsuario(String name);

}
