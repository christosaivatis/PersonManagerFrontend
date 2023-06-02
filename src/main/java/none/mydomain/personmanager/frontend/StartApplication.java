package none.mydomain.personmanager.frontend;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 */
public class StartApplication extends Application {

    /**
     * Initialisiert das Ganze und zeigt das Applikationsfenster an.
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

    /**
     * Startet einfach das Ganze!
     *
     * @param args
     * @author Chris A.
     */
    public static void main(String[] args) {

        launch(args);
    }
}
