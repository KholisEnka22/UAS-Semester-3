package Soal2;



public class Lingkaran extends Segitiga {
    @Override
    public void HitungLuas(){
        double luas;
        luas = 3.14 * jarijari * jarijari;
        System.out.println("jari jari Lingkaran :" + jarijari);
        System.out.println("luas Lingkaran :" + luas);
}
    
    @Override
    public void HitungKeliling(){
        double keliling,diameter;
        diameter =  jarijari + jarijari;
        keliling = 3.14 * diameter;
        System.out.println("jari-jari Lingkaran : " + jarijari);
        System.out.println("Diameter Lingkaran  : " + diameter);
        System.out.println("keliling Lingkaran  : " + keliling);
    }
}