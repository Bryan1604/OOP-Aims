package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

import java.util.ArrayList;

public class Store{
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();  // khoi tao attribute la 1 mang

    // khoi tao method de them DVD Vao hust.soict.dsai.aims.store.Store
    public void addDVD(DigitalVideoDisc... dvdList){
        for(DigitalVideoDisc dvd : dvdList)
             itemsInStore.add(dvd) ;
    }
    // khỏi tạo method đẻ xóa DVD, param truyền vào là một object
    public void removeDVD(DigitalVideoDisc DVD) {
        itemsInStore.remove(DVD);
    }

    public void printStore(){
        for(DigitalVideoDisc dvd : itemsInStore) {
            dvd.getInformationDetail();
            System.out.println(" ");
        }
    }
}