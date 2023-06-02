package none.mydomain.personmanager.frontend;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

/**
 * Einfach nur ein horizontaler Platzhalter.
 *
 * @author Chris A.
 */
public class HorizontalPlaceholder extends HBox {

	/**
	 * Der Konstruktor.
	 *
	 * @author Chris A.
	 */
	public HorizontalPlaceholder() {

		HBox.setHgrow(this, Priority.ALWAYS);
	}
}
