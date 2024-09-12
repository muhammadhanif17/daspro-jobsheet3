import java.until.Scanner;

public class Siakad.14 {

    public static void main(String []args){
        java.util.Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc ,nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc ,nextLine() .charAt(0);
        System.out.print("Masukkan Nomor Absen: ");
        absen = sc ,nextByte();
        
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian);

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir)

    }


}

