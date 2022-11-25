import java.lang.String;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    /**
     * @param title
     * @param category
     * @param director
     * @param length
     * @param cost
     */
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) { // khai bao mot
                                                                                                      // contructor cua
                                                                                                      // class
                                                                                                      // DigitalVideoDisc
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public String getTitle() { // phuong thuc lay ra ten dvd
        return title;
    } // phuong thuc lay ra tilte cua dvd

    public String getCategory() { // phuong thuc lay ra kho luu tru dvd
        return category;
    } // phuong thuc lay ra category cua dvd

    public int getLength() { // phuong thuc lay ra do dai cua dvd
        return length;
    } // phuong thuc lay ra length cua dvd

    public String getDirector() { // phuong thuc lay ra tac gia cua dvd
        return director;
    } // phuong thuc lay ra diretor cua dvd

    public float getCost() { // phuong thuc lay ra gia cua 1 dvd
        return cost;
    } // phuong thuc lay ra cost cua dvd

    /*
     * public DigitalVideoDisc(String title) {
     * super();
     * this.title = title;
     * }
     */
    public void getInformationDetail() { // phuong thuc lay ra tat ca thong tin cua 1 dvd
        System.out.print(this.getTitle() + "," +
                this.getCategory() + "," +
                this.getDirector() + "," +
                Integer.toString(this.getLength()) + " minuties ," +
                Float.toString(this.getCost()) + "$ ");
    }

    // cài đặt method setting title
    public void setTitle(String title) {
        this.title = title;
    }

    // tạo một contructor với tham số truyền vào là string title
    public DigitalVideoDisc(String title){
        this.title = title;
    }
}