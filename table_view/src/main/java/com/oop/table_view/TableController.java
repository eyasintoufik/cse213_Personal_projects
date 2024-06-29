package com.oop.table_view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class TableController {

    @FXML private TableColumn<Student, String> cgpaCol;

    @FXML private TextField cgpaTextfield;

    @FXML private TableColumn<Student,String> idCol;

    @FXML private TextField idTextfield;

    @FXML private TableColumn<Student, String> nameCol;

    @FXML
    private TextField nameTextfield;

    @FXML private TableColumn<Student, String> semesterCol;

    @FXML private TextField semesterTextfield;

    @FXML private TableView<Student> studentTable;

    ArrayList<Student>listofStudents = new ArrayList<Student>();

    @FXML
    void initialize(){
            semesterCol.setCellValueFactory(new PropertyValueFactory<Student, String>("Semester"));
            nameCol.setCellValueFactory(new PropertyValueFactory<Student, String>("Name"));
            idCol.setCellValueFactory(new PropertyValueFactory<Student, String>("id"));
            cgpaCol.setCellValueFactory(new PropertyValueFactory<Student,String>("cgpa"));

    }

    @FXML
    void addStudentOnClick(ActionEvent event) {

            String name = nameTextfield.getText();
            String id = idTextfield.getText();
            String semester = semesterTextfield.getText();
            String cgpa = cgpaTextfield.getText();

            Student student = new Student(name, id, cgpa, semester);
            listofStudents.add(student);
            studentTable.getItems().add(student);
    }


    @FXML
    public void sortCgpaOnClick(ActionEvent actionEvent) {
            studentTable.getItems().clear();
            for(int i=0;i<listofStudents.size(); i++){
                float cgpa = Float.parseFloat(listofStudents.get(i).getCgpa());
                if(cgpa > 3.5){
                    studentTable.getItems().add(listofStudents.get(i));
                }
            }
    }
}
