package tugas4;

public class segitigasamasisi extends segitiga {
    public segitigasamasisi(double alas, double tinggi){
        super(alas,tinggi);
    }
    
    public double keliling(double alas){
        return 3*alas;
    }
    
    public void view(){
        double k2 = keliling(alas);
        super.view2();
        System.out.println("Jenis Segitiganya adalah Segitiga Sama Sisi");
        System.out.println("Keliling segitiganya adalah "+k2+" cm");
    }

    
}
