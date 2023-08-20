package revision;

//import java.util.Scanner;

public class Pattent4 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
//		int x = sc.nextInt();
		int a = 4;
		
		for(int i = 4; i >= 0; i--) {
			
			System.out.println();
			
			for(int j = 0; j<=i; j++) {
				
				System.out.print("  ");
			}
			
			for(int k = 4-i; k >=0; k--) {
				
				System.out.print("x ");
			}
		}   
		
	}

}
