package none.mydomain.personmanager.frontend;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.text.Text;

/**
 * Das Bedienfeld mit den entsprechenden Buttons.
 *
 * @author Chris A.
 */
public class ControlPanel extends ToolBar {

	private final Button loadAllButton;

	/**
	 * Der Konstruktor.
	 *
	 * @author Chris A.
	 */
	public ControlPanel(PersonTable personTable) {

		this.setOrientation(Orientation.HORIZONTAL);
		this.setPadding(new Insets(8, 20, 8, 20));

		HorizontalPlaceholder hPlaceholder = new HorizontalPlaceholder();
		this.loadAllButton = new Button("LOAD ALL");
		Text separator1 = new Text(" / ");
		Button updateButton = new Button("UPDATE");
		Text separator2 = new Text(" / ");
		Button deleteButton = new Button("DELETE");
		Text separator3 = new Text(" / ");
		Button addButton = new Button("ADD");

		this.getItems().addAll(hPlaceholder, this.loadAllButton, separator1,
				updateButton, separator2, deleteButton, separator3, addButton);

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
			personTable.loadAll();
		});
	}
}
