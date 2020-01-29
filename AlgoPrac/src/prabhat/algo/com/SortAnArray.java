package prabhat.algo.com;

public class SortAnArray {

	public static void main(String[] args) {
		System.out.print("H");
		int a[]= {2,3,7,9,3,65,4,7,8};
		int n=a.length-1;
		for(int i=0;i<=n;i++)
			for(int j=i+1;j<=n;j++)
			{
			if(a[i]>a[j])
			{
				int temp=a[i];  //
				a[i]=a[j];
				a[j]=temp;
				
			}
			}
			
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
	}

}
