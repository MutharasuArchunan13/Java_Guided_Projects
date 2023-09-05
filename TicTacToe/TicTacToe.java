import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class TicTacToe implements ActionListener 
{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_Panel =new JPanel();
    JPanel button_panel =new JPanel();
    JLabel textfield =new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn; 
    TicTacToe()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.getContentPane().setBackground(new Color(60,60,60));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(40, 40, 20));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,70));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        title_Panel.setLayout(new BorderLayout());
        title_Panel.setBounds(0, 0, 800, 100);

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(150,150,150));
        title_Panel.add(textfield);
        frame.add(title_Panel,BorderLayout.NORTH);

        frame.add(button_panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    }
    public void firstTurn()
    {
System.out.println("hey dude");
    }
    public void check()
    {

    }
    public void xWins(int a, int b,int c)
    {

    }
    public void oWins(int a, int b,int c)
    {

    }
}
