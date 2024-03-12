package com.example.emsbackend.repository;

import com.example.emsbackend.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository  extends JpaRepository<Employe,Long> {

}
