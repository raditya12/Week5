import java.util.Scanner;
public class PemilihBilangan23 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        String hasil;
        hasil = (angka %2 == 0) ? " Bilangan positif" : " Bilangan negatif";
        System.out.println(angka + " adalah " + hasil);
        
    }
}