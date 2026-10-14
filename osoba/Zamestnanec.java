public class Zamestnanec extends Osoba implements Info {
    private int plat;
    private String pozicia;
    // uvazok
    // datum nastupu

    public Zamestnanec (String meno, String priezvisko, int vyska, int vaha, String datumNarodenia, int plat, String pozicia){
        super(meno, priezvisko, vyska, vaha, datumNarodenia);
        this.plat = plat;
        this.pozicia = pozicia;
    }

    public int getPlat(){
        return plat;
    }

    public String getPozicia(){
        return pozicia;
    }

    public void setPlat(int Plat){
        this.plat = plat;
    }

    public void setPozicia(String pozicia){
        this.pozicia = pozicia;
    }

    public String toString(){
        return "plat = " + plat +
        "\npozicia = " + pozicia + 
        "\n" + super.toString();
    }
    
    //@Override
    public void info(){
        System.out.println(toString());
    }

}
