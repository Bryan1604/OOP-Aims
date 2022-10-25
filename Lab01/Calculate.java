// Example 6: Calculate.java
//Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.

import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args) {
        String strNum1, strNum2; // khai báo hai xau de chua so nguoi dung nhap
        Double sum, diff, prod, qout; // khai báo 4 xâu để chứa kết quả cua phép tính

        // nhập vào màn hình log số thứ nhất
        strNum1 = JOptionPane.showInputDialog(null, "enter the first number: ", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1); // convert số thứ nhất từ kiểu string sang kiểu double

        // nhập vào màn hình log số thứ hai
        strNum2 = JOptionPane.showInputDialog(null, "enter the second number: ", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2); // convert số thứ hai từ kiểu string sang kiểu double

        sum = num1 + num2;
        System.out.println("Sum of 2 numbers: " + sum); // in tổng
        diff = num1 - num2;
        System.out.println("Diffirence of 2 numbers: " + diff); // in hiệu 2 số
        prod = num1 * num2;
        System.out.println("Product of 2 numbers: " + prod); // in tích 2 số
        if (num2 != 0) { // kiểm tra điều kiện của số thứ 2 : nếu số thứ 2 khác không thì kết quả trả về
                         // đúng, nếu = 0 thì in ra "can not define "
            qout = num1 / num2;
            System.out.println("Division of 2 numbers: " + qout);
        } else {
            System.out.println("Division of 2 numbers: cannot define");
        }
        System.exit(0);
    }
}