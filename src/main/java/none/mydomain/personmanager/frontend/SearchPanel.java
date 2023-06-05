package none.mydomain.personmanager.frontend;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.text.Text;
import org.controlsfx.control.CheckComboBox;

/**
 * Das Suchfeld mit den entsprechenden Auswahlmöglichkeiten.
 *
 * @author Chris A.
 */
public class SearchPanel extends ToolBar {

    /**
     * Der Konstruktor.
     *
     * @author Chris A.
     */
    public SearchPanel() {

        this.setOrientation(Orientation.HORIZONTAL);
        this.setPadding(new Insets(8, 20, 8, 20));

        HorizontalPlaceholder hPlaceholder = new HorizontalPlaceholder();
        Button searchButton = new Button("SEARCH");
        TextField searchText = new TextField();
        Text sortByLabel = new Text("sortByLabel");

        final ObservableList<String> strings = FXCollections.observableArrayList();
        for (int i = 0; i <= 100; i++) {
            strings.add("Item " + i);
        }
        CheckComboBox<String> checkComboBox = new CheckComboBox<>(strings);

        this.getItems().addAll(hPlaceholder, searchButton, searchText, sortByLabel, checkComboBox);

        searchButton.setOnAction(event -> {
            System.out.println("SEARCH geklickt!");
        });

        checkComboBox.getCheckModel().getCheckedItems().addListener(new ListChangeListener<String>() {
            public void onChanged(ListChangeListener.Change<? extends String> c) {
                while(c.next()) {
                    //do something with changes here
                }
                System.out.println(checkComboBox.getCheckModel().getCheckedItems());
            }
        });
    }
}
