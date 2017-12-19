import java.util.Arrays;

public class QuickSort {
	
	public static void quickSort(int[] arr, int low, int high) {

		if(low < high) {
			int p = partition(arr, low, high);
			quickSort(arr, low, p-1);;
			quickSort(arr, p + 1, high);
		}
		return;
	}
		
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		
		while(low < high) {
			while(low < high && arr[high] >= pivot) high--;
			//arr[high] < pivot
			//swap
			arr[low] = arr[high];
			//arr[low] < pivot, arr[high] < pivot
			
			while(low < high && arr[low] <= pivot) low++;
			//arr[low] > pivot, swap
			arr[high] = arr[low];
		}
		//low == high
		
		arr[low] = pivot;
		return low;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		if(low <= high) {
//			int mid = partition(arr, low, high);
//			
//			quickSort(arr, low, mid - 1);
//			quickSort(arr, mid + 1, high);
//		}
//	}
	
	//public static int partition(int []array,int low,int high){
        //固定的切分方式
//        int temp = array[low];
//        
//        while(low < high) {
//        	while(low < high && array[high] >= temp) high--;
//        	array[low] = array[high];
//        	while(low < high && array[low] <= temp) low++;
//        	array[high] = array[low];
//        }
//        array[low] = temp;
//        return low;
 //   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] {2,3,5,8,9,0,4,5,1,6,8,7};
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

}
