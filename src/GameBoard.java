import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 01.12.2016.
 */
public class GameBoard {
    private static JFrame frame;
    private JPanel panel;
    private GridLayout layout;
    private static GameEngine game;

    public static JButton button1 = new JButton();
    public static JButton button2 = new JButton();
    public static JButton button3 = new JButton();
    public static JButton button4 = new JButton();
    public static JButton button5 = new JButton();
    public static JButton button6 = new JButton();
    public static JButton button7 = new JButton();
    public static JButton button8 = new JButton();
    public static JButton button9 = new JButton();

    public static void main(String[] args){
        GameBoard board = new GameBoard();
        board.init();
    }

    public static GameEngine getGame(){
        return game;
    }


    public static JFrame getFrame(){
        return frame;
    }

    public void init(){
        game = new GameEngine();
        frame = new JFrame("Крестики-нолики");
        panel = new JPanel();
        layout = new GridLayout(3, 3);

        Font bigFont = new Font("TimesRoman", Font.BOLD, 70);

        button1.setPreferredSize(new Dimension(50 , 50));
        button1.setFont(bigFont);
        button1.setActionCommand("1");
        button1.addActionListener(game);
        button1.setBackground(Color.WHITE);
        button1.setFocusable(false);
        button2.setPreferredSize(new Dimension(50 , 50));
        button2.setFont(bigFont);
        button2.setActionCommand("2");
        button2.addActionListener(game);
        button2.setBackground(Color.WHITE);
        button2.setFocusable(false);
        button3.setPreferredSize(new Dimension(50 , 50));
        button3.setFont(bigFont);
        button3.setActionCommand("3");
        button3.addActionListener(game);
        button3.setBackground(Color.WHITE);
        button3.setFocusable(false);
        button4.setPreferredSize(new Dimension(50 , 50));
        button4.setFont(bigFont);
        button4.setActionCommand("4");
        button4.addActionListener(game);
        button4.setBackground(Color.WHITE);
        button4.setFocusable(false);
        button5.setPreferredSize(new Dimension(50 , 50));
        button5.setFont(bigFont);
        button5.setActionCommand("5");
        button5.addActionListener(game);
        button5.setBackground(Color.WHITE);
        button5.setFocusable(false);
        button6.setPreferredSize(new Dimension(50 , 50));
        button6.setFont(bigFont);
        button6.setActionCommand("6");
        button6.addActionListener(game);
        button6.setBackground(Color.WHITE);
        button6.setFocusable(false);
        button7.setPreferredSize(new Dimension(50 , 50));
        button7.setFont(bigFont);
        button7.setActionCommand("7");
        button7.addActionListener(game);
        button7.setBackground(Color.WHITE);
        button7.setFocusable(false);
        button8.setPreferredSize(new Dimension(50 , 50));
        button8.setFont(bigFont);
        button8.setActionCommand("8");
        button8.addActionListener(game);
        button8.setBackground(Color.WHITE);
        button8.setFocusable(false);
        button9.setPreferredSize(new Dimension(50 , 50));
        button9.setFont(bigFont);
        button9.setActionCommand("9");
        button9.addActionListener(game);
        button9.setBackground(Color.WHITE);
        button9.setFocusable(false);

        panel.setLayout(layout);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        frame.add(panel);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
