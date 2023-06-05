package none.mydomain.personmanager.frontend;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Zum Starten und Initialisieren der Anwendung.
 *
 * @author Chris A.
 */
public class StartApplication extends Application {

    /**
     * Startet einfach die Anwendung.
     *
     * @param args
     * @author Chris A.
     */
    public static void main(String[] args) {

        launch(args);
    }

    /**
     * Initialisiert die Anwendung und zeigt das Fenster an.
     *
     * @param stage
     * @throws Exception
     * @author Chris A.
     */
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Person Manager");
        stage.setScene(new Scene(new MainPanel(), 800, 600));
        stage.show();
    }
}
