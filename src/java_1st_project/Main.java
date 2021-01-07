package java_1st_project;

import javax.swing.JFrame;


public class Main {
    
    public static void main(String[] args) {
        multiplication_app jframe =new multiplication_app();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBounds(300,20,460,750);
        jframe.setTitle("multiplication apps");
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
    }
    
}
