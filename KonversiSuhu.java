import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam celcius: ");
        int celcius = input.nextInt();
        //mengubah celcius ke farenheit
        double farenheit = ((double)celcius * 9/5) + 32;
        //menampilkan output
        System.out.println("Suhu dalam farenheit: " + farenheit);

    }
}
