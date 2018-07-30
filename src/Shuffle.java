import java.util.ArrayList;
import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		/*Random random=new Random();
	    ArrayList list=new ArrayList<>();

	    for(int i=1;i<=100;i++){
	    	int num=random.nextInt(100);
	    	System.out.print(" "+num);
	    	list.add(num);
	    }*/
		int arr[]=new int[]{4,3,7,2,8,1};
		
		for(int i=0;i<6;i++){
			for(int j=1;j<6;j++){
				if(arr[j-1]<arr[j]){
					int temp;
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(arr[0]+" "+arr[1]);
		for(int k=0;k<6;k++){
			System.out.print(arr[k]);
		}
		
	}

}
