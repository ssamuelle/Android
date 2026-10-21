public class Ziak extends Osoba {

    private String trieda;
    private String odbor;
    private float priemer;

    public Ziak(String meno, String priezvisko, int vyska, int hmotnost, String datumNarodenia,
                String trieda, String odbor, float priemer) {
        super(meno, priezvisko, vyska, hmotnost, datumNarodenia);
        this.trieda = trieda;
        this.odbor = odbor;
        this.priemer = priemer;
    }

    public String getTrieda() {
        return trieda;
    }

    public void setTrieda(String trieda) {
        this.trieda = trieda;
    }

    public String getOdbor() {
        return odbor;
    }

    public void setOdbor(String odbor) {
        this.odbor = odbor;
    }

    public float getPriemer() {
        return priemer;
    }

    public void setPriemer(float priemer) {
        this.priemer = priemer;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", trieda: " + trieda
                + ", odbor: " + odbor
                + ", priemer: " + priemer;
    }
}
