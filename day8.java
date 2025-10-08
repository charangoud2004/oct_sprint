class singleNumber_inDuplicates {
  public int singleNumber(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int counter = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          counter++;
        }
      }
      if (counter == 1) {
        return nums[i];
      }
    }
    return 0;
  }
}

class longestSubarray_withSumK {
  public int longestSubarray(int[] nums, int k) {

    int maxLen = 0;

    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {

        sum = nums[j] + sum;
        if (sum == k) { // found a valid window
          maxLen = Math.max(maxLen, j - i + 1);
        }
      }
    }
    return maxLen;
  }
}

class classicTwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {   // j starts at i+1
                if (nums[i] + nums[j] == target) {
                return new int[] {i, j};
                }
            }
        }
        return null;                    
    }
}