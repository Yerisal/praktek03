package praktek03;

public class KomputerAksi {
    public static void main(String[] args) {
        Komputer a = new Komputer();

        a.setMerk("ASUS");
        a.setProcessor("intel core i5");
        a.setMemory("4 GB");
        
        a.cetakInfo();
    }
}
