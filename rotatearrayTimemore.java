//time limit EXCEEDEDLMFAO

class rotatearrayTimemore {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0)
            return;
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < n - 1; i++) {
                swap(nums, i, n - 1);
            }
        }
    }

    static void swap(int[] arr, int index1, int indexn) {
        int temp = arr[index1];
        arr[index1] = arr[indexn];
        arr[indexn] = temp;
    }
}