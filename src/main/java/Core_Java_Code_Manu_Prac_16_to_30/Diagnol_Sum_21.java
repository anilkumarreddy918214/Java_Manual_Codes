package Core_Java_Code_Manu_Prac_16_to_30;

public class Diagnol_Sum_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {	{1,2,3},
						{4,5,6},
						{7,8,9}
					};
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i][i];
		}
		System.out.print(sum+" ");
	}

}
