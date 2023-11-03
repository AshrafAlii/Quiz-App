import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class score extends JFrame implements ActionListener {

    JLabel qno;

    score(String name, int score){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

        qno = new JLabel();
        qno.setBounds(100,450,50,30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        JLabel heading = new JLabel("Thankyou " +name + " for playing Sharp Minds" );
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,120,40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.addActionListener(this);
        add(submit);


        setLayout(null);
        setBounds(400, 150, 710, 470);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new login();
    }

    public static void main(String[] args) {
        new score("User", 0);
    }
}
