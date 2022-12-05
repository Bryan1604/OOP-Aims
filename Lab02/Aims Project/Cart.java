import java.lang.Object;

import static com.intellij.icons.AllIcons.Nodes.Project;

public class Cart {
    private int qtyOrdered = 0; // khai bao thuoc tinh dung de chua so luong DVD trong gio hang
    private float totalCost; // khai bao thuoc tinh de chua tong so tien cua gio hang
    private boolean status; // thuoc tinh status kiem tra xem cart da duoc thanh toan hay chua
    public static final int MAX_NUMBERS_ORDERED = 20; // khai bao so luong DVD toi da co trong gio hang
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public Cart() {
        super();
    }

    public int getQtyOrdered() { // lay ra tong so luong dia trong gio hang
        return qtyOrdered;
    }

    public boolean getStatus() {
        return status;
    }

    public void addDVD(DigitalVideoDisc DVD) { // them dvd vao gio hang => kiem tra so luong dia duoc them . neu da du
                                               // thi in ra thong bao cho nguoi dung
        if (this.qtyOrdered <= 20) { // kiem tra xem trong cart có đủ chỗ( vượt quá số lượng cho phép) để thêm DVD mới vào trong Cart không
            this.itemsOrdered[this.qtyOrdered] = DVD;
            this.qtyOrdered++;
        } else {
            System.out.println("the Cart was full. Please remove some one if you really want to add other the one!");
        }
    }

    // tạo method mới để thêm list các DVD vào trong Cart
    public void addDVD(DigitalVideoDisc[] DVDList){   // nạp chồng phương thức addDVD bằng cách thêm param là mảng vào phương thức
         for(int j = 0;j<DVDList.length;j++){         // vòng lặp
                 this.addDVD(DVDList[j]);             // thêm từng DVD trong list vào trong Cart. sử dụng lại method addDVD()
         }
    }

    // tạo method mới để thêm 2 dvd các DVD vào trong Cart
    public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){  // nạp chồng phương thức addDVD bằng cách thêm params là 2 object
        if((this.qtyOrdered+2)<=MAX_NUMBERS_ORDERED) {   // kiểm tra điều kiên. nếu đủ chỗ thì add cả 2 DVD vào Cart
            this.addDVD(dvd1);                           // thêm DVD1 vào Cart  . sử dụng lại method addDVD với param là một object
            this.addDVD(dvd2);                           // thêm DVD2 vào Cart  . sử dụng lại method addDVD với param là một object
        }else if((this.qtyOrdered+2)<=MAX_NUMBERS_ORDERED-1){ // kiểm tra điều kiện . nếu chỉ còn thừa một chỗ trống thì chỉ thêm DVD1
            this.addDVD(dvd1);
            System.out.printf("the number of DVD is already over .Only add %s into the cart",dvd1.getTitle());
        }
        else{                                             // Cart đã đây => không thêm vào nữa
            System.out.println("the Cart has been full.");
        }
    }


    /*
     * public void removeDigitalVideoDisc(DigitalVideoDisc DVD) { //remove 1 dvd
     * 
     * 
     * for (int i = 0; i < this.qtyOrdered; i++) {
     * if (this.itemsOrdered[i].getTitle().equals(DVD.getTitle())) {
     * 
     * 
     * }
     * }
     * }
     */
    public float getTotalCost() { // phuong thuc tinh tong so tien cua tat ca dvd co trong gio hang
        for (int i = 0; i < this.qtyOrdered; i++) {
            this.totalCost += itemsOrdered[i].getCost();
        }
        return this.totalCost;
    }

    public void getInformationOfListDVD() { // method lay ra thong tin chi tiet cua tat ca dvd co trong cart
        System.out.println("*****************CART********************");
        System.out.println("Order items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf(" %d: ",this.itemsOrdered[i].getId());
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
        for(int i ==0; i< qtyOrdered;++i){    // dung vong lap for de duyet het tat ca
            if(itemsOrdered[i].getId() == id){  // so sanh co trung nhau khong
                itemsOrdered[i].getInformationDetail();// phuong thuc lay ra tat ca thong tin cua 1 dvd duoc tim thay
            }
            else {
                System.out.println("Khong co dvd nao duoc tim thay");
            }
        }
    }

    //xay dung method search theo title
    public void searchByTitle(String titlte){
        for (int i = 0 i< this.qtyOrdered;i++){       // dung vong lap for de duyet tat ca cac phan tu
            if(this.itemsOrdered[i].isMatch(title))   // so sanh co thoa man dieu kien hay khong
                itemsOrdered[i].getInformationDetail();  // in ra man hinh neu tim duoc
            else{
                System.out.println("There is no dvd you want ot file");
            }
        }
    }
}