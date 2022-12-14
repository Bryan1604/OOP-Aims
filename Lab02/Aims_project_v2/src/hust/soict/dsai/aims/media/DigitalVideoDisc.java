package hust.soict.dsai.aims.media;

import java.lang.String;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0; // khởi tạo class attribute nbDigitalVideoDiscs kiểu int ( lưu ý: giá trị này thuộc kiểu increment cho mỗi đối tượng)

    public DigitalVideoDisc(int id,String title, String category, String director, int length, float cost) {
        super(id,title,category,cost,director,length);
        //.director = director;
        //this.length = length;
    }

    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public void getInformationDetail() { // phuong thuc lay ra tat ca thong tin cua 1 dvd
        System.out.print(this.getId()+ ": " + this.getTitle() + "," +
                this.getCategory() + "," +
                this.getDirector() + "," +
                Integer.toString(this.getLength()) + " minuties ," +
                Float.toString(this.getCost()) + "$ ");
    }

    public boolean isMatch(String title){
        if(this.getTitle().equals(title)){
            return true;
        }
        return false;
    }
}