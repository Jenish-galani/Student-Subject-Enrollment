package com.example.MtoM.Controllers;

import com.example.MtoM.Models.Subject;
import com.example.MtoM.Services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Indicates this class is a REST controller
@RequestMapping("subject") // Maps HTTP requests with "subject" to this controller
public class SubjectController {

    @Autowired // Injects the SubjectService dependency
    private SubjectService subjectService;

    // Handles HTTP POST requests to save a new Subject
    @PostMapping()
    public Subject insert(@RequestBody Subject subject) {
        return subjectService.insertSubject(subject);
    }

    // Handles HTTP GET requests to retrieve a Subject by its ID
    @GetMapping("id/{sId}")
    public Optional<Subject> showOne(@PathVariable Long sId) {
        return subjectService.showOne(sId);
    }

    // Handles HTTP GET requests to retrieve all Subjects
    @GetMapping()
    public List<Subject> getAll() {
        return subjectService.getAll();
    }
}

