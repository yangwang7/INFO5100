public class Main{
	public static void main(String[] args) {
		Assignment4 a = new Assignment4();

		//1
		System.out.println(a.firstUniqChar("leetcode"));
		System.out.println(a.firstUniqChar("loveleetcode"));

		//2
		System.out.println(a.addDigits(1235));

		//3
		int[] nums = {0,1,0,3,12};
		a.moveZeroes(nums);
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i] + " "); 
		}

		//4
		String s = "babad";
		System.out.println(a.longestPalindrome(s));

		//5
		int[][] matrix = 
		{
			{1,2,3},
			{4,5,6},
			{7,8,9},
		};

		a.rotate(matrix);

		for(int x = 0; x < matrix.length; x++){
			for(int y = 0; y < matrix[0].length; y++){
				System.out.print(matrix[x][y] + " ");
			}
			System.out.println();
		}
	}
}