package Unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author s31011
 */
public class TimerFrame extends JFrame{
    private JButton btnStart = new JButton("Start");
    private JButton btnStop = new JButton("Stop");
    private JPanel jp = new JPanel();
    private javax.swing.Timer timer;
    
    public TimerFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Timer");
        
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(150, 150));
        jp.setLayout(null);
        
        btnStart.setBounds(10, 5, 130, 30);
        Font f = new Font("SansSerif", Font.BOLD, 36);
        btnStop.setBounds(10,100,130,30);
        btnStart.addActionListener( new Respond());
        btnStop.addActionListener( new Respond());
        
        timer = new javax.swing.Timer(100, new TimerListener());
        
        jp.add(btnStart);
        jp.add(btnStop);
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
    private class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Color c = random();
            Color d = random();
            jp.setBackground(random());
            btnStart.setBackground(c);
            btnStop.setBackground(c);
            btnStart.setForeground(c);
            btnStop.setForeground(c);
            
        }
    }
    
    private class Respond implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource().equals( btnStart)){
                timer.start();
            }else{
                timer.stop();
            }
        }
    }
    private Color random(){
        int red = (int)(256*Math.random());
        int green = (int)(256*Math.random());
        int blue = (int)(256*Math.random());
        return new Color(red, green, blue);
    }
}
