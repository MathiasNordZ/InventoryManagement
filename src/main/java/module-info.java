module org.mnord.inventorymanagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.mnord.inventorymanagement to javafx.fxml;
    exports org.mnord.inventorymanagement;
}