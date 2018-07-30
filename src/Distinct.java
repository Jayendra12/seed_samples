import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Distinct {

	public static void main(String[] args) {
		char c[]=new char[]{'j','a','y','r','n','j','r','a'};
		ArrayList list=new ArrayList<>();
		
		for(int i=0;i<c.length;i++){
			
			for(int j=i+1;j<c.length;j++){
				
				if(c[i]==c[j]){
					list.add(c[j]);
				}
			}
		}
		for(int k=0;k<list.size();k++){
			System.out.print(" "+list.get(k));
		}
		
		
		

	}

}
