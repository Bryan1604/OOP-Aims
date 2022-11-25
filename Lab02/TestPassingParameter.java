public class TestPassingParameter {
    public static void main(String[] args){
        //Todo auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");  // tạo mới 1 dvd tên là jungle
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella"); // tạo mới một DVD tên là Cinderella

        swap(jungleDVD,cinderellaDVD);  // gọi hàm swap để hoán đổi 2 object
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());   // in ra title mơi của dvd jungle
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());  // in ra title mới của dvd cinderella

        changeTitle(jungleDVD,cinderellaDVD.getTitle());  //gọi hàm changeTitle để thay đổi title của DVD jungle
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
    }

    /*  hàm này làm theo hướng dẫn trong file => xảy ra lỗi không swap được
    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
     */
    public static void swap(Object o1, Object o2){

    }


    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}