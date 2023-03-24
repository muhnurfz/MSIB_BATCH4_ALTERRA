class deletemaxarray {
    public static void main(String[] args) {
        public static int maxSubArraySum(int[] arr, int k) {
            int n = arr.length;
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int i = 0; i < n; i++) {
                currentSum += arr[i];
                if (i >= k - 1) {
                    maxSum = Math.max(maxSum, currentSum);
                    currentSum -= arr[i - k + 1];
                }
            }

            return maxSum;
        }

    }
}