package Practice;

import java.util.HashMap;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = {1,5,6,8,9,10};
		
		int target = 6;
		
		HashMap<Integer,Integer> keys = new HashMap();
		
		for(int i=0;i<test.length;i++) {
			
			int x =target - test[i]  ;
			
			if(keys.containsKey(x)) {
				
				System.out.println(x);
				System.out.println(test[i]);
			}
			
			else {
				keys.put(test[i], i);
			}
			
			
		}

	}

}
