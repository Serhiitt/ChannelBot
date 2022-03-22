module com.example.channelbot {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.channelbot to javafx.fxml;
    exports com.example.channelbot;
}