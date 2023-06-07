package none.mydomain.personmanager.frontend;

import javafx.scene.layout.BorderPane;
import none.mydomain.personmanager.frontend.simplebuildingblocks.Pillar;

import java.net.URL;

/**
 * Das Haupt-Panel, in dem sich alle andere Komponenten befinden.
 *
 * @author Chris A.
 */
public class MainPanel extends BorderPane {

    private RoofPanel roofPanel;
    private CentralPanel centralPanel;
    private FloorPanel floorPanel;
    private Pillar leftPillar;
    private Pillar rightPillar;

    /**
     * Der Konstruktor.
     *
     * @author Chris A.
     */
    public MainPanel() {

        // Durch das Haupt-Panel erfolgt die Kommunikation zwischen den Panels,
        // deswegen wir es von den drei anderen Panels als Argument erwartet.
        this.roofPanel = new RoofPanel(this);
        this.centralPanel = new CentralPanel(this);
        this.floorPanel = new FloorPanel(this);
        this.leftPillar = new Pillar();
        this.rightPillar = new Pillar();

        this.setTop(this.roofPanel);
        this.setCenter(this.centralPanel);
        this.setBottom(this.floorPanel);
        this.setLeft(this.leftPillar);
        this.setRight(this.rightPillar);

        this.setId("main-panel");
        this.embedCss();
    }

    /*********************
            Getter
     *********************/

    public RoofPanel getRoofPanel() {
        return this.roofPanel;
    }

    public CentralPanel getCentralPanel() {
        return this.centralPanel;
    }

    public FloorPanel getFloorPanel() {
        return this.floorPanel;
    }

    public Pillar getLeftPillar() {
        return this.leftPillar;
    }

    public Pillar getRightPillar() {
        return this.rightPillar;
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
