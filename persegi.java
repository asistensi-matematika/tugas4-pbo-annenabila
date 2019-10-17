package tugas4;

public class persegi extends bangundatar {
    protected double sisi;
    
    persegi(double sisi){
        this.sisi = sisi;
    }
   
    public double luas(double sisi){
        return sisi*sisi;
    }
    
    public void view(){
        double l = luas(sisi);
        double k = 4*sisi;
        super.view();
        System.out.println("Nama bangun datar adalah persegi");
        System.out.println("Luasnya adalah "+l+"cm^2");
        System.out.println("Keliling adalah "+k+"cm");
    }
}
