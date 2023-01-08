package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.exception.PlayerException;

import javax.swing.*;
import java.lang.String;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0; // khởi tạo class attribute nbDigitalVideoDiscs kiểu int ( lưu ý: giá trị này thuộc kiểu increment cho mỗi đối tượng)

    public DigitalVideoDisc(int id,String title, String category, String director, int length, float cost) {
        super(id,title,category,cost,director,length);
    }

    public void play() throws PlayerException{
        if(this.getLength()>0){
            // add dialog
            JDialog dialog = new JDialog();
            dialog.setSize(400,400);

            // add label
            JLabel label = new JLabel("VDL - " + this.toString());
            label.setHorizontalAlignment(SwingConstants.CENTER);
            dialog.add(label);
            dialog.setTitle("VDL - Play DVD :");
            dialog.setVisible(true);
        }else{
            System.err.println("Error: DVD length is non-positive!");
            throw new PlayerException("Error: DVD length is non-positive!");

        }

    }

    public String toString() { // phuong thuc lay ra tat ca thong tin cua 1 dvd
        return "DVD: " +this.getId()+ " - " + this.getTitle() + " - " +
                this.getCategory() + " - " +
                this.getDirector() + " - " +
                this.getLength() + " minuties - " +
                this.getCost() + " $ ";
    }

    public boolean isMatch(String title){
        if(this.getTitle().equals(title)){
            return true;
        }
        return false;
    }
}