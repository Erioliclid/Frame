package Smth;

import java.awt.*;
import javax.swing.*;

public class DrawLine extends JPanel {

    public DrawLine() {
        super();
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 200);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawLine(10, 10, 290, 190);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DrawLine panel = new DrawLine();
                JFrame frame = new JFrame("PaintPanel");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}

