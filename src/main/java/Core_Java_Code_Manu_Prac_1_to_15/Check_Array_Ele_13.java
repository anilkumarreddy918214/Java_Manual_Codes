package Core_Java_Code_Manu_Prac_1_to_15;

public class Check_Array_Ele_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int sea=4;
		boolean found =false;
		for(int i=0;i<arr.length;i++) {
			if(i==sea) {
				found =true;
				break;
			}
		}
		if(found) {
			System.out.print(sea+" is present in Array... ");
		}else{
			System.out.print(sea+" is not-present in Array... ");
		}
	}

}
