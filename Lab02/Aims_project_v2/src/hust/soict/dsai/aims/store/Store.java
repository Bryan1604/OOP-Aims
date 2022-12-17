package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store{
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();  // khoi tao attribute la 1 mang

    // khoi tao method de them media Vao Store
    public void addMedia(Media... mediaList){
        for(Media media : mediaList)
             itemsInStore.add(media) ;
    }
    // khỏi tạo method đẻ xóa media, param truyền vào là một object
    public void removeMedia(Media media) {
        if(itemsInStore.contains(media)){
            itemsInStore.remove(media);
            System.out.println("the media" + media.getTitle()+ " has been removed from the Store");
        }else{
            System.out.println("The media" + media.getTitle() + " hasn't been in the Store");
        }
    }

    public void printStore(){
        for(Media media : itemsInStore) {
            System.out.println(media.toString());
        }
    }
}