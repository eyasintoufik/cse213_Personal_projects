package com.oop.studentprofile;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class StudentController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private ComboBox<String> nationalityCombobox;
    @javafx.fxml.FXML
    private TextArea displayTextArea;
    @javafx.fxml.FXML
    private DatePicker datePickerField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private RadioButton femaleRadiobutton;

    @javafx.fxml.FXML
    public void initialize() {
        nationalityCombobox.getItems().addAll("Bangladeshi", "Indian", "Pakistani");
        ToggleGroup toggleGroup = new ToggleGroup();
        maleRadioButton.setToggleGroup(toggleGroup);
        femaleRadiobutton.setToggleGroup(toggleGroup);
    }

    @javafx.fxml.FXML
    public void createProfilebuttonOnClick(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String id = idTextField.getText();
        String dob = datePickerField.getValue().toString();
        String nationality = nationalityCombobox.getValue();

        String gender;
        if(maleRadioButton.isSelected()){
            gender = "Male";
        }
        else{
            gender = "Female";
        }


        Student student = new Student(name, id, dob, nationality, gender);

        displayTextArea.appendText(student.toString());
    }
}