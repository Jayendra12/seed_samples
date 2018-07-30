
public class Matrix3Addition {

	public static void main(String[] args) {
		int l = 0;
		for(int i=5;i>=1;i--){
			for(int j=i;j<=3;j++){
				System.out.print("*");
			}
			System.out.println();
			
			if(i==1){
				for(int k=2;k>=1;k--){
					for(int m=k;m>=1;m--){
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
		
		 

	}

}
