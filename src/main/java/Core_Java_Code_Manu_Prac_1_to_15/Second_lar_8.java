package Core_Java_Code_Manu_Prac_1_to_15;

import java.util.Scanner;

public class Second_lar_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {2,3,6,5,4,8};
//		int lar=Integer.MIN_VALUE;
//		int seclar=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] > lar) {
//				seclar = lar;
//				lar = arr[i];
//			}
//			else if(arr[i] > seclar && arr[i]!=lar) {
//				seclar= arr[i];
//			}
//		}
//		System.out.println(seclar);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size...");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" Element Array....");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int lar=Integer.MIN_VALUE;
		int seclar=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			if(arr[i] > lar){
				seclar = lar;
				lar = arr[i];
			}
			else if(arr[i] > seclar && arr[i]!=lar) {
				seclar = arr[i];
			}
		}
		System.out.println(seclar);
	}

}
