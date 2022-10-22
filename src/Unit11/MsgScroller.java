package Unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author s31011
 */
public class MsgScroller extends JFrame{
    JLabel msg = new JLabel();
    JPanel jp = new JPanel();
    private javax.swing.Timer timer;
    int x = -240;
    public MsgScroller(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Message Scroller");
        
        Font f = new Font("SansSerif", Font.BOLD, 40);
        //msg.setBounds(0,75,300,40);
        msg.setFont(f);
        msg.setText("Sami Shami");
        
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(300, 150));
        jp.setLayout(null);
        
        timer = new javax.swing.Timer(10, new TimerListener());
        timer.start();
        
        jp.add(msg);
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
            int y = jp.getHeight()/2-25;
            //boolean right = true;
            x += 1;
            System.out.println(x);
            if(x == jp.getWidth()){
                x = -240;
            }
            msg.setBounds(x, y, 240, 50);

            /*if(x == jp.getWidth()){
                right = false;
                //msg.setBounds(x, y, 240, 50);
            }else if(x == -150){
                right = true;
                //msg.setBounds(x, y, 240, 50);
            }
            if(right){
                x += 10;
                msg.setBounds(x, y, 240, 50);
            }else{
                x -= 10;
                msg.setBounds(x, y, 240, 50);
            }*/
            //msg.setBounds(x, y, 240, 50);
        }
    }
}
