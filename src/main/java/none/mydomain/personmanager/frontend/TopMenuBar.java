package none.mydomain.personmanager.frontend;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class TopMenuBar extends MenuBar {

    private Menu menu;
    private MenuItem amateur;
    private CheckMenuItem professional;

    public TopMenuBar(PersonTable personTable) {

        this.menu = new Menu("Search");
        this.getMenus().add(this.menu);

        this.amateur = new MenuItem("Amateur");
        this.professional = new CheckMenuItem("Professional");
        this.menu.getItems().addAll(this.amateur, this.professional);

        // to be continued ...
//        this.amateur.setOnAction(actionEvent -> {
//            if (this.amateur.isDisable()) {
//                new SelectPanel(personTable);
//            }
//        });
    }
}
