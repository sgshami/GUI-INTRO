package Unit11;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author s31011
 */
public class RandomPanels extends JFrame{
    public RandomPanels(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Random Panels");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(300,300));
        jp.setLayout(null);
        //JPanel j1 = new JPanel();
        
        for(int i = 1; i<11; i++){
            JPanel j1 = new JPanel();
            int red = (int)(256*Math.random());
            int green = (int)(256*Math.random());
            int blue = (int)(256*Math.random());
            Color c = new Color(red, green, blue);
            j1.setBackground(c);
            j1.setBounds(((int)(Math.random()*275)), ((int)(Math.random()*275)), ((int)(Math.random()*100)), ((int)(Math.random()*100)));
            jp.add(j1);
        }

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
