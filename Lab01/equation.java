/* Example 2.2.6
*  Vũ Đức Lương -20205099
 */
import javax.swing.JOptionPane;
import java.lang.Math;
public class equation {
    public static void main(String[] args) {
        String strEquation; // khai bao xau de luu kieu phuong trinh can tinh toan
        strEquation = JOptionPane.showInputDialog(null,
                "Enter the type of equation you want to solve ( 1-first degree, 2-second degree) : ",
                JOptionPane.INFORMATION_MESSAGE);

        int e = Integer.parseInt(strEquation);      // hệ số xác định loại phương trình muốn tính toán ( 1- phương trình bậc nhất, 2 - phương trình bậc 2
        switch (e) {
            case 1 -> {
                String a, b;    // khai bao xau de nhap 2 so tu nguoi dung
                a = JOptionPane.showInputDialog(null,
                        "Enter the value of a: ");
                b = JOptionPane.showInputDialog(null,
                        "Enter the value of b: ");
                double aa = Double.parseDouble(a);
                double bb = Double.parseDouble(b);
                if (aa != 0) {
                    JOptionPane.showMessageDialog(null,
                            "Ket qua cua phuong trinh ax + b =0 : x= " + (-1)*bb / aa
                            );
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Ket qua cua phuong trinh ax + b =0 : Phuong trinh vo nghiem "
                            );
                }
                System.exit(0);
            }
            case 2 -> {
                String strA, strB, strC; // khai bao xau de nhap cac hang so cua phuong trinh
                double val1,val2;// khai bao hai so de luu ket qua cua chuong trinh

                JOptionPane.showMessageDialog(null, "Giai phuong trinh bac 2 :ax^2 + bx + c =0");

                strA = JOptionPane.showInputDialog(null,           // nhập hệ số a
                        "Enter the value of a: ");
                strB = JOptionPane.showInputDialog(null,           // nhập hệ số b
                        "Enter the value of b: ");
                strC = JOptionPane.showInputDialog(null,           // nhập hệ số c
                        "Enter the value of c: ");

                double a1 = Double.parseDouble(strA);   // chuyen doi so nhap tu kieu string sang kieu double
                double b1 = Double.parseDouble(strB);   // chuyen doi so nhap tu kieu string sang kieu double
                double c1 = Double.parseDouble(strC);   // chuyen doi so nhap tu kieu string sang kieu double

                /* ys tuong giai phuong trinh bac 2 la tinh delta = b^2 -4*a*c
                *  neu  delta < 0 => phuong trinh vo nghiem
                *  neu delta =0 => phuong trinh co nghiem duy nhat
                *  neu delta >0 => phuong trinh co 2 nghiem phan biet
                * */

                double delta = b1 * b1 - 4 * a1 * c1;

                if (delta < 0) {
                    JOptionPane.showMessageDialog(null,"phuong trinh bac 2 vo nghiem ");
                } else if (delta == 0) {
                    val1 = (-1) * b1 / (2 * a1);
                    JOptionPane.showMessageDialog(null,"ket qua cua phuong trinh la : " + val1);
                }else {
                    val1 = (-b1 + Math.sqrt(delta))/(2*a1);
                    val2 = (-b1 - Math.sqrt(delta))/(2*a1);
                    JOptionPane.showMessageDialog(null,"Nghiem cua phuong trinh la: x1 = " + val1 + " ,x2= " + val2);
                }
                System.exit(0);
            }

        }


    }
}
