package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args){
        // creat a new hust.soict.dsai.aims.store.Store
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("kkkkkkkk","ddfdfdfdd","rerererere",43,46.64f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("rtrtrtr","uuuuufdfdfdd","rwewewewererere",63,89.64f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("kkewewewew","ddrererdd","oooooerere",83,99.64f);

        store.addDVD(dvd1,dvd2, dvd3);
        System.out.println("hust.soict.dsai.aims.store.Store before:");
        store.printStore();

        store.removeDVD(dvd2);
        System.out.println("hust.soict.dsai.aims.store.Store after:");
        store.printStore();
    }
}