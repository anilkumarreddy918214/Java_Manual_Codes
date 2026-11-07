package Core_Java_Code_Manu_Prac_16_to_30;

import java.util.HashSet;

public class Check_Dup_Elem_Exmp_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,4,3,4};
//		HashSet<Integer> set=new HashSet<>();
//		boolean dup=false;
//		for(int num:arr) {
//			if(set.contains(num)) {
//				dup=true;
//				break;
//			}else {
//				set.add(num);
//			}
//		}
//		if(dup) {
//			System.out.println("The given array is duplicate....");	
//		}else {
//			System.out.println("The given array not duplicate....");	
//		}
		/**
		 * @Description Finding the duplicate elements in given array......
		 */
		int arr[]= {1,2,3,4,5,2,4,5,6,7};
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> duplicate=new HashSet<>();
		for(int num: arr) {
			if(set.contains(num)) {
				duplicate.add(num);
			}else {
				set.add(num);
			}
		}
		System.out.println("The Duplicate elements aree....");
		System.out.println(duplicate);
		System.out.println("The Non-Duplicate elements aree....");
		System.out.println(set);
	}

}
