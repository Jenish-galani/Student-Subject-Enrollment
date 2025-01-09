package com.example.MtoM.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {

    @Id
    private Long subId;

    private String subName;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();

    public Subject(Long subId, String subName, List<Student> students) {
        this.subId = subId;
        this.subName = subName;
        this.students = students;
    }

    public Subject() {
    }

    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
