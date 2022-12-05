import java.util.Scanner;  // khai bao pagekage chua lop Scanner
public class CartTest {
    public static void main(String[] args){
        //Create a new Cart
        Cart cart = new Cart();

        // Create a new dvd object and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King","Animation","Roger Allll", 87, 19.95f); // tao 1 object
        cart.addDigitalVideoDisc(dvd1);   // Truyen vao trong cART

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Crap King","Science Diction","RoBer Allll", 90, 10.95f); // tao 1 object
        cart.addDigitalVideoDisc(dvd1);    // truyen vao trong Cart

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The lion GGGGGing","Animation","Roger Allll", 19.95f); // tao mot object
        cart.addDigitalVideoDisc(dvd1);    // truyen vao trong Cart

        //TEST the print menthod
        cart.getInformationOfListDVD();

        //Search dvd in Cart by id
        Scanner input = new Scanner(System.in); // create an object input from keyboard
        System.out.println("Enter the id of dvd you want to find: ");
        Int id = input.nextInt(); // declare a id to store the input the id of DVD from keyboard
        cart.searchById(id);      // call method search by id

        // Search dvd by title
        System.out.println("Enter the id of dvd you want to find: ");
        String title = input.nextLine(); // declare a id to store the input the title of DVD from keyboard
        cart.searchByTitle(title);      // call method search by title
        input.close(); // close the object
    }
}