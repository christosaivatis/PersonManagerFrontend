package none.mydomain.personmanager.frontend;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.ToolBar;
import javafx.scene.text.Text;
import org.controlsfx.control.CheckComboBox;

/**
 * Der Teil des Suchfeldes mit der Auswahlmöglichkeit "ORDER BY"
 * zur Sortierung der Ergebnisse.
 *
 * @author Chris A.
 */
public class SortPart extends ToolBar {

    private CheckComboBox<String> sortChoice;

    /**
     * Der Konstruktor.
     *
     * @autor Chris A.
     */
    public SortPart() {

        Text sortLabel = new Text("ORDER BY ");
        final ObservableList<String> strings = FXCollections.observableArrayList();
        for (int i = 0; i <= 100; i++) {
            strings.add("Item " + i);
        }
        this.sortChoice = new CheckComboBox<>(strings);

        this.getItems().addAll(sortLabel, sortChoice);

        this.addSortChoiceFunctionality();
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
