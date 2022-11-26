import java.lang.String;

public class DigitalVideoDisc {
    private String title;  // khởi tạo thuộc tính title kiểu String
    private String category; // khởi tạo thuộc tính category kiểu String
    private String director; // khời tạo thuộc tính director kiểu String
    private int length;  // khỏi tạo thuộc tinhs length kiểu int
    private float cost; // khởi tạo thuộc tính cost kiểu float
    private static int nbDigitalVideoDiscs = 0; // khởi tạo class attribute nbDigitalVideoDiscs kiểu int ( lưu ý: giá trị này thuộc kiểu increment cho mỗi đối tượng)

    private int id;  // khời tạo instance attribute

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
        nbDigitalVideoDiscs++;      // update giá trị của nbDigitalVideoDiscs của class
        this.id= nbDigitalVideoDiscs;
    }


    public int getId(){
        return id;
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
        System.out.print(this.id+ ": " + this.getTitle() + "," +
                this.getCategory() + "," +
                this.getDirector() + "," +
                Integer.toString(this.getLength()) + " minuties ," +
                Float.toString(this.getCost()) + "$ ");
    }

}