import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Osoba implements Info {

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("d.M.yyyy");

    private String meno;
    private String priezvisko;
    private int vyska;
    private int hmotnost;
    private LocalDate datumNarodenia;

    // datum sa zadava ako text vo formate d.M.yyyy
    public Osoba(String meno, String priezvisko, int vyska, int hmotnost, String datumNarodenia) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vyska = vyska;
        this.hmotnost = hmotnost;
        this.datumNarodenia = LocalDate.parse(datumNarodenia, FORMAT);
    }

    public void predstavSa() {
        System.out.println("Ahoj, volam sa " + meno + " " + priezvisko);
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public int getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(int hmotnost) {
        this.hmotnost = hmotnost;
    }

    public LocalDate getDatumNarodenia() {
        return datumNarodenia;
    }

    public void setDatumNarodenia(String datumNarodenia) {
        this.datumNarodenia = LocalDate.parse(datumNarodenia, FORMAT);
    }

    // vek sa pocita z datumu narodenia (presne, s ohladom na den a mesiac)
    public int vypocitajVek() {
        return Period.between(datumNarodenia, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return meno + " " + priezvisko
            + ", vek: " + vypocitajVek()
            + ", datum narodenia: " + datumNarodenia.format(FORMAT)
            + ", vyska: " + vyska + " cm"
            + ", hmotnost: " + hmotnost + " kg";
    }

    @Override
    public void info() {
        System.out.println(toString());
    }
}
