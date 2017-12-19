import java.util.Arrays;


public class MergeSort {

	public static int[] sort(int[] nums, int low, int high) {
		if(low >= high) return nums;
		
		int mid = (low + high) / 2;
		sort(nums, low, mid);
		sort(nums, mid + 1, high);
		
		merge(nums, low, mid, high);
		return nums;
	}
		
	public static void merge(int[] nums, int low, int mid, int high) {
		
	int[] temp = new int[high - low + 1];
	int i = low;
	int j = mid + 1;
	int k = 0;
	while(i <= mid && j <= high) {
		if(nums[i] < nums[j])
			temp[k++] = nums[i++];
		else
			temp[k++] = nums[j++];
	}
	
	//if i <= mid
	while(i <= mid) {
		temp[k++] = nums[i++];
	}
	
	//if j <= high
	while(j <= high) {
		temp[k++] = nums[j++];
	}
	
	//temp is completed, put temp into nums
	
	for(int k2 = 0; k2 < temp.length; k2++) {
		nums[k2 + low] = temp[k2];
	}
	
	return;
	
	
	
	
	
	
	
	
	
	
	
	
	
		//		int[] temp = new int[high - low + 1];
//		int i = low;
//		int j = mid + 1;
//		int k = 0;
//		
//		while(i <= mid && j <= high) {
//			if(nums[i] < nums[j]) {
//				temp[k++] = nums[i++];
//			}else {
//				temp[k++] = nums[j++];
//			}
//		}
//		
//		//把左边剩余的数移入数组
//		while(i <= mid) {
//			temp[k++] = nums[i++];
//			
//		}
//		
//		while(j <= high) {
//			temp[k++] = nums[j++];
//		}
//		
//		for(int k2 = 0; k2 < temp.length; k2++) {
//			nums[k2 + low] = temp[k2];
//		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };  
		  
        sort(nums, 0, nums.length-1);  
        System.out.println(Arrays.toString(nums));
	}

}
