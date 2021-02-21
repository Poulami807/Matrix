package Assignment;

public class Matrix {
	
	public static void main(String[] args) {
		int  a[][]={{1,3,4},{2,4,3},{3,4,5}}; 
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};
		add(a,b);
		multi(a,b);
		}
	public static void add(int [][]a1,int[][]b1) {
		int [][]sum=new int[3][3];
		System.out.println("Addition of matrices : ");
		for(int i=0;i<3;i++) { 
			for(int j=0;j<3;j++) {
				sum[i][j]=a1[i][j]+b1[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void multi(int [][]a1,int[][]b1) {
		int [][]mul=new int[3][3];
		System.out.println("Multiplication of matrices : ");
		for(int i=0;i<3;i++) { 
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++)      
				{      
				mul[i][j]+=a1[i][k]*b1[k][j];  
			  }
				System.out.print(mul[i][j]+" ");
		   }
			System.out.println();
         }
	}
}
