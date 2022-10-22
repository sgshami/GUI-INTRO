package Unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author s31011
 */
public class OnScreenKeyBoard extends JFrame{
    JButton buttonLetter = new JButton();
    JButton clearMessage = new JButton("Clear the Message");
    JLabel screen = new JLabel();
    String word = "";
    public OnScreenKeyBoard(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Text");
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setPreferredSize(new Dimension(700, 300));
        jp.setLayout( null );
        
        int x = 10;
        int y = 10;
        ButtonListener ear = new ButtonListener();
        for(int i = 0; i<26; i++){
            char ch = (char)(i+65);
            String letter = ch + "";
            if(ch == 'N'){
                y += 70;
                x = 10;
            }
            JButton letterB = new JButton(letter);
            letterB.setBounds(x, y, 50, 50);
            x += 52;
            letterB.addActionListener(ear);
            jp.add(letterB);
            //buttonLetter = letterB;
        }
        screen.setBounds(10, 140, 680, 50);
        
        clearMessage.addActionListener(ear);
        clearMessage.setBounds(10, 200, 680, 50);
        
        jp.add(screen);
        jp.add(clearMessage);
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
            
            if(e.getSource().equals(clearMessage)){
                screen.setText("");
                word = "";
            }else{
                buttonLetter = (JButton)e.getSource();
                word += buttonLetter.getText();
                //word += text;
                System.out.println(word);
                screen.setText(word);
            }
        }
    }
}
