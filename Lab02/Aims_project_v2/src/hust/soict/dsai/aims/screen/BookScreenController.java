package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.media.Book;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BookScreenController {

    @FXML
    private Button btnAdd;

    @FXML
    private TextField tfCategory;

    @FXML
    private TextField tfCost;

    @FXML
    private TextField tfTitle;

    Stage stage;
    public BookScreenController(Stage stage){
        this.stage= stage;
    }

    void addBook (ActionEvent event){
        float Cost;
        try{
            Cost = Float.parseFloat(tfCost.getText());
            Book book = new Book(1,tfTitle.getText(),tfCategory.getText(),Cost);
            tfTitle.setText("");
            tfCategory.setText("");
            tfCost.setText("");
           // StoreScreen.S.addMedia(book);
        }catch (Exception e){

        }
    }

}

