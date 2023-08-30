import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    Rules(String name){
        setLayout(null);
        this.name=name;


        JLabel heading=new JLabel("WELCOME   "+ name+"   TO INTELLIGENT MINDS");
        heading.setBounds(50,30,700,30);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
        heading.setForeground(new Color(52, 96, 86));
        add(heading);

        JLabel rules=new JLabel();
        rules.setBounds(50,20,700,550);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
                "<html>"+
                        "1. The quiz competition is open to all participants of age 18 and above, regardless of their background or affiliation." + "<br><br>" +
                        "2. Participants must register prior to the event either online or on-site. Late registrations might not be accepted." + "<br><br>" +
                        "3. Participants cannot be a part of multiple teams." + "<br><br>" +
                        "4. The quiz will consist of multiple-choice questions, true/false statements, and short-answer questions." + "<br><br>" +
                        "5. Each question will have a specified time limit for answering. Once the time is up, answers will not be accepted." + "<br><br>" +
                        "6. Participants are not allowed to use mobile phones, books, or any external aids during the competition. " + "<br><br>" +
                        "7. Correct answers will be awarded points." + "<br><br>" +
                        "8. Any violation might lead to disqualification." + "<br><br>" +
                "<html>"

        );

        add(rules);

        back=new JButton("BACK");
        back.setBounds(250  ,550,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);


        start=new JButton("Start");
        start.setBounds(400,550,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);



        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
}
