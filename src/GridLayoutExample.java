import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutExample implements ActionListener{

    private JFrame mainFrame;
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public static void main(String[] args) {
        GridLayoutExample myCode = new GridLayoutExample();
    }

    public GridLayoutExample(){
        mainFrame = new JFrame("GridLayoutExample");
        mainFrame.setSize(600,550);

        panel = new JPanel();
        panel.setLayout(new GridLayout(2,3));
        mainFrame.add(panel);

        button1 = new JButton("button 1");
        panel.add(button1);

        button2 = new JButton("button 2");
        panel.add(button2);

        button3 = new JButton("button 3");
        panel.add(button3);

        button4 = new JButton("button 4");
        panel.add(button4);

        button5 = new JButton("button 5");
        panel.add(button5);

        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e){

    }

}
