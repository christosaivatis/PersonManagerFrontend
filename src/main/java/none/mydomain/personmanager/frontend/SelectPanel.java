package none.mydomain.personmanager.frontend;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

/**
 * Das Panel für die Erstellung des SQL- (bzw. HQL-) SELECT-Befehls.
 * (HQL = "Hibernate Query Language")
 *
 * @author Chris A.
 */
public class SelectPanel extends ToolBar {

    private final Button selectButton;
    private final TextField textField;

    /**
     * Der Konstruktor.
     *
     * @author Chris A.
     */
    public SelectPanel(PersonTable personTable) {

        this.setOrientation(Orientation.HORIZONTAL);
        this.setPadding(new Insets(8, 20, 8, 20));

        this.selectButton = new Button("SELECT");
        this.textField = new TextField("FROM Person WHERE ");

        this.getItems().addAll(this.selectButton, this.textField);
        HBox.setHgrow(this.textField, Priority.ALWAYS);

        this.addSelectButtonFunctionality(personTable);
    }

    /**
     * Fügt die Funktionalität des "SELECT"-Buttons hinzu.
     *
     * @author Chris A.
     */
    private void addSelectButtonFunctionality(PersonTable personTable) {

        this.selectButton.setOnAction(event -> {
            System.out.println("SELECT geklickt!");
            String hql = this.textField.getText();
            personTable.loadRecords(hql);
        });
    }
}
