module com.cse.oop.courseprojects.firstpractice {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.cse.oop.courseprojects.firstpractice to javafx.fxml;
    exports com.cse.oop.courseprojects.firstpractice;
}