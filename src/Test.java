
public class Test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        
        Monitor monitor = new Monitor("WS19", "Asus", "18.", resolution);
        
        Kasa kasa = new Kasa("ShadowBlade", "Shadow", "Cam");
        
        Anakart anakart = new Anakart("Gaming190", "MSI", 5, "Windows 10");
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        
        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();
    }
}
