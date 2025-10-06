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
