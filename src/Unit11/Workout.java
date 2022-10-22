package Unit11;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author s31011
 */
public class Workout extends JFrame{
    public Workout(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Exercise");
        JPanel jp = new JPanel();
        jp.setBackground( Color.YELLOW);
        jp.setPreferredSize( new Dimension (300, 300));
        jp.setLayout(null);
        
        JButton doSomething = new JButton("Do Something");
        doSomething.setBounds(75, 200, 150, 50);
        
        JLabel name = new JLabel("Name:");
        name.setBounds(50, 75, 50, 20);
        JTextField name1 = new JTextField();
        name1.setBounds(100, 75, 100, 20);
        JLabel age = new JLabel("Age:");
        age.setBounds(50, 125, 50, 20);
        JTextField age1 = new JTextField();
        age1.setBounds(100, 125, 100, 20);
        
        jp.add(age1);
        jp.add(name1);
        jp.add(age);
        jp.add(name);
        jp.add(doSomething);
        getContentPane().add(jp);
        pack();
    }
    public void display(){
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                setVisible(true);
            }
        });
    }
}
