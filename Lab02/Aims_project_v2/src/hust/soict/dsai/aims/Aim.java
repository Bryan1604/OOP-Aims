package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

import javax.script.ScriptContext;
import java.util.Scanner;

class Aim {

    //Main menu
    public static void showMenu() {
        System.out.println("Aims:");
        System.out.println("--------------");
        System.out.println("1: View store");
        System.out.println("2: Update store");
        System.out.println("3: See current cart");
        System.out.println("0: Exit");
        System.out.println("--------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    //store menu
    public static void storeMenu(){
        System.out.println("Option:");
        System.out.println("---------------");
        System.out.println("1: See a media's details");
        System.out.println("2: Add a media to cart");
        System.out.println("3: Play a media");
        System.out.println("4: See current cart");
        System.out.println("0: Back");
        System.out.println("---------------");
        System.out.println("Please choose a number : 0-1-2-3-4");
    }

    // media detail menu
    public static void mediaDetailsMenu(){
        System.out.println("Option");
        System.out.println("--------------");
        System.out.println("1: Add to Cart");
        System.out.println("2: Play");
        System.out.println("0: Back");
        System.out.println("--------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    // cart menu
    public static void cartMenu(){
        System.out.println("Option");
        System.out.println("--------------");
        System.out.println("1: Filter medias in cart");
        System.out.println("2: Sort medias in cart");
        System.out.println("3: Remove media from cart");
        System.out.println("4: Play a media");
        System.out.println("5: Place order");
        System.out.println("0: Back");
        System.out.println("--------------");
        System.out.println("Please choose a number : 0-1-2-3-4-5");
    }

    public static int readInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static String readString(){
        Scanner input = new Scanner(System.in);
        return input.next();
    }
    public static Float readFloat(){
        Scanner input = new Scanner(System.in);
        return input.nextFloat();
    }

    //handle media detail menu

    public static void handleMediaDetailMenu(Store store, Cart cart) throws Exception {
        boolean back = false;
        int option ;
        while(!back){
            mediaDetailsMenu();
            option = readInt();
            switch (option){
                case 1:
                    System.out.println("Please enter the title of media on the screen you want to add to the cart");
                    Media media = store.searchByTitle(readString());
                    if(media == null){
                        System.out.println("No found");
                    }else{
                            cart.addMedia(media);
                    }
                    // count the number of DVD in the current cart
                case 2:
                    System.out.println("Please enter the title of media you want to play");
                case 0:
                    back = true;
                    break;
            }
        }
    }
    // handle store menu
    public static void handleStoreMenu(Store store, Cart cart) throws Exception {
        boolean back = true;
        int option;
        while (!back){
            store.printStore();
            storeMenu();
            option = readInt();
            switch (option){
                case 1:
                    System.out.println("Please enter the title to get detail media:");
                    Media media = store.searchByTitle(readString());
                    if(media == null){
                        System.out.println("Have nothing to find");
                    }else{
                        System.out.println(media.toString());
                    }
                    handleMediaDetailMenu(store, cart);
                    break;
                case 2:

                case 3:
                case 4:
                case 0:
                    back = true;
                    break;
            }
        }

    }

    // handle main menu
    public static void handleMenu(){
        boolean exit = false;
        while(!exit) {
            showMenu();
            int option = readInt();
            switch (option) {
                case 1:
                    storeMenu();
                    // handle store menu
                    break;
                case 2:
                    //add a media to or remove a media from the store
                    break;
                case 3:
                    // see the current cart

                    //show the cart menu
                    cartMenu();
                    break;
                case 0:
                    exit = true;
                    break;
            }
        }
    }

    public static void main(String args[]){
        showMenu();


    }
}
