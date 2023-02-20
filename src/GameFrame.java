import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame() {

        this.add(new GamePanel1());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);


    }
}
