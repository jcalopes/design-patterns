package com.patterns.color;

import java.awt.*;

public class GreenColorShape implements ColorShape{
    @Override
    public void setColor(Graphics graphics) {
        graphics.setColor(Color.GREEN);
    }
}
