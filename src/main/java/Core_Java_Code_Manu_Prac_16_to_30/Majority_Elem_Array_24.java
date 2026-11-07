package Core_Java_Code_Manu_Prac_16_to_30;

import java.util.HashMap;

public class Majority_Elem_Array_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,3,4,2,4,4,2,4,4};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int num:arr) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		boolean found=true;
		for(int num1:map.keySet()) {
			if(map.get(num1)>arr.length/2) {
				System.out.println("The Majority Elements Are : "+num1);
				found=false;
				break;
			}
		}
		
		if(found) {
			System.out.println("No Majority Elements: ");
		}
	}

}
