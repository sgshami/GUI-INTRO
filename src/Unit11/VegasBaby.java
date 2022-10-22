package Unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author s31011
 */
public class VegasBaby extends JFrame{
    private JButton start = new JButton("Start");
    private JButton stop = new JButton("Stop");
    private int tokens;
    private int n1;
    private int n2;
    private int n3;
    private JLabel msg =  new JLabel();
    private JLabel number1 = new JLabel();
    private JLabel number2 = new JLabel();
    private JLabel number3 = new JLabel();
    private JPanel jp = new JPanel();
    private javax.swing.Timer timer;
    
    public VegasBaby(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Vegas Baby!!!");
        
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(360, 250));
        jp.setLayout(null);
        
        tokens = 100;
        
        Font w = new Font("SansSerif", Font.BOLD, 36);
        Font n = new Font("SansSerif", Font.BOLD, 50);
        number1.setFont(n);
        number2.setFont(n);
        number3.setFont(n);
        number1.setText("?");
        number2.setText("?");
        number3.setText("?");
        start.setFont(w);
        stop.setFont(w);
        msg.setText("2/3 numbers match: 10 tokens; 3/3 numbers match: 30 tokens.");
        
        start.setBounds(10, 5, 330, 50);
        stop.setBounds(10,165,330,50);
        start.addActionListener( new Respond());
        stop.addActionListener( new Respond());
        
        msg.setBounds(0, 215, 360, 40);
        number1.setBounds(60, 85, 50, 50);
        number2.setBounds(150, 85, 50, 50);
        number3.setBounds(240, 85, 50, 50);
        
        timer = new javax.swing.Timer(100, new TimerListener());
        
        jp.add(msg);
        jp.add(number1);
        jp.add(number2);
        jp.add(number3);
        jp.add(start);
        jp.add(stop);
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
             n1 = (int)(Math.random() * 9 + 1);
             n2 = (int)(Math.random() * 9 + 1);
             n3 = (int)(Math.random() * 9 + 1);
        }
    }
    
    private class Respond implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource().equals(start)){
                timer.start();
                tokens --;
            }else{
                timer.stop();
                number1.setText(n1 + "");
                number2.setText(n2 + "");
                number3.setText(n3 + "");
                if(n1 == n2 && n2 == n3){
                    tokens += 30;
                    msg.setText("All 3 numbers matched!!! You have earned 30 tokens. You now have: " + tokens);
                }else if(n1 == n2 || n1==n3 || n2==n3){
                    tokens += 10;
                    msg.setText("2 numbers matched! You earned 10 tokens. You now have: " + tokens);
                }else{
                    msg.setText("You lost. You now have: " + tokens);
                }
            }
        }
    }
}
