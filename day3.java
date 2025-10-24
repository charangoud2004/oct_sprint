import java.util.ArrayList;

class p1_selectionSort {
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

class p2_secondLargestElement {
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

class p3_isSorted {
  public boolean isSorted(ArrayList <Integer> nums) {
    for (int i = 0; i < nums.size() - 1; i++) {
      if (nums.get(i) > nums.get(i + 1)) {
        return false;
      }
    }
    return true;
  }
}

class p3_1_isSorted {
  public boolean isSorted(ArrayList<Integer> nums) {
    int up = 0, down = 0;
    for (int i = 0; i < nums.size() - 1; i++) {
      int a = nums.get(i), b = nums.get(i + 1);
      if (a < b) up++;      // breaks descending
      if (a > b) down++;    // breaks ascending
    }
    return up == 0 || down == 0;   // pure ascending OR pure descending
  }
}