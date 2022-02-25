
public class Kasa {
    private String model;
    private String uretitici;
    private String mazeme;

    public Kasa(String model, String uretitici, String mazeme) {
        this.model = model;
        this.uretitici = uretitici;
        this.mazeme = mazeme;
    }

    public void bilgisayari_ac(){
        System.out.println("Bilgisayar Aciliyor...");
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretitici() {
        return uretitici;
    }

    public void setUretitici(String uretitici) {
        this.uretitici = uretitici;
    }

    public String getMazeme() {
        return mazeme;
    }

    public void setMazeme(String mazeme) {
        this.mazeme = mazeme;
    }
    
    
    
}
