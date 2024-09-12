import java.until.Scanner;

public class Siakad.14 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc ,nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc ,nextLine() .charAt(0);
        System.out.print("Masukkan nomor absen: ");
        abse = sc ,nextByte();
        
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

