//package ✓
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		int number = 0;

		for (int i=0; i<=n; i++) {
			for (int j=0; j<=i; j++) {
				number++;
				System.out.print(number +" ");
			}
			System.out.println();
		}
	}
}
