module org.feodal.calculatorfx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.feodal.calculatorfx2 to javafx.fxml;
    exports org.feodal.calculatorfx2;
}