public class Store(){
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[];  // khoi tao attribute la 1 mang

    public Store(){}  // Khai  bao contructor

    // khoi tao method de them DVD Vao Store
    public void addDVD(DigitalVideoDisc DVD){
        int s= this.itemsInStore.size();           // khai bao s de luu gia tri kich thuoc cua mang
        this.itemsInStore[s] = DVD;                // them 1 dvd vao uoi cua mang
    }
    // khỏi tạo method đẻ xóa DVD, param truyền vào là một object
    public void removeDVD(DigitalVideoDisc DVD) {
        for (DigitalVideoDisc DVD_r : itemsInStore)     // vong lap foeach de duyet mang
            if (DVD_r.equals(DVD)) {                   // so sánh 2 đối tượng đẻ xem có trùng với đối tượng cần xóa không
                DVD_r = null; //                       // gán cho đối tượng là null neu trung khớp
            }
        }
    }
}