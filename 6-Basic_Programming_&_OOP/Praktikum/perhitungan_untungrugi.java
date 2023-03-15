import java.util.Scanner;

public class perhitungan_untungrugi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perhitungan untung rugi");
        System.out.println("Muhamad Nur Fajjri Z-Kelas D QE 2023    ");
        System.out.println("Masukan nilai pertama       : ");
        double num1 = input.nextDouble();
        System.out.println("Masukan nilai kedua         : ");
        double num2 = input.nextDouble();

        double result = 0;
        result = num1 - num2;

        System.out.println("Maka hasil perhitunganya adalah   : " + result);
    }
}
