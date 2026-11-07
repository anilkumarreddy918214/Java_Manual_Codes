package Core_Java_Code_Manu_Prac_16_to_30;

import java.util.Arrays;

public class Third_Small_Ele_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,7,8,3,9,4};
		Arrays.sort(arr);
		if(arr.length<3) {
			System.out.println("There is no Third Smallest Element in the Array...");
		}else {
			System.out.println("The Third Smallest Element in the Array is "+arr[2]);
		}

	}

}
