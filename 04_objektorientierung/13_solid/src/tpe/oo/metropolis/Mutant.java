package tpe.oo.metropolis;

public abstract class Mutant extends Einwohner {
    String mutation;
     Mutant(String name, int einkommen, String mutation) {
         super(name, einkommen);
         this.mutation = mutation;
}
}
