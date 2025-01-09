package com.example.MtoM.Services;

import com.example.MtoM.Models.Subject;
import com.example.MtoM.Repositories.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepo subjectRepo;

    public Subject insertSubject(Subject subject) {
        return subjectRepo.save(subject);
    }

    public Optional<Subject> showOne(Long sId) {
        return subjectRepo.findById(sId);
    }

    public List<Subject> getAll() {
        return subjectRepo.findAll();
    }
}
