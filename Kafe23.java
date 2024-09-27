import java.util.Scanner;
public class Kafe23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan, cup= true;

        System.out.println("Masukkan menu: ");
        menu = input.nextLine();
        System.out.println("Masukkan ukuran cup: ");
        ukuranCup = input.next().charAt(0);
        System.out.println("Masukkan jumlah: ");
        jumlah = input.nextInt();
        System.out.println("Masukkan keanggotaan (true / false): ");
        keanggotaan = input.nextBoolean();

        double hargaMenu = 0;
        switch  (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }
        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                cup = false;
                break;
        }
        if (cup){

            double diskon = keanggotaan ? 0.1 : 0;
            double nominalBayar = totalHarga - (diskon * totalHarga);
            
            System.out.println("Item pembelian : " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
            System.out.println(" Nominal bayar: " + nominalBayar);
        }
        else {
            System.out.println("Ukuran tidak tersedia");
        }
        }
}