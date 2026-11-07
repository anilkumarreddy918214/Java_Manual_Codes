package Core_Java_Code_Manu_Prac_1_to_15;
import java.util.*;
public class Check_Ase_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,6,5,8};
//		boolean sorted=true;
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i] < arr[i-1]) {
//				sorted =false;
//				break;
//			}
//		}
//		if(sorted) {
//			System.out.println("The Given Array is Asending order....");
//		}else {
//			System.out.println("The Given Array is Desending order....");
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size...");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" Element Array....");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean sorted = true;
		for(int i=1;i<n;i++) {
			if(arr[i] < arr[i-1]) {
				sorted = false;
				break;
			}
		}
		if(sorted) {
			System.out.println("The Given Array is Asending order....");
		}else {
		System.out.println("The Given Array is Desending order....");
	}
	}

}
