package tpe.oo.metropolis;

public class Superheld extends Mutant {


    Superkraft[] superkraft;

    Superheld(String name, int einkommen, String mutation, Superkraft[] superkraft) {
        super(name, einkommen, mutation);
        this.superkraft= superkraft;
    }

}
