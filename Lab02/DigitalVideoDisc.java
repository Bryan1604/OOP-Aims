import java.lang.String;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc(String string, String string2, String string3, int i, double d) {
    }

    /**
     * @param title
     * @param category
     * @param director
     * @param lenght
     * @param cost
     */
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    } // lay ra ten dvd

    public String getCategory() {
        return category;
    } // lay ra kho luu tru dvd

    public int getLength() {
        return length;

    }

    public String getDirector() {
        return director;
    }

    public float getCost() {
        return cost;
    }

    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

}