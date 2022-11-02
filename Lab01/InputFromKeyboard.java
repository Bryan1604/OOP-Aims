
/*Bài 6.2: InputFromKeyboard
 * 
 */
import java.util.Scanner; // khai báo pagekage khi sử dụng lớp Scanner

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // tạo một đối tượng Scanner có tên keyboard để nhận đầu vào từ bàn
                                                   // phím

        System.out.println("What's your name? ");// in xâu ra màn hình
        String strName = keyboard.nextLine(); // method nextLine đọc dòng văn bản từ người dùng
        System.out.println("How old are you?"); // in xâu ra màn hình
        int iAge = keyboard.nextInt(); // method đọc giá trị Int từ người dùng
        System.out.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble(); // method đọc giá trị double từ người dùng

        System.out.println("Mrs/Ms." + strName + ", " + // in kết quả mong muốn ra màn hình.
                iAge + " years old. " +
                "Your height is " + dHeight + ".");

        keyboard.close();
    }
}
