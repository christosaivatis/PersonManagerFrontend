package none.mydomain.personmanager.frontend;

import javafx.scene.control.MenuBar;

/**
 * Die obere Menüleiste mit den verschiedenen Menüs (zuerst nur das Suchmenü).
 *
 * @author Chris A.
 */
public class TopMenuBar extends MenuBar {

    private SearchMenu searchMenu;

    /**
     * Der Konstruktor.
     *
     * @param mainPanel Das Haupt-Panel.
     * @author Chris A.
     */
    public TopMenuBar(MainPanel mainPanel) {

        this.searchMenu = new SearchMenu(mainPanel);

        this.getMenus().add(this.searchMenu);
    }

    /*********************
            Getter
     *********************/

    public SearchMenu getSearchMenu() {
        return this.searchMenu;
    }
}
