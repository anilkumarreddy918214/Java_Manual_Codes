package Core_Java_Code_Manu_Prac_16_to_30;

public class Pali_Check_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Amma";
		str=str.toLowerCase();
//		String rev="";
//		String org=str;
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//		}
//		if(org.equals(str)) {
//			System.out.println("Palindrone");
//		}else {
//			System.out.println("Not Palindrone");
//		}
		
		StringBuilder sb=new StringBuilder(str);
		
		String rev=sb.reverse().toString();
		
		if(str.equals(rev)) {
			System.out.println("Palindrone");
		}else {
			System.out.println("Not Palindrone");
		}
	}

}
