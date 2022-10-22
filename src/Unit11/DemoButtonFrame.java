package Unit11;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author s31011
 */
public class DemoButtonFrame extends JFrame{
    public DemoButtonFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Button!");
        JPanel jp = new JPanel();
        jp.setBackground( Color.WHITE);
        jp.setPreferredSize( new Dimension (300, 400));
        jp.setLayout(null);
        
        JButton button1 = new JButton("Buttom 1");
        button1.setBounds(0, 0, 100, 100);
        button1.setBackground(Color.ORANGE);
        JButton button2 = new JButton("Button 2");
        button2.setBounds(50, 100, 200, 200);
        button2.setBackground(Color.MAGENTA);
        
        jp.add(button1);
        jp.add(button2);
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
