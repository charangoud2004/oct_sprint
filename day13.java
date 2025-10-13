class alternate_pos_and_neg {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }
        for (int j = 0; j < nums.length / 2; j++) {
            nums[j * 2] = pos.get(j);
            nums[j * 2 +1] = neg.get(j);
        }
        return nums;
    }
}

class Solution {
    public boolean isPalindrome(String s) {

        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}