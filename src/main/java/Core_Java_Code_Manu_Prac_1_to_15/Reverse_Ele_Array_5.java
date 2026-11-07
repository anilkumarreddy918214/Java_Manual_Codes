package Core_Java_Code_Manu_Prac_1_to_15;
import java.util.*;
public class Reverse_Ele_Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,4,5,6};
//		int len=arr.length;
//		for(int i=0;i<len/2;i++) {
//			int temp=arr[i];
//			arr[i]=arr[len-1-i];
//			arr[len-1-i]=temp;
//		}
//		for(int i=0;i<len;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size...");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" Element Array....");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//		for(int i=n-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		for(int i=0;i<n;i++) {
			int temp=arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
