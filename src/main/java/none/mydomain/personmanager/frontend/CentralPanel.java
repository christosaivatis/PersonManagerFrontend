package none.mydomain.personmanager.frontend;

import javafx.geometry.Orientation;
import javafx.scene.control.SplitPane;

/**
 *
 */
public class CentralPanel extends SplitPane {

    /**
     * Der Konstruktor.
     *
     * @author Chris A.
     */
    public CentralPanel(PersonTable personTable) {

        this.setOrientation(Orientation.HORIZONTAL);

        this.getItems().add(personTable);
    }
}
