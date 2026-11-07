package Core_Java_Code_Manu_Prac_16_to_30;

public class Leader_Array_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {16,17,4,3,5,2};
		
		for(int i=0;i<arr.length;i++) {
			boolean leader=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] > arr[i]) {
					leader=false;
					break;
				}
			}
			if(leader) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
