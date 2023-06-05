package none.mydomain.personmanager.frontend;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;
import org.controlsfx.control.CheckComboBox;

/**
 * Das Panel mit den verschiedenen Auswahlmöglichkeiten zum Anzeigen der Datensätze.
 *
 * @author Chris A.
 */
public class SelectPanel extends ToolBar {

    private final Button loadAllButton;
    private final Button selectButton;
    private final TextField textField;
    private final CheckComboBox<String> sortChoice;

    /**
     * Der Konstruktor.
     *
     * @author Chris A.
     */
    public SelectPanel(PersonTable personTable) {

        this.setOrientation(Orientation.HORIZONTAL);
        this.setPadding(new Insets(8, 20, 8, 20));

        // LOAD ALL bzw. SELECT
        this.loadAllButton = new Button("LOAD ALL");
        Text separator = new Text(" / ");
        this.selectButton = new Button("SELECT");
        this.textField = new TextField("FROM Person WHERE ");

        // ORDER BY
        Text sortLabel = new Text("ORDER BY ");

        final ObservableList<String> strings = FXCollections.observableArrayList();
        for (int i = 0; i <= 100; i++) {
            strings.add("Item " + i);
        }
        this.sortChoice = new CheckComboBox<>(strings);

        // addAll()
        this.getItems().addAll(this.loadAllButton, separator,
                this.selectButton, this.textField, sortLabel, sortChoice);
        HBox.setHgrow(this.textField, Priority.ALWAYS);

        this.addLoadAllButtonFunctionality(personTable);
        this.addSelectButtonFunctionality(personTable);
        this.addSortChoiceFunctionality();
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
            String hql = this.textField.getText();
            personTable.loadSome(hql);
        });
    }

    /**
     * Fügt die Funktionalität des Auswahl-Boxes hinzu.
     *
     * @author Chris A.
     */
    private void addSortChoiceFunctionality() {

        this.sortChoice.getCheckModel().getCheckedItems().addListener(new ListChangeListener<String>() {
            public void onChanged(ListChangeListener.Change<? extends String> c) {
                while(c.next()) {
                    //do something with changes here
                }
                System.out.println(sortChoice.getCheckModel().getCheckedItems());
            }
        });
    }
}
