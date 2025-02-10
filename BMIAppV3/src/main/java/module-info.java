module com.trantheanh1301.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.trantheanh1301.mavenproject1 to javafx.fxml;
    exports com.trantheanh1301.mavenproject1;
}
