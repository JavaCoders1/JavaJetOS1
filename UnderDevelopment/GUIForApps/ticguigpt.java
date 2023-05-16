import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ticguigpt extends JFrame implements ActionListener {

    private JButton[][] buttons = new JButton[3][3];
    private boolean xTurn = true;
    private JLabel message = new JLabel("X's turn");

    public ticguigpt() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel board = new JPanel(new GridLayout(3, 3));
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton("");
                buttons[row][col].setFont(new Font("Arial", Font.PLAIN, 40));
                buttons[row][col].addActionListener(this);
                board.add(buttons[row][col]);
            }
        }

        add(board, BorderLayout.CENTER);
        add(message, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public static void main(String[] args)
    {
        new ticguigpt();
    }
}