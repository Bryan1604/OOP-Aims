package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

class Aim {
    public static void main(String[] args) {
        final Cart anOrder = new Cart(); // create a new card

        // create new dvd and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("English", "Language", "John", 3, 8.12f);
        anOrder.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Japanese", "Language", "Katazurashi", 4, 4.12f);
        anOrder.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Chinese", "Language", "Xin Chao", 6, 5.12f);
        anOrder.addDVD(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Vietnamese", "Language", "Chien Nguyen00", 1, 4f);
        anOrder.addDVD(dvd4);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Math", "Subject", "Kara", 6, 3.52f);
        anOrder.addDVD(dvd5);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Physic", "Natural", "Johnk", 3, 4.76f);
        anOrder.addDVD(dvd6);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Color", "Art", "Sam", 13, 3.33f);
        anOrder.addDVD(dvd7);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Singer", "Unknow", "John", 8, 3.82f);
        anOrder.addDVD(dvd8);

        // print total cost of the items in the cart
        System.out.println("Total cost is: ");
        System.out.println(anOrder.getTotalCost());

        // print the dvd's quantity in the cart
        System.out.println("the number of DVD int the hust.soict.dsai.aims.cart.Cart is: ");
        System.out.println(anOrder.getQtyOrdered());

        // print the detail information of all dvd in the cart
        System.out.println("Title  Category    Diretor    Length   Cost" + "\t");
        anOrder.getInformationOfListDVD();

         /*
        // remove the DVD from hust.soict.dsai.aims.cart.Cart
        Scanner input_remove = new Scanner(System.in); // create an object input from keyboard
        System.out.println("Enter the title of DVD you want to remove from hust.soict.dsai.aims.cart.Cart: ");
        String title_remove = input_remove.nextLine(); // declare a string to store the input title of DVD from keyboard
        anOrder.removeDVD(title_remove); // call method removeDVD to remove the DVD from the hust.soict.dsai.aims.cart.Cart
        System.out.println("Title  Category    Diretor    Length   Cost" + "\t"); // print information after remove one
                                                                                  // Dvd
        anOrder.getInformationOfListDVD();
        input_remove.close(); // close the object
         */

        System.out.println("list dvd after add:");
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Singer1", "Unknow", "John", 8, 3.92f);  // tạo mới 1 object
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Singer2", "Unknow", "John", 8, 3.2f);   //tạo mới 1 object
        DigitalVideoDisc dvd11 = new DigitalVideoDisc("Singer3", "Unknow", "John", 8, 3.32f);  //tạo mới 1 object

        DigitalVideoDisc DVDlist[] = {dvd9,dvd10,dvd11};  // tạo mới 1 mảng object

        anOrder.addDVD(DVDlist);                          // gọi phương thức addDVD với param truyền vào là 1 mảng
        anOrder.addDVD(dvd10, dvd11);                     // gọi phương thức addDVD với param truyền vào là 2 object
        anOrder.getInformationOfListDVD();                // in ra thông tin list DVD có trong hust.soict.dsai.aims.cart.Cart

    }
}