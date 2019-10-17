package tugas4;

public class segitigasiku2 extends segitiga{
    public segitigasiku2(double alas1, double tinggi1){
        super(alas1,tinggi1);
    }
    
    public double sisimiring(double alas1, double tinggi){
        return Math.sqrt((tinggi*tinggi)+(alas1*alas1));
    }
    
    public double keliling(double alas1, double tinggi1){
        double sisimiring = sisimiring(alas1,tinggi1);
        return alas1+tinggi1+sisimiring;
        
    }
    
    public void view(){
        double k1 = keliling(alas,tinggi);
        super.view1();
        System.out.println("Jenis segitiganya adalah Segitiga Siku-Siku");
        System.out.println("Keliling segitiganya adalah "+k1+" cm");
    }
}
