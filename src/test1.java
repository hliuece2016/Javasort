import java.util.*;

public class test1 {

	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		Stack<Character> stack = new Stack<>();
		int i = 0;
		for(; i < str.length(); i++) {
			if(isLeft(str.charAt(i))) {
				stack.push(str.charAt(i));
			}
			else if(isRight(str.charAt(i))) {
				if(stack.isEmpty()) {
					System.out.println("false");
					break;
					
				}
				if(isMatch(stack.peek(), str.charAt(i))) {
					stack.pop();
				}
			}
			else {
				continue;
			}
		}
		
		if(i == str.length()) {
			if(stack.isEmpty())
				System.out.println("true");
			else
				System.out.println("false");
		}
		
	}
	
	public static boolean isLeft(char c) {
		if(c == '(' || c == '[' || c == '{') 
			return true;
		return false;
	}
	
	public static boolean isRight(char c) {
		if(c == ')' || c == ']' || c == '}')
			return true;
		return false;
	}
	
	public static boolean isMatch(char c1, char c2) {
		if(c1 == '(' && c2 == ')')
			return true;
		else if(c1 == '[' && c2 == ']')
			return true;
		else if(c1 == '{' && c2 == '}')
			return true;
		return false;
	}
}
