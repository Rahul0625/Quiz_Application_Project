import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements  ActionListener{
    JButton rules, back;
    JTextField tfname;
    Login(){

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        setLayout(null);
        image.setBounds(0,0,600,550);
        add(image);

        JLabel heading=new JLabel("Intelligent Minds");
        heading.setBounds(670,60,450,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(52, 96, 86));
        add(heading);

        JLabel name=new JLabel("Hello Intelligent !!");
        name.setBounds(700,200,300,35);
        name.setFont(new Font("Stencil",Font.BOLD,25));
        name.setForeground(new Color(0, 0, 0));
        add(name);

        tfname=new JTextField();
        tfname.setBounds(680,275,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

        rules=new JButton("RULES");
        rules.setBounds(660,350,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("BACK");
        back.setBounds(860,350,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);


        getContentPane().setBackground(Color.white);
        setSize(1100,600);
        setLocation(200,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
