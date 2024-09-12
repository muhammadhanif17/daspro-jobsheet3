import java.util.Scanner; // Pastikan impor Scanner sudah ada

public class GajiKaryawan14 {
    public static void main(String[] args) {
        // Input
        double jamKerja, upahPerJam, gajiSebelumBonus, bonus, gajiSetelahBonus, gajiSetelahPajak, pajak; 
      
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Masukkan jumlah jam kerja per bulan: ");
        jamKerja = scanner.nextDouble();

        System.out.print("Masukkan upah per jam (Rp): ");
        upahPerJam = scanner.nextDouble();

        //Perhitungan
        gajiSebelumBonus = jamKerja * upahPerJam;
        bonus = 0.10 * gajiSebelumBonus;
        gajiSetelahBonus = gajiSebelumBonus + bonus;
        pajak = 0.05 * gajiSetelahBonus;
        gajiSetelahPajak = gajiSetelahBonus - pajak;

        // Output
        System.out.println("Gaji sebelum bonus: Rp " + gajiSebelumBonus);
        System.out.println("Bonus (10%): Rp " + bonus);
        System.out.println("Gaji setelah bonus: " + gajiSetelahBonus);
        System.out.println("Pajak (5%): Rp " + pajak);
        System.out.println("Gaji setelah pajak: Rp " + gajiSetelahPajak);
        
    }
}

