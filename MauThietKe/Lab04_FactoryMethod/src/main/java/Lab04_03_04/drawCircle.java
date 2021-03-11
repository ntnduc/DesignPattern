package Lab04_03_04;

import javax.swing.*;
import java.awt.*;

public class drawCircle extends JFrame {

    public drawCircle(){
        setTitle("Drawing a Circle");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(150, 150, 100, 100);

    }
}
