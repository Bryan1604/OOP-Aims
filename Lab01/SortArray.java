
/*Bài 6.5: SortArray
 * Vũ Đức Lương- 20205099
 */
import java.util.Arrays; //khai báo pagekage

public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[] { 12, 43, 546, 75, 23, 65, 75, 345 }; // tạo mảng có định
        Arrays.sort(array); // dùng method để sortig mảng
        System.out.println("Array after being sorted: ");
        for (int i = 0; i < array.length; i++) { // vòng for i mảng ra màn hình
            System.out.print(array[i] + " ");
        }
    }
}
