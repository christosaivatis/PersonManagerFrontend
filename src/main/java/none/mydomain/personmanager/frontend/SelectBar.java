package none.mydomain.personmanager.frontend;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

/**
 * Die "Select"-Leiste für die Erstellung des SQL- (bzw. HQL-) SELECT-Befehls.
 * (HQL = "Hibernate Query Language")
 *
 * @author Chris A.
 */
public class SelectBar extends ToolBar {

    private final Button selectButton;
    private final TextField queryField;

    /**
     * Der Konstruktor.
     *
     * @param mainPanel Das Haupt-Panel.
     * @author Chris A.
     */
    public SelectBar(MainPanel mainPanel) {

        this.setOrientation(Orientation.HORIZONTAL);
        this.setPadding(new Insets(8, 20, 8, 20));

        Label label = new Label("SQL/HQL: ");
        label.setId("my-labels");
        this.selectButton = new Button("SELECT");
        this.queryField = new TextField("FROM Person WHERE ");

        this.getItems().addAll(label, this.selectButton, this.queryField);

        // Damit das Textfeld immer die größtmögliche Breite hat.
        HBox.setHgrow(this.queryField, Priority.ALWAYS);

        this.addSelectButtonFunctionality(mainPanel);
    }

    /*********************
            Getter
     *********************/

    public Button getSelectButton() {
        return this.selectButton;
    }

    public TextField getQueryField() {
        return this.queryField;
    }

    /**
     * Fügt die Funktionalität des "SELECT"-Buttons hinzu.
     *
     * @param mainPanel Das Haupt-Panel.
     * @author Chris A.
     */
    private void addSelectButtonFunctionality(MainPanel mainPanel) {

        this.selectButton.setOnAction(event -> {
            System.out.println("SELECT geklickt!");
            String hql = this.queryField.getText();
            mainPanel.getCentralPanel().getPersonTable().loadRecords(hql);
        });
    }
}
