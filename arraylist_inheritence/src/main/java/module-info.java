module com.oop.arraylist_inheritence {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.arraylist_inheritence to javafx.fxml;
    exports com.oop.arraylist_inheritence;
}