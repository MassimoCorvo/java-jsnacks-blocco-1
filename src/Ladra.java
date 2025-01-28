public class Ladra extends Personaggio{
    private int puntiAstuzia;

    public Ladra(int puntiVita, int puntiAttacco, int puntiDifesa, int puntiAstuzia){
        super(puntiVita, puntiAttacco, puntiDifesa);
        this.puntiAstuzia = puntiAstuzia;
    }

    public int getPuntiAstuzia() {
        return puntiAstuzia;
    }

    public void setPuntiAstuzia(int puntiAstuzia) {
        this.puntiAstuzia = puntiAstuzia;
    }

    public void ruba(String oggetto){
        System.out.println("Ho rubato " + oggetto);
    }
    
}
