import java.util.Arrays;

public class bubblesort {
	
	public static void sort(int[] array) {
		int n = array.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] {2,3,5,8,9,0,4,5,1,6,8,7};
		sort(array);
		System.out.println(Arrays.toString(array));
	}

}
