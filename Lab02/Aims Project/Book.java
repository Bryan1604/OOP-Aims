import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Book extends {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> author = new ArrayList<String>();

    public Book(){

    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*
    public boolean checkAuthor(String authorName){
        while(author.hasNext()){
            if(author.get)
        }
    }
    */

    public void addAuthor(String authorName){
       // ListIterator<String> str = author.listIterator();

        this.author.add(authorName);}
    public void removeAuthor(String authorName){
        author.remove(authorName);

    }
}
