package Unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author s31011
 */
public class BackgroundColors extends JFrame{
    JButton changeColor = new JButton("Change the Background Color");
    JPanel jp = new JPanel();
    public BackgroundColors(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Random Panels");
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(300,350));
        jp.setLayout(null);
        
        changeColor.setBounds(20,50,250,50);
        ButtonListener spy = new ButtonListener();
        changeColor.addActionListener(spy);
        
        jp.add(changeColor);
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
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int red = (int)(256*Math.random());
            int green = (int)(256*Math.random());
            int blue = (int)(256*Math.random());
            Color c = new Color(red, green, blue);
            jp.setBackground(c);
        }
    }
}
