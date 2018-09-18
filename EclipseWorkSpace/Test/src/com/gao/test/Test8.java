package com.gao.test;

/**
 * Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.


 * @author XX
 *
 */
public class Test8 {
	public static void main(String[] args) {
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(arr));
	}
	public static int maxSubArray(int[] A) {
        int n = A.length;
        int[] dp = new int[n];//					dp[i]意味着最大的子数组以i结尾;
        dp[0] = A[0];
        int max = dp[0];
        
        for(int i = 1; i < n; i++){//如果dp[i - 1] > 0 ，那么说明
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        return max;
}
}