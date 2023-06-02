package none.mydomain.personmanager.frontend;

import javafx.scene.layout.BorderPane;

import java.net.URL;

public class MainPanel extends BorderPane {

    public MainPanel() {

        this.setCenter(new PersonTable());
        this.setBottom(new ControlPanel());

//        this.setId("main-panel");
//        this.embedCss();
    }

    private void embedCss() {

        this.getStylesheets().add(this.getStyleUrlAsString());
    }

    private String getStyleUrlAsString() {

        URL styleUrl = this.getClass().getResource("styles.css");
        String styleUrlAsString = styleUrl.toExternalForm();
        return styleUrlAsString;
    }
}
