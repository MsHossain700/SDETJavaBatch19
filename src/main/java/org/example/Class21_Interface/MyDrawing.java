package org.example.Class21_Interface;

import javax.swing.*;
import java.awt.*;

public class MyDrawing {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        MyCanvas myCanvas = new MyCanvas();
        j.setSize(1000, 1000);
        j.add(myCanvas);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}
class MyCanvas extends Canvas{
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillOval(200,200,500,500);

    }
}
