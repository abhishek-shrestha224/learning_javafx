module com.example {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;

    opens com.example to javafx.fxml;
    opens com.example.controllers to javafx.fxml;

    exports com.example;
}
