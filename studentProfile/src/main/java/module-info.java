module com.oop.studentprofile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.studentprofile to javafx.fxml;
    exports com.oop.studentprofile;
}