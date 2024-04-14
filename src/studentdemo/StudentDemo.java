package studentdemo;
import View.JFStudent;
import javax.swing.JFrame;
public class StudentDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quản Lý Sinh Viên");
        JFStudent jfs = new JFStudent();
        frame.add(jfs);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
