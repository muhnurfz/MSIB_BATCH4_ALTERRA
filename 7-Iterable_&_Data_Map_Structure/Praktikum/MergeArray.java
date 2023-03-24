import java.util.*;

public class MergeArray {
    public static void main(String[] args) {
        String[] arr1 = {"kazuya", "jin", "lee"};
        String[] arr2 = {"kazuya", "feng"};

        String[] result = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<>(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));

        String[] result = new String[set.size()];
        int i = 0;
        for(String s : set) {
            result[i++] = s;
        }

        return result;
    }
}
