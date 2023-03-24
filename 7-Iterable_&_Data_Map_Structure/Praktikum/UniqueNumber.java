import java.util.*;

public class UniqueNumber {
    public static void main(String[] args) {
        String input = "76523752";
        List<Integer> result = uniqueNumbers(input);
        System.out.println(result);
    }

    public static List<Integer> uniqueNumbers(String input) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        // menghitung frekuensi masing-masing karakter
        for(char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // menambahkan karakter dengan frekuensi 1 ke dalam hasil
        for(char c : map.keySet()) {
            if(map.get(c) == 1) {
                result.add(Character.getNumericValue(c));
            }
        }

        return result;
    }
}
