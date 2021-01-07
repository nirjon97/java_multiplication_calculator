package java_1st_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class multiplication_app extends JFrame {
    
      private  Container c;
       private JTextArea ta;
       private JTextField tf;
       private JButton clear_button;
       private JLabel imglabel,textlabel;
       private Font f;
       private JScrollPane scroll;
       private ImageIcon img,img2;
       private Cursor cursor;
       
       multiplication_app()
       {
           
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        f=new Font("Arial",Font.BOLD,18);
       
        
        img= new ImageIcon(getClass().getResource("hiddenworld_onesheet_p2.png"));
        
        
        imglabel=new JLabel(img);
        imglabel.setBounds(20, 10, img.getIconWidth(), img.getIconHeight());
        c.add(imglabel);
        
        textlabel =new JLabel("Enter the number :");
        textlabel.setBounds(50, 300, 400, 80);
        textlabel.setFont(f);
        textlabel.setForeground(Color.WHITE);
        c.add(textlabel);
        
        tf =new JTextField();
        tf.setBounds(230, 320, 90, 50);
        tf.setFont(f);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.LIGHT_GRAY);
        c.add(tf);
        
          cursor =new Cursor(Cursor.HAND_CURSOR);
        
        clear_button =new JButton("clear");
        clear_button.setBounds(330, 320, 90, 50);
        clear_button.setBackground(Color.LIGHT_GRAY);
        clear_button.setFont(f);
        clear_button.setCursor(cursor);
        c.add(clear_button);
        
        ta= new JTextArea();
        ta.setBounds(70, 380, 300, 300);
        ta.setFont(f);
        c.add(ta);
        
        //action listener
        tf.addActionListener(new ActionListener(){
            @Override
            
            public void actionPerformed(ActionEvent e) {
                
                String value =tf.getText();
                if(value.isEmpty())
                {
                    JOptionPane.showMessageDialog(null," Sorry . You didn't put any number ");
                }
                else
                {
                     ta.setText("");
              
                 long num= Integer.parseInt(tf.getText());
                
                for(int i=1;i<=10;i++)
                {
                    long result=num *i;
                    
                    String r=String.valueOf(result);
                    String n=String.valueOf(num);
                    String incr=String.valueOf(i);
                    
                    ta.append("   "+n+" X "+incr +" = "+r+"\n");
                } 
                }
                
              
            }
            
        });
        
           clear_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              ta.setText("");
              tf.setText("");
            }
            
        });
        
           
       }
    
    
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

