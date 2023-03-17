import java.util.Scanner;

public class piramida_bintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("QE Muhamad Nur Fajjri Z");
        System.out.print("Masukkan jumlah baris yang diinginkan : ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
