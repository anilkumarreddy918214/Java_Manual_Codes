package Core_Java_Code_Manu_Prac_31_to_40;

public class Contain_Only_Dig_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="1234562q";
		
		if(str.matches("\\d+")) {
			System.out.println(str+" Contain only digit.");
		}else {
			System.out.println(str+" does not Contain only digit.");
		}

	}

}
