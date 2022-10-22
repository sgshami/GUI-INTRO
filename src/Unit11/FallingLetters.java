package Unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author s31011
 */
public class FallingLetters extends JFrame{
    JPanel jp = new JPanel();
    javax.swing.Timer timer;
    JLabel[] letters = new JLabel[6];
    int[] y = new int[6];
    int[] x = {0, 75, 150, 225, 300, 375};
    int[] ychange = new int[6];
    
    public FallingLetters(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Falling Letters");
        jp.setBackground(Color.GREEN);
        jp.setPreferredSize(new Dimension(425, 400));
        jp.setLayout(null);
        
        for(int i = 0; i<ychange.length; i++){
            ychange[i] = (int)(Math.random()*50);
        }
        Font f = new Font("SansSerif", Font.BOLD, 40);
        for(int i = 0; i<letters.length; i++){
            letters[i] = new JLabel();
            letters[i].setFont(f);
        }
        letters[0].setText("C ");
        letters[1].setText("H ");
        letters[2].setText("I ");
        letters[3].setText("P ");
        letters[4].setText("P ");
        letters[5].setText("S ");
        
        timer = new javax.swing.Timer(1000, new TimerListener());
        timer.start();
        for(int i = 0; i<letters.length; i++){
            jp.add(letters[i]);
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
    private class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            for(int l = 0; l<letters.length; l++){
                letters[l].setBounds(x[l], y[l], 50, 50);
                y[l] += ychange[(int)(Math.random()*5)];
                if(y[l] > jp.getHeight()){
                    y[l] = 0;
                }
            }
        }
    }
}
