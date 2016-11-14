package tpe.oo.factory.figuren;

public class FigurFactory {

    public Figur createFigur(Figur figur) {
        int i = (int)(Math.random() * 10);
        for (int i = 0; i < figur.length; i++) {

            if (i % 3 == 0) {
                figur[i] = new Lady(this);
            }
            else if (i % 3 == 1) {
                figur[i] = new Ninja(this);
            }
            else { // i % 3 == 2
                figur[i] = new Wizard(this);
            }

        return figur;
    }

}
