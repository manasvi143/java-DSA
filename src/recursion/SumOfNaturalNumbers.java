package recursion;

public class SumOfNaturalNumbers {
	
	public static int sum(int n) {
		
		if(n ==1) {
			return 1;
		}
		
		int result = sum(n-1);
		return n+result;
	}

	public static void main(String[] args) {
		
		int n = 7;
		int ans = sum(n);
		
		System.out.println(ans);

	}

}

