// Example 6: Calculate.java
//Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.

import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args) {
        String strNum1, strNum2; // khai báo hai xau de chua so nguoi dung nhap
        Double sum, diff, prod, qout; // khai báo 4 xâu để chứa kết quả cua phép tính

        strNum1 = JOptionPane.showInputDialog(null, "enter the first number: ", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "enter the second number: ", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        sum = num1 + num2;
        diff = num1 - num2;
        prod = num1 * num2;

        System.out.println(sum, diff, prod);

    }
}