class p1 {
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

class Solution {
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