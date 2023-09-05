import javax.swing.SwingUtilities;

public class Main
{
    public static void main(String[]arg)
    {
        SwingUtilities.invokeLater(() -> {
            new TicTacToe(); // Create an instance of TicTacToe to start the game
        });    }
}