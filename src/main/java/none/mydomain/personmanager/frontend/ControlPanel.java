package none.mydomain.personmanager.frontend;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;

/**
 * Das Bedienfeld mit den entspr. Buttons.
 *
 * @author Chris A.
 */
public class ControlPanel extends ToolBar {

	public ControlPanel() {

		this.setOrientation(Orientation.HORIZONTAL);
		this.setPadding(new Insets(8, 20, 8, 20));

		HorizontalPlaceholder hPlaceholder = new HorizontalPlaceholder();
		Button updateButton = new Button("UPDATE");
		Button deleteButton = new Button("DELETE");
		Button addButton = new Button("ADD");

		this.getItems().addAll(hPlaceholder, updateButton, deleteButton, addButton);

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
}
