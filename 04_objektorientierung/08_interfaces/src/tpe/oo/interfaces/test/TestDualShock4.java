package tpe.oo.interfaces.test;

import org.junit.Test;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;
import tpe.oo.interfaces.impl.DuallShock4;

/**
 * Tests für einen analogen Joystick.
 */
public class TestDualShock4 extends TestAnalogController {

    /**
     * Testet einen DualShock4 Kombi-Controller.
     */
    @Test
    public void testDualShock4() {
        DigitalController cd = new DuallShock4();
        testDigitalController(cd);

        AnalogController ca = new DuallShock4();
        testAnalogController(ca);

        DuallShock4 ds = new DuallShock4();

        ds.up();
        ds.up(1.0);
        assertPointEquals(0, -2, ds.getPosition());

        ds.left();
        ds.right();
        ds.right(0.5);
        ds.right(0.5);
        assertPointEquals(1, -2, ds.getPosition());

        ds.down();
        ds.down();
        ds.down(0.3);
        ds.down(0.3);
        ds.down(0.3);
        ds.down(0.1);
        assertPointEquals(1, 1, ds.getPosition());
    }
}
