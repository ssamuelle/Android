public class Main {
    public static void main(String[] args) throws Exception {
        Obdlznik obd = new Obdlznik();
        obd.info();
 
        Kruh k1 = new Kruh(5, "modra");
        k1.info();
 
        Kvader kv = new Kvader(2, 3, 4);
        kv.info();
    }
}
 
