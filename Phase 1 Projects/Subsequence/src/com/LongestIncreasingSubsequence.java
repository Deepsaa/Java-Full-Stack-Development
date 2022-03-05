package com;

public class LongestIncreasingSubsequence {
	
	public static int lis(int arr[], int arrLen){
	      int seqArr[] = new int[arrLen];
	      int c, d, max = 0;
	      for (c = 0; c < arrLen; c++)
	         seqArr[c] = 1;
	      for (c = 1; c < arrLen; c++)
	      for (d = 0; d < c; d++)
	      if (arr[c] > arr[d] && seqArr[c] < seqArr[d] + 1)
	      seqArr[c] = seqArr[d] + 1;
	      for (c = 0; c < arrLen; c++)
	      if (max < seqArr[c])
	      max = seqArr[c];
	      return max;
	   }

	public static void main(String[] args) {
		
		 int my_arr[] = { 15, 25, 60, 32, 26, 55, 45, 28 };
	      int arr_len = my_arr.length;
	      System.out.println("The length of the longest increasing subsequence is " +lis(my_arr, arr_len));
		

	}

}

