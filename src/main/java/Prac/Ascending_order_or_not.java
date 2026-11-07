package Prac;

import java.util.Scanner;

public class Ascending_order_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		boolean asc=true;
		for(int i=1;i<n;i++) {
			if(arr[i] < arr[i-1]) {
				asc = false;
				break;
			}
		}
		if(asc) {
			System.out.println("Ascending order");
		}else {
			System.out.println(" Not Ascending order");
		}

	}
}
