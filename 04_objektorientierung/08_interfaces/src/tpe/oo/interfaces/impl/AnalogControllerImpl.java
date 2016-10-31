package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {
    private Point position = new Point(0, 0);
    double x = 0;
    double y = 0;

  
    /**
     * @see tpe.oo.interfaces.api.AnalogController#up()
     */
    public void up(double percentage) {
        y -= percentage;
    }

    /**
     * @see tpe.oo.interfaces.api.AnalogController#down()
     */
    @Override
    public void down(double percentage) {
        y += percentage;
    }

    /**
     * @see tpe.oo.interfaces.api.AnalogController#left()
     */
    public void left(double percentage) {
        x -= percentage;
    }

    /**
     * @see tpe.oo.interfaces.api.AnalogController#right()
     */
    public void right(double percentage) {
        x += percentage;
    }

    /**
     * @see tpe.oo.interfaces.api.AnalogController#getPosition()
     */
    public Point getPosition() {
        return new Point((int)x, (int)y);
    }

}
