package Core_Java_Code_Manu_Prac_1_to_15;
import java.util.*;
public class Sum_Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int arr[]= {12,3,5,35,35,23};
		//		int sum=0;
		//		for(int i=0;i<arr.length;i++) {
		//			sum=sum+arr[i];
		//		}
		//		System.out.println("The Sum of Array is "+sum);

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the Array....");
		int n=sc.nextInt();
		int num[]=new int[n];
		int num1=0;
		System.out.println("Enter "+n+" Array Elements");
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			num1+=num[i];
		}
		System.out.println(num1);

	}
}
