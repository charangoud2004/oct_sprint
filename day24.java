class Find_square_root_of_a_number {
  public int floorSqrt(int n) {

    int left = 0;
    int right = n / 2;
    int ans = 0;
    while (left <= right) {
      long mid = left + (right - left) / 2;
      if (mid * mid <= n) {
        ans = (int) mid;
        left = (int) mid + 1;
      } else {
        right = (int) mid - 1;
      }
    }
    return ans;
  }
}

class Find_Nth_root_of_a_number {
  public int NthRoot(int N, int M) {

    int low = 1, high = M;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      long ans = 1;
      for (int i = 0; i < N; i++) {
        ans *= mid;
        if (ans > M) break;
      }
      if (ans == M) return mid;
      if (ans < M) low = mid + 1;
      else high = mid - 1;
    }
    return -1;
  }
}
