class First_and_last_occurrence {
  public int[] searchRange(int[] nums, int target) {

    int start = -1;
    int end = -1;

    // --- Loop 1: Find the START position ---
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] == target) {
        start = mid; // Found a match, store it
        high = mid - 1; // Keep searching LEFT for an earlier one
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    // If 'start' is still -1, the target isn't in the array
    if (start == -1) {
      return new int[] {-1, -1};
    }

    // --- Loop 2: Find the END position ---
    // Reset low and high for the second search
    low = 0;
    high = nums.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] == target) {
        end = mid; // Found a match, store it
        low = mid + 1; // Keep searching RIGHT for a later one
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return new int[] {start, end};
  }
}

class Count_Occurrences_in_a_Sorted_Array {
  public int countOccurrences(int[] arr, int target) {
    // Your code goes here

    int low = 0;
    int high = arr.length - 1;
    int start = -1;
    int end = -1;
    int ans = 0;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        start = mid;
        high = mid - 1;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    if (start == -1) {
      return ans;
    }
    low = 0;
    high = arr.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        end = mid;
        low = mid + 1;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    ans = end - start + 1;
    return ans;
  }
}
