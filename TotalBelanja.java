import java.util.Scanner;
public class TotalBelanja {
    public static void main(String[] args) {

        //Deklarasi variable
        Scanner input = new Scanner(System.in);
        String namaBarang;
        double hargaBarang, jmlBarang, totalHarga = 0, diskon= 0, pajak, hargaSetelahDiskon, totalPembayaran;

        //Input data barang
        System.out.print("Masukkan nama barang: ");
        namaBarang = input.nextLine();
        System.out.print("Masukkan harga barang: ");
        hargaBarang = input.nextDouble();
        System.out.print("Masukkan jumlah barang: ");
        jmlBarang = input.nextDouble();

        //Hitung total harga
        totalHarga = hargaBarang * jmlBarang;

        //Jika harga < 50000
        hargaSetelahDiskon = totalHarga;

        //menentukan apakah lebih dari 50.000
        if(totalHarga > 50000){
            diskon = totalHarga * 0.10;
            hargaSetelahDiskon = totalHarga - diskon;
            System.out.println("Anda mendapatkan diskon 10%");

        }
        
        //menghitung pajak 
        pajak = hargaSetelahDiskon * 0.10;
        totalPembayaran = hargaSetelahDiskon + pajak;

        //menampilkan output
        System.out.println("Nama barang: " + namaBarang);
        System.out.println("Harga barang: " + hargaBarang);
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga setelah diskon: " + hargaSetelahDiskon);
        System.out.println("Pajak: " + pajak);
        System.out.println("Total pembayaran: " + totalPembayaran);


    }
}

