/* bài 6.1: choosingoption
 * Vũ Đức Lương -20205099
 */

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, // khai bao xau de luu giá trị confirm từ người dùng khi log
                "Do you want to  change to the first class ticket?");

        JOptionPane.showMessageDialog(null, // in ra lựa chọn của người dùng . dùng toán tử 3 ngôi để in ra kết quả
                "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));

        System.exit(0);
    }

}