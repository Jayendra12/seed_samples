import java.util.ArrayList;

public class Test {
	
	private static int processArray(ArrayList<Object> list) {
		for(int i = 0;i<list.size();i++){
		 int endsWith=(int) list.get(i);
		 int number=endsWith%10;
		 
		 if(endsWith>100&&number==6){
			 list.remove(i);
			 list.add(i,-3);
		 }
		 if(endsWith<100&&number==6){
			 list.remove(i);
			 list.add(i, -1);
		 }
		 if(endsWith<100&&number!=6){
			 list.remove(i);
			 list.add(i, -2);
		 }
		 
		 
		
		}
		return list.size();
		
	}

	public static void main(String[] args) {
		/*int i=1,j=1,k=0;
		System.out.print(i+" ");
		int number=1,n=15;
		while(number!=n){
		    
			k=i+j;
			System.out.print(k+" ");
			
			i=j;
			j=k;
			number++;
			
		}*/
		/*int num = 9;Boolean flag=true;
		System.out.print(1+" "+2);
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false;
				++i;
			}
			System.out.print(" "+i+" ");
		}*/
		
		ArrayList list=new ArrayList<>();
		list.add(176);
		list.add(76);
		list.add(50);
		list.add(150);
		
		int size=processArray(list);
		for (Object object : list) {
			System.out.println(object.toString());
		}
		
	}

	

}
