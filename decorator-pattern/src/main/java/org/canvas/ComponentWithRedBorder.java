package org.canvas;

import java.awt.*;

public class ComponentWithRedBorder implements Component{
    Component decoratedComponent;

    public ComponentWithRedBorder(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    /**
     * We are decorating the object with a red border and as this class also implements the Component object we can use either
     * Component or ComponentWithRedBorder.
     * @param graphics
     */
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        decoratedComponent.draw(graphics);
        graphics.setColor(Color.BLACK);
    }
}
