import java.util.ArrayList;

class Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}

class Find_day24out_how_many_times_the_array_is_rotated {
  public int findKRotation(ArrayList<Integer> nums) {

    int low = 0;
    int high = nums.size() - 1;

    while (low < high) {
      int mid = low + (high - low) / 2;
      if (nums.get(mid) > nums.get(high)) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}
