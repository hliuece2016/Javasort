import java.util.*;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		boolean sign = true;
		if(n < 0)
			sign = false;
		String str = String.valueOf(n);
		if(str.charAt(0) == '-')
			str = str.substring(1);
		StringBuilder res = new StringBuilder();
		if(!sign)
			res.append('-');
		for(int i = str.length() - 1; i >= 0; i--) {
			res.append(str.charAt(i));
		}
		
		System.out.println(res.toString());
	}

}
