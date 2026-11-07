package Core_Java_Code_Manu_Prac_1_to_15;

import java.util.*;
public class Remove_Dupli_7 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,4,2,1,3,4,3,23,4,2};
//		
//		int[] duplicate=Arrays.stream(arr).distinct().toArray();
//		
//		for(int value: duplicate) {
//			System.out.print(value+" ");
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size...");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" Element Array....");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] duplicate =Arrays.stream(arr).distinct().toArray();
		
		for(int value: duplicate) {
			System.out.print(value+" ");
		}

	}

}
