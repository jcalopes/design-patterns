package com.patterns.shape;

import com.patterns.color.ColorShape;

import java.awt.*;

public class Square extends Shape{
    ColorShape colorShape;

    public Square(ColorShape color){
        this.colorShape = color;
    }

    @Override
    public void draw(Graphics graphics) {
        colorShape.setColor(graphics);
        graphics.fillRect(5,15,50,50);
    }
}
