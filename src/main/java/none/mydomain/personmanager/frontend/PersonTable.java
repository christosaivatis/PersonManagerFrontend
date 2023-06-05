package none.mydomain.personmanager.frontend;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import none.mydomain.personmanager.backend.Person;
import none.mydomain.personmanager.backend.PersonHandler;

import java.util.List;

/**
 *
 *
 *
 */
public class PersonTable extends TableView<Person> {

    private PersonHandler personHandler;

    /**
     * Der Konstruktor.
     *
     *
     */
    public PersonTable() {

        TableColumn<Person, Integer> id = new TableColumn<>("Id");
        TableColumn<Person, String> title = new TableColumn<>("Title");
        TableColumn<Person, String> firstName = new TableColumn<>("First name");
        TableColumn<Person, String> lastName = new TableColumn<>("Last name");
        TableColumn<Person, String> dateOfBirth = new TableColumn<>("Date of birth");
        TableColumn<Person, String> street = new TableColumn<>("Street");
        TableColumn<Person, String> houseNumber = new TableColumn<>("House number");
        TableColumn<Person, String> zipCode = new TableColumn<>("Zip code");
        TableColumn<Person, String> city = new TableColumn<>("City");
        TableColumn<Person, String> mobileNumber = new TableColumn<>("Mobile number");
        TableColumn<Person, String> email = new TableColumn<>("Email");

        this.getColumns().addAll(id, title, firstName, lastName, dateOfBirth,
                street, houseNumber, zipCode, city, mobileNumber, email);

        // Erstellung der Verbindung mit dem entsprechenden POJO.
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        dateOfBirth.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));
        street.setCellValueFactory(new PropertyValueFactory<>("street"));
        houseNumber.setCellValueFactory(new PropertyValueFactory<>("houseNumber"));
        zipCode.setCellValueFactory(new PropertyValueFactory<>("zipCode"));
        city.setCellValueFactory(new PropertyValueFactory<>("city"));
        mobileNumber.setCellValueFactory(new PropertyValueFactory<>("mobileNumber"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));

        this.personHandler = new PersonHandler();
    }

    /**
     * Ladet in das Frontend alle Datensätze aus der Datenbank.
     *
     * @author Chris A.
     */
    public void loadAll() {

        List<Person> allPersonsList = this.personHandler.getAll();



        for (Person p : allPersonsList) {
            this.getItems().add(p);
        }
    }

    /**
     * Ladet in das Frontend nur die Datensätze aus der Datenbank,
     * die den Kriterien im HQL-String entsprechen.
     * (HQL = "Hibernate Query Language")
     *
     * @author Chris A.
     */
    public void loadSome(String hql) {

        List<Person> somePersonsList = this.personHandler.getSome(hql);



        for (Person p : somePersonsList) {
            this.getItems().add(p);
        }
    }
}
