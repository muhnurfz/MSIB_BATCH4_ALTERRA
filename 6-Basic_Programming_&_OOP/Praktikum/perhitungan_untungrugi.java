import java.util.Scanner;

public class perhitungan_untungrugi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perhitungan untung rugi");
        System.out.println("Muhamad Nur Fajjri Z-Kelas D QE 2023    ");
        System.out.println("Masukan harga beli barang (modal)       : ");
        double num1 = input.nextDouble();
        System.out.println("Masukan harga jual barang               : ");
        double num2 = input.nextDouble();

        if (num1<num2) {
            System.out.println("Anda mendapat keuntungan" +(num2-num1));
        } else {
            System.out.println("Anda mendapat kerugian"+ (num2-num1));
        }
    }
}
