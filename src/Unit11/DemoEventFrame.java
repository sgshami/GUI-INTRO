package Unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoEventFrame extends JFrame{
    private JLabel lbl = new JLabel("Random Numer");
    private JButton btnEven = new JButton("Display Random Even Number");
    private JButton btnOdd = new JButton("Display Random Odd Number");
    
    public DemoEventFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Buttons That Work");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(250, 150));
        jp.setLayout( null );
        
        ButtonListener spy = new ButtonListener();
        btnEven.addActionListener( spy );
        btnOdd.addActionListener( spy );
        
        btnEven.setBounds(10, 10, 230, 30);
        btnOdd.setBounds(10, 60, 230, 30);
        lbl.setBounds(10, 110, 150, 30);
        jp.add( btnEven );
        jp.add( btnOdd );
        jp.add(lbl);
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
            if(e.getSource().equals(btnEven)){
                int num = (int)(5*Math.random())+1;
                num = 2*num;
                lbl.setText(num + "");
            }else{
                int num = (int)(5*Math.random());
                num = 2*num+1;
                lbl.setText(num+"");
            }
        }
    }
}
