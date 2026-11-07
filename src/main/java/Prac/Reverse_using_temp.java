package Prac;

import java.util.Scanner;

public class Reverse_using_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size :");

		int n=sc.nextInt();
		System.out.println("Array elments :");
		int num[] =new int[n];
		for(int i= 0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int temp = num[i];
			num[i] = num[n-1-i];
			num[n-1-i] = temp;
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(num[i]+ " ");
		}
	}

}
