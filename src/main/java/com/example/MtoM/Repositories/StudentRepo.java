package com.example.MtoM.Repositories;


import com.example.MtoM.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // This interface is a Spring Data JPA repository for the Student entity
public interface StudentRepo extends JpaRepository<Student, Long> {
}
