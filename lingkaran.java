package tugas4;

public class lingkaran extends bangundatar{
    protected double jari2;
    
    lingkaran(double jari2){
        this.jari2 = jari2;
    }
    
    public double luas(double jari2){
        return 3.14159265358979323846*jari2*jari2;
    }
    
    public void view(){
        double l = luas(jari2);
        double k = 2*3.14159265358979323846*jari2;
        super.view();
        System.out.println("Nama bangun datar adalah lingkaran");
        System.out.println("luas lingkaran adalah "+l);
        System.out.println("keliling lingkaran adalah "+k);
        
    }
}
