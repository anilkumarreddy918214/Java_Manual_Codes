package Prac;

public class All_Zero_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,0,3,0,32,0,43,0,0,32,34,0};
		int ind = 0;
		
		for(int num : arr) {
			if(num !=0) {
			arr[ind++] = num;
		}
		}
		while(ind < arr.length) {
			arr[ind++] = 0;
		}
		
		for(int num : arr) {
			System.out.print(num+ " ");
		}
		

	}

}
