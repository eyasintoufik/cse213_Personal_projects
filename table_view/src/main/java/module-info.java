module com.oop.table_view {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.oop.table_view to javafx.fxml;
    exports com.oop.table_view;
}