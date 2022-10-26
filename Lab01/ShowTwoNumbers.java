/**  example 3: Add
 *   Vu Duc Luong - 20205099
 */
import  javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args){
        String num1, num2;   // khai báo xâu để lưu 2 số người dùng nhạo vào  ( dưới dạng string)
        String strNotification = "You've just entered: ";   // xâu tin ra thông báo cho người dùng

        num1 = JOptionPane.showInputDialog(null,           // nhập số thứ nhât
                "Please input the first number: ",
                "Input the first number",
                JOptionPane.INFORMATION_MESSAGE
                );

        num2 = JOptionPane.showInputDialog(null,          // nhập số thứ 2
                "Please input the second number: ",
                "Input the second number",
                JOptionPane.INFORMATION_MESSAGE
        );
        strNotification +=  num1 + " and " + num2 ;      // xâu lưu thông báo  người dùng đã nhập hai số

        JOptionPane.showMessageDialog(null,              // hiển thị log ra màn hình người dùng , show ra 2 số đã nhập
                strNotification,
                "Show two numbers ",
                JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0);   // kết thúc chương trình
    }
}
