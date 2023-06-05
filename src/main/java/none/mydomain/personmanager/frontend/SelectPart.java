package none.mydomain.personmanager.frontend;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;

/**
 * Der Teil des Suchfeldes mit dem Button "LOAD ALL",
 * dem Button "SELECT" und dem Textfeld.
 *
 * @author Chris A.
 */
public class SelectPart extends ToolBar {

    private final Button loadAllButton;
    private final Button selectButton;
    private TextField testField;

    /**
     * Der Konstruktor.
     *
     * @author Chris A.
     */
    public SelectPart(PersonTable personTable) {

        this.loadAllButton = new Button("LOAD ALL");
        this.selectButton = new Button("SELECT");
        this.testField = new TextField("FROM Person WHERE ");

        this.getItems().addAll(this.loadAllButton, this.selectButton, this.testField);

        this.addLoadAllButtonFunctionality(personTable);
        this.addSelectButtonFunctionality(personTable);
    }

    /**
     * Fügt die Funktionalität des "LOAD-ALL"-Buttons hinzu.
     *
     * @author Chris A.
     */
    private void addLoadAllButtonFunctionality(PersonTable personTable) {

        this.loadAllButton.setOnAction(event -> {
            System.out.println("LOAD ALL geklickt!");
            personTable.loadAll();
        });
    }

    /**
     * Fügt die Funktionalität des "SELECT"-Buttons hinzu.
     *
     * @author Chris A.
     */
    private void addSelectButtonFunctionality(PersonTable personTable) {

        this.selectButton.setOnAction(event -> {
            System.out.println("SELECT geklickt!");
            String hql = this.testField.getText();
            personTable.loadSome(hql);
        });
    }
}
