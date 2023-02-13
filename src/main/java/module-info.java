module com.example.adressbookapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires java.logging;

    opens com.example.adressbookapplication to javafx.fxml;
    exports com.example.adressbookapplication;
}

