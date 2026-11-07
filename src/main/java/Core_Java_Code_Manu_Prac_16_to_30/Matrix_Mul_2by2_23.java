package Core_Java_Code_Manu_Prac_16_to_30;

public class Matrix_Mul_2by2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat1[][]= {{1,2},{3,4}};
		int mat2[][]= {{5,6},{7,8}};
		
		int c[][]=new int[2][2];
		
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				
			for(int k=0;k<2;k++){
				
				c[i][j]=c[i][j]+mat1[i][k]*mat2[k][j];
					
				}
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		}

	}


