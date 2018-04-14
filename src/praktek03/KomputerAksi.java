package praktek03;

public class KomputerAksi {
    public static void main(String[] args) {
        Komputer a = new Komputer();

        a.setMerk("ASUS");
        a.setProcessor("intel core i5");
        a.setMemory("4 GB");
        
        a.cetakInfo();
        
        System.out.println("================================");
        System.out.print("Merknya       \t: ");
        System.out.println(a.getMerk());
        System.out.print("Processornya  \t: ");
        System.out.println(a.getProcessor());
        System.out.print("Memorynya     \t: ");
        System.out.println(a.getMemory());
    }
}
