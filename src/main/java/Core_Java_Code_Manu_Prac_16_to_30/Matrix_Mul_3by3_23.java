package Core_Java_Code_Manu_Prac_16_to_30;

import java.util.Scanner;

public class Matrix_Mul_3by3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int mat1[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		int mat2[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		
//		int c[][]=new int[3][3];
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				for(int k=0;k<2;k++) {
//					c[i][j]=c[i][j]+mat1[i][k]*mat2[k][j];
//				}
//			}
//		}
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of An Array:---");
		int n=sc.nextInt();
		
		int mat1[][]=new int[n][n];
		int mat2[][]=new int[n][n];
		int res[][]=new int[n][n];

		System.out.println("Enter the First Matrix :-->");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Second Matrix :-->");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					
					res[i][j]=res[i][j]+mat1[i][k]*mat2[k][j];
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
