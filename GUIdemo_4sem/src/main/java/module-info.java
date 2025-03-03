module com.example.guidemo_4sem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guidemo_4sem to javafx.fxml;
    exports com.example.guidemo_4sem;
}