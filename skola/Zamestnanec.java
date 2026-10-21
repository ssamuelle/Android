public class Zamestnanec extends Osoba {

    private int plat;
    private String pozicia;

    public Zamestnanec(String meno, String priezvisko, int vyska, int hmotnost, String datumNarodenia,
                       int plat, String pozicia) {
        super(meno, priezvisko, vyska, hmotnost, datumNarodenia);
        this.plat = plat;
        this.pozicia = pozicia;
    }

    public int getPlat() {
        return plat;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }

    public String getPozicia() {
        return pozicia;
    }

    public void setPozicia(String pozicia) {
        this.pozicia = pozicia;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", plat: " + plat
                + ", pozicia: " + pozicia;
    }
}
