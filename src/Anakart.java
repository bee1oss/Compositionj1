/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 37525
 */
public class Anakart {
    
    private String model;
    private String uretici;
    private int yuva_sayisi;
    private String isletim_sistemi;

    public Anakart(String model, String uretici, int yuva_sayisi, String isletim_sistemi) {
        this.model = model;
        this.uretici = uretici;
        this.yuva_sayisi = yuva_sayisi;
        this.isletim_sistemi = isletim_sistemi;
    }

    public void isletim_Sistemi_Yukle(String isletim_sistemi){
        this.isletim_sistemi = isletim_sistemi;
        System.out.println("Isletim sistemi yuklendi:" + isletim_sistemi);
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }
    
    
    
}
