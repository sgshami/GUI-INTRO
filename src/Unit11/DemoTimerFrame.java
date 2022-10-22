package Unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoTimerFrame extends JFrame{
    private JLabel lbl = new JLabel("0");
    private JButton btnStart = new JButton("Start");
    private JButton btnStop = new JButton("Stop");
    private JPanel jp = new JPanel();
    private int count = 0;
    private javax.swing.Timer timer;
    
    public DemoTimerFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Timer");
        
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(150, 150));
        jp.setLayout(null);
        
        btnStart.setBounds(10, 5, 130, 30);
        lbl.setBounds(60, 50, 90, 30);
        Font f = new Font("SansSerif", Font.BOLD, 36);
        lbl.setFont(f);
        btnStop.setBounds(10,100,130,30);
        btnStart.addActionListener( new Respond());
        btnStop.addActionListener( new Respond());
        
        timer = new javax.swing.Timer(100, new TimerListener());
        
        jp.add(btnStart);
        jp.add(lbl);
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
            count++;
            lbl.setText( count + "");
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
}
