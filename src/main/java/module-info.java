module com.example.maze {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.maze to javafx.fxml;
    exports com.example.maze;
    exports com.example.maze.Controller;
    opens com.example.maze.Controller to javafx.fxml;
}