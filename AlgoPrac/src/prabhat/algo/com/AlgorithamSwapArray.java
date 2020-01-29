package prabhat.algo.com;

public class AlgorithamSwapArray {

	public static void main(String[] args) {
		
		int a[]= {2,3,7,9,3,65,4,7,8};
		int b[]= new int[9];
		int m=a.length;
		for(int i=0;i<=a.length-1;i++) {
			b[m-1]=a[i];
			m=m-1;
		}
		
		for(int k=0;k<=a.length-1;k++)
		{
			System.out.print(b[k]+" ");
		}
		
		
	}
	

}
