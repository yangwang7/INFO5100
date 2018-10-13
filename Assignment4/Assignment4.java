public class Assignment4 {
	
	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST.
	 * Please feel free to contact Zane and Amanda for any questions.
	 */
	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
    public int firstUniqChar(String s) {
        int[] count = new int[100];

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }

        for(int j=0; j<s.length(); j++){
            if(count[s.charAt(j) - 'a'] == 1){
                return j;
            }
        }

        return -1;
     }
    
    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
    	if(n < 10){
            return n;
        }else if(n % 9 == 0){
            return 9;
        }else{
            return n % 9; 
        }
    }
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }

        while(count < nums.length){
            nums[count++] = 0;
        }
    }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
    public int lo, maxLen;

	public String longestPalindrome(String s) {
		if(s.length() < 2){
            return s;
        }

        for(int i = 0; i < s.length(); i++){
            extend(s, i, i);
            extend(s, i, i + 1);
        }

        return s.substring(lo, maxLen);
    }

    public void extend(String s, int low, int high){
        while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
            low--;
            high++;
        }

        if(maxLen < high-low-1){
            maxLen = high-low-1;
            lo = low + 1;
        }
    }
	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			                  [4,5,6],
  			                  [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								                                 [8,5,2],
  								                                 [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) {
        int len = matrix[0].length;
    	for(int x = 0; x < (len-1)/2; x++){
            for(int y = x; y < len-x-1; y++){
                int temp = matrix[x][y];
                matrix[x][y] = matrix[len-1-y][x];
                matrix[len-1-y][x] = matrix[len-1-x][len-1-y];
                matrix[len-1-x][len-1-y] = matrix[y][len-1-x];
                matrix[y][len-1-x] = temp;
            }
        }

        return matrix;
    }
}
