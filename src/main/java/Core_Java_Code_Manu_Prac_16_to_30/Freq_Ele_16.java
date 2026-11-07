package Core_Java_Code_Manu_Prac_16_to_30;

import java.util.HashMap;
import java.util.Scanner;

public class Freq_Ele_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[]= {1,2,3,1,4,5,5,3,2,6,7};
//		
//		HashMap<Integer,Integer> map=new HashMap<>();
//		
//		for(int num:arr) {
//			if(map.containsKey(num)) {
//				map.put(num, map.get(num)+1);
//			}
//			else {
//				map.put(num, 1);
//			}
//		}
//		
//		 System.out.println("Element Frequencies:");
//	     System.out.println(map);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array...");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the"+size+" of an Elements...");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int num:arr) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num, 1);
			}
		}
		 System.out.println("Element Frequencies:");
	     System.out.println(map);
	}

}
