package com.oop.arraylist_inheritence;

public class Student {
    public String name;
    public String id;
    public String dob;
    public String nationality;
    public String gender;

    public Student(String name, String id, String dob, String nationality, String gender) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.nationality = nationality;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", dob='" + dob + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                '}' + '\n';
    }
}
