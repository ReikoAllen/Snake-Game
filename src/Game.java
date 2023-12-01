import javax.swing.JFrame;
import javax.swing.JPanel;
import SetBoard.Board;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class Game extends JFrame {

    public Game() {
        initUI();
    }
    
    private void initUI() {
        JPanel board = new Board();
        add(board, BorderLayout.CENTER);
        // Add your logo
        ImageIcon logo = new ImageIcon("src/resources/snake.png"); // replace with your logo file path
        setIconImage(logo.getImage());
        pack();
        setResizable(false); 
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame ex = new Game();
                ex.setVisible(true);
            }
        });
    }
}
