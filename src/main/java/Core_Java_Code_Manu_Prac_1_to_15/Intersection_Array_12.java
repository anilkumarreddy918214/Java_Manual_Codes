package Core_Java_Code_Manu_Prac_1_to_15;
import java.util.HashSet;
public class Intersection_Array_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		int arr1[]= {1,2,3,4,5,6};
//		int arr2[]= {3,4,5,6,7,8};
//		HashSet<Integer> set=new HashSet<>();
//		for(int num: arr1) {
//			set.add(num);
//		}
//		 System.out.println("Intersection Elements:");
//		for(int num1:arr2) {
//			if(set.contains(num1)) {
//				System.out.print(num1+" ");
//			}
//		}
//		
//		int arr1[]= {1,2,3,4,5,6};
//		int arr2[]= {3,4,5,6,7,8};
//		int arr3[]= {4,5,6,0,9};
//		
//		HashSet<Integer> set1=new HashSet<>();
//		HashSet<Integer> set2=new HashSet<>();
//		
//		for(int num:arr1) {
//			set1.add(num);
//		}
//		for(int num1:arr2) {
//			if(set1.contains(num1)) {
//				set2.add(num1);
//			}
//		}
//		System.out.println("Intersection Elements:");
//		for(int num2:arr3) {
//			if(set2.contains(num2)) {
//				System.out.print(num2+" ");
//			}
//		}
		
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {3,4,5,6,7,8};
		int arr3[]= {4,5,6,0,9};
		int arr4[]= {4,6,5,0,1};
		int arr5[]= {4,5,7};
		HashSet<Integer> set1=new HashSet<>();
		HashSet<Integer> set2=new HashSet<>();
		HashSet<Integer> set3=new HashSet<>();
		HashSet<Integer> set4=new HashSet<>();
		HashSet<Integer> set5=new HashSet<>();
		
		for(int x:arr1) {
			set1.add(x);
		}
		for(int x:arr2) {
			set2.add(x);
		}
		for(int x:arr3) {
			set3.add(x);
		}
		for(int x:arr4) {
			set4.add(x);
		}
		for(int x:arr5) {
			set5.add(x);
		}
		for(int val:set1) {
			if(set2.contains(val)&&set3.contains(val)&&set4.contains(val)&&set5.contains(val)) {
				System.out.print(val+" ");
			}
		}      
	}

}
