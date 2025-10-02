class p1 {
  public int[] bubbleSort(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (nums[j] >= nums[j + 1]) {
          int tmp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = tmp;
        }
      }
    }
    return nums;
  }
}


class p2 {
  public int largestElement(int[] nums) {

    int max = nums[0];

    for (int i = 0; i < nums.length; i++) {
      int a = nums[i];
      if (max < a) {
        max = a;
      }
    }

    return max;
  }
}

