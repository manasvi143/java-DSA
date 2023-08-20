package temp;

public class PrintArray {
	
	public static <P> void print(P a[]) {
		for(int i = 0 ; i< a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Integer c[] = new Integer [10];
		for(int i = 0; i< 10; i++) {
			c[i] = 1+i;
		}
		
		print(c);

	}

}
