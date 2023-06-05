package none.mydomain.personmanager.frontend;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;

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

        this.setTop(new SearchPanel());
        this.setBottom(new ControlPanel());
        this.setLeft(new Pillar());
        this.setRight(new Pillar());
        this.setCenter(new PersonTable());

        this.setId("main-panel");
        this.embedCss();
    }

    /**
     * Bindet die CSS-Datei ein.
     * Vorsicht! Die Ordner-Struktur unter "resources" schrittweise erstellen,
     * also NICHT direkt (wie z.B. "none.mydomain.personmanager.frontend")!
     * @author Chris A.
     */
    private void embedCss() {

        URL styleUrl = this.getClass().getResource("style.css");
        String styleUrlAsString = null;
        if (styleUrl != null) {
            styleUrlAsString = styleUrl.toExternalForm();
            this.getStylesheets().add(styleUrlAsString);
        }
        else {
            System.out.println("CSS file could not be found!");
        }
    }
}
