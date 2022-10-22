package Unit11;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
/**
 *
 * @author s31011
 */
public class MyFrame1 extends JFrame {
    public MyFrame1(){
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setTitle("Hey");
        JPanel jp = new JPanel();
        jp.setBackground(Color.GREEN);
        jp.setPreferredSize(new Dimension(300, 100));
        jp.setLayout(null);
        getContentPane().add(jp);
        pack();
    }
    public void display(){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                setVisible(true);
            }
        } );
    }
}
