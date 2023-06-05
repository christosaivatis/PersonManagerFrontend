package none.mydomain.personmanager.frontend.simplebuildingblocks;

import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * Einfach nur ein vertikaler Platzhalter.
 *
 * @author Chris A.
 */
public class VerticalPlaceholder extends VBox {

    /**
     * Der Konstruktor.
     *
     * @author Chris A.
     */
    public VerticalPlaceholder() {

        VBox.setVgrow(this, Priority.ALWAYS);
    }
}
