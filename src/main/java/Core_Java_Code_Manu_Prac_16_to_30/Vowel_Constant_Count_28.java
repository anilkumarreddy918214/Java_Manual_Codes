package Core_Java_Code_Manu_Prac_16_to_30;

public class Vowel_Constant_Count_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Anil Kumar Reddy";
		int count_v=0;
		int count_c=0;
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' ||ch=='u') {
					count_v++;
				}else {
					count_c++;
				}
			}
		}
		System.out.println("The count of vowels is : "+count_v);
		System.out.println("The count of constants is : "+count_c);
	}

}
