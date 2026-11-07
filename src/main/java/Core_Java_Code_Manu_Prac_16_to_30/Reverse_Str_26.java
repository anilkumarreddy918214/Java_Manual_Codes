package Core_Java_Code_Manu_Prac_16_to_30;

public class Reverse_Str_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str="Hello Mine";
//		String rev="";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			rev+=str.charAt(i);
//		}
//		System.out.println("The Reverse String is : "+rev);
//		
//		StringBuilder sb=new StringBuilder(str);
//		sb.reverse();
//		System.out.println("The Reverse String is : "+sb);
		
		String str="anil kumar";
		StringBuilder rev=new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--) {
			rev.append(str.charAt(i));
		}
		System.out.println("The Reverse String is : "+rev);
	}

}
