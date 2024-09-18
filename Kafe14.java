import java.util.Scanner;
public class Kafe14 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean keanggotaan;
    int jmlKopi, jmlTeh, jmlRoti;
    double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar ;
    float diskon = 10/100f;

    System.out.print("Masukkan Keanggotaan (true/false): ");
    keanggotaan = input.nextBoolean();
    System.out.print("Masukkan Jumlah Pembelian Kopi: ");
    jmlKopi = input.nextInt();
    System.out.print("Masukkan Jumlah Pembelian Teh: ");
    jmlTeh = input.nextInt();
    System.out.print("Masukkan Jumlah Pembelian Roti: ");
    jmlRoti = input.nextInt();

    totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
    byte totalByte = (byte) totalHarga;

    nominalBayar = totalHarga - (diskon * totalHarga);
    int nominalInt = (int) nominalBayar;

    System.out.println("Keanggotaan Pelanggan " + keanggotaan);
    System.out.println("Item Pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
    System.out.println("Total Harga Rp " + totalHarga);
    System.out.println("Total Harga (dalam byte) Rp " + totalByte);
    System.out.println("Nominal Bayar Rp " + nominalBayar);
    System.out.println("Nominal Bayar (dalam integer) Rp " + nominalInt);


    } 
    
}
    