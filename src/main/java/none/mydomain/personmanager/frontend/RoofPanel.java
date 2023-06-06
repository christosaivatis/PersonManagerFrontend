package none.mydomain.personmanager.frontend;

import javafx.scene.layout.VBox;

/**
 * Das "Dach"-Panel, in dem sich die verschiedenen Suchmöglichkeiten befinden.
 *
 * @author Chris A.
 */
public class RoofPanel extends VBox {

    /**
     * Der Konstruktor.
     *
     * @param personTable
     * @author Chris A.
     */
    public RoofPanel(PersonTable personTable) {

        this.getChildren().add(new TopMenuBar(personTable));
    }
}
