package Core_Java_Code_Manu_Prac_1_to_15;
import java.util.*;
public class Avg_Ele_Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,4,5};
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		double avg=(double) sum / arr.length;
//		System.out.println("The Average of the array "+avg);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size...");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" Element Array....");
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		double avg=(double) sum/arr.length;
		System.out.println("The Average of the Array is ..."+avg);
		    }
		
	}


