package proj;
//STUDENT DATABASE SYSTEM
import javax.swing.JFrame;
public class Proj {
 public static void main(String[] args) {
       Login mframe = new Login();
        mframe.setVisible(true);
        mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mframe.setBounds(250, 40, 500, 400);
        mframe.setResizable(false);
        mframe.setTitle("Student Database Management System");

    }
    
}
