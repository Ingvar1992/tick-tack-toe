import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Игорь on 04.12.2016.
 */
public class EndWindow extends JDialog implements ActionListener {
    private String label;
    private String cross = "Крестики ";
    private String zero = "Нолики ";
    private String winMessage = "выиграли!";
    private String patMessage = "Ничья!";
    ExitOnButton exit = new ExitOnButton();
    Font bigFont = new Font("TimesRoman", Font.BOLD, 20);
    GameEngine gameStatus = GameBoard.getGame();

    public EndWindow(JFrame owner){
        super(owner, "Игра окончена.", true);

        if(gameStatus.getWinner() != null && gameStatus.getNoFreeCells() == true){
            String champ = gameStatus.getWinner().equals("X") ? cross : zero;
            label = champ + winMessage;
        } else if(gameStatus.getWinner() != null && gameStatus.getNoFreeCells() == false){
            String champ = gameStatus.getWinner().equals("X") ? cross : zero;
            label = champ + winMessage;
        } else if(gameStatus.getNoFreeCells() == true && gameStatus.getWinner() == null){
            label = patMessage;
        }

        JLabel labe = new JLabel(label);
        labe.setFont(bigFont);
        labe.setHorizontalAlignment(labe.CENTER);

        add(labe, BorderLayout.CENTER);

        JButton newGame = new JButton("Новая игра");
        newGame.setPreferredSize(new Dimension(40, 30));
        newGame.addActionListener(this);


        JButton out = new JButton("Выход");
        out.setPreferredSize(new Dimension(40, 30));
        out.addActionListener(exit);

        GridLayout gridLayout = new GridLayout(2, 2);
        gridLayout.setVgap(10);
        gridLayout.setHgap(10);
        JPanel panel = new JPanel(gridLayout);
        panel.add(newGame);
        panel.add(out);

        add(panel, BorderLayout.SOUTH);
        setSize(new Dimension(260, 140));
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        gameStatus.setMatrix(new String[3][3]);
        gameStatus.setCount(0);
        gameStatus.setFirstMove(true);
        gameStatus.setWinner(null);
        gameStatus.setNoFreeCells(false);

        GameBoard.button1.setBackground(Color.WHITE);
        GameBoard.button1.setText("");

        GameBoard.button2.setBackground(Color.WHITE);
        GameBoard.button2.setText("");

        GameBoard.button3.setBackground(Color.WHITE);
        GameBoard.button3.setText("");

        GameBoard.button4.setBackground(Color.WHITE);
        GameBoard.button4.setText("");

        GameBoard.button5.setBackground(Color.WHITE);
        GameBoard.button5.setText("");

        GameBoard.button6.setBackground(Color.WHITE);
        GameBoard.button6.setText("");

        GameBoard.button7.setBackground(Color.WHITE);
        GameBoard.button7.setText("");

        GameBoard.button8.setBackground(Color.WHITE);
        GameBoard.button8.setText("");

        GameBoard.button9.setBackground(Color.WHITE);
        GameBoard.button9.setText("");

        this.setVisible(false);
    }


}
