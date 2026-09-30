import java.util.Scanner;

public class Obdlznik {
    private int stranaA;
    private int stranaB;
    private String farba;

    public void setStranaA(int stranaA){
        this.stranaA = stranaA;
    }

    public void setStranaB(int stranaB){
        this.stranaB = stranaB;
    }

    public void setFarba(String farba){
        this.farba = farba;
    }

    public int getStranaA(){
        return this.stranaA;
    }

    public int getStranaB(){
        return this.stranaB;
    }

    public String getFarba(){
        return this.farba;
    }

    public int obsah(){
        return stranaA*stranaB;
    }

    public int obvod(){
        return 2*(stranaA+stranaB);
    }

    public float uhlopriecka() {
        return (float)Math.sqrt(Math.pow(stranaA, 2) + Math.pow(stranaB, 2));
    }

    public Obdlznik (int stranaA, int stranaB){
        this.stranaA = stranaA;
        this.stranaB = stranaB;
    }

    public Obdlznik(int stranaA, int stranaB, String farba){
        this(stranaA, stranaB);
        this.farba = farba;
    }

    public Obdlznik(int stranaA){
        this(stranaA, stranaA);
    }

    public Obdlznik(int stranaA, String farba){
        this(stranaA, stranaA, farba);
    }

    public Obdlznik() {
        Scanner scanner = new Scanner(System.in);

        this.stranaA = OverRozmer.overRozmerStrany('a', scanner);
        this.stranaB = OverRozmer.overRozmerStrany('b', scanner);

        scanner.nextLine();

        System.out.println("Zadaj farbu: ");
        this.farba = scanner.nextLine();
    }

    @Override
    public String toString(){
        return "a = " + stranaA +
         "\nb = " + stranaB +
         "\nfarba = " + farba +
         "\nobvod = " + obvod() +
         "\n(S) - Obsah = " + obsah() +
         "\nuhlopriecka = " + uhlopriecka();
    }

    public void info(){
        System.out.println(toString());
    }
}