package Core_Java_Code_Manu_Prac_1_to_15;

import java.util.Scanner;

public class Right_Shift_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int arr[]= {1,2,3,4,5};
				int n=1;
		for(int i=0;i<n;i++) {
			int last =arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0]=last;
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		System.out.println("After Shifting Arrays.....");
			for(int value: arr) {
				System.out.print(value+" ");
			}
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the array Size...");
//		int n=sc.nextInt();
//		System.out.println("Enter "+n+" Element Array....");
//		int[] arr=new int[n];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("Enter the number of postion to shift....");
//		int nt=sc.nextInt();
//		for(int i=0;i<nt;i++) {
//			int last=arr[arr.length-1];
//			for(int j=arr.length-1;j>0;j--) {
//				arr[j]=arr[j-1];
//			}
//			arr[0]=last;
//		}
//		System.out.println("After Shifting Arrays.....");
//		for(int value: arr) {
//	System.out.print(value+" ");
//		}

	}

}
