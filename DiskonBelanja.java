import java.util.Scanner;
public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.print("Masukkan jumlah barang: ");
         int jmlBarang = input.nextInt();
         System.out.print("Masukkan harga barang: ");
         double hargaBarang = input.nextInt();

         double totalBelanja = jmlBarang*hargaBarang;

         System.out.println("Total belanja: " + totalBelanja);

         double diskon = 0;
            if(totalBelanja > 50000) {
                diskon = 0.20 * totalBelanja;
            }
            double totalBelanjaSetelahDiskon = totalBelanja - diskon;
            
            System.out.println("Diskon: " + diskon);
            System.out.println("Total belanja setelah diskon: " + totalBelanjaSetelahDiskon);


    }
}
