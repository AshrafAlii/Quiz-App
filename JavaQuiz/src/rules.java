import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rules extends JFrame implements ActionListener {

    String name;
    JButton back, start;
    rules(String name){
        this.name = name;
        setLayout(null);


        JLabel heading = new JLabel("Welcome " + name + " to SHARP MINDS");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                        "1. Ensure you provide an answer for every question in the quiz. Leaving questions unanswered may affect your score." + "<br><br>" +
                        "2. Submit your answers only once. Once you submit the quiz, you may not change your responses." + "<br><br>" +
                        "3. If there's a time limit, manage your time wisely. Try not to spend too much time on any single question." + "<br><br>" +
                        "4. Before submitting, review your answers to ensure they are accurate. Check for any questions you may have skipped or marked for review." + "<br><br>" +
                        "5. Respect the time limit. Submit your answers within the specified time frame." + "<br><br>" +
                        "<html>"
        );
        add(rules);

        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.addActionListener(this);
        add(back);



        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new quiz(name);
        }
        else {
            setVisible(false);
            new login();
        }
    }

    public static void main(String[] args) {
        new rules("");
    }
}
