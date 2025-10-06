class movingZeroesToEnd_1 {
  public void moveZeroes(int[] nums) {

    int p1 = 0;
    for (int p2 = 0; p2 < nums.length; p2++) {

      if (nums[p2] !=0) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
      }
      p1++;
    }
  }
}

class movingZeroesToEnd_2 {
    public void moveZeroes(int[] nums) {
        int p1 = 0;                   // next free slot for a non-zero

        for (int p2 = 0; p2 < nums.length; p2++) {
            if (nums[p2] != 0) {      // found a non-zero
                nums[p1] = nums[p2];  // place it at the free slot
                p1++;                 // advance the free slot
            }
        }

        // zero-out whatever is left
        while (p1 < nums.length) {
            nums[p1] = 0;
            p1++;
        }
    }
}

class missing_Number {
  public int missingNumber(int[] nums) {

    int N = nums.length;
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {

      sum = sum + nums[i];
    }

    int Nsum = (N * (N + 1)) / 2;
    int missingNum = Nsum - sum;

    return missingNum;
  }
}

class maxConsecutiveOnes {
  public int findMaxConsecutiveOnes(int[] nums) {

    int counter = 0;
    int max_count = 0;

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == 1) {
        counter++;
        max_count = Math.max(max_count, counter);
      } else {
        counter = 0;
      }
    }
    return max_count;
  }
}

