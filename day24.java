class Find_square_root_of_a_number {
  public int floorSqrt(int n) {

    int left = 0;
    int right = n / 2;
    int ans = 0;
    while (left <= right) {
      long mid = left + (right - left) / 2;
      if (mid * mid <= x) {
        ans = (int) mid;
        left = (int) mid + 1;
      } else {
        right = (int) mid - 1;
      }
    }
    return ans;
  }
}