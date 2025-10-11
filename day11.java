class Solution {
  public List<Integer> leaders(int[] nums) {
    List<Integer> leader = new ArrayList<>();

    int maxFromRight = Integer.MIN_VALUE;

    // walk from right to left
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] >= maxFromRight) { // current element is a leader
        leader.add(nums[i]);
        maxFromRight = nums[i];
      }
    }

    Collections.reverse(leader); // we built it backwards
    return leader;
  }
}
