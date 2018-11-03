class Solution5Test{
	
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int[] nums1 = {1, 3};
		int[] nums2 = {2};
		System.out.println(s.findMedianSortedArrays(nums1, nums2)); 
		
		int[] nums3 = {1, 2};
		int[] nums4 = {3, 4};
		System.out.println(s.findMedianSortedArrays(nums3, nums4)); 
	}

}