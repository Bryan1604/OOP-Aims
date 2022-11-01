/*Bài 6.3 : DisplayTriangle : biểu diễn hình tam giác bằng các kí tự *
 *  Vũ Đức Lương - 20205099
 */

import java.util.Scanner;

public class DisplayTriangle {
    public static void main(String[] args) {
        Scanner height = new Scanner(System.in);
        int n, k = 0;
        // String strN = JOptionPane.showInputDialog(null, "Enter the height of stars(*)
        // n: ");
        // int n = Integer.parseInt(strN);
        System.out.println("Enter the hight of paramater: ");
        n = height.nextInt();
        for (int i = 1; i <= n; ++i, k = 0) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}
