package com.inventor.app.repository;

import com.inventor.app.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inventor.app.model.Doctor;
import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRepo extends CrudRepository<Doctor, Long> {
    Optional<Doctor> findByDocUsuario(Usuario usuario);
    List<Doctor> findByDocEspecialidad(String Especialidad);

}
