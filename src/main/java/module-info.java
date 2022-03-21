module com.example.channelbot {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.channelbot to javafx.fxml;
    exports com.example.channelbot;
}