package tugas4;

public class segitiga extends bangundatar {
    protected double alas;
    protected double tinggi;
    
    segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double luas(double alas, double tinggi){
        return (0.5*alas*tinggi);
    }
    
    public void view1(){
        double l1 = luas(alas,tinggi);
        super.view();
        System.out.println("Nama bangun datar adalah segitiga");
        System.out.println("Luas segitiga adalah "+l1);
    }
    
    public void view2(){
        double l2 = luas(alas,tinggi);
        super.view();
        System.out.println("Nama bangun datar adalah segitiga");
        System.out.println("Luas segitiga adalah "+l2);
    }
}
