package none.mydomain.personmanager.frontend;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.text.Text;
import none.mydomain.personmanager.frontend.simplebuildingblocks.HorizontalPlaceholder;

/**
 * Das "Boden"-Panel, in dem sich die weiteren Funktionsbuttons befinden.
 *
 * @author Chris A.
 */
public class FloorPanel extends ToolBar {

	private final Button loadAllButton;

	/**
	 * Der Konstruktor.
	 *
	 * @author Chris A.
	 */
	public FloorPanel(PersonTable personTable) {

		this.setOrientation(Orientation.HORIZONTAL);
		this.setPadding(new Insets(8, 20, 8, 20));

		this.loadAllButton = new Button("LOAD ALL");
		Button updateButton = new Button("UPDATE");
		Button deleteButton = new Button("DELETE");
		Button addButton = new Button("ADD");

		this.getItems().addAll(new HorizontalPlaceholder(),
								this.loadAllButton,
								new Text(" / "), updateButton,
								new Text(" / "), deleteButton,
								new Text(" / "), addButton);

		this.addLoadAllButtonFunctionality(personTable);

		updateButton.setOnAction(event -> {
			System.out.println("UPDATE geklickt!");
		});

		deleteButton.setOnAction(event -> {
			System.out.println("DELETE geklickt!");
		});

		addButton.setOnAction(event -> {
			System.out.println("ADD geklickt!");
		});
	}

	/**
	 * Fügt die Funktionalität des "LOAD-ALL"-Buttons hinzu.
	 *
	 * @author Chris A.
	 */
	private void addLoadAllButtonFunctionality(PersonTable personTable) {

		this.loadAllButton.setOnAction(event -> {
			System.out.println("LOAD ALL geklickt!");
			String hql = "FROM Person";
			personTable.loadRecords(hql);
		});
	}
}
