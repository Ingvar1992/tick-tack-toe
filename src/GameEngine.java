import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 01.12.2016.
 */
public class GameEngine implements ActionListener {

    private String cross = "X";
    private String zero = "O";
    private String onButton;
    private String[][] matrix = new String[3][3];
    private boolean firstMove = true;
    private String winner;
    private boolean noFreeCells;
    private int count = 0;
    private EndWindow endWindow;

    public void setMatrix(String[][] newMatrix){
        this.matrix = newMatrix;
    }

    public void setFirstMove(boolean b){
        this.firstMove = b;
    }

    public void setWinner(String newWinner){
        this.winner = newWinner;
    }

    public void setNoFreeCells(boolean b){
        this.noFreeCells = b;
    }

    public void setCount(int count1){
        this.count = count1;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if(firstMove) {
            chooseSymbol();
            firstMove = false;
        }

        if(clickedButton.getText().equals("")) {
            clickedButton.setText(onButton);
            if(onButton.equals(cross)) clickedButton.setBackground(Color.GREEN);
            else clickedButton.setBackground(Color.CYAN);

            if(clickedButton.getActionCommand().equals("1")){
                matrix[0][0] = onButton;
            } else if(clickedButton.getActionCommand().equals("2")){
                matrix[0][1] = onButton;
            } else if(clickedButton.getActionCommand().equals("3")){
                matrix[0][2] = onButton;
            } else if(clickedButton.getActionCommand().equals("4")){
                matrix[1][0] = onButton;
            } else if(clickedButton.getActionCommand().equals("5")){
                matrix[1][1] = onButton;
            } else if(clickedButton.getActionCommand().equals("6")){
                matrix[1][2] = onButton;
            } else if(clickedButton.getActionCommand().equals("7")){
                matrix[2][0] = onButton;
            } else if(clickedButton.getActionCommand().equals("8")){
                matrix[2][1] = onButton;
            } else if(clickedButton.getActionCommand().equals("9")){
                matrix[2][2] = onButton;
            } count++;

            checkWinner();
            checkFreeCells();

            if(winner != null || noFreeCells) endWindow = new EndWindow(GameBoard.getFrame());

            switchSymbol();

        } else {
            clickedButton.setText(clickedButton.getText());
        }

    }

    private void switchSymbol(){
        if(onButton.equals(cross)){
            onButton = zero;
        } else onButton = cross;
    }

    private void chooseSymbol(){
        int val = (int) (Math.random()*2);

        if(val == 0) onButton = zero;
        else onButton = cross;
    }

    private void checkFreeCells(){
        if(count == 9) noFreeCells = true;
    }

    private void checkWinner(){
        if((matrix[0][0] != null && matrix[0][0].equals(matrix[0][1])&& matrix[0][0].equals(matrix[0][2])) ||
                (matrix[1][0] != null && matrix[1][0].equals(matrix[1][1])&& matrix[1][0].equals(matrix[1][2])) ||
                (matrix[2][0] != null && matrix[2][0].equals(matrix[2][1])&& matrix[2][0].equals(matrix[2][2])) ||
                (matrix[0][0] != null && matrix[0][0].equals(matrix[1][0])&& matrix[0][0].equals(matrix[2][0])) ||
                (matrix[0][1] != null && matrix[0][1].equals(matrix[1][1])&& matrix[0][1].equals(matrix[2][1])) ||
                (matrix[0][2] != null && matrix[0][2].equals(matrix[1][2])&& matrix[0][2].equals(matrix[2][2])) ||
                (matrix[0][0] != null && matrix[0][0].equals(matrix[1][1])&& matrix[0][0].equals(matrix[2][2])) ||
                (matrix[0][2] != null && matrix[0][2].equals(matrix[1][1])&& matrix[0][2].equals(matrix[2][0]))) {winner = onButton;
        }
    }

    public String getWinner(){
        return winner;
    }
    public boolean getNoFreeCells() {
        return noFreeCells;
    }



}
