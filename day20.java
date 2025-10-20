class Search_insert_position {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}

class Solution {
  public int[] getFloorAndCeil(int[] nums, int x) {
    int low = 0;
    int high = nums.length - 1;
    int floor = -1;
    int ceil = -1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      // Case 1: Perfect match found
      if (nums[mid] == x) {
        floor = nums[mid];
        ceil = nums[mid];
        break; // Found the best possible answer, so we can exit the loop
      }

      // Case 2: Middle element is less than the target
      if (nums[mid] < x) {
        floor = nums[mid]; // This is a potential floor
        low = mid + 1; // Look for a better (larger) floor on the right
      }
      // Case 3: Middle element is greater than the target
      else {
        ceil = nums[mid]; // This is a potential ceiling
        high = mid - 1; // Look for a better (smaller) ceiling on the left
      }
    }

    return new int[] {floor, ceil};
  }
}
