package hust.soict.dsai.aims.screen;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BookScreen {
    public Scene bookScene(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Book.fxml"));
        BookScreenController controller = new BookScreenController(stage);
        loader.setController(controller);
        Parent root = loader.load();
        return new Scene(root);
    }
}
