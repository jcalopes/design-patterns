package com.patterns.shape;

import com.patterns.color.ColorShape;

import java.awt.*;

public class Circle extends Shape{
    ColorShape colorShape;

    public Circle(ColorShape colorShape){
        this.colorShape = colorShape;
    }

    @Override
    public void draw(Graphics graphics) {
        colorShape.setColor(graphics);
        graphics.fillOval(75,15,50,50);
    }
}
