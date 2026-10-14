public class Ziak extends Osoba implements Info{
    private String trieda;
    private String zameranie;
    private float priemer;
    // private Osoba triednaUcitelka;

    public String getTrieda(){
        return trieda;
    }

    public String getZameranie(){
        return zameranie;
    }

    public float getPriemer(){
        return priemer;
    }

    public void setTrieda(String trieda){
        this.trieda = trieda;
    }

    public void setZameranie(String zameranie){
        this.zameranie = zameranie;
    }

    public void setPriemer(float priemer){
        this.priemer = priemer;
    }

    public Ziak(String meno, String priezvisko, int vyska, int vaha, String datumNarodenia, String trieda, String zameranie, float priemer){
        super(meno, priezvisko, vyska, vaha, datumNarodenia); // volanie konstruktora musi byt na prvom riadku 
        this.trieda = trieda;
        this.zameranie = zameranie;
        this.priemer = priemer;
    }

    public String toString(){
        return "trieda = " + trieda +
        "\nzameranie = " + zameranie + 
        "\npriemer = " + priemer + 
        "\n" + super.toString();
    }

    public void info(){
        System.out.println(toString());
    }

}

