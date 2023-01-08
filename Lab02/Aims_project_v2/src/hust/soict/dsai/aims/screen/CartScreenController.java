package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import javafx.beans.Observable;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
//import sun.awt.NullComponentPeer;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;

//import javax.swing.*;
//import javax.swing.event.ChangeEvent;
//import java.awt.*;
//import java.awt.event.ActionEvent;

//import javax.swing.text.TableView;

public class CartScreenController {
    private Cart cart;
    @FXML
    private TableView<Media> tblMedia;
    @FXML
    private TableColumn<Media,String> colMediaTitle;
    @FXML
    private TableColumn<Media,String> colMediaCategory;
    @FXML
    private TableColumn<Media,Float> coleMediaCost;

    @FXML
    private Button btnPlay;
    @FXML
    private Button btnRemove;
    @FXML
    private TextField tfFilter;
    @FXML
    private Label totalCost;
    @FXML
    private RadioButton radioBtnFilterId;
    @FXML
    private RadioButton radioBtnFilterTitle;
    @FXML
    private ToggleGroup filterCategory;

    public CartScreenController(Cart cart){
        super();
        this.cart = cart;
    }

    @FXML
    private void initialize(){
        // get data
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media,String>("title"));
        colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media,String>("category"));
        coleMediaCost.setCellValueFactory(new PropertyValueFactory<Media,Float>("cost"));
        // push data
        tblMedia.setItems(this.cart.getItemsOrdered());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>(){
                    public void changed(ObservableValue<? extends Media> observable,Media oldValue, Media newValue) {
                        if(newValue!=null){
                            updateButtonBar(newValue);
                        }
                    }
                }
        );

        tfFilter.textProperty().addListener(new ChangeListener<String>(){
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue){
                if(radioBtnFilterTitle.selectedProperty().getValue()){
                    showFilterMedia(newValue);
                }else{
                    int id;
                    try{
                        id = Integer.parseInt(newValue);
                    }catch (Exception e){
                        id = 0;
                    }
                    showFilterMedia(id);
                }

            }
        });
    }

    void updateButtonBar(Media media){
        btnRemove.setVisible(true);
        if(media instanceof Playable){
            btnPlay.setVisible(true);
        }else {
            btnPlay.setVisible(false);
        }
    }
    @FXML
    void btnRemovePressed(ActionEvent event){
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
    }

    // search by title
    void showFilterMedia(String title){
        tblMedia.setItems(this.cart.getItemsOrdered(title));
    }
    // search by id
    void showFilterMedia(int id){
        tblMedia.setItems(this.cart.getItemsOrdered(id));
    }

    // button place order
    @FXML
    void BtnPlaceOrder(ActionEvent event){
        this.cart.setEmptyCart();
        // set the cost;
        totalCost.setText(this.cart.getTotalCost() + " $");
    }

    // play the media
    @FXML
    void playTrackPressed(javafx.event.ActionEvent event){
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        //media.play();  // need to fix
    }

    //set the total Cost
    void setTotalCost(){
        totalCost.setText(this.cart.getTotalCost() + " $");
    }

}
