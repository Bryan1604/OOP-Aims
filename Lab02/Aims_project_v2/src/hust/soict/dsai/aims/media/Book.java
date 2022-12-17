package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost, List<String> authors){
        super(id, title,category,cost);
        this.authors = authors;
    }

    public Book(int id, String title, String category, float cost){
        super(id, title,category,cost);
    }

    public void addAuthor(String authorName){
        if(!authors.contains(authorName))
            authors.add(authorName);
        else
            System.out.println(authorName + " has been existed");
    }
    public void removeAuthor(String authorName){
        if(!authors.contains(authorName)){
            authors.remove(authorName);
        }
        else
            System.out.println(authorName + " hasn't present in this book");
    }
    public String toString(){
        return "Book: " + this.getId() + "-" + this.getTitle() + "-" +
                this.getCategory() + "-"+this.getCost()+ "$" + "-" + "authors:" + this.authors;
    }
}
