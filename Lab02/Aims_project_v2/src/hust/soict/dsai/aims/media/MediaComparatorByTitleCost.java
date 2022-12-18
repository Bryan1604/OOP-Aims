package hust.soict.dsai.aims.media;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    public int compare(Media o1, Media o2){
       int check = o1.getTitle().compareTo(o2.getTitle());
       if(check!=0){
           return check;
       }else{
           return Float.compare(o2.getCost(),o1.getCost());
       }
    }
}
