package none.mydomain.personmanager.frontend;

import javafx.geometry.Orientation;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import none.mydomain.personmanager.frontend.simplebuildingblocks.Pillar;

import java.net.URL;

/**
 * Das Haupt-Panel, in dem sich alle andere Komponenten befinden.
 *
 * @author Chris A.
 */
public class MainPanel extends BorderPane {

    private SplitPane splitPane;

    /**
     * Der Konstruktor.
     *
     * @author Chris A.
     */
    public MainPanel() {

        PersonTable personTable = new PersonTable();
        this.splitPane = new SplitPane();
        this.splitPane.setOrientation(Orientation.HORIZONTAL);
        this.splitPane.getItems().add(personTable);
        this.setCenter(splitPane);
        this.setTop(new RoofPanel(this, personTable));
        this.setBottom(new FloorPanel(personTable));
        this.setLeft(new Pillar());
        this.setRight(new Pillar());

        this.setId("main-panel");
        this.embedCss();
    }

    /**
     * Getter für splitPane.
     *
     * @return
     * @author Chris A.
     */
    public SplitPane getSplitPane() {
        return this.splitPane;
    }

    /**
     * Bindet die CSS-Datei ein.
     * (Vorsicht! Die Ordner-Struktur unter "resources" schrittweise erstellen,
     * also NICHT direkt (wie z.B. "none.mydomain.personmanager.frontend")!)
     *
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
