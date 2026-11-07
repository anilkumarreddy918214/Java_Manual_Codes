package Core_Java_Code_Manu_Prac_1_to_15;
import java.util.HashSet;
import java.util.*;
public class Union_Array_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr1[]= {1,2,3,4};
//		int arr2[]= {3,4,5,6,7};
//		int arr3[]= {6,7,8,9,1};
//		
//		HashSet<Integer> set=new HashSet<>();
//		for(int num:arr1) {
//			set.add(num);
//		}
//		for(int num:arr2) {
//			set.add(num);
//		}
//		for(int num:arr3) {
//			set.add(num);
//		}
//		System.out.print(set);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of The Array....");
		int n=sc.nextInt();
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter Size of Array "+(i+1)+": ");
			int size=sc.nextInt();
			System.out.println("Enter the "+size+" elements");
			
			for(int j=0;j<size;j++) {
				int num=sc.nextInt();
				set.add(num);
			}
			
		}
		System.out.println(set);
	}

}
