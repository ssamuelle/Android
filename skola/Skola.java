import java.util.ArrayList;

public class Skola implements Info {
    private String nazov;
    private String adresa;
    private ArrayList<Ziak> ziaci = new ArrayList<Ziak>();
    private ArrayList<Zamestnanec> zamestnanci = new ArrayList<Zamestnanec>();

    public Skola(String nazov, String adresa) {
        this.nazov = nazov;
        this.adresa = adresa;
    }

    public String getNazov() {
        return nazov;
    }

    public String getAdresa() {
        return adresa;
    }

    // ---------- ziaci ----------
    public void pridajZiaka(Ziak z) {
        ziaci.add(z);
    }

    public boolean odstranZiaka(String meno, String priezvisko) {
        for (int i = 0; i < ziaci.size(); i++) {
            Ziak z = ziaci.get(i);
            if (z.getMeno().equalsIgnoreCase(meno) && z.getPriezvisko().equalsIgnoreCase(priezvisko)) {
                ziaci.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Ziak> hladajZiaka(String text) {
        ArrayList<Ziak> vysledok = new ArrayList<Ziak>();
        for (Ziak z : ziaci) {
            if (z.getMeno().equalsIgnoreCase(text) || z.getPriezvisko().equalsIgnoreCase(text)) {
                vysledok.add(z);
            }
        }
        return vysledok;
    }

    public void vypisZiakov() {
        if (ziaci.isEmpty()) {
            System.out.println("Ziadni ziaci.");
            return;
        }
        System.out.println("Pocet ziakov: " + ziaci.size());
        for (Ziak z : ziaci) {
            System.out.println("-----");
            z.info();
        }
    }

    // ---------- zamestnanci ----------
    public void pridajZamestnanca(Zamestnanec z) {
        zamestnanci.add(z);
    }

    public boolean odstranZamestnanca(String meno, String priezvisko) {
        for (int i = 0; i < zamestnanci.size(); i++) {
            Zamestnanec z = zamestnanci.get(i);
            if (z.getMeno().equalsIgnoreCase(meno) && z.getPriezvisko().equalsIgnoreCase(priezvisko)) {
                zamestnanci.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Zamestnanec> hladajZamestnanca(String text) {
        ArrayList<Zamestnanec> vysledok = new ArrayList<Zamestnanec>();
        for (Zamestnanec z : zamestnanci) {
            if (z.getMeno().equalsIgnoreCase(text) || z.getPriezvisko().equalsIgnoreCase(text)) {
                vysledok.add(z);
            }
        }
        return vysledok;
    }

    public void vypisZamestnancov() {
        if (zamestnanci.isEmpty()) {
            System.out.println("Ziadni zamestnanci.");
            return;
        }
        System.out.println("Pocet zamestnancov: " + zamestnanci.size());
        for (Zamestnanec z : zamestnanci) {
            System.out.println("-----");
            z.info();
        }
    }

    // ---------- info o skole ----------
    public String toString() {
        return "nazov = " + nazov +
                "\nadresa = " + adresa +
                "\npocet ziakov = " + ziaci.size() +
                "\npocet zamestnancov = " + zamestnanci.size();
    }

    public void info() {
        System.out.println(toString());
    }
}
