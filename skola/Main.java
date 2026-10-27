import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    // ---------- pomocne metody na nacitanie ----------
    static String nacitajText(String vyzva) {
        System.out.print(vyzva);
        return sc.nextLine().trim();
    }

    static int nacitajInt(String vyzva) {
        while (true) {
            try {
                return Integer.parseInt(nacitajText(vyzva));
            } catch (NumberFormatException e) {
                System.out.println("Zadaj cele cislo!");
            }
        }
    }

    static float nacitajFloat(String vyzva) {
        while (true) {
            try {
                return Float.parseFloat(nacitajText(vyzva).replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Zadaj cislo!");
            }
        }
    }

    static String nacitajDatum(String vyzva) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d.M.yyyy");
        while (true) {
            String text = nacitajText(vyzva);
            try {
                LocalDate d = LocalDate.parse(text, format);
                if (d.isAfter(LocalDate.now())) {
                    System.out.println("Datum nemoze byt v buducnosti!");
                    continue;
                }
                return text;
            } catch (DateTimeParseException e) {
                System.out.println("Zly format datumu! Pouzi napr. 5.6.2007");
            }
        }
    }

    // ---------- menu ----------
    static void vypisMenu() {
        System.out.println();
        System.out.println("-------- MENU --------");
        System.out.println("1 - Pridat ziaka");
        System.out.println("2 - Odstranit ziaka podla mena a priezviska");
        System.out.println("3 - Pridat zamestnanca");
        System.out.println("4 - Odstranit zamestnanca podla mena a priezviska");
        System.out.println("5 - Vyhladat ziaka podla mena alebo priezviska");
        System.out.println("6 - Vyhladat zamestnanca podla mena alebo priezviska");
        System.out.println("7 - Vypisat zoznam ziakov");
        System.out.println("8 - Vypisat zoznam zamestnancov");
        System.out.println("9 - Vypisat informacie o skole");
        System.out.println("0 - Koniec");
        System.out.print("Vyber: ");
    }

    // ---------- akcie ----------
    static void pridajZiaka(Skola skola) {
        String meno = nacitajText("Meno: ");
        String priezvisko = nacitajText("Priezvisko: ");
        int vyska = nacitajInt("Vyska (cm): ");
        int vaha = nacitajInt("Vaha (kg): ");
        String datum = nacitajDatum("Datum narodenia (d.M.yyyy): ");
        String trieda = nacitajText("Trieda: ");
        String zameranie = nacitajText("Zameranie: ");
        float priemer = nacitajFloat("Priemer: ");

        skola.pridajZiaka(new Ziak(meno, priezvisko, vyska, vaha, datum, trieda, zameranie, priemer));
        System.out.println("Ziak bol pridany.");
    }

    static void odstranZiaka(Skola skola) {
        String meno = nacitajText("Meno: ");
        String priezvisko = nacitajText("Priezvisko: ");

        if (skola.odstranZiaka(meno, priezvisko)) {
            System.out.println("Ziak bol odstraneny.");
        } else {
            System.out.println("Ziak sa nenasiel.");
        }
    }

    static void pridajZamestnanca(Skola skola) {
        String meno = nacitajText("Meno: ");
        String priezvisko = nacitajText("Priezvisko: ");
        int vyska = nacitajInt("Vyska (cm): ");
        int vaha = nacitajInt("Vaha (kg): ");
        String datum = nacitajDatum("Datum narodenia (d.M.yyyy): ");
        int plat = nacitajInt("Plat: ");
        String pozicia = nacitajText("Pozicia: ");

        skola.pridajZamestnanca(new Zamestnanec(meno, priezvisko, vyska, vaha, datum, plat, pozicia));
        System.out.println("Zamestnanec bol pridany.");
    }

    static void odstranZamestnanca(Skola skola) {
        String meno = nacitajText("Meno: ");
        String priezvisko = nacitajText("Priezvisko: ");

        if (skola.odstranZamestnanca(meno, priezvisko)) {
            System.out.println("Zamestnanec bol odstraneny.");
        } else {
            System.out.println("Zamestnanec sa nenasiel.");
        }
    }

    static void hladajZiaka(Skola skola) {
        String text = nacitajText("Zadaj meno alebo priezvisko: ");
        ArrayList<Ziak> najdeni = skola.hladajZiaka(text);

        if (najdeni.isEmpty()) {
            System.out.println("Ziak sa nenasiel.");
        } else {
            for (Ziak z : najdeni) { 
                System.out.println("-----");
                z.info();
            }
        }
    }

    static void hladajZamestnanca(Skola skola) {
        String text = nacitajText("Zadaj meno alebo priezvisko: ");
        ArrayList<Zamestnanec> najdeni = skola.hladajZamestnanca(text);

        if (najdeni.isEmpty()) {
            System.out.println("Zamestnanec sa nenasiel.");
        } else {
            for (Zamestnanec z : najdeni) {
                System.out.println("-----");
                z.info();
            }
        }
    }

    // ---------- main ----------
    public static void main(String[] args) {
        System.out.println("-------- SKOLA --------");
        String nazov = nacitajText("Zadaj nazov skoly: ");
        String adresa = nacitajText("Zadaj adresu skoly: ");
        Skola skola = new Skola(nazov, adresa);

        int volba = -1;
        while (volba != 0) {
            vypisMenu();
            try {
                volba = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                volba = -1;
            }
            System.out.println();

            switch (volba) {
                case 1: pridajZiaka(skola); break;
                case 2: odstranZiaka(skola); break;
                case 3: pridajZamestnanca(skola); break;
                case 4: odstranZamestnanca(skola); break;
                case 5: hladajZiaka(skola); break;
                case 6: hladajZamestnanca(skola); break;
                case 7: skola.vypisZiakov(); break;
                case 8: skola.vypisZamestnancov(); break;
                case 9: skola.info(); break;
                case 0: System.out.println("Koniec programu."); break;
                default: System.out.println("Neplatna volba!");
            }
        }
    }
}
