class Solution_reverse {
  public void reverse(int[] arr, int n) {
    rev(arr, 0, n - 1); // reverse first n elements
  }

  /* recursive helper */
  private void rev(int[] a, int l, int r) {
    if (l >= r) return;
    int tmp = a[l];
    a[l] = a[r];
    a[r] = tmp;
    rev(a, l + 1, r - 1);
  }
}
