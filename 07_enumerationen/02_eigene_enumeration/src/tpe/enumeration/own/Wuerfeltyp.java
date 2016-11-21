package tpe.enumeration.own;

//Enum für Würfelseiten
public enum Wuerfeltyp {
        D4(4), D6(6), D8(8), D10(10), D12(12), D20(20);

    public double average(int wuerfel){
         double value=(getSeiten()+1)/2;
        return value;
    }
    private int seiten;
    Wuerfeltyp(int seiten){
        this.setSeiten(seiten);
    }
    //get Seitenanzahl
    public int getSeiten() {
        return seiten;
    }
    public void setSeiten(int seiten) {
        this.seiten = seiten;
    }


}