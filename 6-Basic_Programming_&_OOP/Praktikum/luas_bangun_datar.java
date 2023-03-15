import java.util.Scanner;

public class luas_bangun_datar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program menghitung luas bagun datar");
        System.out.println("Muhamad Nur Fajjri Z-Kelas D QE 2023");
        System.out.println("Masukan nilai pertama       : ");
        double num1 = input.nextDouble();
        System.out.println("Masukan nilai kedua         : ");
        double num2 = input.nextDouble();

        System.out.println("Pilih perhitungan luas");
        System.out.println("1. menghitung luas segitiga");
        System.out.println("2. menghitung luas persegi panjang");
        System.out.println("3. menghitung luas lingkaran");
        int choice = input.nextInt();

        double result = 0;
        switch(choice) {
            case 1:
                result = 0.5 * num1 * num2;
                break;
            case 2:
                result = num1 * num2;
                break;
            case 3:
                result = 3.14 * num1 * num1;
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }

        System.out.println("Maka hasil perhitungan luasnya adalah   : " + result);
    }
}
