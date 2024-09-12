import java.util.Scanner;
public class TagihanListrik14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double penggunaanListrik = 0, tarifPerKwh = 1500, totalTagihan;
        boolean melebihi500Kwh;
        
        System.out.print("Masukkan Jumlah Penggunaan Listrik (kWh): ");
        
        penggunaanListrik = input.nextDouble();
        totalTagihan = penggunaanListrik * tarifPerKwh;

        melebihi500Kwh = penggunaanListrik > 500;

        System.out.println("Total Tagihan Listrik (Rp): " + totalTagihan);
        System.out.println("Apakah Melebihi 500 kWh?" + melebihi500Kwh);
    }
    
}
