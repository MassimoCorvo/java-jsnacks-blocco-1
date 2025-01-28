public class Personaggio {
    private int puntiVita;
    private int puntiAttacco;
    private int puntiDifesa;


    public Personaggio(int puntiVita, int puntiAttacco, int puntiDifesa){
        this.puntiVita = puntiVita;
        this.puntiAttacco = puntiAttacco;
        this.puntiDifesa = puntiDifesa;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }

    public int getPuntiAttacco() {
        return puntiAttacco;
    }

    public void setPuntiAttacco(int puntiAttacco) {
        this.puntiAttacco = puntiAttacco;
    }

    public int getPuntiDifesa() {
        return puntiDifesa;
    }

    public void setPuntiDifesa(int puntiDifesa) {
        this.puntiDifesa = puntiDifesa;
    }
    

}
