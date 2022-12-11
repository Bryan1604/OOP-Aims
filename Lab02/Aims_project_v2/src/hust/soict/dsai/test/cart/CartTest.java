package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.util.Scanner;  // khai bao pagekage chua lop Scanner
public class CartTest {
    public static void main(String[] args){
        //Create a new hust.soict.dsai.aims.cart.Cart
        Cart cart = new Cart();

        // Create a new dvd object and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King","Animation","Roger Allll", 87, 19.95f); // tao 1 object
        cart.addDVD(dvd1);   // Truyen vao trong cART

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Crap King","Science Diction","RoBer Allll", 90, 10.95f); // tao 1 object
        cart.addDVD(dvd2);    // truyen vao trong hust.soict.dsai.aims.cart.Cart

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The lion GGGGGing","Animation","Roger Allll",101, 19.95f); // tao mot object
        cart.addDVD(dvd3);    // truyen vao trong hust.soict.dsai.aims.cart.Cart

        //TEST the print menthod
        cart.getInformationOfListDVD();

        //Search dvd in hust.soict.dsai.aims.cart.Cart by id
        Scanner input1 = new Scanner(System.in); // create an object input from keyboard
        System.out.println("Enter the id of dvd you want to find: ");
        int id = input1.nextInt(); // declare a id to store the input the id of DVD from keyboard
        cart.searchById(id);      // call method search by id

        // Search dvd by title
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the title of dvd you want to find: ");
        String title = input2.nextLine(); // declare a id to store the input the title of DVD from keyboard
        cart.searchByTitle(title);      // call method search by title

        input1.close();
        input2.close(); // close the object
    }
}