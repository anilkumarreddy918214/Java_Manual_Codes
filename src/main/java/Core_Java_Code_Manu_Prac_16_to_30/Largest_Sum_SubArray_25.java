package Core_Java_Code_Manu_Prac_16_to_30;

public class Largest_Sum_SubArray_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int currentsum=arr[0];
		int Maxsum=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			currentsum=Math.max(arr[i],currentsum+arr[i]);
			
			Maxsum=Math.max(Maxsum, currentsum);
		}
		System.out.println(Maxsum);
		System.out.println(currentsum);
		
	}

}
