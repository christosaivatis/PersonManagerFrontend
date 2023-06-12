package none.mydomain.personmanager.frontend;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Das Panel für die erweiterte live Suche.
 *
 * @author Chris A.
 */
public class SearchForm extends GridPane {

    /**
     * Der Konstruktor.
     *
     * @param mainPanel Das Haupt-Panel.
     * @param minWidth Die erwünschte minimale Breite.
     * @param maxWidth Die erwünschte maximale Breite.
     * @author Chris A.
     */
    public SearchForm(MainPanel mainPanel, double minWidth, double maxWidth) {

        this.setMinWidth(minWidth);
        this.setMaxWidth(maxWidth);

        this.setPadding(new Insets(50.0d, 20.0d, 10.0d, 20.0d));

        // Der Überschrift für das Such-Formular.
        Label headline = new Label("Extended Live Search!");
        this.add(headline, 1, 0);
        headline.setId("my-labels");

        // Nur ein Platzhalter, deswegen beides mit leerem Label.
        this.add(new Label(), 1, 1);
        this.add(new Label(), 2, 1);

        // Klassische Variante.
//        TextField titleTextField = new TextField();
//        titleTextField.setOnKeyTyped(event -> {
//            System.out.println(titleTextField.getText());
//        });
//        this.add(new Label("Title: "), 1, 2);
//        this.add(titleTextField, 2, 2);
//
//        TextField fNameTextField = new TextField();
//        fNameTextField.setOnKeyTyped(event -> {
//            System.out.println(fNameTextField.getText());
//        });
//        this.add(new Label("First name: "), 1, 3);
//        this.add(fNameTextField, 2, 3);
//
//        TextField lNameTextField = new TextField();
//        lNameTextField.setOnKeyTyped(event -> {
//            System.out.println(lNameTextField.getText());
//        });
//        this.add(new Label("Last name: "), 1, 4);
//        this.add(lNameTextField, 2, 4);
//
//        TextField dobTextField = new TextField();
//        dobTextField.setOnKeyTyped(event -> {
//            System.out.println(dobTextField.getText());
//        });
//        this.add(new Label("Date of birth: "), 1, 5);
//        this.add(dobTextField, 2, 5);
//
//        TextField streetTextField = new TextField();
//        streetTextField.setOnKeyTyped(event -> {
//            System.out.println(streetTextField.getText());
//        });
//        this.add(new Label("Street: "), 1, 6);
//        this.add(streetTextField, 2, 6);
//
//        TextField houseNoTextField = new TextField();
//        houseNoTextField.setOnKeyTyped(event -> {
//            System.out.println(houseNoTextField.getText());
//        });
//        this.add(new Label("House number: "), 1, 7);
//        this.add(houseNoTextField, 2, 7);
//
//        TextField zipCodeTextField = new TextField();
//        zipCodeTextField.setOnKeyTyped(event -> {
//            System.out.println(zipCodeTextField.getText());
//        });
//        this.add(new Label("Zip code: "), 1, 8);
//        this.add(zipCodeTextField, 2, 8);
//
//        TextField cityTextField = new TextField();
//        cityTextField.setOnKeyTyped(event -> {
//            System.out.println(cityTextField.getText());
//        });
//        this.add(new Label("City: "), 1, 9);
//        this.add(cityTextField, 2, 9);
//
//        TextField mobileNoTextField = new TextField();
//        mobileNoTextField.setOnKeyTyped(event -> {
//            System.out.println(mobileNoTextField.getText());
//        });
//        this.add(new Label("Mobile number: "), 1, 10);
//        this.add(mobileNoTextField, 2, 10);
//
//        TextField emailTextField = new TextField();
//        emailTextField.setOnKeyTyped(event -> {
//            System.out.println(emailTextField.getText());
//        });
//        this.add(new Label("Email: "), 1, 11);
//        this.add(emailTextField, 2, 11);





        // Variante ArrayList.
//        ArrayList<TextField> textFieldsInArrayList = new ArrayList<>();
//        textFieldsInArrayList.add(new TextField());
//        textFieldsInArrayList.get(0).setOnKeyTyped(event -> {
//            System.out.println(textFieldsInArrayList.get(0).getText());
//        });





        // Variante HashMap.
        HashMap<Label, TextField> textFieldsInHashMap = new HashMap<>();
        textFieldsInHashMap.put(new Label("Title: "), new TextField());
        textFieldsInHashMap.put(new Label("First name: "), new TextField());
        textFieldsInHashMap.put(new Label("Last name: "), new TextField());
        textFieldsInHashMap.put(new Label("Date of birth: "), new TextField());
        textFieldsInHashMap.put(new Label("Street: "), new TextField());
        textFieldsInHashMap.put(new Label("House number: "), new TextField());
        textFieldsInHashMap.put(new Label("Zip code: "), new TextField());
        textFieldsInHashMap.put(new Label("City: "), new TextField());
        textFieldsInHashMap.put(new Label("Mobile number: "), new TextField());
        textFieldsInHashMap.put(new Label("Email: "), new TextField());
        int x;
        x = 2;
        for (Label label : textFieldsInHashMap.keySet()) {
            this.add(label, 1, x);
            x++;
        }
        x = 2;
        for (TextField textField : textFieldsInHashMap.values()) {
            this.add(textField, 2, x);
            x++;

            textField.setOnKeyTyped(event -> {
                System.out.println(textField.getText());
            });
        }
    }
}
