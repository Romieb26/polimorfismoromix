module com.romina.polimorfismoromix{
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rominaesba.polimorfismok.r to javafx.fxml;
    exports com.rominaesba.polimorfismok.r;
    exports com.rominaesba.polimorfismok.r.Models;
    opens com.rominaesba.polimorfismok.r.Models to javafx.fxml;
    exports com.rominaesba.polimorfismok.r.Controllers;
    opens com.rominaesba.polimorfismok.r.Controllers to javafx.fxml;
}