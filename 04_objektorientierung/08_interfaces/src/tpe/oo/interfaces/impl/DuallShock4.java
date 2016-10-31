package tpe.oo.interfaces.impl;

import java.awt.Point;
import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DuallShock4 implements AnalogController,DigitalController {
    
    private AnalogController ana = new AnalogControllerImpl();
    private DigitalController digi = new DigitalControllerImpl();
    @Override
    public void up(double percentage) {
        ana.up(percentage);
        
    }

    @Override
    public void down(double percentage) {
        ana.down(percentage);
        
    }

    @Override
    public void left(double percentage) {
        ana.left(percentage);
        
    }

    @Override
    public void right(double percentage) {
        ana.right(percentage);
        
    }
    public void up(){
        digi.up();
    }
    public void down(){
        digi.down();
    }

    @Override
    public void left() {
        digi.left();
    }

    @Override
    public void right() {
        digi.right();
    }

    @Override
    public Point getPosition() {
        return new Point((int) (ana.getPosition().getX() + digi.getPosition().getX()),
                (int) (ana.getPosition().getY() + digi.getPosition().getY()));
    }

    

}
