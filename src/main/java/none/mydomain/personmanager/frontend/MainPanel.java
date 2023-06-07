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

    private PersonTable personTable;

    private CentralPanel centralPanel;
    private RoofPanel roofPanel;
    private FloorPanel floorPanel;
    private Pillar leftPillar;
    private Pillar rightPillar;

    /**
     * Der Konstruktor.
     *
     * @author Chris A.
     */
    public MainPanel() {

        this.personTable = new PersonTable();

        this.centralPanel = new CentralPanel(personTable);
        this.roofPanel = new RoofPanel(this, this.personTable);
        this.floorPanel = new FloorPanel(this.personTable);
        this.leftPillar = new Pillar();
        this.rightPillar = new Pillar();

        this.setCenter(this.centralPanel);
        this.setTop(this.roofPanel);
        this.setBottom(this.floorPanel);
        this.setLeft(this.leftPillar);
        this.setRight(this.rightPillar);

        this.setId("main-panel");
        this.embedCss();
    }

    /**
     * Getter für splitPane.
     *
     * @return
     * @author Chris A.
     */
    public CentralPanel getCentralPanel() {
        return this.centralPanel;
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
