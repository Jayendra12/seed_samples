
public class MatrixAddition {

	public static void main(String[] args) {
		int arr1[]=new int[]
				{
					1,2,3,
					4,5,6,
					6,7,8
				};
		int arr2[]=new int[]
				{
					3,2,3,
					9,5,6,
					6,1,5
				};
		int arr3[] =new int[9];
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(arr1[i]+" "+arr2[j]);
				 arr3[j]=arr1[i]+arr2[j];
			}
		}
		System.out.println();
        for(int k=0;k<arr3.length;k++){
        	System.out.println(" "+arr3[k]);
        }
	}

}
