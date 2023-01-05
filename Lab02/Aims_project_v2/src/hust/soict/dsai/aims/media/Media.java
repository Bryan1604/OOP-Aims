package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media(int id, String title, String category, float cost){
        super();
        this.id=id;
        this.title=title;
        this.category= category;
        this.cost = cost;
    }

    public boolean equals(Object obj){
        if(obj instanceof Media){
            Media media = (Media) obj;
            return this.title.equals(media.title);
        }else{
            return false;
        }
    }

    public String toString(){
        return  this.getId()+" : "+ this.getTitle()+" - "+this.getCategory()+" - " + this.getCost();
    }

}
