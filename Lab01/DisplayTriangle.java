/*Bài 6.3 : DisplayTriangle : biểu diễn hình tam giác bằng các kí tự *
 *  Vũ Đức Lương - 20205099
 */

import java.util.Scanner; // khai báo pagekage trước khi sử dụng class Scanner;

public class DisplayTriangle {
    public static void main(String[] args) {
        Scanner height = new Scanner(System.in); // tạo một Object Scanner có tên height

        System.out.println("Enter the hight of paramater: "); // in xâu ra màn hình

        int n = height.nextInt(); // method nextInt đọc giá tri Int từ người dùng

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= n - i + 1 && j <= n + i - 1) {
                    System.out.print("*"); // in ra man hinh vi tri khong co dau *
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        height.close();
    }
}
