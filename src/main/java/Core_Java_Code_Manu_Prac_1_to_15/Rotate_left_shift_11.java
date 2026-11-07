package Core_Java_Code_Manu_Prac_1_to_15;

import java.util.Scanner;

public class Rotate_left_shift_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,4,5};
//		int n=2;
//		for(int i=0;i<n;i++) {
//			int first =arr[0];
//			for(int j=0;j<arr.length-1;j++) {
//				arr[j] = arr[j+1];
//			}
//			arr[arr.length-1]=first;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size...");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" Element Array....");
		int arr[] =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int num_rot=sc.nextInt();
		for(int i=0;i<num_rot;i++) {
			int first=arr[0];
			for(int j=0;j<n-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[n-1] = first;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
