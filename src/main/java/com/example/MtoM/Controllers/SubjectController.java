package com.example.MtoM.Controllers;

import com.example.MtoM.Models.Subject;
import com.example.MtoM.Services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @PostMapping()
    public Subject insert(@RequestBody Subject subject) {
        return subjectService.insertSubject(subject);
    }

    @GetMapping("id/{sId}")
    public Optional<Subject> showOne(@PathVariable Long sId) {
        return subjectService.showOne(sId);
    }

    @GetMapping()
    public List<Subject> getAll() {
        return subjectService.getAll();
    }
}
