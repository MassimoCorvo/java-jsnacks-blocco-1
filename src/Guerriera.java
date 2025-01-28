public class Guerriera extends Personaggio{
    private String arma;
    private int puntiDanno;

    public Guerriera(int puntiVita, int puntiAttacco, int puntiDifesa, String arma, int puntiDanno){
        super(puntiVita, puntiAttacco, puntiDifesa);
        this.arma = arma;
        this.puntiDanno = puntiDanno;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getPuntiDanno() {
        return puntiDanno;
    }

    public void setPuntiDanno(int puntiDanno) {
        this.puntiDanno = puntiDanno;
    }

    public void attacca(){
        System.out.println("Sei stato ferito");
    }
}
