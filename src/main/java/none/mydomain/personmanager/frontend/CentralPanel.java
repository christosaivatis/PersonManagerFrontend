package none.mydomain.personmanager.frontend;

import javafx.geometry.Orientation;
import javafx.scene.control.SplitPane;

/**
 * Das zentrale Panel, in dem sich die Personentabelle und das Such-Panel befinden.
 * Erhält eine geteilte Ansicht (JavaFX-<code>SplitPane</code>),
 * bei Erscheinung von beiden Komponenten.
 *
 * @author Chris A.
 */
public class CentralPanel extends SplitPane {

    private PersonTable personTable;
    private SearchForm searchForm;

    /**
     * Der Konstruktor.
     *
     * @param mainPanel Das Haupt-Panel.
     * @author Chris A.
     */
    public CentralPanel(MainPanel mainPanel) {

        this.personTable = new PersonTable();
        this.searchForm = new SearchForm(mainPanel, 200.0d, 330.0d);

        this.setOrientation(Orientation.HORIZONTAL);

        // Bei der Initialisierung der Anwendung
        // wird nur die Personen-Tabelle hinzugefügt.
        this.getItems().add(this.personTable);
    }

    /*********************
            Getter
     *********************/

    public PersonTable getPersonTable() {
        return this.personTable;
    }

    public SearchForm getSearchForm() {
        return this.searchForm;
    }
}
