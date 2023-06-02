package none.mydomain.personmanager.frontend;

import javafx.scene.layout.BorderPane;

import java.net.URL;

/**
 * Das Hauptpanel, in dem sich alles befindet.
 *
 * @author Chris A.
 */
public class MainPanel extends BorderPane {

    /**
     * Der Konstruktor.
     *
     * @author Chris A.
     */
    public MainPanel() {

        this.setCenter(new PersonTable());
        this.setBottom(new ControlPanel());

//        this.setId("main-panel");
//        this.embedCss();
    }

    /**
     *
     *
     *
     */
    private void embedCss() {

        this.getStylesheets().add(this.getStyleUrlAsString());
    }

    /**
     *
     *
     * @return
     *
     */
    private String getStyleUrlAsString() {

        URL styleUrl = this.getClass().getResource("");
        return styleUrl.toExternalForm();
    }
}
