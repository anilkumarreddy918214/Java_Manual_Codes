package Core_Java_Code_Manu_Prac_1_to_15;
import java.util.*;
public class Min_Ele_Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {4,5,3,7,9,4,23};
//		int min=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i] < min) {
//				min =arr[i];
//			}
//		}
//		System.out.println("The Minimum element in the array is..."+min);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the Array....");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" Array Elements");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The Minimum element in the array is..."+min);
	}

}
