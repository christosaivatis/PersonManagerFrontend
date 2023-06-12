package none.mydomain.personmanager.frontend;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.HashMap;

/**
 * Das Panel für die erweiterte live Suche.
 *
 * @author Chris A.
 */
public class SearchForm extends GridPane {

    /**
     * Dient zum Speichern und Zugreifen
     * auf die folgenden zwei Werte für jede Personen-Eigenschaft:
     * <ul>
     *     <li>Der entsprechende Spaltenname im Backend (Datenbanktabelle)</li>
     *     <li>Der entsprechende Label-Text im Frontend (JavaFX-Oberfläche)</li>
     * </ul>
     *
     * @author Chris A.
     */
    private enum PersonEnum {

        ID              ("id",              "Id: "),
        TITLE           ("title",           "Title: "),
        FIRSTNAME       ("firstName",       "First name: "),
        LASTNAME        ("lastName",        "Last name: "),
        DATEOFBIRTH     ("dateOfBirth",     "Date of birth: "),
        STREET          ("street",          "Street: "),
        HOUSENUMBER     ("houseNumber",     "House number: "),
        ZIPCODE         ("zipCode",         "Zip code: "),
        CITY            ("city",            "City: "),
        MOBILENUMBER    ("mobileNumber",    "Mobile number: "),
        EMAIL           ("email",           "Email: ");

        private String propertyName;
        private String labelValue;

        /**
         * Der Konstruktor.
         *
         * @param dbTableColName Der entsprechende Spaltenname im Backend (Datenbanktabelle).
         * @param labelText Der entsprechende Label-Text im Frontend (JavaFX-Oberfläche).
         * @author Chris A.
         */
        private PersonEnum(String dbTableColName, String labelText) {

            this.propertyName = dbTableColName;
            this.labelValue = labelText;
        }

        /**************************************
         *          Getter-Methoden.          *
         **************************************/

        public String getPropertyName() {

            return this.propertyName;
        }

        public String getLabelValue() {

            return this.labelValue;
        }
    }

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

        // Die Überschrift für das Such-Formular.
        Label headline = new Label("Extended Live Search!");
        this.add(headline, 1, 0);
        headline.setId("my-labels");

        // Nur ein Platzhalter, deswegen zwei leere Labels.
        this.add(new Label(), 1, 1);
        this.add(new Label(), 2, 1);

        // Neue Implementierung mit Benutzung einer HashMap.
        HashMap<PersonEnum, TextField> labelsAndTextFields = new HashMap<>();

        // Erstellung aller Labels und Textfelder mithilfe der Person-Enumeration.
        int x = 2;
        for (PersonEnum personProperty : PersonEnum.values()) {
            Label label = new Label(personProperty.getLabelValue());
            TextField textField = new TextField();
            labelsAndTextFields.put(personProperty, textField);

            this.add(label, 1, x);
            this.add(textField, 2, x);
            x++;

            textField.setOnKeyTyped(event -> {
                StringBuilder hqlStringBuilder = new StringBuilder("FROM Person WHERE ");

                int i = labelsAndTextFields.size() - 1;
                for (PersonEnum personProperty2 : labelsAndTextFields.keySet()) {
                    hqlStringBuilder.append("(");
                    hqlStringBuilder.append(personProperty2.getPropertyName());
                    hqlStringBuilder.append(" LIKE ");
                    hqlStringBuilder.append("\"");
                    TextField textField2 = labelsAndTextFields.get(personProperty2);
                    hqlStringBuilder.append(textField2.getText());
                    hqlStringBuilder.append("%\"");
                    hqlStringBuilder.append(" OR ");
                    hqlStringBuilder.append(personProperty2.getPropertyName());
                    hqlStringBuilder.append(" = NULL)");
                    if (i > 0) {
                        hqlStringBuilder.append(" AND ");
                    }
                    i--;
                }

                String hql = hqlStringBuilder.toString();
                mainPanel.getCentralPanel().getPersonTable().loadRecords(hql);
            });
        }
    }
}
