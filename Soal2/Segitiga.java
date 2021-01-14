package Soal2;

public class Segitiga extends Bangundatar {
    private double sisia=2;
    protected double sisib=1;
    protected double sisic=2;
    protected double jarijari=21;
 
    @Override
    public void HitungLuas(){
        double luas;
        luas = this.sisib * this.sisic / 2;
        System.out.println("ALAS : " +this.sisib + " cm ");
        System.out.println("Tinggi : " +this.sisic + " cm ");
        System.out.println("Luas Segitiga : " +luas + " cm ");
    }
    
    @Override
    public void HitungKeliling(){
        double keliling;
        keliling = this.sisia + this.sisib + this.sisic;
        System.out.println("SISI A : " +this.sisib + " cm ");
        System.out.println("SISI B : " +this.sisic + " cm ");
        System.out.println("SISI C : " +this.sisia + " cm ");
        System.out.println("keliling Segitiga : " +keliling + " cm ");
        
    }
    
}