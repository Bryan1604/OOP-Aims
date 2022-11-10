
public class Cart {
    private int qtyOrdered = 0;
    private float totalCost;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public int getQtyOrdered() { // lar ra tong so luong dia trong gio hang
        return qtyOrdered;
    }

    public void addDVD(DigitalVideoDisc DVD) { // them dia vao gio hang // kiem tra so luong dia duoc them
        if (this.qtyOrdered <= 20) {
            this.itemsOrdered[this.qtyOrdered] = DVD;
            this.qtyOrdered++;
        }
    }

    /*
     * public void removeDigitalVideoDisc(DigitalVideoDisc DVD) { // xoa mat hang ra
     * khoi gio hang
     * try {
     * 
     * } catch (Exception e) {
     * // TODO: handle exception
     * }
     * }
     * 
     */

    public float cost() {
        for (int i = 0; i < this.qtyOrdered; i++) {
            this.totalCost += itemsOrdered[i].getCost();
        }
        return this.totalCost;
    }

}