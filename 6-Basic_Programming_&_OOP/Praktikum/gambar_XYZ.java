import java.util.Scanner;

public class gambarXYZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("QE Muhamad Nur Fajjri Z");
        System.out.print("Masukkan nilai baris yang dinginkan : ");
        int n = input.nextInt();
        gambarXYZ(n);
    }

    public static void gambarXYZ(int n) {
        for (int i = 1; i <= n * n; i++) {
            if (i % 3 == 0) {
                System.out.print("X");
            } else if (i % 2 == 1) {
                System.out.print("Y");
            } else {
                System.out.print("Z");
            }
            if (i % n == 0) {
                System.out.println();
            }
        }
    }
}
