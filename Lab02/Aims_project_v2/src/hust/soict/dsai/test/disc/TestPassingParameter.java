package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        /*
        //Todo auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");  // tạo mới 1 dvd tên là jungle
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella"); // tạo mới một DVD tên là Cinderella

         hướng làm swap 2 đối tượng Jungle và Cinderella
        *    1) tạo một class phụ có tên là hust.soict.dsai.test.disc.Swapper và có 1 addtribute kiểu hust.soict.dsai.aims.media.DigitalVideoDisc
        *    2) Tạo 2 Object hust.soict.dsai.test.disc.Swapper có chứa addtribute có giá trị là jungleDVD và cinderellaDVD
        *    3) sau đó swap 2 adtribute của 2 object với nhau => ta swap được 2 object jungle và Cinderella

        Swapper swap1 = new Swapper(jungleDVD);
        Swapper swap2 = new Swapper(cinderellaDVD);
        swap(swap1,swap2);  // gọi hàm swap để hoán đổi addtribute của 2 object hust.soict.dsai.test.disc.Swapper

        System.out.println("Jungle dvd title: " + swap1.DVD.getTitle());   // in ra title mơi của dvd jungle
        System.out.println("Cinderella dvd title: " + swap2.DVD.getTitle());  // in ra title mới của dvd cinderella


        changeTitle(jungleDVD,cinderellaDVD.getTitle());  //gọi hàm changeTitle để thay đổi title của DVD jungle
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());   // in ra thông tin của DVD jungle sau khi thay đổi title
    }

    // fix hàm swap()
    public static void swap(Swapper S1, Swapper S2){ // hàm truyền param là 2 object . hoán đổi thuộc tính của object, ko phải swap object
        DigitalVideoDisc tmp = S1.DVD;
        S1.DVD = S2.DVD;
        S2.DVD = tmp;
    }


    // hàm changeTitle đổi title của DVD
    public static void changeTitle(DigitalVideoDisc dvd, String title){  // hàm truyền param là 1 object và 1 xâu
        String oldTitle = dvd.getTitle();                                // khai báo xâu oldTitle để lưu title cũ
        dvd.setTitle(title);                                             // gọi method setTitle() đặt lại title cho object
        dvd = new DigitalVideoDisc(oldTitle);                            // lưu thay đổi title của object
    }
    */

    }
}
/*
class Swapper{    // tạo mới một class
    DigitalVideoDisc DVD;
    Swapper(DigitalVideoDisc DVD){ // khai báo một contructor
        this.DVD = DVD;
    }
}
*/