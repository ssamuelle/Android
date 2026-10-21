import java.util.InputMismatchException;
import java.util.Scanner;
public class OverRozmer {
    
    public static int overRozmerStrany(char znamienko, Scanner sc){
        int strana = 0;
        do {
            System.out.print("Zadaj dĺžku strany " + znamienko + ": ");
            try {
                strana = sc.nextInt();
                if (strana <= 0) {
                    System.out.println("Dlzka strany je neplatna");
                }
            } catch (InputMismatchException e) {
                System.out.println("Musis zadat cislo");
                sc.next(); 
            }
        } while (strana <= 0);

        return strana;
    }

    public int overRozmerStranyNS(char znamienko, Scanner sc){
        int strana;
        System.out.println("Zadaj dlzku strany a " + znamienko + " :");
        strana = sc.nextInt();

        while(strana<=0){
            System.out.println("Zadana dlzka strany je neplatna");
            strana= sc.nextInt();
        }
        return strana;
    }
}
