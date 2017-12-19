import java.util.Arrays;

public class InsertSort2 {

	public static void sort(int[] array) {
		int n = array.length;
		for(int i = 1; i < n; i++) {
			int key = array[i];
			int j = i - 1;
			while(j >= 0 && array[j] > key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] {2,3,5,8,9,0,4,5,1,6,8,7};
		sort(array);
		System.out.println(Arrays.toString(array));
	}

}
