import java.util.Arrays;

public class Solution5 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int l1 = nums1.length;
		int l2 = nums2.length;
		int l = l1 + l2;
		int[] nums3 = new int[l];
		
		for(int i = 0; i < l1; i++){
			nums3[i] = nums1[i];
		}
		for(int i = 0; i < l2; i++){
			nums3[i + l1] = nums2[i];
		}
		Arrays.sort(nums3);
		
		if(l % 2 == 1){
			return nums3[l/2];
		}else{
			double d = (double)(nums3[l/2 - 1]+ nums3[l/2])/2;
			return d;
		}
		
		
	}

}
