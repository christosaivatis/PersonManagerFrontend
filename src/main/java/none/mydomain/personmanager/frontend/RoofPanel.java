package none.mydomain.personmanager.frontend;

import javafx.scene.layout.VBox;

/**
 * Das "Dach"-Panel, in dem sich die obere Menüleiste und die "Select"-Leiste befinden.
 * Bei Erscheinung von beiden Komponenten
 * werden diese untereinander dargestellt (JavaFX-<code>VBox</code>).
 *
 * @author Chris A.
 */
public class RoofPanel extends VBox {

    private TopMenuBar topMenuBar;
    private SelectBar selectBar;

    /**
     * Der Konstruktor.
     *
     * @param mainPanel Das Haupt-Panel.
     * @author Chris A.
     */
    public RoofPanel(MainPanel mainPanel) {

        this.topMenuBar = new TopMenuBar(mainPanel);
        this.selectBar = new SelectBar(mainPanel);

        // Bei der Initialisierung der Anwendung
        // wird nur die obere Menüleiste hinzugefügt.
        this.getChildren().add(this.topMenuBar);
    }

    /*********************
            Getter
     *********************/

    public TopMenuBar getTopMenuBar() {
        return this.topMenuBar;
    }

    public SelectBar getSelectBar() {
        return this.selectBar;
    }
}
