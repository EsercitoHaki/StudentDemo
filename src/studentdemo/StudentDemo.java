package studentdemo;
import javax.swing.JFrame;
public class StudentDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quản Lý Sinh Viên");
        JFStudent jfs = new JFStudent();
        frame.add(jfs); // Thêm JFStudent vào JFrame
        frame.pack(); // Tự điều chỉnh kích thước của JFrame
        frame.setVisible(true); // Hiển thị JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
