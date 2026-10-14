import java.lang.ProcessHandle.Info;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Samuel", "Dang Van", 175, 63, "5.6.2007");
        //o1.info();

        Ziak z1 = new Ziak("Matus", "Bodnar", 175, 63, "7.8.2007", "4.B", "programator", 1.79f);
        z1.info();

        Zamestnanec z2 = new Zamestnanec("Matus", "Grivalsky", 190, 75, "5.6.2002", 1200, "ucitel");
        z2.info();

        
        ArrayList<Osoba> zoznamOs = new ArrayList<Osoba>();
        zoznamOs.add(z1);
        zoznamOs.add(z2);
        zoznamOs.add(o1);
        zoznamOs.add(new Osoba("Vanessa Mai", "Nguyen", 165, 57, "6.7.2007"));

        System.out.println("pocet: " + zoznamOs.size());

        for (int i = 0; i < zoznamOs.size(); i++) {
            System.out.println(zoznamOs.get(i).toString());
        }

        /*for (Info os : zoznamOs) {
            os.info();
        }*/
    }
}