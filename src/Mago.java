public class Mago extends Personaggio{
    private String bacchettaMagica;

    public Mago(int puntiVita, int puntiAttacco, int puntiDifesa, String bacchettaMagica){
        super(puntiVita, puntiAttacco, puntiDifesa);
        this.bacchettaMagica = bacchettaMagica;
    }

    public String getBacchettaMagica() {
        return bacchettaMagica;
    }

    public void setBacchettaMagica(String bacchettaMagica) {
        this.bacchettaMagica = bacchettaMagica;
    }

    public void converti(){
        System.out.println("Wololo!");
    }
}
