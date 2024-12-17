module org.mnord.inventorymanagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.mnord.inventorymanagement to javafx.fxml;
    exports org.mnord.inventorymanagement;
  exports org.mnord.inventorymanagement.application;
  opens org.mnord.inventorymanagement.application to javafx.fxml;
}