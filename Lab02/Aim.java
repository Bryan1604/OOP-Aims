
public class Aim {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("English", "Language", "John", 3, 8.12);
        anOrder.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Japanese", "Language", "Katazurashi", 4, 4.12);
        anOrder.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Chinese", "Language", "Xin Chao", 6, 5.12);
        anOrder.addDVD(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Vietnamese", "Language", "Chien Nguyen00", 1, 4);
        anOrder.addDVD(dvd4);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Math", "Subject", "Kara", 6, 3.52);
        anOrder.addDVD(dvd5);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Physic", "Natural", "Johnk", 3, 4.76);
        anOrder.addDVD(dvd6);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Color", "Art", "Sam", 13, 3.33);
        anOrder.addDVD(dvd7);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Singer", "Unknow", "John", 8, 3.82);
        anOrder.addDVD(dvd8);

        // print total cost of the items in the cart
        System.out.println("Total cost llis: ");
        System.out.println(anOrder.cost());
        System.out.println(anOrder.getQtyOrdered());

    }
}