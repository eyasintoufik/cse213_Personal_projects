package com.oop.arraylist_inheritence;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class StudentController
{
    @javafx.fxml.FXML
    private DatePicker DobDatepicker;
    @javafx.fxml.FXML
    private ComboBox<String> nationalityComboBox;
    @javafx.fxml.FXML
    private TextArea displayArea;
    @javafx.fxml.FXML
    private TextField nameTxtField;
    @javafx.fxml.FXML
    private TextField IdTxtField;
    @javafx.fxml.FXML
    private RadioButton maleRadiobtn;
    @javafx.fxml.FXML
    private RadioButton femaleRadiobtn;

    ArrayList<Student> listOfSudents = new ArrayList<Student>();
    @javafx.fxml.FXML
    public void initialize() {

        nationalityComboBox.getItems().addAll("Bangladeshi", "Indian", "Pakistani");
        ToggleGroup toggleGroup = new ToggleGroup();
        maleRadiobtn.setToggleGroup(toggleGroup);
        femaleRadiobtn.setToggleGroup(toggleGroup);
    }

    @javafx.fxml.FXML
    public void makeStudentOnClick(ActionEvent actionEvent) {
        String name = nameTxtField.getText();
        String id = IdTxtField.getText();
        String nationality = nationalityComboBox.getValue();
        String dob = DobDatepicker.getValue().toString();

        String gender;
        if(maleRadiobtn.isSelected()){
            gender = "Male";
        }
        else{
            gender = "Femal";
        }

        Student student = new Student(name, id, dob, nationality, gender);
        listOfSudents.add(student);

        displayArea.setText("");
        int i;
        for(i = 0; i < listOfSudents.size(); i++){
            displayArea.appendText(listOfSudents.get(i).toString());
            displayArea.appendText("\n");
        }
    }
}