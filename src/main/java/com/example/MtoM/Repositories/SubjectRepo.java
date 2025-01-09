package com.example.MtoM.Repositories;

import com.example.MtoM.Models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // This interface is a Spring Data JPA repository for the Subject entity
public interface SubjectRepo extends JpaRepository<Subject, Long> {
}
