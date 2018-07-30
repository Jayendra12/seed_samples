
public class BubbleSort {

	public static void main(String[] args) {
		int arr[]=new int[]{3,5,1,7,8,2 };
		int n=6;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]<arr[j+1]){
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			for(i=0;i<6;i++){
				System.out.print(arr[i]);
			}
		}
		

	}

}
