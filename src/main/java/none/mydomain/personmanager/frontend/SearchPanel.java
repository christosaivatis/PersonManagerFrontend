package none.mydomain.personmanager.frontend;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class SearchPanel extends GridPane {

    public SearchPanel(PersonTable personTable) {

        this.setPadding(new Insets(50.0d, 20.0d, 10.0d, 20.0d));

        Label label = new Label("Extended Live Search!");
        this.add(label, 1, 0);
        label.setId("my-labels");

        // Nur ein Platzhalter.
        this.add(new Label(), 1, 1);
        this.add(new Label(), 2, 1);

        this.add(new Label("Title: "), 1, 2);
        this.add(new TextField(), 2, 2);

        this.add(new Label("First name: "), 1, 3);
        this.add(new TextField(), 2, 3);

        this.add(new Label("Last name: "), 1, 4);
        this.add(new TextField(), 2, 4);

        this.add(new Label("Date of birth: "), 1, 5);
        this.add(new TextField(), 2, 5);

        this.add(new Label("Street: "), 1, 6);
        this.add(new TextField(), 2, 6);

        this.add(new Label("House number: "), 1, 7);
        this.add(new TextField(), 2, 7);

        this.add(new Label("Zip code: "), 1, 8);
        this.add(new TextField(), 2, 8);

        this.add(new Label("City: "), 1, 9);
        this.add(new TextField(), 2, 9);

        this.add(new Label("Mobile number: "), 1, 10);
        this.add(new TextField(), 2, 10);

        this.add(new Label("Email: "), 1, 11);
        this.add(new TextField(), 2, 11);
    }
}
