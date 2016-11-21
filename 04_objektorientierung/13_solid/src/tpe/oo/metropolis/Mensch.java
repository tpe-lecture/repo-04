package tpe.oo.metropolis;

public abstract class Mensch extends Einwohner {
    
   int alter;
   
   Mensch(String name, int einkommen, int alter) {
       super(name, einkommen);
       this.alter = alter;
   }
}
