package none.mydomain.personmanager.frontend;

import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;

/**
 * Das Suchmenü mit den zwei Auswahlmöglichkeiten "Amateur" und "Professional".
 *
 * @author Chris A.
 */
public class SearchMenu extends Menu {

    private CheckMenuItem amateur;
    private CheckMenuItem professional;

    /**
     * Der Konstruktor.
     *
     * @param mainPanel Das Haupt-Panel.
     * @author Chris A.
     */
    public SearchMenu(MainPanel mainPanel) {

        super("Search");

        this.amateur = new CheckMenuItem("For Amateurs - Extended Live Search!");
        this.professional = new CheckMenuItem("For Professionals - SQL/HQL");
        this.getItems().addAll(this.amateur, this.professional);

        this.addAmateurCheckMenuItemFunctionality(mainPanel);
        this.addProfessionalCheckMenuItemFunctionality(mainPanel);
    }

    /*********************
            Getter
     *********************/

    public CheckMenuItem getAmateur() {
        return this.amateur;
    }

    public CheckMenuItem getProfessional() {
        return this.professional;
    }

    /**
     * Fügt die Funktionalität des "Amateur"-CheckMenuItems hinzu.
     *
     * @param mainPanel Das Haupt-Panel.
     * @author Chris A.
     */
    private void addAmateurCheckMenuItemFunctionality(MainPanel mainPanel) {

        this.amateur.setOnAction(event -> {
            if (this.amateur.isSelected()) {
                mainPanel.setRight(null);
                mainPanel.getCentralPanel().getItems().add(
                        mainPanel.getCentralPanel().getSearchForm());
            }
            else {
                mainPanel.setRight(mainPanel.getRightPillar());
                mainPanel.getCentralPanel().getItems().remove(
                        mainPanel.getCentralPanel().getSearchForm());
            }
        });
    }

    /**
     * Fügt die Funktionalität des "Professional"-CheckMenuItems hinzu.
     *
     * @param mainPanel Das Haupt-Panel.
     * @author Chris A.
     */
    private void addProfessionalCheckMenuItemFunctionality(MainPanel mainPanel) {

        this.professional.setOnAction(event -> {
            if (this.professional.isSelected()) {
                mainPanel.getRoofPanel().getChildren().add(
                        mainPanel.getRoofPanel().getSelectBar());
            }
            else {
                mainPanel.getRoofPanel().getChildren().remove(
                        mainPanel.getRoofPanel().getSelectBar());
            }
        });
    }
}
