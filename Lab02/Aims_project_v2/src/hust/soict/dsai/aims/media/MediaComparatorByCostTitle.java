package hust.soict.dsai.aims.media;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
    public int compare(Media o1, Media o2){
        int check = Float.compare(o2.getCost(),o1.getCost());
        if(check != 0){
            return check;
        }else{
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

}
