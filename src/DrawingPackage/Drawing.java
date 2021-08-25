package DrawingPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Drawing extends JFrame {
    public Drawing (String name){
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,1920,1080);
        setVisible(true);
        add(new MyComponent());
        

    }

    class MyComponent extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Font font = new Font("Arial", Font.BOLD,20);
            g.setFont(font);
            g.drawString("Hello World",20,30);
            Image image = new ImageIcon("E:\\Java\\Projects2\\Figures1\\daggertail.jpg").getImage();
            g.drawImage(image,0,50,null);
            g.drawLine(100,100,500,500);
            g.drawRect(100,100,500,500);
            g.setColor(Color.BLUE);
            g.fillOval(50,100,500,200);
            g.drawOval(50,100,500,200);
        }
    }
}
