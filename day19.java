class lowerBound_in_BinarySearch {
  public int lowerBound(int[] nums, int x) {
    int low = 0;
    int high = nums.length - 1;
    int ans = nums.length;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (x <= nums[mid]) {
        ans = mid;
        high = mid - 1;
      } else if (x > nums[mid]) {
        low = mid + 1;
      }
    }
    return ans;
  }
}

class upperBound_using_BinarySearch {
  public int upperBound(int[] nums, int x) {
    int low = 0;
    int high = nums.length - 1;
    int ans = nums.length;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] > x) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }
}

