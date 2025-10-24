class p1_removeDuplicates {
  public int removeDuplicates(int[] nums) {
    int left = 0;
    for (int right = 1; right < nums.length; right++) {
      // Before diving into the main logic, always handle edge cases.
      if (nums.length == 0) return 0;
      if (nums[left] != nums[right]) {
        left++;
        nums[left] = nums[right];
      }
    }
    return left + 1;
  }
}

class Solution_rotateArrayByOne {
    public void rotateArrayByOne(int[] nums) {
        // Handle edge cases
        if (nums.length <= 1) return;
        // Store the first element
        int firstElement = nums[0];
        // Shift elements to the left by one position
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        // Place the first element at the end
        nums[nums.length - 1] = firstElement;
    }
}

class p3_rotateLeft {
    public void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle cases when k >= n

        // Step 1: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 2: Reverse remaining n-k elements
        reverse(nums, k, n - 1);

        // Step 3: Reverse whole array
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
