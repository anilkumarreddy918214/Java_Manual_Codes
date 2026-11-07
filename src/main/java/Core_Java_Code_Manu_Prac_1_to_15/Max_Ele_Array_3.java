package Core_Java_Code_Manu_Prac_1_to_15;
import java.util.*;
public class Max_Ele_Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {5,4,24,88,65,87,45,65,33};
//		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("The Maximum Element in the Array is "+max);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array....");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" Array Elements....");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The Maximum Element Of An Array is...."+max);
	}

}
