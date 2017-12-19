import java.util.*;
import java.util.Comparator;

public class test {
	
	public void print() {
		System.out.println("father");
	}
	public static void heap_arrange(int arr[], int cur, int cnt)  //调整为小顶堆
	{
	    int heaptop_val = arr[cur]; //堆顶的值
	    while (cur < cnt) {
	        int left = 2 * cur + 1;
	        int right = 2 * cur + 2;
	        int min = -1;
	        int min_val =heaptop_val;
	        if (left < cnt && arr[left] < min_val) { //检查是否比左节点大
	            min = left;
	            min_val = arr[left];
	        }
	        if (right < cnt && arr[right] < min_val) {//检查是否比右节点大
	            min = right;
	        }
	        if (min == -1)
	            break;
	        arr[cur] = arr[min];
	        cur = min;
	    }
	    arr[cur] = heaptop_val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "a b c d e f g";
		char[] arr = string.toCharArray();
		
		int[] array = {1,2,3,4,5};
		
		Arrays.sort(array, new Comparator<T>() {
		});
		
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
		
		String string2 = "hello";
		Collections.sort(new ArrayList<>());
	}

}
