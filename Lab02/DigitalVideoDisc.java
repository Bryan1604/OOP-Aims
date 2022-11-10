public class DigitalVideoDisc{
    private String title;
    private String category;
    private String director;
    private int lenght;
    private float cost;

    public void DigitalVideoDisc(String title, String category, String director, int lenght, float cost){
        this.title = title;
        this.category = category;
        this.director = director;
        this.lenght = lenght;
        this.cost = cost;
    }
    public String getTitle(){
        return title;
    }     // lay ra ten dvd

    public String getCategory() {
        return category;
    }  // lay ra kho luu tru dvd

    public String getDirector() {
        return this.director;
    }

    public double getCost() {
        return cost;
    }

    public static main(String[] args){

    }
}