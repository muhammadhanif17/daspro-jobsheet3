import java.util.Scanner;
public class Siakad14 {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts,nialaiUas, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nialaiUas = sc.nextDouble();
        
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUts * 0.30) + (nialaiUas * 0.35);
        
        System.out.println("Nama: " + nama +  "NIM: " + nim);
        System.out.println("Kelas: " + kelas +  "Absen: " + absen);
        System.out.println("Nilai Akhir:" + nilaiAkhir);

    }

    
}
