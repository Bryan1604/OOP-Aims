package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
//import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static javafx.application.Application.launch;

public class CartScreen extends JFrame {
    private Cart cart;

    public CartScreen(Cart cart){
        super();
        this.cart = cart;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Cart");
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try{
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/cart.fxml"));
                    CartScreenController controller = new CartScreenController(cart);
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root,1024,748));
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) throws Exception {
        List<Track> tracks = new ArrayList<Track>();
        Track t1,t2,t3;
        t1 = new Track("Track1", 1);
        t2 = new Track("Track2", 2);
        t3 = new Track("Track3", 3);
        tracks.add(t1);
        tracks.add(t2);
        tracks.add(t3);

        CompactDisc cd = new CompactDisc(1,"cd","a",122f,"vdl",32,"vdl",tracks);
        DigitalVideoDisc vdv = new DigitalVideoDisc(2,"hell","englsh","rerer",23,34f);

        List<String> author = new ArrayList<String>();
        author.add("jame");
        author.add("Luong");
        Book book = new Book(3,"KHKE","HISTPR",23f,author);
        Cart cart = new Cart();
        cart.addMedia(cd);
        cart.addMedia(vdv);
        cart.addMedia(book);

        new CartScreen(cart);
    }
}
