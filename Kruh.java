
public class Kruh {
    private static final float PI = 3.14f;

    private int polomer;
    private String farba;

    public Kruh(int polomer) {
        this.polomer = polomer;
    }

    public Kruh(int polomer, String farba) {
        this(polomer);
        this.farba = farba;
    }

    public int getPolomer() {
        return polomer;
    }

    public void setPolomer(int polomer) {
        this.polomer = polomer;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public int priemer() {
        return 2 * polomer; // d = 2*r
    }

    public double obvod() {
        return 2 * PI * polomer; // o = 2*πr
    }

    public double obsah() {
        return PI * polomer * polomer; // S = πr²
    }

    @Override
    public String toString() {
        return "r = " + polomer +
                "\nfarba = " + farba +
                "\nd = " + priemer() +
                "\nobvod = " + String.format("%.2f", obvod()) +
                "\n(S) - Obsah = " + String.format("%.2f", obsah());
    }
 
    public void info() {
        System.out.println(toString());
    }
}
