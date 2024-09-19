package .vscode;
import java.util.Scanner;
public class Latihan {
    public static void main(String[] args) {
        Scanner input = new scanner(System.in);
        //Deklarasi variabel
        String namaAnda;
        int noFilm, noKategori, jmlFilm;
        double hargaReguler = 50000, hargaVip = 100000, hargaVvip = 150000, diskon, pajak, totalPembayaran;

        //Input
        System.out.println("Selamat datang di aplikasi system pemesanan bioskop");
        System.out.println("Masukkan nama anda: ");
        namaAnda = input.nextLine();
        System.out.println("Pilih film");
        System.out.println("1. Film 1");
        System.out.println("2. Film 2");
        System.out.println("3. Film 3");
        System.out.println("Masukkan no film: ");
        noFilm = input.nextInt();
        System.out.println("Pilih kategori film");
        System.out.println("1. Reguler");
        System.out.println("2. VIP");
        System.out.println("3. VVIP");
        System.out.println("Masukkan nomor kategori film: ");
        noKategori = input.nextInt();
        System.out.println("Masukkan jumlah tiket: ");
        jmlFilm = input.nextInt();

        


    }
    
}
