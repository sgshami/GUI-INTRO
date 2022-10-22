package Unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author s31011
 */
public class Multiplication extends JFrame{
    JButton addition = new JButton("Add");
    JButton multiply = new JButton("Multiply");
    JTextField number1e = new JTextField();
    JTextField number2e = new JTextField();
    JLabel answer = new JLabel();
            
    public Multiplication(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Math");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(250, 200));
        jp.setLayout( null );
        
        addition.setBounds(10, 100, 95, 35);
        multiply.setBounds(115, 100, 95, 35);
        
        JLabel number1 = new JLabel("Enter an Integer:");
        number1.setBounds(10,20,100,15);
        JLabel number2 = new JLabel("Enter an Integer:");
        number2.setBounds(10,60,100,15);
        
        number1e.setBounds(110, 20, 100, 20);
        number2e.setBounds(110, 60, 100, 20);
        
        answer.setBounds(20, 150, 250, 30);

        ButtonListener spy = new ButtonListener();
        addition.addActionListener(spy);
        multiply.addActionListener(spy);
        
        jp.add(number1);
        jp.add(number2);
        jp.add(number1e);
        jp.add(number2e);
        jp.add(addition);
        jp.add(multiply);
        jp.add(answer);
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
            if(e.getSource().equals(addition)){
                answer.setText(Integer.toString(Integer.parseInt(number1e.getText()) + Integer.parseInt(number2e.getText())));
            }else{
                answer.setText(Integer.toString(Integer.parseInt(number1e.getText()) * Integer.parseInt(number2e.getText())));
            }
        }
    }
}
