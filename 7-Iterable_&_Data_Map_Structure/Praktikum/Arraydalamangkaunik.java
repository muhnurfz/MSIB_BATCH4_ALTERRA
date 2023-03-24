import java.util.*;

public class Arraydalamangkaunik {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 5, 10, 16};
        int[] result = uniqueNumbers(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] uniqueNumbers(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        // menambahkan semua elemen array pertama ke dalam set
        for(int num : arr1) {
            set.add(num);
        }

        // menghapus elemen yang ada pada array kedua dari set
        for(int num : arr2) {
            set.remove(num);
        }

        // mengembalikan set dalam bentuk array
        int[] result = new int[set.size()];
        int i = 0;
        for(int num : set) {
            result[i++] = num;
        }

        return result;
    }
}
