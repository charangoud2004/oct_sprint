class p1_maxSubArray {
    public int maxSubArray(int[] nums) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
            }
            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        // To consider the sum of the empty subarray
        // uncomment the following check:
        // if (maxi < 0) maxi = 0;
        return (int) maxi;
    }
}

public int maxSubArray2(int[] nums) {
    int currentSum = nums[0];
    int maxSum = nums[0];

    for (int i = 1; i < nums.length; i++) {
        currentSum = Math.max(nums[i], currentSum + nums[i]);
        maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
}

public int[] maxSubArrayWithIndex(int[] nums) {
    int currentSum = nums[0];
    int maxSum = nums[0];

    int tempStart = 0;
    int start = 0, end = 0;

    for (int i = 1; i < nums.length; i++) {

        if (nums[i] > currentSum + nums[i]) {
            currentSum = nums[i];
            tempStart = i;   // new subarray starts here
        } else {
            currentSum += nums[i];
        }

        if (currentSum > maxSum) {
            maxSum = currentSum;
            start = tempStart;
            end = i;
        }
    }

    return new int[]{maxSum, start, end};
}


class p2_maxProfit {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];   // cheapest day so far
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int todayProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, todayProfit);
            minPrice  = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
