package Core_Java_Code_Manu_Prac_1_to_15;

public class Bubble_sort_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,8,3,1,6,2};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++){
				if(arr[j] > arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Bubble Sorting Array....");
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}

}
