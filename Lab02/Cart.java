import java.lang.Object;
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
        if (this.qtyOrdered <= 20) { // neu
            this.itemsOrdered[this.qtyOrdered] = DVD;
            this.qtyOrdered++;
        } else {

            System.out.println("the Cart was full. Please remove some one if you really want to add other the one!");
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
        for (int i = 0; i < this.qtyOrdered; i++) {
            this.itemsOrdered[i].getInformationDetail();
            System.out.println("");
        }
    }

    public void removeDVD(String title) {
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.itemsOrdered[i].getTitle().equals(title)) {
                this.itemsOrdered[i]=null;
                this.qtyOrdered -= 1;
                break;
            }
        }
    }



}