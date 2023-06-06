module none.mydomain.personmanager.frontend {

    requires javafx.controls;
    requires javafx.fxml;

    requires none.mydomain.personmanager.backend;

    exports none.mydomain.personmanager.frontend;
    exports none.mydomain.personmanager.frontend.simplebuildingblocks;
}
