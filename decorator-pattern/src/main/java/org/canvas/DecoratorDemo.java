package org.canvas;

import javax.swing.*;
import java.awt.*;

public class DecoratorDemo extends JPanel {
    Component circle1 = new Circle(15, 15);
    Component circle2 = new Circle(75, 15);
    Component circle3 = new Circle(135, 15);

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.add(new DecoratorDemo());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * Here we are adding to the circle 2 a red border. As the decorator states we add in runtime new features by instantiating
     * new classes. As all of them implements the interface this works perfectly. We can fill with yellow later on and also works well.
     * This are the ease that decorator bring to our code.
     */
    public void paint(Graphics graphics) {
        circle1.draw(graphics);
        circle2 = new ComponentWithRedBorder(circle2);
        circle2.draw(graphics);
        circle3.draw(graphics);
    }
}
