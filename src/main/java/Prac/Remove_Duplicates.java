package Prac;

import java.util.Arrays;

public class Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,4,3,2,1,5,6,7,8,9,0};
		
		int[] du =Arrays.stream(arr).distinct().toArray();
		
	System.out.println(Arrays.toString(du));
		}
	}


