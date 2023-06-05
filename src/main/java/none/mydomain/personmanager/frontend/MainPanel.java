package none.mydomain.personmanager.frontend;

import javafx.scene.layout.BorderPane;

import java.net.URL;

/**
 * Das Haupt-Panel, in dem sich alles befindet.
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

        PersonTable personTable = new PersonTable();
        this.setCenter(personTable);
        this.setTop(new SelectPanel(personTable));
        this.setBottom(new ControlPanel(personTable));
        this.setLeft(new Pillar());
        this.setRight(new Pillar());

        this.setId("main-panel");
        this.embedCss();
    }

    /**
     * Bindet die CSS-Datei ein.
     * (Vorsicht! Die Ordner-Struktur unter "resources" schrittweise erstellen,
     * also NICHT direkt (wie z.B. "none.mydomain.personmanager.frontend")!)
     * @author Chris A.
     */
    private void embedCss() {

        URL styleUrl = this.getClass().getResource("styles.css");
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
