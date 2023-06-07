package none.mydomain.personmanager.frontend;

import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import none.mydomain.personmanager.frontend.simplebuildingblocks.Pillar;

public class TopMenuBar extends MenuBar {

    private Menu menu;

    private CheckMenuItem amateur;
    private CheckMenuItem professional;

    private SelectPanel selectPanel;
    private SearchPanel searchPanel;

    public TopMenuBar(RoofPanel roofPanel, MainPanel mainPanel, PersonTable personTable) {

        this.menu = new Menu("Search");
        this.getMenus().add(this.menu);

        this.amateur = new CheckMenuItem("For Amateurs - Extended Live Search!");
        this.professional = new CheckMenuItem("For Professionals - SQL/HQL");
        this.menu.getItems().addAll(this.amateur, this.professional);

        this.selectPanel = new SelectPanel(personTable);

        this.searchPanel = new SearchPanel(personTable, 200.0d, 330.0d);

        this.amateur.setOnAction(actionEvent -> {
            if (this.amateur.isSelected()) {
                mainPanel.setRight(null);
                mainPanel.getCentralPanel().getItems().add(this.searchPanel);
            }
            else {
                mainPanel.setRight(new Pillar());
                mainPanel.getCentralPanel().getItems().remove(this.searchPanel);
            }
        });

        this.professional.setOnAction(actionEvent -> {
            if (this.professional.isSelected()) {
                roofPanel.getChildren().add(this.selectPanel);
            }
            else {
                roofPanel.getChildren().remove(this.selectPanel);
            }
        });
    }
}
