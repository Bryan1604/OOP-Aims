package hust.soict.dsai.test.book;
import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args){
        List<Media> mediae = new ArrayList<Media>();
        List<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("track1",1));
        tracks.add(new Track("track2",2));
        //create cd object
        CompactDisc cd = new CompactDisc(1,"cdMusic","music",11.2f,"art",12,"james",tracks);

        //create book object
        Book book = new Book(2,"War","History",14.54f) ;
        book.addAuthor("Authers");
        book.addAuthor("James");

        //create dvd object
        DigitalVideoDisc dvd = new DigitalVideoDisc(3,"dvd1","dvd","john",13,14.3f);
        mediae.add(cd);
        mediae.add(book);
        mediae.add(dvd);
        for(Media media : mediae){
            System.out.println(media.toString());
        }
        //System.out.println(book1.getAuthors());
    }
}
