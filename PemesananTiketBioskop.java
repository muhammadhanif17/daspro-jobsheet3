import java.util.Scanner;

public class PemesananTiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Daftar film
        String[] film = {"Film A", "Film B", "Film C"};
        double hargaReguler = 50000, hargaVIP = 100000, hargaVVIP = 150000;
        double hargaTiket = 0, totalHarga = 0, diskon = 0, pajak = 0, totalBayar = 0;
        String kategoriTiket = "";
        
        // Input nama pengguna
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        
        // Pilih film
        System.out.println("Pilih film:");
        for (int i = 0; i < film.length; i++) {
            System.out.println((i + 1) + ". " + film[i]);
        }
        System.out.print("Masukkan nomor film yang dipilih: ");
        int pilihanFilm = input.nextInt();
        
        // Pilih kategori tiket
        System.out.println("Pilih kategori tiket:");
        System.out.println("1. Reguler\n2. VIP\n3. VVIP");
        System.out.print("Masukkan nomor kategori tiket yang dipilih: ");
        int pilihanKategori = input.nextInt();
        
        // Tentukan harga tiket berdasarkan kategori
        switch (pilihanKategori) {
            case 1:
                hargaTiket = hargaReguler;
                kategoriTiket = "Reguler";
                break;
            case 2:
                hargaTiket = hargaVIP;
                kategoriTiket = "VIP";
                break;
            case 3:
                hargaTiket = hargaVVIP;
                kategoriTiket = "VVIP";
                break;
            default:
                System.out.println("Kategori tiket tidak valid.");
                return;
        }
        
        // Input jumlah tiket
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = input.nextInt();
        
        // Hitung total harga sebelum diskon
        totalHarga = hargaTiket * jumlahTiket;
        
        // Hitung diskon
        if (jumlahTiket > 5) {
            diskon = totalHarga * 0.05; // Diskon 5% jika beli lebih dari 5 tiket
        }
        if (totalHarga - diskon > 500000) {
            diskon += (totalHarga - diskon) * 0.10; // Diskon tambahan 10% jika harga setelah diskon > 500.000
        }
        
        // Hitung pajak (10%)
        pajak = (totalHarga - diskon) * 0.10;
        
        // Hitung total bayar
        totalBayar = totalHarga - diskon + pajak;
        
        // Tampilkan rincian
        System.out.println("\n=== RINCIAN PEMESANAN ===");
        System.out.println("Nama: " + nama);
        System.out.println("Film: " + film[pilihanFilm - 1]);
        System.out.println("Kategori Tiket: " + kategoriTiket);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Total Harga Sebelum Diskon: Rp " + totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Pajak (10%): Rp " + pajak);
        System.out.println("Total Pembayaran: Rp " + totalBayar);
    }
}
