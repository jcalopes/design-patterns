package com.patterns;

import com.patterns.color.BlueColorShape;
import com.patterns.color.RedColorShape;
import com.patterns.shape.Circle;
import com.patterns.shape.Square;

import javax.swing.*;
import java.awt.*;

public class BridgeDemo extends JPanel
{
    public static void main( String[] args )
    {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.add(new BridgeDemo());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * The main goal of this pattern is to avoid create a lot of useless classes such as BlueSquare,RedSquare, GreenSquare and BlueCircle,
     * RedCircle, GreenCircle.
     * Instead, we split color from shape by injecting ColorShape into Shape class giving more flexibility to our code and
     * avoiding the number of classes increase over the time. Also make it easier to add more functionalities to our code.
     * @param graphics  the <code>Graphics</code> context in which to paint
     */
    public void paint(Graphics graphics){
        Square square = new Square(new BlueColorShape());
        square.draw(graphics);

        Circle circle = new Circle(new RedColorShape());
        circle.draw(graphics);
    }
}
