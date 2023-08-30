import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener{
    Score(String name, int score) {
        setBounds(280,50,960,720);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,200,300,250);
        add(image);


        JLabel heading=new JLabel("Thank You "+ name+ " for playing Intelligent Minds !!");
        heading.setBounds(350,100,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);

        JLabel lblscore=new JLabel("Yore Score is "+  score);
        lblscore.setBounds(520,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(lblscore);
        
        JButton Submit=new JButton("Play Again");
        Submit.setBounds(510,300,200,40);
        Submit.setFont(new Font("Cambria",Font.BOLD,20));
        Submit.setBackground(new Color(25, 25, 112));
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        add(Submit);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
           setVisible(false);
           new Login();
    }
    public static void main(String[] args) {
        new Score("User",0);
    }
}
