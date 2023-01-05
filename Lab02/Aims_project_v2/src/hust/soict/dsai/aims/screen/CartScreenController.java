package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

//import javax.swing.text.TableView;

public class CartScreenController {
    private Cart cart;

    private TableView<Media> tblMedia;
    private TableColumn<Media,String> colMediaTitle;
    private TableColumn<Media,String> colMediaCategory;
    private TableColumn<Media,Float> coleMediaCost;

    public CartScreenController(Cart cart){
        super();
        this.cart = cart;
    }

    private void initialize(){
        // get data
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media,String>("title"));
        colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media,String>("category"));
        coleMediaCost.setCellValueFactory(new PropertyValueFactory<Media,Float>("cost"));
        // push data
        tblMedia.setItems(this.cart.getItemsOrdered());
    }

}
