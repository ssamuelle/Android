import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Osoba implements Info {
    private String meno;
    private String priezvisko;
    private int vyska;
    private int vaha;
    private String datumNarodenia;

    public void setMeno(String meno){
        this.meno = meno;
    }

    public String getMeno(){
        return this.meno;
    }

    public void setPriezvisko(String priezvisko){
        this.priezvisko = priezvisko;
    }

    public String getPriezvisko(){
        return this.priezvisko;
    }

    public void setVyska(int vyska){
        this.vyska = vyska;
    }

    public int getVyska(){
        return this.vyska;
    }

    public void setVaha(int vaha){
        this.vaha = vaha;
    }

    public int getVaha(){
        return this.vaha;
    }

    public void setDatumNarodenia(String datumNarodenia){
        this.datumNarodenia = datumNarodenia;
    }

    public String getDatumNarodenia(){
        return this.datumNarodenia;
    }

    public Osoba(String meno, String priezvisko, int vyska, int vaha, String datumNarodenia) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vyska = vyska;
        this.vaha = vaha;
        this.datumNarodenia = datumNarodenia;
    }

    public String toString(){ 
        return "meno = " + meno +
         "\npriezvisko = " + priezvisko + 
         "\nvyska = " + vyska + 
         "\nvaha = " + vaha +
         "\ndatum = " + datumNarodenia +
         "\nvek = " + getVek() + 
         "\n" + super.toString();
    }

    public void info(){
        System.out.println(toString());
    }

    public int getVek() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d.M.yyyy");
        LocalDate datum = LocalDate.parse(datumNarodenia, format);
        LocalDate dnes = LocalDate.now();
    
        return Period.between(datum, dnes).getYears();
    }
}
