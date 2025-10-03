class p1 {
  public int[] selectionSort(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      int smallest = i;
      // smallest is the index
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[smallest] > nums[j]) {
          smallest = j;
        }
      }
      int temp = nums[smallest];
      nums[smallest] = nums[i];
      nums[i] = temp;
    }
    return nums;
  }
}

class p2 {
  public int secondLargestElement(int[] nums) {
    int max = nums[0];
    int max2 = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (max < nums[i]) {
        max = nums[i];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (max2 < nums[i] && nums[i] < max) {
        max2 = nums[i];
      }
    }
    if (max2 == Integer.MIN_VALUE) {
      return -1;
    }
    return max2;
  }
}

