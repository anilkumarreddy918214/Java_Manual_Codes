package Core_Java_Code_Manu_Prac_31_to_40;

public class Fir_letter_Capital_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="anil kumar Reddy";
		
		String words[]=str.split(" ");
		
		String res="";
		
		for(String word:words) {
			res=res+word.substring(0,1).toUpperCase()+word.substring(1)+" ";
			
		}
		
		System.out.println(res);
	}

}
