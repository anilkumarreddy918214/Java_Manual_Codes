package Core_Java_Code_Manu_Prac_16_to_30;

import java.util.HashSet;

public class Common_Elem_Array_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]={4,5,6,7,8};
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> common=new HashSet<>();
		
		for(int num:arr1) {
			set.add(num);
		}
		for(int num:arr2) {
			if(set.contains(num)) {
				common.add(num);
			}
		}
		System.out.println("common Elements In Two Arrays...."+common);
	}

}
