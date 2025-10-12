class numbers_in_order {
  public int longestConsecutive(int[] nums) {
    // Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      int small = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[small] > nums[j]) {
          small = j;
        }
      }
      int temp = nums[small];
      nums[small] = nums[i];
      nums[i] = temp;
    }

    if (nums.length < 2) {
      return nums.length;
    }

    int maxCounter = 1;
    int counter = 1;
    for (int k = 0; k < nums.length - 1; k++) {
      if (nums[k] == nums[k + 1]) {
        continue;
      }
      if (nums[k] + 1 == nums[k + 1]) {
        counter++;
      }
      maxCounter = Math.max(maxCounter, counter);
    }

    return maxCounter;
  }
}

class Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        int counter = 0;
        for (int i = 0; i < nums.length ; i++) {
            int sum = 0;
            for (int j = i ; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    counter++;
                }
            }
        }
        return counter;
    }
}