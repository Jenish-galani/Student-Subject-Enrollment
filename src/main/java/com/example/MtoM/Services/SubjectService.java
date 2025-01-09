package com.example.MtoM.Services;

import com.example.MtoM.Models.Subject;
import com.example.MtoM.Repositories.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Marks this class as a Spring service component
public class SubjectService {
    
    @Autowired // Injects the SubjectRepo dependency
    private SubjectRepo subjectRepo;

    // Saves a new Subject to the database
    public Subject insertSubject(Subject subject) {
        return subjectRepo.save(subject);
    }

    // Retrieves a specific Subject by its ID
    public Optional<Subject> showOne(Long sId) {
        return subjectRepo.findById(sId);
    }

    // Retrieves a list of all Subjects from the database
    public List<Subject> getAll() {
        return subjectRepo.findAll();
    }
}
