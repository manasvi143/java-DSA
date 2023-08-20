package generics;

public class GenericFunction {
	
	public static<T> void print(T a[]) {
		
		for(int i = 0 ; i< a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
	Integer a[] = new Integer [10];
	
	for(int i = 0; i < 10; i++) {
		a[i] = i +1; 
	}
	
	String b[] = new String [10];
	
	for(int i = 0; i < 10; i++) {
		b[i] = "abc"; 
	}
	
	print(a);
	print(b);
		
	}

}
