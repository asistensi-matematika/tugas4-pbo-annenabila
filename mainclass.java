package tugas4;
import java.util.Scanner;
public class mainclass {

    public static void main(String[] args) {
        System.out.print("Pilih bangun datar yg diinginkan\n1. Persegi\n2. Lingkaran\n3. Segitiga\n"  );
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Masukan pilihan Anda : ");
        int ini = a.nextInt();
        
        switch (ini) {
            case 1:
                System.out.print("Masukan panjang sisi : ");
                double sisi = a.nextDouble();
                persegi persegi1 = new persegi(sisi);
                persegi1.view();
                break;
            case 2:
                System.out.print("Masukan panjang jari-jari : ");
                double jari2 = a.nextDouble();
                lingkaran lingkaran1 = new lingkaran(jari2);
                lingkaran1.view();
                break;
            case 3:
                System.out.print("Pilih segitiga yang diinginkan\n1. Segitiga siku-siku\n2. Segitiga sama sisi\n");
                System.out.print("Masukan pilihan Anda : ");
                int itu = a.nextInt();
                switch (itu){
                    case 1:
                        System.out.print("Masukan panjang alas : ");
                        double alas = a.nextDouble();
                        System.out.print("Masukan panjang tinggi : ");
                        double tinggi = a.nextDouble();
                        segitigasiku2 segitiga1 = new segitigasiku2(alas,tinggi);
                        segitiga1.view();
                        break;
                    case 2:
                        System.out.print("Masukan panjang alas : ");
                        double alas2 = a.nextDouble();
                        System.out.print("Masukan panjang tinggi : ");
                        double tinggi2 = a.nextDouble();
                        segitigasamasisi segitiga2 = new segitigasamasisi(alas2,tinggi2);
                        segitiga2.view();
                        break;
                }
               
        }
    }
    
}
