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
