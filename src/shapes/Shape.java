package shapes;

import java.awt.*;

public interface Shape {

    int getX();
    int getY();
    int getWidth();
    int getHeigth();
    void move(int x, int y);
    boolean isInsedeBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
