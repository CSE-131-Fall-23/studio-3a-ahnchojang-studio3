package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the value of n? ");
		int n = scanner.nextInt();
		
		boolean[] arr = new boolean[n + 1];
		
		for (int i = 2; i <= n; i++) {
			if (arr[i] == false) {
				for (int j = 2; j <= n/i; j++) {
					arr[i * j] = true;
				}
			}
		}
		
		for (int i = 2; i < n + 1; i++) {
			if (arr[i] == false) {
				System.out.println(i);
			}
		}
	}
}
