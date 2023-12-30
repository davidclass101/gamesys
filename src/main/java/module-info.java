module com.example.gamesys {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gamesys to javafx.fxml;
    exports base.gamesys;
    opens base.gamesys to javafx.fxml;
}