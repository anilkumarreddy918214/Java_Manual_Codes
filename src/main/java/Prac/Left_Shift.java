package Prac;

public class Left_Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		
		int n=1;
		
		for(int i=0;i<n;i++) {
			int fir =arr[0];
			
			for(int j=0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = fir;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
