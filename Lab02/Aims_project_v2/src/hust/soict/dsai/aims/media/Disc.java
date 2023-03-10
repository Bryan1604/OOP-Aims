package hust.soict.dsai.aims.media;

public class Disc extends Media{
    private int length;
    private String director;

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public Disc(int id, String title, String category, float cost, String director, int length){
        super(id,title,category,cost);
        this.length = length;
        this.director = director;
    }

    public String toString(){
        return "DVD : " +this.getId()+"-"+ this.getTitle() + "-" + this.getCategory() + "-" +
                this.getDirector()+ "-" + this.getLength() + "-" +this.getCost() ;
    }

}
