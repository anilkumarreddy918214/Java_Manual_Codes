package Core_Java_Code_Manu_Prac_1_to_15;

import java.util.Scanner;

public class Merge_Arrays_10 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		int arr1[]= {1,2,3};
//		int arr2[]= {4,5,6};
//		int[] merge=new int[arr1.length+arr2.length];
//		for(int i=0;i<arr1.length;i++) {
//			merge[i] = arr1[i];
//		}
//		for(int i=0;i<arr2.length;i++) {
//			merge[arr1.length+i] = arr2[i];
//		}
//		System.out.println("Merged Array...");
//
//        for (int value : merge) {
//            System.out.print(value + " ");
//        }
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First array Size...");
		int n1=sc.nextInt();
		System.out.println("Enter the Second array Size...");
		int n2=sc.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		System.out.println("Enter "+n1+" Element First Array....");
		
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter "+n2+" Element Second Array....");
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int[] merge=new int[n1+n2];
		
		for(int i=0;i<n1;i++) {
			merge[i]=arr1[i];
		}
		for(int i=0;i<n2;i++) {
			merge[n1+i] = arr2[i];
		}
		for(int value: merge) {
			System.out.print(value+" ");
		}

	}

}
