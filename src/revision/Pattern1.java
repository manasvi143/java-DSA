package revision;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i= 0; i< x; i++) {
			System.out.println();
			for(int j= 0; j<=i;j++) {
				System.out.print("*");
			}
		}
		
		}
	}     

