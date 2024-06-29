package com.oop.table_view;

public class Student {
    public String name;
    public String id ;
    public String cgpa;
    public String semester;

    public Student(String name, String id, String cgpa, String semester) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
