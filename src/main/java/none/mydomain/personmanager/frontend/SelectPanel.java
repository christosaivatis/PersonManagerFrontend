package none.mydomain.personmanager.frontend;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;

/**
 * Das Panel mit den verschiedenen Auswahlmöglichkeiten zum Anzeigen der Datensätze.
 *
 * @author Chris A.
 */
public class SelectPanel extends ToolBar {

    /**
     * Der Konstruktor.
     *
     * @author Chris A.
     */
    public SelectPanel(PersonTable personTable) {

        this.setOrientation(Orientation.HORIZONTAL);
        this.setPadding(new Insets(8, 20, 8, 20));

        HorizontalPlaceholder hPlaceholder = new HorizontalPlaceholder();
        SelectPart selectPart = new SelectPart(personTable);
        SortPart sortPart = new SortPart();

        this.getItems().addAll(hPlaceholder, selectPart, sortPart);
    }
}
