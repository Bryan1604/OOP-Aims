package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

//import static com.intellij.icons.AllIcons.Nodes.Project;

public class Cart {
    private float totalCost; // khai bao thuoc tinh de chua tong so tien cua gio hang
    public static final int MAX_NUMBERS_ORDERED = 20; // khai bao so luong DVD toi da co trong gio hang
    private ObservableList<Media> itemsOrdered =  FXCollections.observableArrayList();
    public Cart() {
        
    }

    public ObservableList<Media> getItemsOrdered(){
        return itemsOrdered;
    }
    public void addMedia(Media media) { // them dvd vao gio hang =>
        if (this.itemsOrdered.size() <MAX_NUMBERS_ORDERED) { // kiem tra xem trong cart có đủ chỗ( vượt quá số lượng cho phép) để thêm DVD mới vào trong Cart không
            itemsOrdered.add(media);
        } else {                                              //neu Cart da du thi in ra thong bao cho nguoi dung
            System.out.println("the Cart has been already full. Please remove some one if you really want to add other one!");
        }
    }

    public void removeMedia(Media media) { //remove 1 media
        if (itemsOrdered.isEmpty()) {
            System.out.println("The Cart has nothing to remove");
        } else {
            if (itemsOrdered.contains(media)) {
                itemsOrdered.remove(media);
                System.out.println("the media" + media.getTitle() + " has been already removed from the Cart");
            } else {
                System.out.println("The media" + media.getTitle() + " is not in the Cart");
            }
        }
    }
    public float getTotalCost() { // phuong thuc tinh tong so tien cua tat ca dvd co trong gio hang
        int totalCost = 0;
        for (Media media: itemsOrdered) {
            totalCost += media.getCost();
        }
        return totalCost;
    }
    public void printInfo(){
        for(Media media:itemsOrdered){
            System.out.println(media.toString());
        }
    }


    /*
    // tạo method mới để thêm list các DVD vào trong hust.soict.dsai.aims.cart.Cart
    public void addDVD(DigitalVideoDisc[] DVDList){   // nạp chồng phương thức addDVD bằng cách thêm param là mảng vào phương thức
         for(int j = 0;j<DVDList.length;j++){         // vòng lặp
                 this.addDVD(DVDList[j]);             // thêm từng DVD trong list vào trong hust.soict.dsai.aims.cart.Cart. sử dụng lại method addDVD()
         }
    }

    // tạo method mới để thêm 2 dvd các DVD vào trong hust.soict.dsai.aims.cart.Cart
    public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){  // nạp chồng phương thức addDVD bằng cách thêm params là 2 object
        if((this.qtyOrdered+2)<=MAX_NUMBERS_ORDERED) {   // kiểm tra điều kiên. nếu đủ chỗ thì add cả 2 DVD vào hust.soict.dsai.aims.cart.Cart
            this.addDVD(dvd1);                           // thêm DVD1 vào hust.soict.dsai.aims.cart.Cart  . sử dụng lại method addDVD với param là một object
            this.addDVD(dvd2);                           // thêm DVD2 vào hust.soict.dsai.aims.cart.Cart  . sử dụng lại method addDVD với param là một object
        }else if((this.qtyOrdered+2)<=MAX_NUMBERS_ORDERED-1){ // kiểm tra điều kiện . nếu chỉ còn thừa một chỗ trống thì chỉ thêm DVD1
            this.addDVD(dvd1);
            System.out.printf("the number of DVD is already over .Only add %s into the cart",dvd1.getTitle());
        }
        else{                                             // hust.soict.dsai.aims.cart.Cart đã đây => không thêm vào nữa
            System.out.println("the hust.soict.dsai.aims.cart.Cart has been full.");
        }
    }
    */


    /*
    public void getInformationOfListDVD() { // method lay ra thong tin chi tiet cua tat ca dvd co trong cart
        System.out.println("*****************CART********************");
        System.out.println("Order items:");
        for (int i = 0; i < qtyOrdered; i++) {
            this.itemsOrdered[i].getInformationDetail();
            System.out.println("");
        }
    }

    public void removeDVD(String title) {
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(title)) {
                itemsOrdered[i]= itemsOrdered[i+1];
                qtyOrdered --;
            }
        }
    }



    // xay dung method search theo id
    public void searchById(int id){
        for(int i = 0; i< qtyOrdered;++i) {    // dung vong lap for de duyet het tat ca
            if (itemsOrdered[i].getId() == id) {  // so sanh co trung nhau khong
                itemsOrdered[i].getInformationDetail();// phuong thuc lay ra tat ca thong tin cua 1 dvd duoc tim thay
            }else{
                continue;
            }
            if (itemsOrdered[qtyOrdered-1].getId() != id)
                System.out.println("Khong co dvd nao duoc tim thay");
        }
    }

    //xay dung method search theo title
    public void searchByTitle(String title){
        for (int i = 0; i< this.qtyOrdered;i++) {       // dung vong lap for de duyet tat ca cac phan tu
            if (this.itemsOrdered[i].isMatch(title)) {   // so sanh co thoa man dieu kien hay khong
                itemsOrdered[i].getInformationDetail();  // in ra man hinh neu tim duoc
            }else{
                continue;
            }
            if (!this.itemsOrdered[qtyOrdered-1].isMatch(title))
                System.out.println("There is no dvd you want ot file");
        }
    }
    */
}