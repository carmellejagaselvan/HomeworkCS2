import javax.swing.*;
import java.awt.*;


public class LayoutExample2 {
    private JFrame mainFrame;
    private JPanel gridPanel;
    private JPanel innerPanel;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    private JLabel label;

    public static void main(String[] args) {
        LayoutExample2 myCode = new LayoutExample2();
    }

    public LayoutExample2(){
        mainFrame = new JFrame("Frame");
        mainFrame.setSize(600,600);

        gridPanel = new JPanel(new GridLayout(3,3));
        mainFrame.add(gridPanel);

        innerPanel = new JPanel();
        innerPanel.setLayout(new BorderLayout());

        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");
        button6 = new JButton("button 6");
        button7 = new JButton("button 7");
        button8 = new JButton("button 8");
        button9 = new JButton("button 9");
        button10 = new JButton("button 10");
        label = new JLabel("label");

        gridPanel.add(button1);
        gridPanel.add(button2);
        gridPanel.add(button3);
        gridPanel.add(button4);
        gridPanel.add(innerPanel);
        innerPanel.add(label, BorderLayout.CENTER);
        innerPanel.add(button9, BorderLayout.EAST);
        innerPanel.add(button10, BorderLayout.SOUTH);
        gridPanel.add(button5);
        gridPanel.add(button6);
        gridPanel.add(button7);
        gridPanel.add(button8);






        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
