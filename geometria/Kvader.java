public class Kvader {
    private Obdlznik podstava;
    private Obdlznik prednaStena;
    private Obdlznik bocnaStena;
    //private String farba;

    public Kvader(int stranaA, int stranaB, int stranaC) {
        podstava = new Obdlznik(stranaA, stranaB);
        prednaStena = new Obdlznik(podstava.getStranaA(), stranaC);
        bocnaStena = new Obdlznik(podstava.getStranaB(), prednaStena.getStranaB());
    }

    public Kvader(int strana) {
        this(strana, strana, strana);
    }

    public Kvader(int strana, int vyska) {
        this(strana, strana, vyska);
    }

    public int objem() {
        return podstava.obsah() * prednaStena.getStranaB();
    }

    public int povrch() {
        return (2 * prednaStena.obsah() + 2 * bocnaStena.obsah()) + 2 * podstava.obsah();
    }

    public float telesovaUhlopriecka() {
        return (float)Math.sqrt(Math.pow(podstava.uhlopriecka(), 2) + Math.pow(prednaStena.getStranaB(), 2)); 
    }

    public String ToString() {
        return "a = " + podstava.getStranaA() +
         "\nb = " + podstava.getStranaB() + 
         "\nc = " + prednaStena.getStranaB() +
         "\nV = " + objem() +
         "\nS = " + povrch() +
         "\nu = " + telesovaUhlopriecka() +
         "\n" + super.toString();
    }

    public void info() {
        System.out.println(toString());
    }
}