public class menghapusduplikasi {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 6, 9, 9};
        int length = removeDuplicates(arr);
        System.out.println(length); // Output: 4
        int[] subarray = Arrays.copyOfRange(arr, 0, length);
        System.out.println(Arrays.toString(subarray)); // Output: [2, 3, 6, 9]
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
