class skip {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new LinkedHashSet<>();

        int i = 0, j = 0;

        // Merge sorted arrays and skip duplicates
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                set.add(nums1[i++]);
            } else if (nums1[i] > nums2[j]) {
                set.add(nums2[j++]);
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements
        while (i < nums1.length) set.add(nums1[i++]);
        while (j < nums2.length) set.add(nums2[j++]);

        // Convert set to array
        int[] result = new int[set.size()];
        int k = 0;
        for (int num : set) result[k++] = num;

        return result;
    }
}