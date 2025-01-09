package com.example.MtoM.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity // This class represents a Student entity for the database
public class Student {

    @Id
    private Long sId;

    private String sName;

    @ManyToMany(mappedBy = "students")
    private List<Subject> subjects = new ArrayList<>();

    public Student(Long sId, String sName, List<Subject> subjects) {
        this.sId = sId;
        this.sName = sName;
        this.subjects = subjects;
    }

    public Student() {
    }

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
