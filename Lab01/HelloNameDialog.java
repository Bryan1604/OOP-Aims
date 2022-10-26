
/* Example 3: HelloNameDialog
*  Vu Duc Luong -20205099
* */
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args){
        String result;  // khai bao xau de luu ket qua tra ve
        result = JOptionPane.showInputDialog("Please enter your name: ");  // xau title hien thi thong bao nhap ten
        JOptionPane.showMessageDialog(null,
                  "Hi " + result + "!");
        System.exit(0);
    }
}
